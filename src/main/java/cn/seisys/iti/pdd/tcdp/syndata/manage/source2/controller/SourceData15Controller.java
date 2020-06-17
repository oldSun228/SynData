package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.controller;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity.Cargo15Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source2.service.SourceData15Service;
import cn.seisys.iti.pdd.tcdp.syndata.manage.syndata.service.SynDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author fgs
 * @data 2019/5/4 6:52
 */
@Api(tags = "应用查询类")
@RestController
@RequestMapping("sourceData15")
public class SourceData15Controller {
    private static final Logger logger = LoggerFactory.getLogger(SourceData15Controller.class);

    @Autowired
    private SourceData15Service destinationData15Service;

    @Autowired
    private SynDataService synDataService;

    /**
     * 添加到桌面
     *
     * @param cargo15Entity
     * @return
     */
    @RequestMapping(value = "querySource2CargoList", method = RequestMethod.POST)
    @ApiOperation(value = "添加到桌面", httpMethod = "POST", response = Object.class, notes = "添加到桌面")
    public List<Cargo15Entity> querySource1CargoList(@RequestBody Cargo15Entity cargo15Entity, HttpServletRequest request) {

        return destinationData15Service.querySource2CargoList();
    }


    @RequestMapping(value = "queryData", method = RequestMethod.POST)
    @ApiOperation(value = "数据查询", httpMethod = "POST", response = Object.class, notes = "数据查询")
    public List<TestEntity> queryData(HttpServletRequest request) {
        return synDataService.query15Data();
    }

    @RequestMapping(value = "insertData", method = RequestMethod.POST)
    @ApiOperation(value = "数据新增", httpMethod = "POST", response = Object.class, notes = "数据新增")
    public void insertData(HttpServletRequest request) {
        synDataService.insert15Data();
    }


}
