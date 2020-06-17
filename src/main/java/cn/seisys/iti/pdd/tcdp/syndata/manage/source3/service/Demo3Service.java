package cn.seisys.iti.pdd.tcdp.syndata.manage.source3.service;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.entity.Demo3Entity;

import java.util.List;

/**
 * @author fgs
 * @data 2019/4/26 17:58
 */
public interface Demo3Service {

    List<Demo3Entity> querySource3DataList(Demo3Entity demo3Entity);

}
