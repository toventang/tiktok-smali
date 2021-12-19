package com.ss.android.ugc.aweme.commercialize.log;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ad;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.l;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class RawURLGetter {

    /* renamed from: a  reason: collision with root package name */
    public static final RawURLGetter f74701a = new RawURLGetter();

    /* renamed from: b  reason: collision with root package name */
    private static final h f74702b = i.a((h.f.a.a) b.f74707a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f74703c = i.a((h.f.a.a) c.f74708a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f74704d = i.a((h.f.a.a) d.f74709a);

    /* renamed from: e  reason: collision with root package name */
    private static String f74705e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f74706f;

    public interface RawUrlApi {
        static {
            Covode.recordClassIndex(46070);
        }

        @com.bytedance.retrofit2.b.h
        @ad(a = "vas_ad_track")
        q<String> doGet(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);
    }

    public interface a {
        static {
            Covode.recordClassIndex(46071);
        }

        void a(int i2, boolean z, Exception exc);
    }

    public static RawUrlApi a() {
        return (RawUrlApi) f74702b.getValue();
    }

    public static String b() {
        return (String) f74703c.getValue();
    }

    public static SharedPreferences c() {
        return (SharedPreferences) f74704d.getValue();
    }

    private RawURLGetter() {
    }

    static final class d extends m implements h.f.a.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f74709a = new d();

        static {
            Covode.recordClassIndex(46074);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SharedPreferences invoke() {
            SharePrefCache inst = SharePrefCache.inst();
            h.f.b.l.b(inst, "");
            return inst.getSharePref();
        }
    }

    private static final void d() {
        com.bytedance.ies.ugc.appcontext.f.g().d(f.f74712a);
    }

    static final class b extends m implements h.f.a.a<RawUrlApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74707a = new b();

        static {
            Covode.recordClassIndex(46072);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RawUrlApi invoke() {
            return RetrofitFactory.a().b(com.ss.android.c.b.f59141e).a(false).d().a(RawUrlApi.class);
        }
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f74708a = new c();

        static {
            Covode.recordClassIndex(46073);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = RawURLGetter.a(com.bytedance.ies.ugc.appcontext.d.a());
            if (a2 != null && a2.length() != 0) {
                return a2;
            }
            String property = System.getProperty("http.agent");
            if (property == null) {
                return "";
            }
            return property;
        }
    }

    static {
        Covode.recordClassIndex(46069);
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f74710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74711b;

        static {
            Covode.recordClassIndex(46075);
        }

        e(String str, a aVar) {
            this.f74710a = str;
            this.f74711b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String a2 = RawURLGetter.a("other");
            if (a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            List<com.ss.android.http.a.a> c2 = z ? null : n.c(new com.ss.android.http.a.b.a("User-Agent", a2));
            ArrayList arrayList = new ArrayList();
            if (c2 != null) {
                for (com.ss.android.http.a.a aVar : c2) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
                }
            }
            try {
                RawURLGetter.a().doGet(this.f74710a, arrayList).get();
                RawURLGetter.a(this.f74711b, 200, true, null);
            } catch (com.ss.android.http.a.a.b e2) {
                RawURLGetter.a(this.f74711b, e2.getStatusCode(), false, e2);
            } catch (com.bytedance.frameworks.baselib.network.http.cronet.b.c e3) {
                RawURLGetter.a(this.f74711b, e3.getStatusCode(), false, e3);
            } catch (Exception e4) {
                RawURLGetter.a(this.f74711b, 0, false, e4);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f74712a = new f();

        static {
            Covode.recordClassIndex(46076);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                new f.c().b((w) new RawURLGetter$updateUa$1$1()).a();
            }
        }
    }

    public static String a(Context context) {
        MethodCollector.i(13010);
        if (!com.bytedance.common.utility.m.a(f74705e)) {
            String str = f74705e;
            MethodCollector.o(13010);
            return str;
        }
        String a2 = com.bytedance.common.c.b.f26745a.a(context);
        f74705e = a2;
        if (!com.bytedance.common.utility.m.a(a2)) {
            String str2 = f74705e;
            MethodCollector.o(13010);
            return str2;
        }
        if (!f74706f && context != null && (context instanceof Activity)) {
            f74706f = true;
            try {
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                h.f.b.l.b(settings, "");
                f74705e = settings.getUserAgentString();
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f74705e;
        MethodCollector.o(13010);
        return str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter.a(java.lang.String):java.lang.String");
    }

    public static final void a(String str, a aVar) {
        h.f.b.l.d(str, "");
        b.i.b(new e(str, aVar), g.a());
    }

    public static void a(a aVar, int i2, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.a(i2, z, exc);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
