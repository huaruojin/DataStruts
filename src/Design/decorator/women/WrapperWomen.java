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
 * @date 2021/3/2323:26
 */
public abstract class WrapperWomen extends Women{
	private Women women;

	public WrapperWomen (Women women) {
		super(women.getIq(),women.getBeautyIndex(),women.getName());
		this.women = women;
	}

	@Override
	public int getIq() {
		return women.getIq();
	}

	@Override
	public int getBeautyIndex() {
		return women.getBeautyIndex();
	}

	@Override
	public String getName() {
		return women.getName();
	}

	@Override
	public void say() {
		women.say();
	}
}