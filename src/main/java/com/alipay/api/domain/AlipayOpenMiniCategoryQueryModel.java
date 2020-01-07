package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目树查询
 *
 * @author auto create
 * @since 1.0, 2019-12-16 14:50:09
 */
public class AlipayOpenMiniCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2544625928529139697L;

	/**
	 * 是否需要过滤不可用类目
	 */
	@ApiField("is_filter")
	private Boolean isFilter;

	public Boolean getIsFilter() {
		return this.isFilter;
	}
	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

}
