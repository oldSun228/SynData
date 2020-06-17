package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.mapper;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
public interface SourceData206Mapper {

    List<Cargo206Entity> querySource1CargoList();

    List<Declare206Entity> querySource1DeclareList();

    List<Docs206Entity> querySource1DocsList();

    void updateDataSynStatusForCargo(List<Cargo206Entity> dataList);

    void updateDataSynStatusForDeclare(List<Declare206Entity> dataList);

    void updateDataSynStatusForDocs(List<Docs206Entity> dataList);

    void insertTestData(List<TestEntity> list);

    List<TestEntity> query206Data();
}
