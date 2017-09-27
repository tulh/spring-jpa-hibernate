package com.higgsup.sample.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mi on 4/11/17.
 */
@Component
public class DateUtil {
    public final static String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    private final static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = ThreadLocal.withInitial(SimpleDateFormat::new);

    public static String getDateInFormat(Date date) {

        return getDateInFormat(DEFAULT_DATE_PATTERN, date);
    }

    public static String getDateInFormat(String datePattern, Date date) {
        SimpleDateFormat simpleDateFormat = simpleDateFormatThreadLocal.get();
        simpleDateFormat.applyPattern(datePattern);
        return simpleDateFormat.format(date);
    }
    public static String getDateInFormat(String datePattern, String date, String datePatternFormat) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        simpleDateFormat.applyPattern(datePattern);

        SimpleDateFormat simpleDateFormatPattern = new SimpleDateFormat(datePatternFormat);
        simpleDateFormatPattern.applyPattern(datePatternFormat);

        try {
            return simpleDateFormat.format(simpleDateFormatPattern.parse(date));
        } catch (ParseException e) {
            return "01/01/1900";
        }
    }
}