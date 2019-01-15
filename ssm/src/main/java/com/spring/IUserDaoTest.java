package com.spring;

import com.spring.model.QcCorpustab;
import com.spring.model.QcCorpustabKey;
import com.spring.service.IQcCorpustabService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
//    @Autowired
//    IUserDao userDao;

//    @Test
//    public void selectUser()throws Exception{
//        User user=userDao.selectUser(1l);
//
//        System.out.println("ip:"+user.getRegIp());
//    }

    @Resource
    private IQcCorpustabService iQcCorpustabService=null;

    @Test
    public void testMybatisGenerate(){
        QcCorpustabKey qcCorpustabKey=new QcCorpustabKey();
        qcCorpustabKey.setTenantid("egoo");
        qcCorpustabKey.setCorpusid(1100L);

        QcCorpustab qcCorpustab=iQcCorpustabService.selectByPrimaryKey(qcCorpustabKey);

        System.out.println("qcCorpustab:"+qcCorpustab.getBussinesscenarios()+"-"+
        qcCorpustab.getCorpustype()+"-"+qcCorpustab.getSensitivitylevel()+"-"+qcCorpustab.getCorpustext());
    }
}
