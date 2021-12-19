package com.bytedance.sdk.a.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f43479a;

    /* renamed from: b  reason: collision with root package name */
    public String f43480b;

    static {
        Covode.recordClassIndex(26626);
    }

    public h() {
        this.f43479a = new LinkedHashMap();
        this.f43480b = null;
    }

    public final String toString() {
        String str;
        if (this.f43479a.isEmpty()) {
            return this.f43480b;
        }
        Map<String, String> map = this.f43479a;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b2 = b(entry.getKey(), "UTF-8");
            String value = entry.getValue();
            if (value != null) {
                str = b(value, "UTF-8");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                str = str.replace("+", "%20");
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b2);
            sb.append("=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        String str2 = this.f43480b;
        if (str2 == null || str2.length() == 0) {
            return sb2;
        }
        if (this.f43480b.indexOf(63) >= 0) {
            return this.f43480b + "&" + sb2;
        }
        return this.f43480b + "?" + sb2;
    }

    public final void a(String str) {
        this.f43479a.put(str, "19");
    }

    public h(String str) {
        this.f43479a = new LinkedHashMap();
        this.f43480b = str;
    }

    private static String b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void a(String str, String str2) {
        this.f43479a.put(str, str2);
    }
}
