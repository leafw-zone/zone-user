package cn.leafw.zone.user.api.dto;

import lombok.Data;

import java.util.List;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/9 9:52
 */
@Data
public class LoginDto {

    private String token;

    private List<String> roles;
}
