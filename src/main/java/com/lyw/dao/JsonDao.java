package com.lyw.dao;

import com.lyw.po.Json;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @outhor LiYouWei
 * @create 2020/10/1-8:52
 */
public interface JsonDao {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from student")
    @Results(id = "jsonresults" ,value = {
            @Result(id = true,property = "id",column = "stu_id"),
            @Result(property = "name",column = "stu_name"),
            @Result(property = "sex",column = "stu_sex")
    })
    List<Json> selectAll();
    /**
     * 根据id查询
     * @param stu_id
     * @return
     */
    @Select("select * from student where stu_id=#{stu_id}")
    @ResultMap("jsonresults")
    Json selectOne(int stu_id);

    /**
     * 添加
     * @param json
     * @return
     */
    @Insert("insert into student(stu_name,stu_sex) values(#{name},#{sex})")
    int insert(Json json);

    /**
     * 修改
     * @param json
     * @return
     */
    @Update("update student set stu_name=#{name},stu_sex=#{sex} where stu_id=#{id}")
    @ResultMap("jsonresults")
    int update (Json json);

    /**
     * 删除
     * @param stu_id
     * @return
     */
    @Delete("delete from student where stu_id=#{id}")
    int delete(int stu_id);
}
