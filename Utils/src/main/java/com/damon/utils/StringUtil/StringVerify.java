package com.damon.utils.StringUtil;

import android.widget.EditText;
import android.widget.TextView;

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
     * 检测字符串是否为空
     *
     * @param string
     * @return true为空 false不为空
     */
    public static boolean isEmpty(String string) {
        if (null == string || "".equals(string))
            return true;
        return false;
    }

    /**
     * 检测字符串是否为空
     *
     * @param textView
     * @return true为空 false为为空
     */
    public static boolean isEmpty(TextView textView) {
        if (null == textView || null == textView.getText().toString() || "".equals(textView.getText().toString()))
            return false;
        return true;
    }

    /**
     * 检测字符串不为空
     *
     * @param string
     * @return true不为空 false为空
     */
    public static boolean notEmpty(String string) {
        if (null == string || "".equals(string))
            return false;
        return true;
    }

    /**
     * 检测字符串不为空
     *
     * @param textView
     * @return true不为空 false为空
     */
    public static boolean notEmpty(TextView textView) {
        if (null == textView || null == textView.getText().toString() || "".equals(textView.getText().toString()))
            return false;
        return true;
    }

    /**
     * 检测邮箱地址是否合法
     *
     * @param email
     * @return true合法 false不合法
     */
    public static boolean isEmail(String email) {
        if (notEmpty(email))
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
        if (notEmpty(editText))
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
        if (notEmpty(zipString))
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
        if (notEmpty(editText))
            return false;
        String str = "^[1-9][0-9]{5}$";
        return Pattern.compile(str).matcher(editText.getText().toString()).matches();
    }

    /**
     * 判断是否大陆手机号码
     *
     * @param mobile
     * @return true合法 false不合法
     */
    public static boolean isMobile(String mobile) {
        if (notEmpty(mobile))
            return false;
        String str = "(\\+\\d+)?1[34578]\\d{9}$";
        return Pattern.compile(str).matcher(mobile).matches();
    }

    /**
     * 判断是否大陆手机号码
     *
     * @param mobile
     * @return true合法 false不合法
     */
    public static boolean isMobile(EditText mobile) {
        if (notEmpty(mobile))
            return false;
        String str = "(\\+\\d+)?1[34578]\\d{9}$";
        return Pattern.compile(str).matcher(mobile.getText().toString()).matches();
    }


    /**
     * 判断是否大陆手机号码
     *
     * @param idcard
     * @return true合法 false不合法
     */
    public static boolean isIdCard(String idcard) {
        if (notEmpty(idcard))
            return false;
        return IdcardVerify.IDCardValidate(idcard);
    }

    /**
     * 判断是否大陆手机号码
     *
     * @param idcard
     * @return true合法 false不合法
     */
    public static boolean isIdCard(EditText idcard) {
        if (notEmpty(idcard))
            return false;
        return IdcardVerify.IDCardValidate(idcard.getText().toString());
    }


}
