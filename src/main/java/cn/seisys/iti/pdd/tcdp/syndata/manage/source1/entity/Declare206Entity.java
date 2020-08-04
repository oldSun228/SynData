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
    private String id;
    //申请人,申报企业名称
    private String maker;
    //申请时间
    private String make_date;
    //项目名称
    private String make_project;
    //联系人：企业紧急联系人
    private String connects;
    //联系人电话：企业紧急联系人电话
    private String connect_no;
    //事项说明
    private String  explanations;
    //申报单号
    private String declare_code;
    //新申报单号
    private String new_declare_code;
    //港口作业单位：散装时为申报单位，包装时页面下拉选择
    private String unit_code;
    //作业委托人：申报企业名称
    private String consigner;
    //船名
    private String ship_name;
    //航次
    private String voyage_number_code;
    //作业地点
    private String address;
    //起运港
    private String from_port_code;
    //目的港
    private String to_port_code;
    //开工时间
    private String pre_start_date;
    //完工时间
    private String pre_end_date;
    //包装件
    private String pack_code;
    //集装箱号（仅出口包装使用）
    private String merge_container_code;
    //港口作业方式
    private String handle_mode;
    // 附交的相关证件
    private String add_info;
    //安全防范措施;
    private String emergency_code;
    //申报单位
    private String declare_unit;
    //申报日期
    private String declare_date;
    //紧急联系电话
    private String emergency_link_tel_no;
    // 核准部门
    private String check_unit_code;
    //核准人
    private String checker;
    //核准意见:0未审批 1核准同意 2核准不同意
    private String checker_flag;
    //核准时间
    private String check_date;
    //撤单人
    private String revoker;
    //撤单时间
    private String revoker_date;
    //申报员:申报企业信息表中的申报员字段
    private String declarer;
    //货物运输形式类型：0：集装箱 1：包装件2：散装 3：中散 4：罐柜
    private String transport_type;
    //具体运输
    private String transport_desc;
    //"状态：0撤单 1锁单(超时锁单) 2正常 3解锁 4改单 5锁单（出口包装必检、抽查锁单） 6-穿巴受理7-已进港 8-已出运"
    private String  state;
    //新增人员;
    private String addoperation;
    //新增时间
    private String addtime;
    //修改人员
    private String updateoperation;
    //修改时间
    private String updatetime;
    //是否删除
    private String isremove;
    //申请单类型：0:散装 1:包装,2:进口
    private String declare_type;
    //批准文号
    private String approval_number;
    //流水号，规则：yyxxxxxxx(7位流水号，每年从0开始)
    private String prerecord_no;
    //解锁人
    private String  unlocker;
    //解锁时间
    private String unlock_time;
    //流程id
    private String pid;
    // 版本号，未审批的申报单每次修改，版本号加1
    private String version;
    //事项编号
    private String  item_id;
    //审核说明
    private String check_option;
    // 是否需要抽查
    private String is_spot_check;
    //出运时间
    private String shipment_time;
    //作业总量吨
    private String  declare_total_ton;
    //作业总量teu
    private String declare_total_teu;
    //作业总量件
    private String declare_total_piece;
    //改单原因，出口包装申报单改单时使用
    private String change_order_reason;
    //是否必检单0否1是
    private String is_must_check;
    //实际作业量（吨）
    private String declare_ton_actual;
    //实际作业量（teu）
    private String declare_teu_actual;
    //实际作业量（件）
    private String declare_piece_actual;
    //1未出运 0已出运
    private String is_shipping;
    //取消原因
    private String cancel_reason;
    //穿巴受理时间
    private String wear_ba_time;
    //进港时间
    private String into_port_time;
    //申请人,申报企业id(关联hy_wharf_enterpriseaccount 中的id字段)
    private String maker_id;
    //进口申报标志（5：补报）
    private String buz_op_type;
    //是否有来自上港的数据更新 0有更新 1已读取更新
    private String change_flag;
    //是否 补报（1是0不是）（进口）
    private String isbubao;
    //是否 补报 备案 (1是 0 不是)（进口）
    private String isbubaobeian;
    //船code
    private String vesselcode;

}
