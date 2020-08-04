package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.controller;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.*;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.service.SourceData206Service;
import cn.seisys.iti.pdd.tcdp.syndata.manage.syndata.service.SynDataService;
import cn.seisys.iti.pdd.tcdp.syndata.utils.ConfigParams;
import cn.seisys.iti.pdd.tcdp.syndata.utils.ExcelReader;
import cn.seisys.iti.pdd.tcdp.syndata.utils.importdata.BatchImportUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @Autowired
    private ConfigParams configParams;


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

    @RequestMapping(value = "insertHistoryData", method = RequestMethod.POST)
    @ApiOperation(value = "数据新增", httpMethod = "POST", response = Object.class, notes = "数据新增")
    public String insertHistoryData(HttpServletRequest request) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>调用开始>>>>>>>>>>>>>>>>>>>>>>>>>>");
        long startTime = System.currentTimeMillis();
        // 设定Excel文件所在路径
        String excelFileName1 = "C:\\Users\\86158\\Desktop\\HistoryData\\new\\DangerDeclare.xlsx";
        String excelFileName2 = "C:\\Users\\86158\\Desktop\\HistoryData\\new\\DangerDeclareCargo.xlsx";
        String excelFileName3 = "C:\\Users\\86158\\Desktop\\HistoryData\\new\\DangerDeclareDocs.xlsx";
        // 读取Excel文件内容
        List<ExcelDataEntity> readResult1 = ExcelReader.readExcel(excelFileName1);
        List<ExcelDataEntity> readResult2 = ExcelReader.readExcel(excelFileName2);
        List<ExcelDataEntity> readResult3 = ExcelReader.readExcel(excelFileName3);

        List<Declare206Entity> declare206List = new ArrayList<>();
        List<Cargo206Entity> cargo206List = new ArrayList<>();
        List<Docs206Entity> docs206List = new ArrayList<>();


        for (int f = 0; f < readResult1.size(); f++) {
            Declare206Entity declare206Entity = new Declare206Entity();
            String tableId = "HS" + String.valueOf(UUID.randomUUID());
            declare206Entity.setId(tableId);
            declare206Entity.setMaker(getValue(readResult1.get(f).getLi33()));
            declare206Entity.setMake_date(getValue(readResult1.get(f).getLi36()));
            declare206Entity.setMake_project("出口包装港口危险货物作业申报");
            declare206Entity.setConnects("");
            declare206Entity.setConnect_no("");
            declare206Entity.setExplanations("");
            declare206Entity.setDeclare_code(getValue(readResult1.get(f).getLi1()));
            declare206Entity.setNew_declare_code(getValue(readResult1.get(f).getLi1()));
//            declare206Entity.setNew_declare_code(getValue(readResult1.get(f).getLi2()));
            declare206Entity.setUnit_code(getValue(readResult1.get(f).getLi72()));
            declare206Entity.setConsigner(getValue(readResult1.get(f).getLi4()));
            declare206Entity.setShip_name(getValue(readResult1.get(f).getLi5()));
            declare206Entity.setVoyage_number_code(getValue(readResult1.get(f).getLi6()));
            declare206Entity.setAddress("");
            declare206Entity.setFrom_port_code(getValue(readResult1.get(f).getLi8()));
            declare206Entity.setTo_port_code(getValue(readResult1.get(f).getLi9()));
            declare206Entity.setPre_start_date(getValue(readResult1.get(f).getLi10()));
            declare206Entity.setPre_end_date(getValue(readResult1.get(f).getLi11()));
            declare206Entity.setPack_code(getValue(readResult1.get(f).getLi26()));
            declare206Entity.setMerge_container_code(getValue(readResult1.get(f).getLi44()));
            declare206Entity.setHandle_mode(getValue(readResult1.get(f).getLi28()));
            declare206Entity.setAdd_info(getValue(readResult1.get(f).getLi30()));
            declare206Entity.setEmergency_code(getValue(readResult1.get(f).getLi29()));
            declare206Entity.setDeclare_unit(getValue(readResult1.get(f).getLi33()));
            declare206Entity.setDeclare_date(getValue(readResult1.get(f).getLi34()));
            declare206Entity.setEmergency_link_tel_no(getValue(readResult1.get(f).getLi29()));
            declare206Entity.setCheck_unit_code(getValue(readResult1.get(f).getLi38()));
            declare206Entity.setChecker(getValue(readResult1.get(f).getLi39()));
            declare206Entity.setChecker_flag(getValue(readResult1.get(f).getLi40()));
            declare206Entity.setCheck_date(getValue(readResult1.get(f).getLi41()));
            declare206Entity.setRevoker(getValue(readResult1.get(f).getLi42()));
            declare206Entity.setRevoker_date(getValue(readResult1.get(f).getLi43()));
            declare206Entity.setDeclarer(getValue(readResult1.get(f).getLi37()));
            declare206Entity.setTransport_type(getValue(readResult1.get(f).getLi47()));
            declare206Entity.setTransport_desc(getAutoValue(getValue(readResult1.get(f).getLi48())));
            declare206Entity.setState(getValue(readResult1.get(f).getLi50()));
            declare206Entity.setAddoperation("");
            declare206Entity.setAddtime(getValue(readResult1.get(f).getLi63()));
            declare206Entity.setUpdateoperation("");
            declare206Entity.setUpdatetime("");
            declare206Entity.setIsremove("0");
            declare206Entity.setDeclare_type("1");
            declare206Entity.setApproval_number("");
            declare206Entity.setPrerecord_no(getValue(readResult1.get(f).getLi55()));
            declare206Entity.setUnlocker("");
            declare206Entity.setUnlock_time("");
            declare206Entity.setPid("");
            declare206Entity.setVersion("1");
            declare206Entity.setItem_id("");
            declare206Entity.setCheck_option("");
            declare206Entity.setIs_spot_check("0");
            declare206Entity.setShipment_time("");
            declare206Entity.setDeclare_total_ton(getValue(readResult1.get(f).getLi14()));
            declare206Entity.setDeclare_total_teu(getValue(readResult1.get(f).getLi15()));
            declare206Entity.setDeclare_total_piece(getValue(readResult1.get(f).getLi16()));
            declare206Entity.setChange_order_reason("");
            declare206Entity.setIs_must_check("");
            declare206Entity.setDeclare_ton_actual("");
            declare206Entity.setDeclare_teu_actual("");
            declare206Entity.setDeclare_piece_actual("");
            declare206Entity.setIs_shipping("");
            declare206Entity.setCancel_reason("");
            declare206Entity.setWear_ba_time("");
            declare206Entity.setInto_port_time(getValue(readResult1.get(f).getLi66()));
            declare206Entity.setMaker_id("");
            declare206Entity.setBuz_op_type("");
            declare206Entity.setChange_flag("");
            declare206Entity.setIsbubao("");
            declare206Entity.setIsbubaobeian("");
            declare206Entity.setVesselcode("");
            for (int g = 0; g < readResult2.size(); g++) {
                if (readResult1.get(f).getLi1().equals(readResult2.get(g).getLi1())) {//申报单号相同
                    Cargo206Entity cargo206Entity = new Cargo206Entity();
                    cargo206Entity.setDeclare_id(tableId);
                    cargo206Entity.setId(String.valueOf(UUID.randomUUID()));
                    cargo206Entity.setCargo_code(getValue(readResult2.get(g).getLi2()));
                    cargo206Entity.setDeclare_ton(getValue(readResult2.get(g).getLi12()));
                    cargo206Entity.setDeclare_teu(getValue(readResult2.get(g).getLi14()));
                    cargo206Entity.setDeclare_piece(getValue(readResult2.get(g).getLi13()));
                    cargo206Entity.setPackage_type(getValue(readResult2.get(g).getLi11()));
                    cargo206Entity.setNational_no(getValue(readResult2.get(g).getLi3()));
                    cargo206Entity.setInternational_no(getValue(readResult2.get(g).getLi4()));
                    cargo206Entity.setDanger_type(getValue(readResult2.get(g).getLi5()));
                    cargo206Entity.setDanger_type1(getValue(readResult2.get(g).getLi7()));
                    cargo206Entity.setDanger_type2(getValue(readResult2.get(g).getLi9()));
                    cargo206Entity.setAddoperation("");
                    cargo206Entity.setAddtime("");
                    cargo206Entity.setUpdateoperation("");
                    cargo206Entity.setUpdatetime("");
                    cargo206Entity.setIsremove("0");
                    cargo206Entity.setTransport_name(getValue(readResult2.get(g).getLi21()));
                    cargo206Entity.setMeasures_number(getValue(readResult2.get(g).getLi18()));
                    cargo206Entity.setOrder_number(getValue(readResult2.get(g).getLi15()));
                    if ((readResult2.get(g).getLi19() != null && (!"".equals(readResult2.get(g).getLi19())))) {
                        cargo206Entity.setIs_ref_poison_goods("1");
                    } else {
                        cargo206Entity.setIs_ref_poison_goods("0");
                    }
                    cargo206Entity.setContainer_no(getValue(readResult2.get(g).getLi22()));
                    cargo206Entity.setBill_no(getValue(readResult2.get(g).getLi26()));
                    cargo206Entity.setFull_box("");
                    cargo206Entity.setCnt_type(getValue(readResult2.get(g).getLi23()));
                    cargo206Entity.setCnt_size(getValue(readResult2.get(g).getLi24()));
                    cargo206Entity.setBill_code(getValue(readResult2.get(g).getLi27()));
                    cargo206Entity.setDanger_groupname("");
                    cargo206Entity.setPxxx("");
                    int m = 1;
                    for (int s = 0; s < readResult3.size(); s++) {
                        if (readResult2.get(g).getLi1().equals(readResult3.get(s).getLi1()) && readResult2.get(g).getLi16().equals(readResult3.get(s).getLi11())) {//申报单号相同 和 danId相同
                            Docs206Entity docs206Entity = new Docs206Entity();
                            docs206Entity.setDeclare_id(tableId);
                            docs206Entity.setId(String.valueOf(UUID.randomUUID()));
                            //从Cargo表取
                            docs206Entity.setCargo_order_number(getValue(readResult2.get(g).getLi15()));
                            docs206Entity.setDocs_order_number(String.valueOf(m));
                            docs206Entity.setDocs_type(getValue(readResult3.get(s).getLi2()));
                            docs206Entity.setDocs_no(getValue(readResult3.get(s).getLi3()));
                            docs206Entity.setTotal_qty(getValue(readResult3.get(s).getLi5()));
                            docs206Entity.setUsing_qty(getValue(readResult3.get(s).getLi6()));
                            docs206Entity.setValid_date(null);
//                            docs206Entity.setValid_date(getValue(readResult3.get(s).getLi7()));
                            docs206Entity.setIs_valid(StringUtils.isNotEmpty(getValue(readResult3.get(s).getLi8())) ? getValue(readResult3.get(s).getLi8()) : "0");
                            docs206Entity.setAddoperation("");
//                            docs206Entity.setAddtime(getValue(readResult3.get(s).getLi9()));
                            docs206Entity.setAddtime(null);
                            docs206Entity.setUpdateoperation("");
                            docs206Entity.setUpdatetime("");
                            docs206Entity.setIsremove("0");
                            docs206List.add(docs206Entity);
                            m++;
                        }
                    }
                    cargo206List.add(cargo206Entity);
                }
            }
            declare206List.add(declare206Entity);
        }
        try {
            long endTime1 = System.currentTimeMillis();
            System.out.println("解析耗时>>>>>>>>>>>>>>>>>>>>>>>" + (endTime1 - startTime));
            if (CollectionUtils.isNotEmpty(docs206List)) {
                BatchImportUtils.batchImportDataForDocs15Entity(docs206List, configParams.getMaster1url(), configParams.getMaster1name(), configParams.getMaster1password());
            }
            if (CollectionUtils.isNotEmpty(cargo206List)) {
                BatchImportUtils.batchImportDataForCargo15Entity(cargo206List, configParams.getMaster1url(), configParams.getMaster1name(), configParams.getMaster1password());
            }
            if (CollectionUtils.isNotEmpty(declare206List)) {
                BatchImportUtils.batchImportDataForDeclare15Entity(declare206List, configParams.getMaster1url(), configParams.getMaster1name(), configParams.getMaster1password());
            }
            long endTime2 = System.currentTimeMillis();
            System.out.println("插入耗时>>>>>>>>>>>>>>>>>>>>>>>" + (endTime2 - endTime1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ">>>" + declare206List.size() + ">>>>" + cargo206List.size() + ">>>>>" + docs206List.size();
    }

    private String getAutoValue(String value) {
        if(StringUtils.isNotEmpty(value)){
            if(value.indexOf("'") != -1){
                value = value.replaceAll("'","‘");
            }
            if(value.indexOf(",") != -1){
                value = value.replaceAll(",","");
            }
            return value;
        }
        return null;
    };


    public String getValue(String str) {
        if (str == null || "null".equals(str) || "NULL".equals(str)) {
            str = "";
        }
        return str;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(String.valueOf(UUID.randomUUID()));
        }
    }

}
