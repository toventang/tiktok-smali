package com.bytedance.ies.xbridge.base.runtime.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Set;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35824c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f35825a;

    /* renamed from: b  reason: collision with root package name */
    public String f35826b = "UTF-8";

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, String> f35827d = new HashMap<>();

    static {
        Covode.recordClassIndex(21386);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21387);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static String a(String str, String str2) {
            if (str2 == null) {
                try {
                    str = URLEncoder.encode(str, "ISO_8859_1");
                } catch (UnsupportedEncodingException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else if (!l.a((Object) str2, (Object) "null_encoding")) {
                str = URLEncoder.encode(str, str2);
            }
            l.a((Object) str, "");
            return str;
        }
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        String str;
        if (this.f35827d.isEmpty()) {
            return this.f35825a;
        }
        HashMap<String, String> hashMap = this.f35827d;
        String str2 = this.f35826b;
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = hashMap.keySet();
        String str3 = "";
        if (keySet != null && !keySet.isEmpty()) {
            for (String str4 : keySet) {
                String a2 = a.a(str4, str2);
                String str5 = hashMap.get(str4);
                if (str5 == null || (str = a.a(str5, str2)) == null) {
                    str = str3;
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(a2);
                sb.append("=");
                sb.append(str);
            }
            String sb2 = sb.toString();
            l.a((Object) sb2, str3);
            str3 = sb2;
        }
        String str6 = this.f35825a;
        if (str6 == null || str6.length() == 0) {
            return str3;
        }
        if (p.a((CharSequence) this.f35825a, '?', 0, false, 6) >= 0) {
            return this.f35825a + '&' + str3;
        }
        return this.f35825a + '?' + str3;
    }

    public d(String str) {
        l.c(str, "");
        this.f35825a = str;
    }

    public final d a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f35827d.put(str, str2);
        return this;
    }
}
