package cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author fgs
 * @Date 2020/5/6 17:18
 * @Version 1.0
 * @Description
 **/
@Data
public class Cargo206Entity implements Serializable {
    private String id;
    private String declare_id;	//危险物申请id
    private String cargo_code;	//货物名称
    private String declare_ton;	//作业吨
    private String declare_teu;	//作业teu
    private String declare_piece;	//作业件
    private String package_type;	//包装类别
    private String national_no;	//cas
    private String international_no;	//联合国
    private String danger_type;	//1和2的和  1.2e 3.4j
    private String danger_type1;	//危险类别1
    private String danger_type2;	//危险类别2
    private String addoperation;	//新增人员
    private String addtime;	//新增时间
    private String updateoperation;	//修改人员
    private String updatetime;	//修改时间
    private String isremove;	//是否删除
    private String transport_name;	//运输名称
    private String measures_number;	//措施编号
    private String order_number;	//序号（出口包装使用）货物序号
    private String is_ref_poison_goods;	//是否是剧毒品(0否 1是)
    private String container_no;	//箱号
    private String bill_no;	//提单号
    private String full_box;	//整拼
    private String cnt_type;	//箱型
    private String cnt_size;	//尺寸
    private String bill_code;	//提单编码
    private String danger_groupname;	//使用规则分组
    private String pxxx;	//拼箱信息

}
