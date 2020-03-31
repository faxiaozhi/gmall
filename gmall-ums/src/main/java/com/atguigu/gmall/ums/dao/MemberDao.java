package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wenruo
 * @email lxf@atguigu.com
 * @date 2020-03-31 18:44:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
