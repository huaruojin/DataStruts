/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package women;

/**
 * @author Administrator
 * @date 2021/3/2323:36
 */
public class EducateWomen extends WrapperWomen{

	public EducateWomen(Women women) {
		super(women);
	}

	@Override
	public int getIq() {
		return super.getIq()+20;
	}
}