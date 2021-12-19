/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package singleton;

/**
 * @author Administrator
 * @date 2021/3/160:11
 */
//可防止反序列化，因为枚举没构造函数。序列化（可以通过反射类对象进行初始化）
public enum Mgr {
	INSTANCE;
}