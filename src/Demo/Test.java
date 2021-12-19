/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;

/**
 * @author Administrator
 * @date 2021/7/1311:51
 */
public class Test  {

	@Override
	public int hashCode() {
		return 0;
	}

	public static void main(String[] args) {
		new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				method.invoke(proxy);
				return null;
			}
		};
		Calendar.getInstance();


	}
}