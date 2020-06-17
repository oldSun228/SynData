package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service.impl;

import cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbAop.DataSource;
import cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbAop.DataSourceNames;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.mapper.SourceData206Mapper;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service.SourceData206Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
@Service("sourceData206Service")
public class SourceData206ServiceImpl implements SourceData206Service {

    @Autowired(required = false)
    private SourceData206Mapper sourceData206Mapper;


    /**
     * @Author fgs
     * @Description 获取syn_danger_pre_declare_cargo表SYN_FLAG = 0的数据
     * @Date 17:41 2020/5/6
     **/
    @Override
    public List<Cargo206Entity> querySource1CargoList() {
        return sourceData206Mapper.querySource1CargoList();
    }

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 0的数据
     * @Date 17:44 2020/5/6
     **/
    @Override
    public List<Declare206Entity> querySource1DeclareList() {
        return sourceData206Mapper.querySource1DeclareList();
    }

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 0的数据
     * @Date 17:44 2020/5/6
     **/
    @Override
    public List<Docs206Entity> querySource1DocsList() {
        return sourceData206Mapper.querySource1DocsList();
    }

    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:12 2020/5/7
     **/
    @Override
    public void updateDataSynStatusForCargo(List<Cargo206Entity> cargo206List) {
        sourceData206Mapper.updateDataSynStatusForCargo(cargo206List);
    }

    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:12 2020/5/7
     **/
    @Override
    public void updateDataSynStatusForDeclare(List<Declare206Entity> declare206List) {
        sourceData206Mapper.updateDataSynStatusForDeclare(declare206List);
    }

    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:12 2020/5/7
     **/
    @Override
    public void updateDataSynStatusForDocs(List<Docs206Entity> docs206List) {
        sourceData206Mapper.updateDataSynStatusForDocs(docs206List);
    }

    @Override
    public void insertTestData(List<TestEntity> list) {
        sourceData206Mapper.insertTestData(list);
    }

    @Override
    @DataSource(DataSourceNames.ONE)
    public List<TestEntity> query206Data() {
        return sourceData206Mapper.query206Data();
    }


}
