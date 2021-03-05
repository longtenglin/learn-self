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
@TableName("es_student")
public class EsStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("stu_id")
    private String stuId;

    @TableField("stu_name")
    private String stuName;

    @TableField("user_id")
    private String userId;

    @TableField("stu_position")
    private String stuPosition;

    @TableField("stu_class")
    private String stuClass;

    @TableField("stu_grade")
    private String stuGrade;

    @TableField("stu_school")
    private String stuSchool;

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
