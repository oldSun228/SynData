package cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbAop;

import java.lang.annotation.*;

/**
 * @Author fgs
 * @Date 2020/6/17 12:53
 * @Version 1.0
 * @Description
 **/

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceNames.ONE;
}
