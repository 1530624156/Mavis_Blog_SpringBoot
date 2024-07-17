package com.ld.poetry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RootController
 *
 * @author Mavis郭逸轩
 * @since 2024/7/17 16:22
 */
@RestController
public class RootController {
    @RequestMapping("/")
    public String index() {
        return "Mavis_Blog Start Successful";
    }
}
