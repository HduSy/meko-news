package cn.meko.mapper;

import cn.meko.entity.Htb;
import cn.meko.entity.HtbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HtbMapper {
    int countByExample(HtbExample example);

    int deleteByExample(HtbExample example);

    int deleteByPrimaryKey(String htbh);

    int insert(Htb record);

    int insertSelective(Htb record);

    List<Htb> selectByExample(HtbExample example);

    Htb selectByPrimaryKey(String htbh);

    int updateByExampleSelective(@Param("record") Htb record, @Param("example") HtbExample example);

    int updateByExample(@Param("record") Htb record, @Param("example") HtbExample example);

    int updateByPrimaryKeySelective(Htb record);

    int updateByPrimaryKey(Htb record);
}