package com.bytedance.apm.q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

public final class v {
    static {
        Covode.recordClassIndex(14723);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append("://");
            stringBuffer.append(url.getHost());
            if (url.getPort() != -1) {
                stringBuffer.append(":");
                stringBuffer.append(url.getPort());
            }
            stringBuffer.append(url.getPath());
            return stringBuffer.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8") : str + "&" + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8");
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + a(entry.getKey().toString(), "UTF-8") + "=" + a(map.get(entry.getKey()).toString(), "UTF-8") : str + "&" + a(entry.getKey().toString(), "UTF-8") + "=" + a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
