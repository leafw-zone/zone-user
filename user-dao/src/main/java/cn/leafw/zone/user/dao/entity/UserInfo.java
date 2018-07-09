package cn.leafw.zone.user.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/9 14:18
 */
@Data
@Table(name = "user_info")
@Entity
public class UserInfo {

    @Id
    private String userId;

    private String userName;

    private String sex;

    private String email;

    private String phone;

    private String wechatNo;

    private Date birthday;

    private String remark;

    private String accountNo;

    private String password;

    private String avatar;

    private String isDeleted;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;
}
