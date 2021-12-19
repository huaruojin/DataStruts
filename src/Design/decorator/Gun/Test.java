/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Gun;

/**
 * @author Administrator
 * @date 2021/7/1122:15
 */
public class Test {

	public static void main(String[] args) {
		Gun gun = new Ak47();
		Gun shootGun = new ShootGun(gun);
		shootGun.shoot();
	}
}