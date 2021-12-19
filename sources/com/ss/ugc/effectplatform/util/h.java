package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import d.a.c.c;
import d.a.c.g;
import d.a.e.b;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.m.p;
import h.w;

public final class h {

    /* renamed from: a */
    public static String f153963a = "760.0.0.148-alpha.2-mt";

    /* renamed from: b */
    public static final d.a.b.a<com.ss.ugc.effectplatform.i.a> f153964b = new d.a.b.a<>(null);

    /* renamed from: c */
    public static final h f153965c = new h();

    /* renamed from: d */
    private static final h.h f153966d = i.a((h.f.a.a) a.f153967a);

    private static byte[] a() {
        return (byte[]) f153966d.getValue();
    }

    private h() {
    }

    static {
        Covode.recordClassIndex(102673);
    }

    static final class a extends m implements h.f.a.a<byte[]> {

        /* renamed from: a */
        public static final a f153967a = new a();

        static {
            Covode.recordClassIndex(102674);
        }

        a() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ byte[] invoke() {
            String str = h.f153963a;
            b.a("EffectPlatformAES", "initialize-->platformVersion=".concat(String.valueOf(str)));
            if (str != null) {
                String a2 = c.a(g.a(com.ss.ugc.effectplatform.g.a.a(str + ":android")));
                if (a2 != null) {
                    String substring = a2.substring(8, 24);
                    l.a((Object) substring, "");
                    b.a("EffectPlatformAES", "md5: " + str + ":android -> " + substring);
                    return com.ss.ugc.effectplatform.g.a.a(substring);
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new RuntimeException();
        }
    }

    public static /* synthetic */ String a(h hVar, String str) {
        return a(str, a());
    }

    public final String a(String str, String str2) {
        l.c(str2, "");
        if (p.a((CharSequence) str2)) {
            return a(this, str);
        }
        String a2 = c.a(g.a(com.ss.ugc.effectplatform.g.a.a(str2 + ":android")));
        if (a2 != null) {
            String substring = a2.substring(8, 24);
            l.a((Object) substring, "");
            return a(str, com.ss.ugc.effectplatform.g.a.a(substring));
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        if (r6 >= r5) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r38, byte[] r39) {
        /*
        // Method dump skipped, instructions count: 961
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.h.a(java.lang.String, byte[]):java.lang.String");
    }
}
