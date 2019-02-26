package com.spring.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DateUtil {
    public  static String format;
    public static String add_month(String date) throws Exception{
        String result="";

        format="yyyy-MM";
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date dt=sdf.parse(date);

        Calendar c=Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.MONTH,1);
        return sdf.format(c.getTime());
    }

    public static List<Map<String,Object>> convertDate(List<Map<String,Object>> list){
        format="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(format);

        list.forEach(l->{
            l.forEach((k,v)->{
                if (v instanceof Date){
                    l.put(k,sdf.format(v));
                }
            });
        });
        return list;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(DateUtil.add_month("2018-12"));

        SimpleDateFormat sdft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdft.format(new Date(1545096383000L)));
    }
}
