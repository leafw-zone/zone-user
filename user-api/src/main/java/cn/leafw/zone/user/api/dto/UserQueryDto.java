package cn.leafw.zone.user.api.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 9:59
 */
@Data
public class UserQueryDto extends BaseQueryDto{

    private String userId;

    private String userName;

    private String sex;

    private String email;

    private String phone;

    private String wechatNo;

    private Date birthday;

    private String remark;

    private String accountNo;

    private String avatar;

    private String isDeleted;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;

    private String username;

    private String password;

    private List<String> roles;

    private String name;

    private String token;
}
