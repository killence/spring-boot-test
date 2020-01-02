package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
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
    /**
     * MaxUploadSizeExceededException异常的特殊之处在于，当上传文件的大小超过限制时，它的抛出并是在进入Controller之前，
     * 所以不能在controller中利用注解@ExceptionHandler（MaxUploadSizeExceededException.class）来定义该异常的处理方法；
     * @param e
     * @param redirectAttributes
     * @return
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleError1(MaxUploadSizeExceededException e, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message",e.getCause().getMessage());
        return "redirect:show";
    }

}
