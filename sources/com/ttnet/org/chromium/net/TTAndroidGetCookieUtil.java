package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTAndroidGetCookieUtil {
    static {
        Covode.recordClassIndex(103399);
    }

    public static String getCookieHeader(String str) {
        Map<String, List<String>> map;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                map = cookieHandler.get(new URI(str), hashMap);
            } else {
                map = null;
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                        int i2 = 0;
                        for (String str2 : entry.getValue()) {
                            if (i2 > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i2++;
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return sb.toString();
        }
    }
}
