package henu.yan.sample.controller;

import henu.yan.sample.util.UploadUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 文件上传接口
 */
@RestController
public class FileUploadController {

    private final UploadUtil uploadUtil = new UploadUtil(); //文件上传工具类

   //单文件上传
    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req){
        return uploadUtil.save(uploadFile, req, "uploadFile");
    }

    //多文件上传
    @PostMapping("/uploads")
    public String uploads(MultipartFile[] uploadFiles, HttpServletRequest req){
        StringBuilder result = new StringBuilder();
        for (MultipartFile uploadFile : uploadFiles) {
            result.append(uploadUtil.save(uploadFile, req, "uploadFiles"));
        }
        return result.toString();
    }
}
