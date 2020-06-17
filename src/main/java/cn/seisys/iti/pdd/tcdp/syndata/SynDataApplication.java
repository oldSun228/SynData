package cn.seisys.iti.pdd.tcdp.syndata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class})
//@ComponentScan({"cn.seisys.iti.pdd.tcdp.syndata"})//自动扫描并且装入bean容器
//@MapperScan({"cn.seisys.iti.pdd.tcdp.syndata.manage.*.mapper"})//将项目中对应的mapper类的路径加进来就可以了
//@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解;开启事务等同于xml配置方式的 <tx:annotation-driven />
//@EnableScheduling //开启定时任务
public class SynDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SynDataApplication.class, args);
    }

}

//@SpringBootApplication(exclude={RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class})

