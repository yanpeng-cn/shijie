package cn.yanpeng.shijie.mapper;


import cn.yanpeng.shijie.pojo.Directory;

import java.util.List;
/**
 * @ClassName DirectoryMapper
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
public interface DirectoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Directory record);

    Directory selectByPrimaryKey(Long id);

    List<Directory> selectAll();

    int updateByPrimaryKey(Directory record);
}