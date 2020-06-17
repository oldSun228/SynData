package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author fgs
 * @Date 2020/5/6 17:04
 * @Version 1.0
 * @Description
 **/
@Data
public class Declare206Entity implements Serializable {
    private static final long serialVersionUID = 1486000246749830952L;
    private String id;
    /* 申请人,申报企业名称*/
    private String make_date;
    /* 申请时间*/
    private String declare_code;
    /*申报单号*/
    private String approval_number;
    /*批准文号*/
    private String new_declare_code;
    /*新申报单号*/
    private String unit_code;
    /*港口作业单位：散装时为申报单位，包装时页面下拉选择*/
    private String consigner;
    /*作业委托人：申报企业名称*/
    private String ship_name;
    /*船名*/
    private String voyage_number_code;
    /* 航次*/
    private String address;
    /*作业地点*/
    private String from_port_code;
    /*起运港*/
    private String to_port_code;
    /*目的港*/
    private String pre_start_date;
    /*开工时间*/
    private String pre_end_date;
    /*完工时间*/
    private String pack_code;
    /*包装件*/
    private String merge_container_code;
    /*仅出口包装使用*/
    private String handle_mode;
    /*港口作业方式*/
    private String add_info;
    /*附交的相关证件*/
    private String emergency_code;
    /*安全防范措施*/
    private String declare_unit;
    /*申报单位*/
    private String declare_date;
    /*申报日期*/
    private String emergency_link_tel_no;
    /*紧急联系电话*/
    private String check_unit_code;
    /*核准部门*/
    private String checker;
    /*核准人*/
    private String checker_flag;
    /*核准意见:0未审批 1核准同意 2核准不同意*/
    private String check_date;
    /*核准时间*/
    private String check_option;
    /*审核说明*/
    private String revoker;
    /*撤单人*/
    private String revoker_date;
    /*撤单时间*/
    private String unlocker;
    /*解锁人*/
    private String unlock_time;
    /*解锁时间*/
    private String declarer;
    /*申报员:申报企业信息表中的申报员字段*/
    private String transport_type;
    /*货物运输形式类型：0：集装箱 1：单一包件 2：散装 3：中散 4：罐柜*/
    private String transport_desc;
    /*具体运输*/
    private String state;
    /*0-正常 1-已改单 2-已撤单 4-已删除 6-穿巴受理 7-已进港 8-已出运*/
    private String declare_type;
    /*申请单类型：0:散装 1:包装,2:进口*/
    private String prerecord_no;
    /*流水号，规则：YYXXXXXXX(7位流水号，每年从0开始)*/
    private String version;
    /*版本号，未审批的申报单每次修改，版本号加1*/
    private String change_order_reason;
    /*改单原因，出口包装申报单改单时使用*/
    private String is_spot_check;
    /*是否需要抽查0否1是*/
    private String declare_total_teu;
    /*作业总量TEU（出口包装使用）*/
    private String declare_total_ton;
    /*作业总量吨（出口包装使用）*/
    private String declare_total_piece;
    /*作业总量件（出口包装使用）*/
    private String is_must_check;
    /*是否必检单0否1是*/
    private String syn_item;
    /*同步字段 表中同步的字段名 以逗号分隔（新增数据时为空）*/
    private String syn_flag;
    /*同步标示 1已同步 0未同步*/
    private String syn_time;
    /*同步时间*/
    private String syn_type;
    /*同步数据来源：1： 来自于BS系统 2：来自于航运系统*/
    private String shipment_time;
    /*装船时间*/
    private String leaving_port_time;
    /*离港时间*/
    private String wear_ba_time;
    /*穿巴受理时间*/
    private String is_wear_ba;
    /*是否穿巴 1是 0否*/
    private String port_meaasge_get_time;
    /*港务集团反馈信息获取时间*/
    private String port_meaasge_get_flag;
    /*港务集团反馈信息是否获取标识：1是 0否*/
    private String is_locked;
    /*1：锁单，0：正常*/
    private String danger_storage_time;
    /*危库 堆场时间*/
    private String danger_storage_confirm_sign;
    /*危库 堆场确认标志*/
    private String declare_ton_actual;
    /*实际作业量（吨）*/
    private String declare_teu_actual;
    /*实际作业量（TEU）*/
    private String declare_piece_actual;
    /*实际作业量（件）*/
    private String into_port_time;
    /*进港时间*/
    private String lock_type;
    /*锁单类型（1：逾期，5：查检）*/
    private String maker_id;
    /*申请人,申报企业ID(关联HY_WHARF_ENTERPRISEACCOUNT 中的ID字段)*/
    private String declare_id;
    /*主键UUID*/
    private String is_ref_poison_goods;
    /*新增剧毒品字段，只要货物中含有一个是剧毒品，该字段就是剧毒*/
    private String declare_unit_code;
    /*申报单位编码*/
    private String addtime;
    /*新增时间*/
    private String maker;
    private String uuid;

}
