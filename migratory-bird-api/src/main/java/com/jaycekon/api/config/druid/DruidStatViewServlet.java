package com.jaycekon.api.config.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * TODO 加点注释
 *
 * @author <a href="mailto:weijie_huang"> weijie_huang </a>
 * 2018/5/28 14:07
 */

@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                // IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name = "allow", value = "127.0.0.1"),
                // IP黑名单 (存在共同时，deny优先于allow)
                @WebInitParam(name = "deny", value = ""),
                // 用户名
                @WebInitParam(name = "loginUsername", value = "admin"),
                // 密码
                @WebInitParam(name = "loginPassword", value = "admin"),
                // 禁用HTML页面上的“Reset All”功能
                @WebInitParam(name = "resetEnable", value = "false")
        }
)
public class DruidStatViewServlet extends StatViewServlet {
}
