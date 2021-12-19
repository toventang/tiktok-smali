package com.bytedance.lynx.hybrid;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.e.d;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.d.a;
import com.lynx.tasm.e.c;
import h.f.b.l;
import h.m.p;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f40974a;

    /* renamed from: b  reason: collision with root package name */
    static ConcurrentHashMap<String, Typeface> f40975b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final h f40976c = new h();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f40977d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static c.a f40978e;

    public static final class a extends c.a {
        static {
            Covode.recordClassIndex(25107);
        }

        a() {
        }

        private static Typeface c(j jVar, a.EnumC1269a aVar, String str) {
            Typeface typeface = null;
            if (TextUtils.isEmpty(str) || aVar == a.EnumC1269a.LOCAL) {
                return null;
            }
            if (str == null) {
                l.a();
            }
            int a2 = p.a((CharSequence) str, "base64,", 0, false, 6);
            if (!p.b(str, "data:", false) || a2 == -1) {
                return null;
            }
            String substring = str.substring(a2 + 7);
            l.a((Object) substring, "");
            try {
                typeface = com.lynx.tasm.utils.l.a(jVar, Base64.decode(substring, 0));
                return typeface;
            } catch (Exception e2) {
                a(jVar, e2.getMessage());
                return typeface;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[Catch:{ Exception -> 0x0091 }] */
        @Override // com.lynx.tasm.e.c.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Typeface a(com.lynx.tasm.behavior.j r7, com.lynx.tasm.d.a.EnumC1269a r8, java.lang.String r9) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.h.a.a(com.lynx.tasm.behavior.j, com.lynx.tasm.d.a$a, java.lang.String):android.graphics.Typeface");
        }
    }

    private h() {
    }

    private static void a() {
        a aVar = new a();
        f40978e = aVar;
        c.a(aVar);
        r.a(b.f40983a);
    }

    static {
        Covode.recordClassIndex(25106);
    }

    public static void a(com.bytedance.lynx.hybrid.e.b bVar) {
        l.c(bVar, "");
        if (f40974a || f40977d.compareAndSet(false, true)) {
            try {
                a();
                i.a(bVar);
                LynxEnv b2 = LynxEnv.b();
                l.a((Object) b2, "");
                if (b2.f()) {
                    f40974a = true;
                } else {
                    f40977d.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                f40977d.set(false);
                com.bytedance.lynx.hybrid.j.c.a(th, "LynxKit Init Failed", (String) null, 4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements r.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40983a = new b();

        static {
            Covode.recordClassIndex(25108);
        }

        b() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.a
        public final Typeface a(String str, int i2) {
            return r.a(d.a().getAssets(), str, i2, "font/");
        }
    }
}
