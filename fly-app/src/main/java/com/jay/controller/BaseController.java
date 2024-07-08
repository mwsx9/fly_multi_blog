package com.jay.controller;


import com.jay.service.CategoryService;
import com.jay.service.PostService;
import com.jay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiang.wei on 2018/10/31
 *
 * @author xiang.wei
 */
public class BaseController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    PostService postService;
    @Autowired
    UserService userService;
    @Autowired
    CategoryService categoryService;

    
}
