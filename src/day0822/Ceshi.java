package day0822;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ceshi {
	public static void main(String[] args) {
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// 数据库中时间转换 to_char(date, "yyyy-mm-dd hh24:mi:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(c.getTime()));
	}
}
