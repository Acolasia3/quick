package tao.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tao.reggie.entity.AddressBook;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
