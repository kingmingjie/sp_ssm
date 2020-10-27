/*
 * Copyright (c) 2005, 2014, EVECOM Technology Co.,Ltd. All rights reserved.
 * EVECOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 */
package com.sp.share.util;

import org.apache.tomcat.util.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Title: StringUtil.java
 *
 * @author Fandy Liu
 * @created 2014年9月28日 下午10:18:03
 * @Description:String工具类
 */
public class StringUtil {

    /**
     * 常用正则表达式
     */
    public final static String REGEXP_INTEGER_1 = "^\\d+$"; // 匹配非负整数（正整数 + 0）
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_INTEGER_2 = "^[0-9]*[1-9][0-9]*$"; // 匹配正整数
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_INTEGER_3 = "^((-\\d+) ?(0+))$"; // 匹配非正整数（负整数
    /**
     * 常用正则表达式
     */
// + 0）
    public final static String REGEXP_INTEGER_4 = "^-[0-9]*[1-9][0-9]*$"; // 匹配负整数
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_INTEGER_5 = "^-?\\d+$"; // 匹配整数
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_FLOAT_1 = "^\\d+(\\.\\d+)?$"; // 匹配非负浮点数（正浮点数
    /**
     * 常用正则表达式:匹配正浮点数
     */
// + 0）
    public final static String REGEXP_FLOAT_2 =
            "^(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*))$";
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_FLOAT_3 =
            "^((-\\d+(\\.\\d+)?) ?(0+(\\.0+)?))$"; // 匹配非正浮点数（负浮点数
    // +
    /**
     * 常用正则表达式:匹配负浮点数
     */
// 0）
    public final static String REGEXP_FLOAT_4 =
            "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*)))$";
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_FLOAT_5 =
            "^(-?\\d+)(\\.\\d+)?$"; // 匹配浮点数
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LETTER_1 =
            "^[A-Za-z]+$";// 匹配由26个英文字母组成的字符串
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LETTER_2 =
            "^[A-Z]+$";// 匹配由26个英文字母的大写组成的字符串
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LETTER_3 =
            "^[a-z]+$";// 匹配由26个英文字母的小写组成的字符串
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LETTER_4 =
            "^[A-Za-z0-9]+$";// 匹配由数字和26个英文字母组成的字符串
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LETTER_5 =
"^\\w+$";// 匹配由数字、26个英文字母或者下划线组成的字符串
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_EMAIL =
            "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$"; // 匹配email地址
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_URL_1 =
            "^[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$"; // 匹配url
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_URL_2 = "[a-zA-z]+://[^\\s]*"; // 匹配url
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_CHINESE_1 = "[\\u4e00-\\u9fa5]"; // 匹配中文字符
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_CHINESE_2 = "[^\\x00-\\xff]"; // 匹配双字节字符(包括汉字在内)
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_LINE = "\\n[\\s ? ]*\\r"; // 匹配空行：
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_HTML_1 = "/ <(.*)>.* <\\/\\1> ? <(.*) \\/>/"; // 匹配HTML标记
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_STARTENDEMPTY = "(^\\s*) ?(\\s*$)"; // 匹配首尾空格
    /**
     * 常用正则表达式:匹配帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
     */
    public final static String REGEXP_ACCOUNTNUMBER = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_TELEPHONE = "\\d{3}-\\d{8} ?\\d{4}-\\d{7}"; // 匹配国内电话号码，匹配形式如
    // 0511-4405222
    // 或
    // 021-87888822
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_QQ = "[1-9][0-9]{4,}"; // 腾讯QQ号,
    // 腾讯QQ号从10000开始
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_POSTBODY = "[1-9]\\d{5}(?!\\d)"; // 匹配中国邮政编码
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_IDCARD = "\\d{15} ?\\d{18}"; // 匹配身份证,
    // 中国的身份证为15位或18位
    /**
     * 常用正则表达式
     */
    public final static String REGEXP_IP = "\\d+\\.\\d+\\.\\d+\\.\\d+";// IP
    /**
     * 常用正则表达式
     */
    public static final Pattern REFERER_PATTERN = Pattern.compile("@([^@^\\s^:]{1,})([\\s\\:\\,\\;]{0,1})");

