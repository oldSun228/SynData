package cn.seisys.iti.pdd.tcdp.syndata.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConfigParams {
    @Value("${spring.datasource.db1.url}")
    private String master1url;
    @Value("${spring.datasource.db1.username}")
    private String master1name;
    @Value("${spring.datasource.db1.password}")
    private String master1password;


    @Value("${spring.datasource.db2.url}")
    private String url;
    @Value("${spring.datasource.db2.username}")
    private String name;
    @Value("${spring.datasource.db2.password}")
    private String password;

}
