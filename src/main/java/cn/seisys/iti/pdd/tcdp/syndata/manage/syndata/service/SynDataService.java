package cn.seisys.iti.pdd.tcdp.syndata.manage.syndata.service;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 17:58
 */
public interface SynDataService {
    void insert206Data();

    List<TestEntity> query206Data();

    List<TestEntity> query15Data();

    void insert15Data();
}
