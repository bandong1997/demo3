package cn.dw.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author INS
 * @create 2020-04-15 15:38
 * 自定义类型转换器
 */
public class MyConverter implements Converter<String , Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date s = null;
        try {
            s = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return s;
    }
}
