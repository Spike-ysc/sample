package henu.yan.sample.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件上传工具类
 */
public class UploadUtil {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    /**
     * 上传文件保存
     * 文件默认保存为临时文件里
     * 具体地址：name/当前日期的文件夹的目录/随机生成的图片名称
     * @param uploadFile    上传文件
     * @param req   网络请求
     * @param name  文件夹名称
     * @return 默认返回图片地址
     * TODO： 若实际保存需要修改保存地址，或需要返回Json数据,需要修改此处代码
     */
    public  String save(MultipartFile uploadFile, HttpServletRequest req, String name){
        String realPath = req.getSession().getServletContext().getRealPath("/"+name+"/");
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()){
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        assert oldName != null;
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(folder, newName));
            return req.getScheme() +"://" + req.getServerName() + ":" + req.getServerPort() + "/"+name+"/"+ format + newName;
        }catch (IOException e){
            e.printStackTrace();
        }
        return "上传失败";
    }
}
