package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping(value = "/fileupload.do",method = RequestMethod.POST)
    public String fileUpload(@RequestParam("file")MultipartFile file,
                             HttpServletRequest request, HttpServletResponse response) {
        try {
            String realPath = request.getSession().getServletContext().getRealPath("/upload");
            System.out.println("真实路径："+realPath);
            String filename=file.getOriginalFilename();
            String storeName=System.currentTimeMillis()+filename.substring(filename.lastIndexOf("."),filename.length());
            File dir=new File(realPath,storeName);
            if (!dir.exists()){
                dir.mkdirs();
            }
            file.transferTo(dir);

            System.out.println("文件上传成功!");
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "error";
    }

    @RequestMapping(value = "/springUpload.do",method = RequestMethod.POST)
    public String springUpload(HttpServletResponse response,HttpServletRequest request){
        try {
            long startTime=System.currentTimeMillis();
            CommonsMultipartResolver commonsMultipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
            if (commonsMultipartResolver.isMultipart(request)){
                MultipartRequest multipartRequest=(MultipartRequest) request;

                Iterator its=multipartRequest.getFileNames();

                String filePath=request.getSession().getServletContext().getRealPath("/upload/")+"multipart/";
                String fileName="";
                String realName="";
                MultipartFile m;
                while (((Iterator) its).hasNext()){


                    m=multipartRequest.getFile(its.next().toString());

                    if (m!=null && m.getSize()!=0 ){
                        realName=m.getOriginalFilename();
                        fileName=System.currentTimeMillis()+realName.substring(realName.lastIndexOf("."),realName.length());
                        File dir=new File(filePath,fileName);

                            dir.length();
                        if (!dir.exists()){
                            dir.mkdirs();
                        }
                        m.transferTo(dir);
                    }
                }
            }
            return "success";
        }catch (IOException e){
            e.printStackTrace();
        }
        return "error";
    }

}
