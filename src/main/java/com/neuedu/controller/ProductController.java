package com.neuedu.controller;

import com.neuedu.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/3/21.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;
    @GetMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("list",productService.list());
        return "product/list";
    }
    @GetMapping("/ajax")
    @ResponseBody
    public String ajax(Integer id){
        System.out.println(id);
       return "aaaaaa";
    }
}
