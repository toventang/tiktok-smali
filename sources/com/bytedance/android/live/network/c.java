package com.bytedance.android.live.network;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public abstract /* synthetic */ class c {
    static {
        Covode.recordClassIndex(6625);
    }

    public static String a(List<Pair<String, String>> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String a2 = a((String) pair.first, str);
            String str2 = (String) pair.second;
            String a3 = str2 != null ? a(str2, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(a3);
        }
        return sb.toString();
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
