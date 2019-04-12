package com.zcz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZCZ
 * @create 2018-12-24-14:37
 */
@RestController
public class TestController {
    @RequestMapping("/ttt")
    public String find(){
        System.out.println("asds");
        return "findall";
    }
}
