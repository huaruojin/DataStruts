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
 * @date 2021/3/2323:24
 */
public class Women {
	private int iq;
	private int beautyIndex;
	private String name;

	public void say() {
		System.out.println("我的名字是"+name);
	}
	public Women(int iq,int beautyIndex,String name) {
		this.iq = iq;
		this.beautyIndex = beautyIndex;
		this.name = name;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public int getBeautyIndex() {
		return beautyIndex;
	}

	public void setBeautyIndex(int beautyIndex) {
		this.beautyIndex = beautyIndex;
	}

	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
}