package com.bytedance.j.a.c;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.w;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.d.a;
import com.lynx.tasm.e.c;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f38987a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38988b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f38989c;

    /* renamed from: d  reason: collision with root package name */
    static ConcurrentHashMap<String, Typeface> f38990d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static o f38991e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f38992f = new d();

    private d() {
    }

    public static final /* synthetic */ o a() {
        o oVar = f38991e;
        if (oVar == null) {
            l.a("token");
        }
        return oVar;
    }

    static {
        Covode.recordClassIndex(23867);
    }

    public static final class a extends c.a {
        static {
            Covode.recordClassIndex(23868);
        }

        static final class b extends m implements h.f.a.b<Throwable, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f38993a = new b();

            static {
                Covode.recordClassIndex(23870);
            }

            b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Throwable th) {
                l.c(th, "");
                return z.f158842a;
            }
        }

        /* renamed from: com.bytedance.j.a.c.d$a$a  reason: collision with other inner class name */
        static final class C0925a extends m implements h.f.a.b<ap, z> {
            final /* synthetic */ String $src;

            static {
                Covode.recordClassIndex(23869);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0925a(String str) {
                super(1);
                this.$src = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ Exception -> 0x0070 }] */
            @Override // h.f.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.service.base.ap r6) {
                /*
                // Method dump skipped, instructions count: 123
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.j.a.c.d.a.C0925a.invoke(java.lang.Object):java.lang.Object");
            }
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

        @Override // com.lynx.tasm.e.c.a
        public final Typeface a(j jVar, a.EnumC1269a aVar, String str) {
            Object b2;
            if (str == null || str.length() == 0) {
                return null;
            }
            w wVar = (w) d.a().b_(w.class);
            if (wVar == null || (b2 = wVar.b()) == null || !(b2 instanceof Typeface)) {
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) d.a().b_(IResourceLoaderService.class);
                if (iResourceLoaderService != null) {
                    com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2 = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
                    jVar2.s = d.a();
                    jVar2.d("sub_source");
                    iResourceLoaderService.loadAsync(str, jVar2, new C0925a(str), b.f38993a);
                }
                Typeface typeface = d.f38990d.get(str);
                if (typeface == null) {
                    return c(jVar, aVar, str);
                }
                return typeface;
            }
            LLog.b("LynxKit", "get typeface from preload service");
            return (Typeface) b2;
        }
    }

    public static final class b implements r.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38994a = new b();

        static {
            Covode.recordClassIndex(23871);
        }

        b() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.a
        public final Typeface a(String str, int i2) {
            return r.a(e.a().getAssets(), str, i2, "font/");
        }
    }
}
