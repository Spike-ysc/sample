package henu.yan.sample.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class CustomExceptionHandler {
    //处理上传文件大小超出限制异常，并抛出错误
    //TODO:默认返回错误内容，若Spring Boot需要返回Json数据，需要修改此处代码
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e,
                                HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("上传文件大小超出限制");
        out.flush();
        out.close();
    }
}
