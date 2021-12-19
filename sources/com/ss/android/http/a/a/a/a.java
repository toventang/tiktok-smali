package com.ss.android.http.a.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(36754);
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            try {
                return URLEncoder.encode(str, "ISO-8859-1");
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (str2.equals("null_encoding")) {
            return str;
        } else {
            return URLEncoder.encode(str, str2);
        }
    }

    public static String a(List<? extends c> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (c cVar : list) {
            String a2 = a(cVar.a(), str);
            String b2 = cVar.b();
            if (b2 != null) {
                str2 = a(b2, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
