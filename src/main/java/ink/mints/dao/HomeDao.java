package ink.mints.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ink.mints.entity.Home;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeDao extends BaseMapper<Home> {
}
