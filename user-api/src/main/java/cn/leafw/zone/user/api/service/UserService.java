package cn.leafw.zone.user.api.service;

import cn.leafw.zone.user.api.dto.PagerResp;
import cn.leafw.zone.user.api.dto.UserDto;
import cn.leafw.zone.user.api.dto.UserQueryDto;

import java.util.List;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 9:59
 */
public interface UserService {

    /**
     * @param userDto
     * @return
     */
    UserDto saveUser(UserDto userDto);

    /**
     * @param userQueryDto
     * @return
     */
    PagerResp<UserDto> queryUserList(UserQueryDto userQueryDto);
}
