/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import java.util.Stack;

/**
 * @author Administrator
 * @date 2020/8/2922:53
 */
public class BracketUtil {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if (ch==('(')||ch==('[')||ch==('{')){
				stack.push(ch);
			}else {
				if (stack.isEmpty()){return false;}
				//取栈顶元素
				char top = stack.pop();
				if (ch == ')'&&top!='(' ){return  false;}
				if (ch==']'&&top!='[') {return false;}
				if (ch=='}'&&top!='{'){return false;}
			}
		}
		return stack.isEmpty();
	}
}