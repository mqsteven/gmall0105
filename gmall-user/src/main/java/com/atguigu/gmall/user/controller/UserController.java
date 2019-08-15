package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserAddressService;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserAddressService userAddressService;
    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers= userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getAllAddress")
    public List<UmsMemberReceiveAddress> getAddress(){
        List<UmsMemberReceiveAddress> allAddress = userAddressService.getAllAddress();
    return allAddress;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
