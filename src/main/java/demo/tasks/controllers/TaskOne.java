package demo.tasks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TaskOne {
    public String put(@RequestParam("image") MultipartFile multipartFile) {
        return "ok";
    }
}
