package cn.leafw.zone.user.api.dto;

import lombok.Data;

import java.util.List;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 9:59
 */
@Data
public class UserDto {

    private String username;

    private String password;

    private List<String> roles;

    private String name;

    private String avatar;
}
