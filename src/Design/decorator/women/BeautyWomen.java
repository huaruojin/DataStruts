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
 * @date 2021/3/2421:23
 */
public class BeautyWomen extends WrapperWomen{

	public BeautyWomen(Women women) {
		super(women);
	}

	@Override
	public int getBeautyIndex() {
		return super.getBeautyIndex()+20;
	}
}