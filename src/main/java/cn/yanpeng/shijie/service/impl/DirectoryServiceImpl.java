package cn.yanpeng.shijie.service.impl;

import cn.yanpeng.shijie.mapper.DirectoryMapper;
import cn.yanpeng.shijie.pojo.Directory;
import cn.yanpeng.shijie.service.IDirectoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DirectoryServiceImpl
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
@Service
public class DirectoryServiceImpl implements IDirectoryService {

    @Resource
    private DirectoryMapper directoryMapper;

    @Override
    public List<Directory> selectAll() {

        return directoryMapper.selectAll();
    }
}
