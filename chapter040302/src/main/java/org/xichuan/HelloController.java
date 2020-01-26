package org.xichuan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
//http://localhost:8081/chapter02/hello
public class HelloController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");


    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/hello2")
    public String hello(HttpSession session) {
       int maxInactiveInterval = session.getMaxInactiveInterval();
       return String.valueOf(maxInactiveInterval);
        //return "hello https!";
    }


//http://localhost:8081/chapter040302/upload.html
    @PostMapping("//upload")//单文件上传
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        System.out.println("realPath:  "+realPath);
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        System.out.println("folder:  "+folder.getPath());
        String oldName = uploadFile.getOriginalFilename();
        System.out.println("oldName:  "+oldName);
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        System.out.println("newName:  "+newName);
        try {
            uploadFile.transferTo(new File(folder, newName));
            String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/chapter040302/uploadFile/" + format + newName;
            System.out.println("filePath:  "+filePath);
            return filePath;
        } catch (IOException e) {
//            e.printStackTrace();
        }
        return "上传失败!";
    }
    @PostMapping("/uploads")//多文件上传
    public String upload(MultipartFile[] uploadFiles, HttpServletRequest req) {
        for (MultipartFile uploadFile : uploadFiles) {
            String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
            System.out.println(realPath);
            String format = sdf.format(new Date());
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
            try {
                uploadFile.transferTo(new File(folder, newName));
                String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/chapter040302/uploadFile/" + format + newName;
//            return filePath;
                System.out.println(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "上传失败!";
    }
}
