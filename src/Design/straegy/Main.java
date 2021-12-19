/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Design.straegy;

import women.BeautyWomen;
import women.EducateWomen;
import women.GoodWomen;
import women.Women;
import singleton.Mgr;

/**
 * @author Administrator
 * @date 2021/3/1523:38
 */
public class Main {
	public static void main(String[] args) {
		//Mgr01 mgr01 = Mgr01.getInstance();
		Mgr mgr = Mgr.INSTANCE;

		Women women = new Women(80,50,"sads");
		EducateWomen educateWomen = new EducateWomen(women);
		BeautyWomen beautyWomen = new BeautyWomen(educateWomen);
		System.out.println(beautyWomen.getBeautyIndex()+"sssss"+beautyWomen.getIq());
		GoodWomen goodWomen = new GoodWomen(beautyWomen);
		goodWomen.say();

	}
}