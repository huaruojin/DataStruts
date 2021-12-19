/*
* Copyright 2021 tuhu.cn All right reserved. This software is the
* confidential and proprietary information of tuhu.cn ("Confidential
* Information"). You shall not disclose such Confidential Information and shall
* use it only in accordance with the terms of the license agreement you entered
* into with Tuhu.cn
*/
package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
* @author Administrator 
* @date 2021/7/2513:19
*/public class ProxyTest {


	public static void main(String[] args) {

		int a = -2147483648;
		int b = a-1;
		System.out.println(b);
		Class<?>[] classes = new Class<?>[]{People.class};
		Student student = new Student();
		Object proxyObject = Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),classes,new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("8点起床");
				return method.invoke(student,args);
			}
		} );
		People poepleProxy = (People)proxyObject;
		poepleProxy.run();
	}

	/*static class  StudentInvocation implements InvocationHandler{
		private Student student;
		public StudentInvocation (Student student) {
			this.student = student;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("8点起床");
			return method.invoke(student,args);
		}
	}*/
}