package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.mapper;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Cargo15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Declare15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Docs15Entity;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
public interface SourceData15Mapper {

    List<Cargo15Entity> querySource2CargoList();

    List<Declare15Entity> querySource2DeclareList();

    List<Docs15Entity> querySource2DocsList();

    void insertSource2CargoList(List<Cargo206Entity> dataList);

    void insertSource2DeclareList(List<Declare206Entity> dataList);

    void insertSource2DocsList(List<Docs206Entity> dataList);

    void insertTestData(List<TestEntity> list);

    List<TestEntity> query15Data();
}
