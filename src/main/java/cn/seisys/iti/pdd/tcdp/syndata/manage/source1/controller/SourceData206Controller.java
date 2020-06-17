package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.controller;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.TestEntity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service.SourceData206Service;
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
@RequestMapping("sourceData206")
public class SourceData206Controller {
    private static final Logger logger = LoggerFactory.getLogger(SourceData206Controller.class);

    @Autowired
    private SourceData206Service sourceData206Service;

    @Autowired
    private SynDataService synDataService;


    @RequestMapping(value = "querySource1CargoList", method = RequestMethod.POST)
    @ApiOperation(value = "备注", httpMethod = "POST", response = Object.class, notes = "添加到桌面")
    public List<Cargo206Entity> querySource1CargoList(@RequestBody Cargo206Entity cargo206Entity, HttpServletRequest request) {

        return sourceData206Service.querySource1CargoList();
    }

    @RequestMapping(value = "queryData", method = RequestMethod.POST)
    @ApiOperation(value = "数据查询", httpMethod = "POST", response = Object.class, notes = "数据查询")
    public List<TestEntity> queryData(HttpServletRequest request) {
        return synDataService.query206Data();
    }

    @RequestMapping(value = "insertData", method = RequestMethod.POST)
    @ApiOperation(value = "数据新增", httpMethod = "POST", response = Object.class, notes = "数据新增")
    public void insertData(HttpServletRequest request) {
        synDataService.insert206Data();
    }


}