    /**
     * 字符编码
     */
    public static String encoding = "UTF-8";

    /**
     * Url Base64编码
     *
     * @param data 待编码数据
     * @return String 编码数据
     * @throws Exception the exception
     * @author Page Pan
     * @created 2019 /11/11 19:25:24 Encode string.
     */
    public static String encode(String data) throws Exception {
        // 执行编码
        byte[] b = Base64.encodeBase64URLSafe(data.getBytes(encoding));

        return new String(b, encoding);
    }

    /**
     * Url Base64解码
     *
     * @param data 待解码数据
     * @return String 解码数据
     * @throws Exception the exception
     * @author Page Pan
     * @created 2019 /11/11 19:25:24 Decode string.
     */
    public static String decode(String data) throws Exception {
        // 执行解码
        byte[] b = Base64.decodeBase64(data.getBytes(encoding));

        return new String(b, encoding);
    }

    /**
     * URL编码（utf-8）
     *
     * @param source the source
     * @return string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 Url encode string.
     */
    public static String urlEncode(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, encoding);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据内容类型判断文件扩展名
     *
     * @param contentType 内容类型
     * @return file ext
     * @author Page Pan
     * @created 2019 /11/11 19:25:25
     */
    public static String getFileExt(String contentType) {
        String fileExt = "";
        if ("image/jpeg".equals(contentType))
            fileExt = ".jpg";
        else if ("audio/mpeg".equals(contentType))
            fileExt = ".mp3";
        else if ("audio/amr".equals(contentType))
            fileExt = ".amr";
        else if ("video/mp4".equals(contentType))
            fileExt = ".mp4";
        else if ("video/mpeg4".equals(contentType))
            fileExt = ".mp4";
        return fileExt;
    }

    /**
     * 获取bean名称
     *
     * @param bean the bean
     * @return string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 Bean name string.
     */
    public static String beanName(Object bean) {
        String fullClassName = bean.getClass().getName();
        String classNameTemp = fullClassName.substring(fullClassName.lastIndexOf(".") + 1, fullClassName.length());
        return classNameTemp.substring(0, 1) + classNameTemp.substring(1);
    }

    /**
     * 格式化字符串
     * <p>
     * 例：formateString("xxx{0}bbb",1) = xxx1bbb
     *
     * @param str    the str
     * @param params the params
     * @return string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 Formate string string.
     */
    public static String formateString(String str, String... params) {
        for (int i = 0; i < params.length; i++) {
            str = str.replace("{" + i + "}", params[i] == null ? "" : params[i]);
        }
        return str;
    }

    /**
     * 获取UUID by jdk
     *
     * @param is32bit the is 32 bit
     * @return uuid by jdk
     * @author Page Pan
     * @created 2019 /11/11 19:25:25
     */
    public static String getUuidByJdk(boolean is32bit) {
        String uuid = UUID.randomUUID().toString();
        if (is32bit) {
            return uuid.toString().replace("-", "");
        }
        return uuid;
    }

    /**
     * 描述 create.
     *
     * @param ig the ig
     * @return the string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 Conver to string string.
     * @Description:把数组转换为一个用逗号分隔的字符串 ，以便于用in+String 查询
     */
    public static String converToString(String[] ig) {
        String str = "";
        StringBuffer strSb = new StringBuffer();
        if (ig != null && ig.length > 0) {
            for (int i = 0; i < ig.length; i++) {
                // str += ig[i] + ",";
                strSb.append(ig[i]);
                strSb.append(",");
            }
        }
        str = strSb.toString();

        str = str.substring(0, str.length() - 1);
        return str;
    }

