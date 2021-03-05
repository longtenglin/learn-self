package com.example.learnself.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@TableName("es_admin")
public class EsAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("username")
    @TableId("user_id")
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("roles")
    private String roles;

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
