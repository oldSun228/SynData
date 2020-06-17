package cn.seisys.iti.pdd.tcdp.syndata.utils;
/**
 * @Description: 公共枚举工具类
 * @author: 叶柳
 * @date: 2017年3月21日
 * 深圳天源迪科信息技术股份有限公司 版权所有.
 */
public enum CommonNumEmnu{
	ZERO(0,"数字0"),
    ONE(1,"数字1"),
    THREE(3, "数字3"),
    EIGHT(8,"数字8"),
    TEN(10,"数字10"),
    TWENTY(20,"数字20"),
    //红名单人员信息
    TWO(2,"数字2"),
    HOURS24(86400,"24小时秒数值");
	

    private Integer code;
    private String desc;

    CommonNumEmnu(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
