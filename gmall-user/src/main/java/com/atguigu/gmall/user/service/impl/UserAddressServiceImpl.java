package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getAllAddress() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userAddressMapper.selectList(null);
        return umsMemberReceiveAddresses;
    }

    @Override
    public int deleteUserByName(int id) {
        return 0;
    }

    @Override
    public int addUser(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return 0;
    }

    @Override
    public int updateUser(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return 0;
    }
}
