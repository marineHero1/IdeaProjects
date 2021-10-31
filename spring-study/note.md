## 常用maven依赖
```xml
        <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>
```
## 注解
- @Autowired ： 自动装配bytype，byname
    如果Autowired不能唯一自动装配，则需要使用@Qualifier(value = "xxx")
- @Nullable ： 字段标记了这个注解，说明这个字段可以为null
- @Resource ： 自动装配byname，bytype
    带有参数name
