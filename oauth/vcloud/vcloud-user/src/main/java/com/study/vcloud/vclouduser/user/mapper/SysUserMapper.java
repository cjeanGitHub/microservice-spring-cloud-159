package com.study.vcloud.vclouduser.user.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.study.vcloud.vclouduser.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author pwl
 * @since 2019-09-03
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * @return java.util.List<java.lang.String>
     * @Author Pan Weilong
     * @Description 用户权限
     * @Date 21:26 2019/9/23
     * @Param [userId]
     **/
    List<String> selectResourceByUserId(@Param("userId") Long userId);
}