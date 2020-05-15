package com.study.vcloud.vclouduser.user.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.study.vcloud.vclouduser.user.bean.UserVo;
import com.study.vcloud.vclouduser.user.entity.SysUser;
import com.study.vcloud.vclouduser.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author pwl
 * @since 2019-09-03
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserServiceImpl;

    /***
     * /**
     * @Author Pan Weilong
     * @Description 更据用户名查找用户
     * @Date 16:25 2019/9/3
     * @Param [username]
     * @return com.study.vcloud.user.bean.UserVoDetail
     **/
    @GetMapping("/getUserByUsername/{username}")
    public UserVo getUserByUsername(@PathVariable String username) {
        EntityWrapper<SysUser> sysUserEntityWrapper = new EntityWrapper<>();
        sysUserEntityWrapper.eq("username", username);
        SysUser sysUser = sysUserServiceImpl.selectOne(sysUserEntityWrapper);
        if (sysUser == null) {
            return null;
        }
        UserVo userVo = new UserVo(sysUser.getUserId().longValue(), sysUser.getUsername(), sysUser.getPassword());
        System.out.println("1111111");
        System.out.println(Objects.toString(userVo));
        return userVo;
    }

}