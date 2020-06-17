package cn.seisys.iti.pdd.tcdp.syndata.manage.source3.service.impl;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.entity.Demo3Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.mapper.Demo3Mapper;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.service.Demo3Service;
import cn.seisys.iti.pdd.tcdp.syndata.utils.ConfigParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 18:01
 */
@Service("demo3Service")
public class Demo3ServiceImpl implements Demo3Service {

    @Autowired(required = false)
    Demo3Mapper demo3Mapper;

    @Autowired
    private ConfigParams configParams;


    /**
     * 添加到桌面
     *
     * @param applicationEntity
     */
    @Override
    public List<Demo3Entity> querySource3DataList(Demo3Entity applicationEntity) {

        return demo3Mapper.querySource3DataList();
    }


}
