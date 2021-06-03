package com.ylh.execute.dao;

import com.baomidou.mybatisplus.annotation.SqlParser;
import com.ylh.execute.common.api.dto.LogDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseCommonMapper {

    /**
     * 保存日志
     * @param dto
     */
    @SqlParser(filter=true)
    void saveLog(@Param("dto") LogDTO dto);

}
