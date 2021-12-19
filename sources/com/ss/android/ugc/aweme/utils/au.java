package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.github.a.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class au {
    static {
        Covode.recordClassIndex(93316);
    }

    private static boolean a(char c2) {
        if ((c2 < 19968 || c2 > 40869) && !Character.isUpperCase(c2) && !Character.isLowerCase(c2)) {
            return false;
        }
        return true;
    }

    private static boolean b(char c2) {
        if (Character.isDigit(c2) || Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c2)).matches()) {
            return true;
        }
        return false;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        char charAt = str.charAt(0);
        if (a(charAt)) {
            String upperCase = c(str).substring(0, 1).toUpperCase();
            if (TextUtils.isEmpty(upperCase)) {
                return str.substring(0, 1).toUpperCase();
            }
            return upperCase;
        } else if (b(charAt)) {
            return "#";
        } else {
            b(str);
            return "#";
        }
    }

    private static boolean b(String str) {
        Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
        if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
            return false;
        }
        return true;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < trim.length(); i2++) {
            sb.append(a.a(trim.charAt(i2)));
        }
        return sb.toString();
    }
}
