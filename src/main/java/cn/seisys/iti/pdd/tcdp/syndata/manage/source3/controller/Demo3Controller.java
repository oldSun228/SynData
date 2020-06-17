package cn.seisys.iti.pdd.tcdp.syndata.manage.source3.controller;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.entity.Demo3Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source3.service.Demo3Service;
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
@RequestMapping("demo3")
public class Demo3Controller {
    private static final Logger logger = LoggerFactory.getLogger(Demo3Controller.class);

    @Autowired
    private Demo3Service demo3Service;

    @RequestMapping(value = "querySource3DataList", method = RequestMethod.POST)
    @ApiOperation(value = "添加到桌面", httpMethod = "POST", response = Object.class, notes = "添加到桌面")
    public List<Demo3Entity> querySource3DataList(@RequestBody Demo3Entity demo3Entity, HttpServletRequest request) {

       return demo3Service.querySource3DataList(demo3Entity);

    }


}
