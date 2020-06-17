package cn.seisys.iti.pdd.tcdp.syndata.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConfigParams {
    @Value("${spring.datasource.master1.jdbc-url}")
    private String master1url;
    @Value("${spring.datasource.master1.username}")
    private String master1name;
    @Value("${spring.datasource.master1.password}")
    private String master1password;


    @Value("${spring.datasource.secondary2.jdbc-url}")
    private String url;
    @Value("${spring.datasource.secondary2.username}")
    private String name;
    @Value("${spring.datasource.secondary2.password}")
    private String password;

}
