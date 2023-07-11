package lfcmybatisplus.samples2.lfcmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author longfc
 * @since 2023-07-07
 */
@Data
public class User {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;
    private Integer age;
    private String email;
}