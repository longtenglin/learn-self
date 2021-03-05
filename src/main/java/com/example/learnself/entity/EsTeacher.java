package com.example.learnself.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mr.ZhaoNan
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("es_teacher")
public class EsTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("tch_id")
    private String tchId;

    @TableField("tch_name")
    private String tchName;

    @TableField("user_id")
    private String userId;

    @TableField("tch_position")
    private String tchPosition;

    @TableField("tch_class")
    private String tchClass;

    @TableField("tch_school")
    private String tchSchool;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("updater")
    private String updater;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("creator")
    private String creator;

    @TableField("delete_flag")
    private Integer deleteFlag;


}
