package com.tarena.test;

import java.util.Scanner;

import org.junit.Test;

public class TestCase {
	/**
	 * 【金色十月线上编程比赛规则】 一个小女孩正在用左手手指数数，从1数到n。 她从拇指算作1开始数起，然后，食指为2，中指为3，无名指为4，小指为5。
	 * 接下来调转方向，无名指算作6，中指为7，食指为8，大拇指为9，如此反复。 问最后会停在那个手指上？
	 * 用编号1、2、3、4、5依次表示大拇指、食指、中指、无名指、小指。 输入格式：
	 * 输入多组数据。每组数据占一行，只包含一个整数n(1<=n<=1000000000)。 输出格式：
	 * 每组数据占一行，只包含一个介于1和5之间的整数，表示最后停留的手指。
	 */
	public void countMain(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		while ((str = scanner.nextLine().trim()) != null) {
			int num = Integer.valueOf(str);
			System.out.println(countNumber(num));
		}
		scanner.close();
	}

	public Integer countNumber(Integer num) {
		int count = (num - 1) / 4;
		int over = (num - 1) % 4;
		int result;
		if (count % 2 == 0) {
			result = 1 + over;
		} else {
			result = 5 - over;
		}
		return result;
	}

	@Test
	public void test() {
	}
}
