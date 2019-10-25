package cn.yanpeng.shijie;

import cn.yanpeng.shijie.pojo.Directory;
import cn.yanpeng.shijie.service.IDirectoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShijieApplicationTests {

    @Autowired
    private IDirectoryService directoryService;

    @Test
    public void getDocument(){
        List<Directory> directories =
                directoryService.selectAll();
        Assert.assertEquals(directories.size(),0);
    }


}
