package cn.yanpeng.shijie.controller;

import cn.yanpeng.shijie.pojo.Directory;
import cn.yanpeng.shijie.service.IDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
@Controller
public class DemoController {


    @Autowired
    private IDirectoryService directoryService;

    /**
     * @Author YANPENG
     * @Description //TODO 
     * @Date 18:05 2019/10/25
     * @Param []
     * @return java.util.List<cn.yanpeng.shijie.pojo.Directory>
     **/
    @GetMapping
    @ResponseBody
    private List<Directory> findAll(){
        return directoryService.selectAll();
    }

}
