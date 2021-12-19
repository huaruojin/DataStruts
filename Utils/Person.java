/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author Administrator
 * @date 2021/4/2123:18
 */
public class Person {
	String name;
	int age;
	Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public String getName (){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}