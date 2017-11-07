package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: demo
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/10/16 18:51
 * @version:1.0
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/indexyyy")
    public String llindex() {
        return "index";
    }
}