package com.ss.android.ugc.aweme.ad.preload;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.e;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.m.p;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class AdLandPagePreloadServiceImpl implements IAdLandPagePreloadService {

    /* renamed from: f  reason: collision with root package name */
    public static final AdLandPagePreloadServiceImpl f66106f = b.f66115a;

    /* renamed from: g  reason: collision with root package name */
    public static final a f66107g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f66108a = "preload_land_page_analytics";

    /* renamed from: b  reason: collision with root package name */
    public final String f66109b = "premem_land_page_analytics";

    /* renamed from: c  reason: collision with root package name */
    public String f66110c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f66111d = "";

    /* renamed from: e  reason: collision with root package name */
    public final Keva f66112e = Keva.getRepo("commercial_preload_land_page_name");

    /* renamed from: h  reason: collision with root package name */
    private final String f66113h = "\"/** adInfo **/\"";

    /* renamed from: i  reason: collision with root package name */
    private final String f66114i = "commercial_preload_land_page_name";

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String e() {
        return "ad_commerce";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40637);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final AdLandPagePreloadServiceImpl f66115a = new AdLandPagePreloadServiceImpl();

        /* renamed from: b  reason: collision with root package name */
        public static final b f66116b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(40638);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final e a() {
        return f.f66130b;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String b() {
        return this.f66111d;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final boolean d() {
        return com.ss.android.ugc.aweme.settings.a.a();
    }

    static {
        Covode.recordClassIndex(40636);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void c() {
        l.b(b.a.f65586a, "");
        d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
        if (c2 != null) {
            c2.a();
        }
    }

    public static IAdLandPagePreloadService f() {
        MethodCollector.i(9803);
        Object a2 = com.ss.android.ugc.b.a(IAdLandPagePreloadService.class, false);
        if (a2 != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) a2;
            MethodCollector.o(9803);
            return iAdLandPagePreloadService;
        }
        if (com.ss.android.ugc.b.J == null) {
            synchronized (IAdLandPagePreloadService.class) {
                try {
                    if (com.ss.android.ugc.b.J == null) {
                        com.ss.android.ugc.b.J = new AdLandPagePreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9803);
                    throw th;
                }
            }
        }
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl = (AdLandPagePreloadServiceImpl) com.ss.android.ugc.b.J;
        MethodCollector.o(9803);
        return adLandPagePreloadServiceImpl;
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdLandPagePreloadServiceImpl f66117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66118b;

        static {
            Covode.recordClassIndex(40639);
        }

        c(AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl, String str) {
            this.f66117a = adLandPagePreloadServiceImpl;
            this.f66118b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r3 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
                if (r2 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.ad.b.b r1 = com.ss.android.ugc.aweme.ad.b.b.a.f65586a
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                com.ss.android.ugc.aweme.ad.b.c r0 = com.ss.android.ugc.aweme.ad.b.b.a()
                java.lang.String r0 = r0.b()
                com.bytedance.ies.ugc.aweme.network.e r0 = r2.b(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.d()
                java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r0 = com.ss.android.ugc.aweme.ad.network.CommonApi.class
                java.lang.Object r1 = r1.a(r0)
                com.ss.android.ugc.aweme.ad.network.CommonApi r1 = (com.ss.android.ugc.aweme.ad.network.CommonApi) r1
                if (r1 == 0) goto L_0x0051
                java.lang.String r0 = r3.f66118b
                com.bytedance.retrofit2.b r0 = r1.doGet(r0)
                if (r0 == 0) goto L_0x0051
                com.bytedance.retrofit2.u r0 = r0.execute()
                if (r0 == 0) goto L_0x0051
                T r2 = r0.f42630b
                java.lang.String r2 = (java.lang.String) r2
            L_0x0039:
                boolean r0 = com.bytedance.x.c.c.a(r2)
                if (r0 != 0) goto L_0x004e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66117a
                r0.f66110c = r2
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66117a
                com.bytedance.keva.Keva r1 = r0.f66112e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66117a
                java.lang.String r0 = r0.f66108a
                r1.storeString(r0, r2)
            L_0x004e:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0051:
                r2 = 0
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.c.call():java.lang.Object");
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdLandPagePreloadServiceImpl f66119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66120b;

        static {
            Covode.recordClassIndex(40640);
        }

        d(AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl, String str) {
            this.f66119a = adLandPagePreloadServiceImpl;
            this.f66120b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r3 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
                if (r2 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.ad.b.b r1 = com.ss.android.ugc.aweme.ad.b.b.a.f65586a
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                com.ss.android.ugc.aweme.ad.b.c r0 = com.ss.android.ugc.aweme.ad.b.b.a()
                java.lang.String r0 = r0.b()
                com.bytedance.ies.ugc.aweme.network.e r0 = r2.b(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.d()
                java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r0 = com.ss.android.ugc.aweme.ad.network.CommonApi.class
                java.lang.Object r1 = r1.a(r0)
                com.ss.android.ugc.aweme.ad.network.CommonApi r1 = (com.ss.android.ugc.aweme.ad.network.CommonApi) r1
                if (r1 == 0) goto L_0x0051
                java.lang.String r0 = r3.f66120b
                com.bytedance.retrofit2.b r0 = r1.doGet(r0)
                if (r0 == 0) goto L_0x0051
                com.bytedance.retrofit2.u r0 = r0.execute()
                if (r0 == 0) goto L_0x0051
                T r2 = r0.f42630b
                java.lang.String r2 = (java.lang.String) r2
            L_0x0039:
                boolean r0 = com.bytedance.x.c.c.a(r2)
                if (r0 != 0) goto L_0x004e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66119a
                r0.f66111d = r2
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66119a
                com.bytedance.keva.Keva r1 = r0.f66112e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f66119a
                java.lang.String r0 = r0.f66109b
                r1.storeString(r0, r2)
            L_0x004e:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0051:
                r2 = 0
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.d.call():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject b(String str) {
        return c.a(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void a(String str) {
        if (!com.bytedance.x.c.c.a(str)) {
            b.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String b(Long l2) {
        return "lynx_h5_" + l2 + "_";
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String a(Long l2) {
        if (l2 == null || l2.longValue() <= 0) {
            return null;
        }
        return this.f66112e.getString(String.valueOf(l2), "");
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int c(String str) {
        if (l.a((Object) str, (Object) "0da04670c45fcb4f5dee6049f06a9d77") || l.a((Object) str, (Object) "a1a15b782e3ee8a25247561a91a99835")) {
            l.b(b.a.f65586a, "");
            e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
            if (b2 != null) {
                return b2.s();
            }
            return 40;
        }
        l.b(b.a.f65586a, "");
        e b3 = com.ss.android.ugc.aweme.ad.b.b.b();
        if (b3 != null) {
            return b3.r();
        }
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void d(String str) {
        if (com.bytedance.x.c.c.a(str)) {
            this.f66112e.storeString(this.f66108a, "");
        } else if (com.bytedance.x.c.c.a(this.f66110c)) {
            i.b(new c(this, str), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void e(String str) {
        if (com.bytedance.x.c.c.a(str)) {
            this.f66112e.storeString(this.f66109b, "");
        } else if (com.bytedance.x.c.c.a(this.f66111d)) {
            i.b(new d(this, str), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void a(AwemeRawAd awemeRawAd) {
        l.d(awemeRawAd, "");
        l.b(b.a.f65586a, "");
        d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
        if (c2 != null) {
            c2.a(awemeRawAd);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String f(String str) {
        String str2;
        l.d(str, "");
        if (com.bytedance.x.c.c.a(this.f66110c)) {
            str2 = this.f66112e.getString(this.f66108a, "");
        } else {
            str2 = this.f66110c;
            if (str2 == null) {
                l.b();
            }
        }
        if (com.bytedance.x.c.c.a(str2)) {
            l.b(str2, "");
            return str2;
        }
        l.b(str2, "");
        return p.a(str2, this.f66113h, str, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String g(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -895866265:
                if (str.equals("splash")) {
                    return "cca47107bfcbdb211d88f3385aeede40";
                }
                return null;
            case 3138974:
                if (str.equals("feed")) {
                    return "cca47107bfcbdb211d88f3385aeede40";
                }
                return null;
            case 862628038:
                if (str.equals("lynx_feed")) {
                    return "a1a15b782e3ee8a25247561a91a99835";
                }
                return null;
            case 1856444385:
                if (str.equals("flutter_feed")) {
                    return "";
                }
                return null;
            case 2012743738:
                if (str.equals("dynamic_ad_feed")) {
                    return "a20813e75cff1b482e289722d8e7422b";
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final long a(long j2, long j3) {
        l.b(b.a.f65586a, "");
        d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
        if (c2 != null) {
            return c2.a(j2, j3);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void a(Long l2, String str) {
        if (l2 != null && l2.longValue() > 0 && !com.bytedance.x.c.c.a(str)) {
            this.f66112e.storeString(String.valueOf(l2), str);
        }
    }
}
