/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: helloController
 * Author:   Administrator
 * Date:     2020-03-18 23:55
 * Description: start project
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br>
 * 〈start project〉
 *
 * @author Administrator
 * @create 2020-03-18
 * @since 1.0.0
 */
@Controller
public class HelloServiceImpl {
    @RequestMapping("/index")
    public String sayHello() {
        return "index";
    }
}