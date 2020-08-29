/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: helloController
 * Author:   Administrator
 * Date:     2020-03-18 23:55
 * Description: start project
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.domain;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈start project〉
 *
 * @author Administrator
 * @create 2020-03-18
 * @since 1.0.0
 */
public class helloModel implements Serializable {
    private static final long serialVersionUID = -4598775929060098550L;

    /**订单扩展信息流水号*/
//    @Id
//    @ApiModelProperty(value = "订单扩展信息流水号", dataType = "String")
//    @Column(name = "order_extend_id", nullable = false, columnDefinition = "VARCHAR(64) COMMENT '订单扩展信息流水号'")
    private String orderExtendId;

    /**订单顺序号*/
//    @ApiModelProperty(value = "订单顺序号", dataType = "String")
//    @Column(name = "order_id", nullable = false, columnDefinition = "VARCHAR(64) COMMENT '订单顺序号'")
    private String orderId;

    /**订单来源*/
//    @ApiModelProperty(value = "订单来源", dataType = "String")
//    @Column(name = "platform_id", columnDefinition = "VARCHAR(20) COMMENT '订单来源'")
    private String platformId;

    /**商户编号*/
//    @ApiModelProperty(value = "商户编号", dataType = "String")
//    @Column(name = "merchant_id",  nullable = false, columnDefinition = "VARCHAR(10) COMMENT '商户编号'")
    private String merchantId;


    public String getOrderExtendId() {
        return orderExtendId;
    }

    public void setOrderExtendId(String orderExtendId) {
        this.orderExtendId = orderExtendId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }


}