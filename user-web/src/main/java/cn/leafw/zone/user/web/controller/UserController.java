package cn.leafw.zone.user.web.controller;

import cn.leafw.zone.user.api.dto.ResponseDto;
import cn.leafw.zone.user.api.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 10:26
 */
@RestController
public class UserController {

    @RequestMapping(value = "/queryUserByUserName/{userName}",method = RequestMethod.GET)
    public ResponseDto queryUserByUserName(@PathVariable(value = "userName") String userName){
        return ResponseDto.instance(userName);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseDto login(@RequestBody UserDto userDto){
        return ResponseDto.instance(userDto);
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public ResponseDto info(@RequestParam(value = "token") String token){
        UserDto userDto = new UserDto();
        userDto.setName("admin");
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        userDto.setRoles(roles);
        userDto.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return ResponseDto.instance(userDto);
    }
}
