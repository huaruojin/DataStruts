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
 * @date 2021/7/1022:49
 */
public class ShootGun extends WrapperGun{

	public ShootGun(Gun gun) {
		super(gun);
	}

	@Override
	public void shoot() {
		super.shoot();
		System.out.println("装了瞄准");
	}
}