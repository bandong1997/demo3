package cn.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author INS
 * @create 2020-04-15 14:37
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    //文件上传
    @RequestMapping("/load")
    public String upload(String username, MultipartFile upload, HttpServletRequest request){
        System.out.println(username);
        System.out.println(upload);

        //1.文件上传路径
        String realPath = request.getSession().getServletContext().getRealPath("/upload"); //获取项目的绝对路径
        //创建目录
        File realFile = new File(realPath);
        if(!realFile.exists()){//判断这个文件件是否存在，不存在创建
            realFile.mkdirs();
        }

        //2.生成随机文件名
        String uuid = UUID.randomUUID().toString().replace("-", "");//将随机生成文件中的-更改的字符串
        //获取扩展名
        //获取文件的真实名称
        String originalFilename = upload.getOriginalFilename();
        //截取扩展名
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        //唯一文件名
        String fileName = uuid+substring;

        //3.文件上传
        try {
            upload.transferTo(new File(realPath,fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "test";
    }
    //
    public void test(){
        
    }
}
