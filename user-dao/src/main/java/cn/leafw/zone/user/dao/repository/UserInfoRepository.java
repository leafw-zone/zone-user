package cn.leafw.zone.user.dao.repository;

import cn.leafw.zone.user.dao.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 10:01
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,String>,JpaSpecificationExecutor<UserInfo>{
}
