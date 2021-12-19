package com.vk.api.sdk.internal;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.f.e;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f156344a = {new y(ab.a(c.class), "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;")};

    /* renamed from: b  reason: collision with root package name */
    public static final c f156345b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final com.vk.api.sdk.f.c f156346c = e.a(b.f156348a);

    private static StringBuilder a() {
        return (StringBuilder) e.a(f156346c, f156344a[0]);
    }

    private c() {
    }

    static final class b extends m implements h.f.a.a<StringBuilder> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156348a = new b();

        static {
            Covode.recordClassIndex(103831);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StringBuilder invoke() {
            return new StringBuilder();
        }
    }

    static {
        Covode.recordClassIndex(103829);
    }

    public static final class a extends m implements h.f.a.b<Byte, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156347a = new a();

        static {
            Covode.recordClassIndex(103830);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Byte b2) {
            String a2 = com.a.a("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2.byteValue())}, 1));
            l.a((Object) a2, "");
            return a2;
        }
    }

    private static String a(String str, boolean z) {
        if (!z) {
            return str;
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            l.a((Object) encode, "");
            return encode;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static StringBuilder a(StringBuilder sb, String str) {
        l.c(sb, "");
        StringBuilder append = sb.append(str);
        l.a((Object) append, "");
        return append;
    }

    public static String a(String str, Map<String, String> map, String str2, int i2, boolean z) {
        StringBuilder sb;
        a().setLength(0);
        StringBuilder a2 = a(a(a(a(), "v="), str), "&https=1&");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((!l.a((Object) key, (Object) "v")) && (!l.a((Object) key, (Object) "access_token")) && (true ^ l.a((Object) key, (Object) "api_id"))) {
                a2 = a(a(a(a(a2, key), "="), a(value, z)), "&");
            }
        }
        if (str2 != null && str2.length() != 0) {
            sb = a(a(a(a2, "access_token="), str2), "&");
        } else if (i2 != 0) {
            sb = a(a(a(a2, "api_id="), String.valueOf(i2)), "&");
        } else {
            sb = a(a2, "&");
        }
        sb.setLength(sb.length() - 1);
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
