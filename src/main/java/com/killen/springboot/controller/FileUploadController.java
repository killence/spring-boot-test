package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName FileUploadController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-29
 * @Version V1.0
 **/
@Controller
public class FileUploadController {

    @GetMapping("/")
    public String index(){
        return "upload";
    }

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            //System.out.println(1);
            redirectAttributes.addFlashAttribute("message", "Please select a file to u pload");
            return "redirect:show";
        }
        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            // UPLOADED_FOLDER ⽂件本地存储地址
            Path path = Paths.get("D://file//" + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:show";
    }

    @GetMapping("/show")
    public String show(){
        return "show";
    }
}
