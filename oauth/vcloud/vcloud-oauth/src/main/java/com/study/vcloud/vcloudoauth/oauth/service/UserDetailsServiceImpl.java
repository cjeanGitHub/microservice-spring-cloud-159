package com.study.vcloud.vcloudoauth.oauth.service;

import com.study.vcloud.vcloudoauth.oauth.bean.UserVo;
import com.study.vcloud.vcloudoauth.oauth.bean.UserVoDetail;
import com.study.vcloud.vcloudoauth.oauth.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author Pan Weilong
 * @date 2019/7/9 15:57
 * @description: 接口.
 */

@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVo userVo = userService.getUserByUsername(username);
        if (userVo == null) {
            throw new UsernameNotFoundException("用户不存在或密码错误");
        }
        UserVoDetail userVoDetail = new UserVoDetail();
        userVoDetail.setUserId(1L);
        userVoDetail.setUsername("hello");
        userVoDetail.setPassword("hello");
        userVoDetail.setUserId(userVo.getUserId());
        userVoDetail.setUsername(userVo.getUsername());
        userVoDetail.setPassword(userVo.getPassword());
        return userVoDetail;
    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserVoDetail userVoDetail = new UserVoDetail();
//        userVoDetail.setUserId(1L);
//        userVoDetail.setUsername("hello");
//        userVoDetail.setPassword("hello");
//        return userVoDetail;
//    }


}