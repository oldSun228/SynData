package cn.seisys.iti.pdd.tcdp.syndata.manage.source2.entity;

import lombok.Data;

/**
 * @Author fgs
 * @Date 2020/5/6 17:18
 * @Version 1.0
 * @Description
 **/
@Data
public class Cargo15Entity {

    /* 主键id*/
    private String declare_code;
    /*危险物申请ID*/
    private String cargo_code;
    /*货物名称*/
    private String declare_ton;
    /*作业量（吨）*/
    private String declare_teu;
    /*作业量（TEU）*/
    private String declare_piece;
    /*业量（件）*/
    private String package_type;
    /*包装类别*/
    private String cas_no;
    /*CAS*/
    private String un_no;
    /*联合国*/
    private String danger_type;
    /*危险类别：eg:1.1、2.1等*/
    private String danger_type1;
    /*危险类别1**/
    private String danger_type2;
    /*危险类别2*/
    private String isremove;
    /*是否删除*/
    private String transport_name;
    /*运输名称*/
    private String measures_number;
    /*措施编号*/
    private String order_number;
    /*序号(出口包装使用)*/
    private String is_ref_poison_goods;
    /*是否是剧毒品(0否 1是)*/
    private String syn_item;
    /*同步字段 表中同步的字段名 以逗号分隔（新增数据时为空）*/
    private String syn_flag;
    /*同步标示 1已同步 0未同步*/
    private String syn_time;
    private String id;
    /*前面的1.1A，2.1B什么的拆分保存*/
    private String declare_id;
    /*申请主表UUID*/
    private String danger_groupname;
    /*危险货物集合名*/
    private String addtime;
    /*新增时间*/
    private String container_no;
    /*箱号*/
    private String bill_no;
    /*提单号*/
    private String full_box;
    /*整拼*/
    private String cnt_type;
    /*箱型*/
    private String cnt_size;
    /*尺寸*/
    private String bill_code;
    /*提单编码*/
    private String danger_type_split;
    private String uuid;

}
