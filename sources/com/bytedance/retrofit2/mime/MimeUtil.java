package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MimeUtil {
    private static final Pattern CHARSET = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    private MimeUtil() {
    }

    static {
        Covode.recordClassIndex(26046);
    }

    public static String parseCharset(String str) {
        return parseCharset(str, "UTF-8");
    }

    public static String parseCharset(String str, String str2) {
        Matcher matcher = CHARSET.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("[\"\\\\]", "");
        }
        return str2;
    }
}
