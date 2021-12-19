package com.bytedance.ies.android.base.runtime.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31897d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, String> f31898a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f31899b;

    /* renamed from: c  reason: collision with root package name */
    public String f31900c = "UTF-8";

    static {
        Covode.recordClassIndex(18645);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18646);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String a(String str, String str2) {
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

        public static String a(Map<String, String> map, String str) {
            String str2;
            StringBuilder sb = new StringBuilder();
            Set<String> keySet = map.keySet();
            if (keySet == null || keySet.isEmpty()) {
                return "";
            }
            for (String str3 : keySet) {
                String a2 = a(str3, str);
                String str4 = map.get(str3);
                if (str4 == null || (str2 = a(str4, str)) == null) {
                    str2 = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(a2);
                sb.append("=");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            l.a((Object) sb2, "");
            return sb2;
        }
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        if (this.f31898a.isEmpty()) {
            return this.f31899b;
        }
        String a2 = a.a(this.f31898a, this.f31900c);
        String str = this.f31899b;
        if (str == null || str.length() == 0) {
            return a2;
        }
        if (p.a((CharSequence) this.f31899b, '?', 0, false, 6) >= 0) {
            return this.f31899b + '&' + a2;
        }
        return this.f31899b + '?' + a2;
    }

    public d(String str) {
        l.c(str, "");
        this.f31899b = str;
    }
}
