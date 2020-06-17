package cn.seisys.iti.pdd.tcdp.syndata.config.datasource.dbConfig;

/**
 * @Author fgs
 * @Date 2020/6/17 12:55
 * @Version 1.0
 * @Description
 **/
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源名
    public static void setDataSourceKey(String dbName) {
        contextHolder.set(dbName);
    }

    // 获取数据源名
    public static String getDataSourceKey() {
        return (contextHolder.get());
    }

    // 清除数据源名
    public static void clearDataSourceKey() {
        contextHolder.remove();
    }
}