    /**
     * 描述 create.
     *
     * @param list the list
     * @return the string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 List to string string.
     * @Description:把list转换为一个用逗号分隔的字符串
     */
    public static String listToString(@SuppressWarnings("rawtypes") List list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    sb.append(list.get(i) + ",");
                } else {
                    sb.append(list.get(i));
                }
            }
        }
        return sb.toString();
    }

    /**
     * 常用正则表达式
     *
     * @param ids the ids
     * @return the string
     * @author Page Pan
     * @created 2019 /11/11 19:25:25 To sql string.
     */
    public static String toSql(String ids) {
        if (null == ids || ids.isEmpty()) {
            return "";
        }

        String[] idsArr = ids.split(",");
        StringBuilder sqlSb = new StringBuilder();
        int length = idsArr.length;
        for (int i = 0, size = length - 1; i < size; i++) {
            sqlSb.append(" '").append(idsArr[i]).append("', ");
        }
        if (length != 0) {
            sqlSb.append(" '").append(idsArr[length - 1]).append("' ");
        }
        return sqlSb.toString();
    }

    /**
     * 加前导
     *
     * @param n   数值
     * @param len 长度
     * @return string
     * @author Yancey Qiu
     * @created 2015年9月10日 下午3:13:21
     */
    public static String paddingIntPrefixZero(long n, int len) {
        String nStr = String.valueOf(n);

        int nStrLen = nStr.length();

        // 如果票号长度大于或等于要求长度，则直接返回票号
        if (nStrLen >= len) {
            return nStr;
        }
        // 否则格式化票号至所需长度
        else {
            for (int i = nStrLen; i < len; i++) {
                nStr = "0" + nStr;
            }

            return nStr;
        }
    }

    /**
     * 去除字数字字符串末尾的0
     *
     * @param s the s
     * @return string
     * @author Alan Yang
     * @created 2016 -3-24 上午9:29:48
     */
    public static String remove0Suf(String s) {
        // if (null == s || s.equals("")) {
        // return s;
        // } else {
        // while (s.length() > 0) {
        // String suf = s.substring(s.length() - 1, s.length());
        // if (!suf.equals("0")) {
        // break;
        // }
        // s = s.substring(0, s.length() - 1);
        // }
        // return s;
        // }
        if (null == s || s.equals("")) {
            return s;
        } else {
            if(s.length() >= 4){
                if ("00".equals(s.substring(s.length() - 2, s.length()))) {
                    return "3501";
                }
            }
            
            return s;
        }
    }

    /**
     * Prefix for system property placeholders: "${"
     */
    public static final String PLACEHOLDER_PREFIX = "${";
    /**
     * Suffix for system property placeholders: "}"
     */
    public static final String PLACEHOLDER_SUFFIX = "}";

    /**
     * 描述 短信参数替换
     *
     * @param text      the text
     * @param parameter the parameter
     * @return string
     * @author Fandy Liu
     * @created 2016年7月20日 下午10:29:02
     */
    public static String placeholders(String text, Map<String, String> parameter) {
        if (parameter == null || parameter.isEmpty()) {
            return text;
        }
        StringBuffer buf = new StringBuffer(text);
        int startIndex = buf.indexOf(PLACEHOLDER_PREFIX);
        while (startIndex != -1) {
            int endIndex = buf.indexOf(PLACEHOLDER_SUFFIX, startIndex + PLACEHOLDER_PREFIX.length());
            if (endIndex != -1) {
                String placeholder = buf.substring(startIndex + PLACEHOLDER_PREFIX.length(), endIndex);
                int nextIndex = endIndex + PLACEHOLDER_SUFFIX.length();
                try {
                    String propVal = parameter.get(placeholder);
                    if (propVal != null) {
                        buf.replace(startIndex, endIndex + PLACEHOLDER_SUFFIX.length(), propVal);
                        nextIndex = startIndex + propVal.length();
                    } else {
//                        log.warn("Could not resolve placeholder '" + placeholder + "' in [" + text + "] ");
                    }
                } catch (Exception ex) {
//                    log.warn("Could not resolve placeholder '" + placeholder + "' in [" + text + "]: " + ex);
                }
                startIndex = buf.indexOf(PLACEHOLDER_PREFIX, nextIndex);
            } else {
                startIndex = -1;
            }
        }
        return buf.toString();
    }

    /**
     * 字符串转JSON
     *
     * @param s the s
     * @return string
     * @author Alan Yang
     * @created 2017 -3-13 下午4:47:30
     */
    public static String string2Json(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            switch (c) {
                case '\"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                case '/':
                    sb.append("\\/");
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 描述 判断是否是数字
     *
     * @param str the str
     * @return boolean
     * @author Fandy Liu
     * @created 2018年7月24日 下午7:38:37
     */
    public static boolean isNumber(String str) {
        // 采用正则表达式的方式来判断一个字符串是否为数字，这种方式判断面比较全
        // 可以判断正负、整数小数
        boolean isInt = Pattern.compile("^-?[1-9]\\d*$").matcher(str).find();
        boolean isDouble = Pattern.compile("^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$").matcher(str).find();
        return isInt || isDouble;

    }

    /**
     * 描述 相似度转百分比
     *
     * @param resule the resule
     * @return string
     * @author Fandy Liu
     * @created 2018年7月26日 下午2:00:00
     */
    public static String similarityResult(double resule) {
        return NumberFormat.getPercentInstance(new Locale("en ", "US ")).format(resule);
    }

    /**
     * 相似度比较
     *
     * @param strA the str a
     * @param strB the str b
     * @return double
     * @author Fandy Liu
     * @created 2018年7月26日 下午2:00:29
     */
    public static double similarDegree(String strA, String strB) {
        String newStrA = removeSign(strA);
        String newStrB = removeSign(strB);
        int temp = Math.max(newStrA.length(), newStrB.length());
        int lenA = newStrA.length();
        int lenB = newStrB.length();
        int temp2 = 0;
        // 在此判断newStrA和newStrB的长度
        if (lenA >= lenB ? true : false) {
            temp2 = longestCommonSubstring(newStrA, newStrB).length();
        } else {
            temp2 = longestCommonSubstring(newStrB, newStrA).length();
        }
        return temp2 * 1.0 / temp;

    }

    /**
     * 描述
     *
     * @param str the str
     * @return string
     * @author Fandy Liu
     * @created 2018年7月26日 下午1:58:58
     */
    private static String removeSign(String str) {
        StringBuffer sb = new StringBuffer();
        for (char item : str.toCharArray())
            if (charReg(item)) {
                sb.append(item);
            }
        return sb.toString();
    }

    /**
     * 利用正则表达式来解析字符串
     *
     * @param charValue the char value
     * @return boolean
     * @author Fandy Liu
     * @created 2018年7月26日 下午1:58:51
     */
    private static boolean charReg(char charValue) {
        return (charValue >= 0x4E00 && charValue <= 0X9FA5) || (charValue >= 'a' && charValue <= 'z')
                || (charValue >= 'A' && charValue <= 'Z') || (charValue >= '0' && charValue <= '9');

    }

    /**
     * 解析两个字符串的相同部分的长度，返回公共部分，strA字符串长度 > strB字符串
     *
     * @param strA the str a
     * @param strB the str b
     * @return string
     * @author Fandy Liu
     * @created 2018年7月26日 下午1:59:03
     */
    public static String longestCommonSubstring(String strA, String strB) {
        char[] chars_strA = strA.toCharArray();
        char[] chars_strB = strB.toCharArray();
        int m = chars_strA.length;
        int n = chars_strB.length;
        int[][] matrix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (chars_strA[i - 1] == chars_strB[j - 1])
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                else
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
            }
        }
        char[] result = new char[matrix[m][n]];
        int currentIndex = result.length - 1;
        while (matrix[m][n] != 0) {
            if (matrix[n] == matrix[n - 1])
                n--;
            else if (matrix[m][n] == matrix[m - 1][n])
                m--;
            else {
                result[currentIndex] = chars_strA[m - 1];
                currentIndex--;
                n--;
                m--;
            }
        }
        return new String(result);
    }

    /**
     * 判断Object是否为空或空字符串
     *
     * @param str the str
     * @return the boolean
     * @author Page Pan
     * @created 2019 /11/11 19:25:26 Is empty boolean.
     */
    public static boolean isNotNullOrEmpty(Object str) {
        return null != str && !"null".equals(str) && (str + "").length() > 0;
    }

    /**
     * @description 是否为空
     *
     * @author Pellym Huang
     * @created 2020/4/29 11:43
     */
    public static boolean isNullOrEmpty(Object str) {
        return !isNotNullOrEmpty(str);
    }
    /**
     * @description obj转String
     *
     * @author Pellym Huang
     * @created 2019/1/7 9:30
     */
    public static String toStr(Object obj) {
        if (obj == null) {
            return "";
        } else {
            return obj.toString();
        }
    }
}
