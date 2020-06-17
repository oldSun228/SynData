package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity;

import lombok.Data;

/**
 * @Author fgs
 * @Date 2020/5/6 17:25
 * @Version 1.0
 * @Description
 **/
@Data
public class Docs15Entity {
    private String id;
    /*申报单id*/
    private String cargo_order_number;
    /*货品序号*/
    private String docs_order_number;
    /*单证序号*/
    private String docs_type;
    /*单证类型*/
    private String docs_no;
    /*单证编码*/
    private String total_qty;
    /*总量*/
    private String using_qty;
    /*本次使用量*/
    private String valid_date;
    /*有效期*/
    private String is_valid;
    /*是否有效(0否 1是)*/
    private String addoperation;
    private String declare_code;
    private String addtime;
    /*是否删除(0否 1是)*/
    private String syn_item;
    /*同步字段 表中同步的字段名 以逗号分隔（新增数据时为空）*/
    private String syn_flag;
    /*同步标示 1已同步 0未同步*/
    private String syn_time;
    /*同步时间*/
    private String declare_id;
    /*申请主表UUID*/
    private String isremove;
    private String uuid;

}
