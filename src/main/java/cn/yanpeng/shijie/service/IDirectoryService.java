package cn.yanpeng.shijie.service;

import cn.yanpeng.shijie.pojo.Directory;
import java.util.List;
/**
 * @ClassName IDirectoryService
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
public interface IDirectoryService {

    List<Directory> selectAll();
}
