package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserAddressService {
    List<UmsMemberReceiveAddress> getAllAddress();
    int deleteUserByName(int id);
    int addUser(UmsMemberReceiveAddress umsMemberReceiveAddress);
    int updateUser(UmsMemberReceiveAddress umsMemberReceiveAddress);
}
