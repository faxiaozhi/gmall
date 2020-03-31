package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wenruo
 * @email lxf@atguigu.com
 * @date 2020-03-31 18:40:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
