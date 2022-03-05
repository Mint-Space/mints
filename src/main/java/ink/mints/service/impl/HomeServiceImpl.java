package ink.mints.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.mints.dao.HomeDao;
import ink.mints.entity.Home;
import ink.mints.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl extends ServiceImpl<HomeDao, Home> implements HomeService{

}
