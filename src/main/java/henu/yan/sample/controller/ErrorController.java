package henu.yan.sample.controller;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 自定义错误页
 * 返回错误信息，若网页访问，返回thymeleaf模板，若网络请求，则返回JSON数据
 */
@Controller
public class ErrorController extends BasicErrorController {

    public ErrorController(ErrorAttributes errorAttributes,
                           ServerProperties serverProperties,
                           List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, serverProperties.getError(), errorViewResolvers);
    }

    /**
     * 错误信息返回thymeleaf模板
     */
    @Override
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        HttpStatus status = getStatus(request);
        Map<String, Object> model = getErrorAttributes(
                request, isIncludeStackTrace(request, MediaType.TEXT_HTML));
        model.put("customMsg", "出错了");
        ModelAndView modelAndView =
                new ModelAndView("errorPage", model, status);
        return  modelAndView;
    }
    /**
     * 错误信息返回JSON数据
     */
    @Override
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> body = getErrorAttributes(request,
                isIncludeStackTrace(request, MediaType.ALL));
        body.put("customMsg", "出错了");
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(body, status);
    }
}
