package tao.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tao.reggie.entity.Orders;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}