package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.service;

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
 * @data 2019/4/26 17:58
 */
public interface SourceData15Service {

    /**
     * @Author fgs
     * @Description 获取syn_danger_pre_declare_cargo表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    List<Cargo15Entity> querySource2CargoList();

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    List<Declare15Entity> querySource2DeclareList();

    /**
     * @Author fgs
     * @Description 获取syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    List<Docs15Entity> querySource2DocsList();


    /**
     * @Author fgs
     * @Description 插入syn_danger_pre_declare_cargo表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    void insertSource2CargoList(List<Cargo206Entity> dataList);

    /**
     * @Author fgs
     * @Description 插入syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    void insertSource2DeclareList(List<Declare206Entity> dataList );

    /**
     * @Author fgs
     * @Description 插入syn_hy_danger_pre_declare表SYN_FLAG = 1的数据
     * @Date 17:40 2020/5/6
     **/
    void insertSource2DocsList(List<Docs206Entity> dataList);

    void insertTestData(List<TestEntity> list);

    List<TestEntity> query15Data();
}
