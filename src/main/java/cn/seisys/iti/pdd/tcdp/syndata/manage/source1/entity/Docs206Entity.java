package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author fgs
 * @Date 2020/5/6 17:25
 * @Version 1.0
 * @Description
 **/
@Data
public class Docs206Entity implements Serializable {
    private String id;
    private String declare_id;	//申报单id
    private String cargo_order_number;	//货品序号
    private String docs_order_number;	//单证序号
    private String docs_type;	//单证类型
    private String docs_no;	//单证编码
    private String total_qty;	//总量
    private String using_qty;	//本次使用量
    private String valid_date;	//有效期
    private String is_valid;	//是否有效(0否 1是)
    private String addoperation;
    private String addtime;
    private String updateoperation;
    private String updatetime;
    private String isremove;//	是否删除(0否 1是)

}
