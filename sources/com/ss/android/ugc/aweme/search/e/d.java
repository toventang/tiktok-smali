package com.ss.android.ugc.aweme.search.e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.ss.android.ugc.aweme.web.k;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.File;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f121005a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f121006b = i.a((h.f.a.a) e.f121012a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f121007c = i.a((h.f.a.a) f.f121013a);

    static Keva a() {
        return (Keva) f121006b.getValue();
    }

    private static com.ss.android.ugc.aweme.util.a d() {
        return (com.ss.android.ugc.aweme.util.a) f121007c.getValue();
    }

    private d() {
    }

    static final class e extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f121012a = new e();

        static {
            Covode.recordClassIndex(78836);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return com.ss.android.ugc.aweme.search.f.a("search_common");
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.util.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f121013a = new f();

        static {
            Covode.recordClassIndex(78837);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.util.a invoke() {
            return new com.ss.android.ugc.aweme.util.a(TimeUnit.SECONDS.toMillis(10));
        }
    }

    private static IResourceService e() {
        return (IResourceService) c.a.a().a(IResourceService.class);
    }

    static {
        Covode.recordClassIndex(78831);
    }

    static boolean c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b2 = e.b();
        long j2 = a().getLong("easter_egg_lynx_timestamp", -1);
        long j3 = a().getLong("easter_egg_video_timestamp", -1);
        if (j2 < 0 || j3 < 0 || elapsedRealtime < j2 || elapsedRealtime < j3 || elapsedRealtime - j2 >= b2 || elapsedRealtime - j3 >= b2) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (e.a() && e() != null) {
            k kVar = k.f145061a;
            l.b(kVar, "");
            String c2 = kVar.c();
            String c3 = e.c();
            String d2 = e.d();
            l.b(c2, "");
            if (c2.length() != 0 && c3.length() != 0 && d2.length() != 0 && !c() && !d().a()) {
                a(c2, d2, c3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121009a = new b();

        static {
            Covode.recordClassIndex(78833);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.e.d$d  reason: collision with other inner class name */
    public static final class C3131d extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3131d f121011a = new C3131d();

        static {
            Covode.recordClassIndex(78835);
        }

        C3131d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121008a = new a();

        static {
            Covode.recordClassIndex(78832);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            boolean z;
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = eVar;
            String str = "";
            l.d(eVar2, str);
            try {
                String str2 = eVar2.n;
                if (str2 != null) {
                    str = str2;
                }
                z = new File(str).exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                d.a().storeLong("easter_egg_lynx_timestamp", SystemClock.elapsedRealtime());
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.lynx.hybrid.resource.d.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121010a = new c();

        static {
            Covode.recordClassIndex(78834);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.lynx.hybrid.resource.d.e eVar) {
            boolean z;
            com.bytedance.lynx.hybrid.resource.d.e eVar2 = eVar;
            String str = "";
            l.d(eVar2, str);
            try {
                String str2 = eVar2.n;
                if (str2 != null) {
                    str = str2;
                }
                z = new File(str).exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                d.a().storeLong("easter_egg_video_timestamp", SystemClock.elapsedRealtime());
            }
            return z.f158842a;
        }
    }

    private static void a(String str, String str2, String str3) {
        IResourceService e2 = e();
        if (e2 != null) {
            j jVar = new j(str);
            com.bytedance.lynx.hybrid.resource.config.a aVar = new com.bytedance.lynx.hybrid.resource.config.a(true);
            aVar.a(n.c(com.bytedance.lynx.hybrid.resource.config.f.GECKO));
            jVar.a(aVar);
            jVar.f41109e = 2;
            jVar.a(str2);
            e2.loadAsync("", jVar, a.f121008a, b.f121009a);
        }
        IResourceService e3 = e();
        if (e3 != null) {
            j jVar2 = new j(str);
            com.bytedance.lynx.hybrid.resource.config.a aVar2 = new com.bytedance.lynx.hybrid.resource.config.a(true);
            aVar2.a(n.c(com.bytedance.lynx.hybrid.resource.config.f.GECKO));
            jVar2.a(aVar2);
            jVar2.f41109e = 2;
            jVar2.a(str3);
            e3.loadAsync("", jVar2, c.f121010a, C3131d.f121011a);
        }
    }
}
