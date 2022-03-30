package com.ylhong.dao.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 商户主表
 * </p>
 *
 * @author ylhong
 * @since 2022-03-30
 */
@ToString
@Getter
@Setter
@TableName("bsn_merchant_mast")
public class BsnMerchantMast implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 客户主键
     */
    private Long customerId;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户简称
     */
    private String merchantNameAbbr;

    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 收单机构代码
     */
    private String acqCode;

    /**
     * 协议有效期（起）
     */
    private LocalDate beginDate;

    /**
     * 协议有效期（止）
     */
    private LocalDate endDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 创建部门
     */
    private Long createDept;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 审核人
     */
    private Long auditUser;

    /**
     * 审核部门
     */
    private Long auditDept;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人
     */
    private Long updateUser;

    /**
     * 修改部门
     */
    private Long updateDept;

    /**
     * 版本号(用于乐观锁控制)
     */
    private Integer updateNo;

    /**
     * 租户编号(用于多租户)
     */
    private Long tenantId;


}
