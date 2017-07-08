package com.damon.utils.StringUtil;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by damon on 2017/7/8.
 * 字符串相关工具类
 */

public class StringVerify {

    private StringVerify() {
        throw new AssertionError();
    }

    /**
     * 检测邮箱地址是否合法
     *
     * @param email
     * @return true合法 false不合法
     */
    public static boolean isEmail(String email) {
        if (null == email || "".equals(email))
            return false;
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * 检测邮箱地址是否合法
     *
     * @param editText
     * @return true合法 false不合法
     */
    public static boolean isEmail(EditText editText) {
        if (null == editText || "".equals(editText.getText().toString()))
            return false;
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher m = p.matcher(editText.getText().toString());
        return m.matches();
    }

    /**
     * 判断是否大陆邮编
     *
     * @param zipString
     * @return true合法 false不合法
     */
    public static boolean isZipNO(String zipString) {
        if (null == zipString && "".equals(zipString))
            return false;
        String str = "^[1-9][0-9]{5}$";
        return Pattern.compile(str).matcher(zipString).matches();
    }

    /**
     * 判断是否大陆邮编
     *
     * @param editText
     * @return true合法 false不合法
     */
    public static boolean isZipNO(EditText editText) {
        if (null == editText && "".equals(editText.getText().toString()))
            return false;
        String str = "^[1-9][0-9]{5}$";
        return Pattern.compile(str).matcher(editText.getText().toString()).matches();
    }

}
