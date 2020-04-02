package com.rj.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: rj
 * @Date: 2020-04-02 11:06
 * @Version: 1.0
 * @Table和@Id都是JPA注解，
 * @Table用于配置表与实体类的映射关系，@Id用于标识主 键属性。
 * @Data lombok 自动生成getter 和 setter
 * @AllArgsConstructor lombok 自动生成全参构造方法
 * @NoArgsConstructor lombok 自动生成无参构造方法
 */
@Table(name="tb_brand")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable {
    @Id
    private Integer id;//品牌ID
    private String name;//品牌名称
    private String image;//品牌图片地址
    private String letter;//品牌首字母
    private Integer seq;//排序

}
