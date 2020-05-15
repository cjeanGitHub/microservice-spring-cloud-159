package com.study.vcloud.vclouduser.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.study.vcloud.vclouduser.user.entity.SysUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author pwl
 * @since 2019-09-03
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * @return java.lang.Boolean
     * @Description 检验权限
     * @Date 17:45 2019/9/9
     * @Param [url, userId, method]
     **/
    Boolean hasAuth(String url, Long userId, String method);
}