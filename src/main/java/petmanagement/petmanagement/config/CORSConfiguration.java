/*
 * Copyright(c) 2019  All Rights Reserved
 * Author: Chuchu He ,also Ye Chen
 *
 */

package petmanagement.petmanagement.config;

/**
 * 描述:
 * 帮着通信的
 *
 * @author root
 * @create 2019-03-03 下午6:12
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");
    }
}
//hello ,i edit it !!!!
/*
大家的CORSConfiguration都长上面那样，也不用改
我们的CORSConfiguration配置类继承了WebMvcConfiugrationAdaper父类并且重写了addCorsMappings方法
addMapping：配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径。
            这里的是系统的所有路径
allowedMethods：允许所有的请求方法访问该跨域资源服务器，如：POST、GET、PUT、DELETE等。
allowedOrigins：允许所有的请求域名访问我们的跨域资源，可以固定单条或者多条内容，如："http://www.baidu.com"，只有百度可以访问我们的跨域资源。
allowedHeaders：允许所有的请求header访问，可以自定义设置任意请求头信息，如："X-YAUTH-TOKEN"

反正就是帮着前后端传送数据的
 */