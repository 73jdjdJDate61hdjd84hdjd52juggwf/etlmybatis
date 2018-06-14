package com.huawei.mybatis.dao;

import com.huawei.mybatis.bean.Ltsprojectpo;
import com.huawei.mybatis.bean.LtsprojectpoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LtsprojectpoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    long countByExample(LtsprojectpoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int deleteByExample(LtsprojectpoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int insert(Ltsprojectpo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int insertSelective(Ltsprojectpo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    List<Ltsprojectpo> selectByExample(LtsprojectpoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    Ltsprojectpo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") Ltsprojectpo record, @Param("example") LtsprojectpoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int updateByExample(@Param("record") Ltsprojectpo record, @Param("example") LtsprojectpoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(Ltsprojectpo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ltsprojectpo
     *
     * @mbg.generated Fri Jun 15 02:03:06 GMT+08:00 2018
     */
    int updateByPrimaryKey(Ltsprojectpo record);
}