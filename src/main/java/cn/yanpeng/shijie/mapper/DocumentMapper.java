package cn.yanpeng.shijie.mapper;

import cn.yanpeng.shijie.pojo.Document;

import java.util.List;
/**
 * @ClassName DocumentMapper
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
public interface DocumentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Document record);

    Document selectByPrimaryKey(Long id);

    List<Document> selectAll();

    int updateByPrimaryKey(Document record);
}