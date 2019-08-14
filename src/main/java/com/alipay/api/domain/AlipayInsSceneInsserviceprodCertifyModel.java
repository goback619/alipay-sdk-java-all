package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务鉴权
 *
 * @author auto create
 * @since 1.0, 2019-05-28 10:04:58
 */
public class AlipayInsSceneInsserviceprodCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6794948412998486727L;

	/**
	 * 扩展信息，JSON字符串格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 唯一订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
