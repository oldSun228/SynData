package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.service.impl;

import cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbAop.DataSource;
import cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbAop.DataSourceNames;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Cargo15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Declare15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Docs15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.mapper.SourceData15Mapper;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.service.SourceData15Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
@Service("sourceData15Service")
public class SourceData15ServiceImpl implements SourceData15Service {

    @Autowired(required = false)
    private SourceData15Mapper sourceData15Mapper;


    /**
     * @Author fgs
     * @Description 获取syn_danger_pre_declare_cargo表SYN_FLAG = 1的数据
     * @Date 18:00 2020/5/6
     **/
    @Override
    public List<Cargo15Entity> querySource2CargoList() {
        return sourceData15Mapper.querySource2CargoList();
    }

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 18:00 2020/5/6
     **/
    @Override
    public List<Declare15Entity> querySource2DeclareList() {
        return sourceData15Mapper.querySource2DeclareList();
    }

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 18:00 2020/5/6
     **/
    @Override
    public List<Docs15Entity> querySource2DocsList() {
        return sourceData15Mapper.querySource2DocsList();
    }


    /**
     * @Author fgs
     * @Description 插入syn_danger_pre_declare_cargo表SYN_FLAG = 1的数据
     * @Date 18:09 2020/5/6
     **/
    @Override
    public void insertSource2CargoList(List<Cargo206Entity> dataList) {
        sourceData15Mapper.insertSource2CargoList(dataList);
    }

    /**
     * @Author fgs
     * @Description 插入syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 18:10 2020/5/6
     **/
    @Override
    public void insertSource2DeclareList(List<Declare206Entity> dataList) {
        sourceData15Mapper.insertSource2DeclareList(dataList);
    }

    /**
     * @Author fgs
     * @Description 插入syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 18:11 2020/5/6
     **/
    @Override
    public void insertSource2DocsList(List<Docs206Entity> dataList) {
        sourceData15Mapper.insertSource2DocsList(dataList);
    }

    @Override
    @DataSource(DataSourceNames.TWO)
    public void insertTestData(List<TestEntity> list) {
        sourceData15Mapper.insertTestData(list);
    }

    @Override
    @DataSource(DataSourceNames.TWO)
    public List<TestEntity> query15Data() {
        return sourceData15Mapper.query15Data();
    }
}
