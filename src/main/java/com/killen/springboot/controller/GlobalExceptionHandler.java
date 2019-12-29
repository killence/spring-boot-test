package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 监控Multipart上传文件大小是否受限
 * @ClassName GlobalExceptionHandler
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-29
 * @Version V1.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MultipartException.class)
    public String handleError1(MultipartException e, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message",e.getCause().getMessage());
        System.out.println(1);
        return "redirect:/show";
    }


}
