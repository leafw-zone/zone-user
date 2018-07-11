package cn.leafw.zone.user.service.impl;

import cn.leafw.zone.common.dto.PagerResp;
import cn.leafw.zone.user.api.dto.UserDto;
import cn.leafw.zone.user.api.dto.UserQueryDto;
import cn.leafw.zone.user.api.service.UserService;
import cn.leafw.zone.user.dao.entity.UserInfo;
import cn.leafw.zone.user.dao.repository.UserInfoRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 10:02
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("10001");
        BeanUtils.copyProperties(userDto,userInfo);
        userInfoRepository.save(userInfo);
        return null;
    }

    @Override
    public PagerResp<UserDto> queryUserList(UserQueryDto userQueryDto) {
        Pageable pageable = PageRequest.of(userQueryDto.getPageNumber() - 1,userQueryDto.getPageSize());
        Page<UserInfo> userInfoPage =userInfoRepository.findAll(new Specification<UserInfo>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<UserInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                if(null != userQueryDto){
                    if(StringUtils.isNotBlank(userQueryDto.getUserName())){
                        list.add(criteriaBuilder.equal(root.get("userName").as(String.class),userQueryDto.getUserName()));
                    }
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        },pageable);

        List<UserDto> userDtoList = new ArrayList<>();
        for (UserInfo userInfo : userInfoPage.getContent()) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userInfo,userDto);
            userDtoList.add(userDto);
        }

        PagerResp<UserDto> pagerResp = new PagerResp<>(userInfoPage.getTotalPages(),userQueryDto.getPageNumber(),userQueryDto.getPageSize(),userDtoList);
        return pagerResp;
    }
}
