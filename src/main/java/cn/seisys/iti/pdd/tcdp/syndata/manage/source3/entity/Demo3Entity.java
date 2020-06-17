package cn.seisys.iti.pdd.tcdp.syndata.manage.source3.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fgs
 * @data 2019/5/8 13:35
 */
@Data
@ApiModel(description = "数据响应类")
public class Demo3Entity implements Serializable {

    private static final long serialVersionUID = 1486000246749830958L;
    /*应用编号*/
    @ApiModelProperty(value = "主键")
    private String id;


}
