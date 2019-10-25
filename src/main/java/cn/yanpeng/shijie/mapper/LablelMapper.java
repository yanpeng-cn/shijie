package cn.yanpeng.shijie.mapper;

import cn.yanpeng.shijie.pojo.Lablel;

import java.util.List;

/**
 * @ClassName LablelMapper
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
public interface LablelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Lablel record);

    Lablel selectByPrimaryKey(Long id);

    List<Lablel> selectAll();

    int updateByPrimaryKey(Lablel record);
}