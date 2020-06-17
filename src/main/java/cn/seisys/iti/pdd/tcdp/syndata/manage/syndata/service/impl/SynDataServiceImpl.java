package cn.seisys.iti.pdd.tcdp.syndata.manage.syndata.service.impl;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service.SourceData206Service;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.service.SourceData15Service;
import cn.seisys.iti.pdd.tcdp.syndata.manage.syndata.service.SynDataService;
import cn.seisys.iti.pdd.tcdp.syndata.utils.ConfigParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
@Service("synDataService")
public class SynDataServiceImpl implements SynDataService {

    @Autowired
    private ConfigParams configParams;

    @Autowired
    private SourceData206Service sourceData206Service;

    @Autowired
    private SourceData15Service sourceData15Service;


    @Override
    public List<TestEntity> query206Data() {
        return sourceData206Service.query206Data();
    }


    @Override
//    @PostConstruct
//    @Scheduled(cron = "0/1 * * * * ?")
    @Transactional(rollbackFor = {Exception.class})
    public void insert206Data(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        TestEntity entity;
        List<TestEntity> list = new ArrayList<>();
        entity = new TestEntity();
        entity.setId("111");
        list.add(entity);
        sourceData206Service.insertTestData(list);
        list = new ArrayList<>();
        entity = new TestEntity();
        entity.setId("222");
        list.add(entity);
        sourceData15Service.insertTestData(list);
        int i = 1/0;

    }


    @Override
    public List<TestEntity> query15Data() {
        return sourceData15Service.query15Data();
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void insert15Data() {
        try {
            TestEntity entity;
            List<TestEntity> list = new ArrayList<>();
            entity = new TestEntity();
            entity.setId("2");
            list.add(entity);
            sourceData15Service.insertTestData(list);
            //        int i = 1/0;
        } catch (Exception e) {
            System.out.println("触发事务回滚");
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }

    }


}
