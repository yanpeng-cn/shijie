package com.yanpeng.shijie.controller;

import com.yanpeng.shijie.mapper.UserMapper;
import com.yanpeng.shijie.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author piper
 * @date 2019/10/24 20:28
 */
public class DemoController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 从数据库查询user表信息
     * @return
     */
    @GetMapping("/data")
    public List<UserEntity> data(){
        return userMapper.getData();
    }

}
