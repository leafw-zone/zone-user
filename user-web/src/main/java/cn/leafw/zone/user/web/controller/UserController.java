package cn.leafw.zone.user.web.controller;

import cn.leafw.zone.user.api.dto.ResponseDto;
import org.springframework.web.bind.annotation.*;

/**
 * @author CareyWYR
 * @description （用一句话描述这个类的作用）
 * @date 2018/7/4 10:26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/queryUserByUserName/{userName}",method = RequestMethod.GET)
    public ResponseDto queryUserByUserName(@PathVariable(value = "userName") String userName){
        return ResponseDto.instance(userName);
    }
}
