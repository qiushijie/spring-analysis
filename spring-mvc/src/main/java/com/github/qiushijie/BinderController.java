package com.github.qiushijie;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/binder")
public class BinderController {

    /**
     * 类型转换
     * 还可以支持参数绑定等
     * 具体看WebDataBinder中方法
     */
    @InitBinder
    public void dateType(WebDataBinder binder){
        // 转换20-11-20格式
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }

    @GetMapping("/date")
    public String date(Date value) {
        System.out.println("date: " + value);
        return "bind ok";
    }

}
