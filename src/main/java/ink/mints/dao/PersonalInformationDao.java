package ink.mints.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ink.mints.entity.PersonalInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonalInformationDao extends BaseMapper<PersonalInformation> {
}
