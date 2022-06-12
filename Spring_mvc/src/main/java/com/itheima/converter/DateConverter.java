package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter  implements Converter<String, Date> {
    @Override
    public Date convert(String date) {
        //将日期字符串转换为日期对象返回
        SimpleDateFormat si=new SimpleDateFormat("yyyy-mm-dd");
            Date de=null;
        try {
             de = si.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return de;
    }
}
