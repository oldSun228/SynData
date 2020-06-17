package cn.seisys.iti.pdd.tcdp.syndata.config.redis;

import org.springframework.cache.annotation.CachingConfigurerSupport;

/**
 * Redis 配置类
 *
 * @author fgs
 * @data 2018/11/29 9:15
 */
//@Configuration
public class RedisConfiguration extends CachingConfigurerSupport {

//    /**
//     * Logger
//     */
//    private static final Logger logger = LoggerFactory.getLogger(RedisConfiguration.class);
//
//
//    @Bean
//    @Override
//    public KeyGenerator keyGenerator() {
//        //  设置自动key的生成规则，配置spring boot的注解，进行方法级别的缓存
//        // 使用：进行分割，可以很多显示出层级关系
//        // 这里其实就是new了一个KeyGenerator对象，只是这是lambda表达式的写法，我感觉很好用，大家感兴趣可以去了解下
//        return (target, method, params) -> {
//            StringBuilder sb = new StringBuilder();
//            sb.append(target.getClass().getName());
//            sb.append(":");
//            sb.append(method.getName());
//            for (Object obj : params) {
//                sb.append(":" + String.valueOf(obj));
//            }
//            String rsToUse = String.valueOf(sb);
//            logger.info("自动生成Redis Key -> [{}]", rsToUse);
//            return rsToUse;
//        };
//    }
//
//
//    @Bean
//    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
//        RedisCacheManager redisCacheManager = RedisCacheManager.create(redisConnectionFactory);
//        return redisCacheManager;
//    }
//
//    /**
//     * 默认redisTemplate 为JSON
//     *
//     * @param jedisConnectionFactory
//     * @return
//     */
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//        //设置序列化
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        // 配置redisTemplate
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//
//        RedisSerializer stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer); // key序列化
//////        redisTemplate.setValueSerializer(stringSerializer); // value序列化
////        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer); // value序列化
//        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer()); // value序列化
//        redisTemplate.setKeySerializer(stringSerializer); // key序列化
//////        redisTemplate.setHashValueSerializer(stringSerializer); // Hash value序列化
////        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer); // Hash value序列化
//        redisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer()); // Hash value序列化
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//
//    /**
//     * 默认redisTemplate 为JSON
//     *
//     * @param jedisConnectionFactory
//     * @return
//     */
//    @Bean(name = "autoRedisTemplate")
//    public RedisTemplate<String, Object> autoRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//        //设置序列化
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        // 配置redisTemplate
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//        RedisSerializer stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer); // key序列化
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer); // value序列化
//        redisTemplate.setKeySerializer(stringSerializer); // key序列化
//        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer); // Hash value序列化
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//
//
//    @Override
//    @Bean
//    public CacheErrorHandler errorHandler() {
//        // 异常处理，当Redis发生异常时，打印日志，但是程序正常走
//        logger.info("初始化 -> [{}]", "Redis CacheErrorHandler");
//        CacheErrorHandler cacheErrorHandler = new CacheErrorHandler() {
//            @Override
//            public void handleCacheGetError(RuntimeException e, Cache cache, Object key) {
//                logger.error("Redis occur handleCacheGetError：key -> [{}]", key, e);
//            }
//
//            @Override
//            public void handleCachePutError(RuntimeException e, Cache cache, Object key, Object value) {
//                logger.error("Redis occur handleCachePutError：key -> [{}]；value -> [{}]", key, value, e);
//            }
//
//            @Override
//            public void handleCacheEvictError(RuntimeException e, Cache cache, Object key) {
//                logger.error("Redis occur handleCacheEvictError：key -> [{}]", key, e);
//            }
//
//            @Override
//            public void handleCacheClearError(RuntimeException e, Cache cache) {
//                logger.error("Redis occur handleCacheClearError：", e);
//            }
//        };
//        return cacheErrorHandler;
//    }
}
