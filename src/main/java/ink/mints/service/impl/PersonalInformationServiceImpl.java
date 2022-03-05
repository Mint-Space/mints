package ink.mints.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.mints.dao.PersonalInformationDao;
import ink.mints.entity.PersonalInformation;
import ink.mints.service.PersonalInformationService;
import org.springframework.stereotype.Service;

@Service
public class PersonalInformationServiceImpl extends ServiceImpl<PersonalInformationDao, PersonalInformation> implements PersonalInformationService {
}
