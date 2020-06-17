package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 17:58
 */
public interface SourceData206Service {

    /**
     * @Author fgs
     * @Description  获取syn_danger_pre_declare_cargo表SYN_FLAG = 0的数据
     * @Date 17:40 2020/5/6
     **/
    List<Cargo206Entity> querySource1CargoList();

    /**
     * @Author fgs
     * @Description  获取syn_hy_danger_pre_declare表SYN_FLAG = 0的数据
     * @Date 17:40 2020/5/6
     **/
    List<Declare206Entity> querySource1DeclareList();

    /**
     * @Author fgs
     * @Description  获取syn_hy_danger_pre_declare表SYN_FLAG = 0的数据
     * @Date 17:40 2020/5/6
     **/
    List<Docs206Entity> querySource1DocsList();


    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:11 2020/5/7
     **/
    void updateDataSynStatusForCargo(List<Cargo206Entity> cargo206List);

    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:11 2020/5/7
     **/
    void updateDataSynStatusForDeclare(List<Declare206Entity> declare206List);

    /**
     * @Author fgs
     * @Description 更新数据状态
     * @Date 10:11 2020/5/7
     **/
    void updateDataSynStatusForDocs(List<Docs206Entity> docs206List);

    void insertTestData(List<TestEntity> list);

    List<TestEntity> query206Data();
}
