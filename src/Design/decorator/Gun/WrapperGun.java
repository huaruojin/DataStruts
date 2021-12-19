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
 * @date 2021/7/1022:46
 */
public abstract class WrapperGun implements Gun{

	private Gun gun;

	public WrapperGun (Gun gun) {
		this.gun = gun;
	}

	@Override
	public void aim() {
		gun.aim();
	}

	@Override
	public void shoot() {
		gun.shoot();
	}

	@Override
	public void load() {
		gun.aim();
	}

	@Override
	public void unload() {
		gun.aim();
	}
	
}