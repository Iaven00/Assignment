package com.yufop.tran.mapper;

import com.yufop.tran.pojo.table.Transunit;
import com.yufop.tran.pojo.table.TransunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransunitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int countByExample(TransunitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int deleteByExample(TransunitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int deleteByPrimaryKey(Integer transunitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int insert(Transunit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int insertSelective(Transunit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    List<Transunit> selectByExample(TransunitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    Transunit selectByPrimaryKey(Integer transunitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int updateByExampleSelective(@Param("record") Transunit record, @Param("example") TransunitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int updateByExample(@Param("record") Transunit record, @Param("example") TransunitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int updateByPrimaryKeySelective(Transunit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transunit
     *
     * @mbggenerated Tue Jun 13 21:38:00 CST 2023
     */
    int updateByPrimaryKey(Transunit record);
}