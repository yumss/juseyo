/**
 * @file		ValidationUtil.java
 * @brief   나이확인용 
 * @author  개발1팀 / 파트1
 * @author  김연근 ( solaris@wemakeprice.com )
 * @date    생성: 2014-03-14
 * @date    최종수정: 2014-03-14
 */

package com.juseyo.commons.lib.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ValidationUtil {

	/**
	 * 생년월일을 기준으로 만 나이가 제한나이를 지났는지 체크한다.
	 * 
	 * @param birth 생년월일(YYYYMMdd)
	 * @param age 제한나이
	 * @return
	 */
	public static boolean checkOverAge(String birth, int age)  throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd", new Locale("ko", "KOREA"));
		Calendar cal = Calendar.getInstance();
		cal.add(1, -(age));
		String strDate = formatter.format(cal.getTime());
		int intDate = Integer.parseInt(strDate); // 14년 전의 날짜
		int birthDate = Integer.parseInt(birth);
				
		return birthDate <= intDate;
	}
}
