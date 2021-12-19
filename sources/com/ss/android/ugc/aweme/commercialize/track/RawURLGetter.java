package com.ss.android.ugc.aweme.commercialize.track;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.b.ad;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.l;
import com.google.c.h.a.q;
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

    /* renamed from: a */
    static final h f75344a = i.a((h.f.a.a) b.f75350a);

    /* renamed from: b */
    public static final RawURLGetter f75345b = new RawURLGetter();

    /* renamed from: c */
    private static final h f75346c = i.a((h.f.a.a) c.f75351a);

    /* renamed from: d */
    private static final h f75347d = i.a((h.f.a.a) d.f75352a);

    /* renamed from: e */
    private static String f75348e;

    /* renamed from: f */
    private static boolean f75349f;

    public interface RawUrlApi {
        static {
            Covode.recordClassIndex(46495);
        }

        @com.bytedance.retrofit2.b.h
        @ad(a = "vas_ad_track")
        q<String> doGet(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);
    }

    public interface a {
        static {
            Covode.recordClassIndex(46496);
        }

        void a(int i2, boolean z, Exception exc);
    }

    public static String a() {
        return (String) f75346c.getValue();
    }

    public static SharedPreferences b() {
        return (SharedPreferences) f75347d.getValue();
    }

    private RawURLGetter() {
    }

    static final class d extends m implements h.f.a.a<SharedPreferences> {

        /* renamed from: a */
        public static final d f75352a = new d();

        static {
            Covode.recordClassIndex(46499);
        }

        d() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ SharedPreferences invoke() {
            return a.f75356a.b();
        }
    }

    private static final void d() {
        com.bytedance.ies.ugc.appcontext.f.g().d(f.f75355a);
    }

    static final class b extends m implements h.f.a.a<RawUrlApi> {

        /* renamed from: a */
        public static final b f75350a = new b();

        static {
            Covode.recordClassIndex(46497);
        }

        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.RawUrlApi invoke() {
            /*
                r2 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
                com.ss.android.ugc.aweme.commercialize.track.a r0 = com.ss.android.ugc.aweme.commercialize.track.a.f75356a
                java.lang.String r0 = r0.a()
                com.bytedance.ies.ugc.aweme.network.e r1 = r1.b(r0)
                r0 = 0
                com.bytedance.ies.ugc.aweme.network.e r0 = r1.a(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.d()
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi> r0 = com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.RawUrlApi.class
                java.lang.Object r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.b.invoke():java.lang.Object");
        }
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a */
        public static final c f75351a = new c();

        static {
            Covode.recordClassIndex(46498);
        }

        c() {
            super(0);
        }

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
        Covode.recordClassIndex(46494);
    }

    public static final class e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f75353a;

        /* renamed from: b */
        final /* synthetic */ a f75354b;

        static {
            Covode.recordClassIndex(46500);
        }

        e(String str, a aVar) {
            this.f75353a = str;
            this.f75354b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String c2 = RawURLGetter.c();
            if (c2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            List<com.ss.android.http.a.a> c3 = z ? null : n.c(new com.ss.android.http.a.b.a("User-Agent", c2));
            ArrayList arrayList = new ArrayList();
            if (c3 != null) {
                for (com.ss.android.http.a.a aVar : c3) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
                }
            }
            try {
                ((RawUrlApi) RawURLGetter.f75344a.getValue()).doGet(this.f75353a, arrayList).get();
                RawURLGetter.a(this.f75354b, 200, true, null);
            } catch (com.ss.android.http.a.a.b e2) {
                RawURLGetter.a(this.f75354b, e2.getStatusCode(), false, e2);
            } catch (Exception e3) {
                RawURLGetter.a(this.f75354b, a.f75356a.a(e3), false, e3);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r1 == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.String c() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.c():java.lang.String");
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a */
        public static final f f75355a = new f();

        static {
            Covode.recordClassIndex(46501);
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
        MethodCollector.i(1923);
        if (!com.bytedance.common.utility.m.a(f75348e)) {
            String str = f75348e;
            MethodCollector.o(1923);
            return str;
        }
        String a2 = com.bytedance.common.c.b.f26745a.a(context);
        f75348e = a2;
        if (!com.bytedance.common.utility.m.a(a2)) {
            String str2 = f75348e;
            MethodCollector.o(1923);
            return str2;
        }
        if (!f75349f && context != null && (context instanceof Activity)) {
            f75349f = true;
            try {
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                h.f.b.l.b(settings, "");
                f75348e = settings.getUserAgentString();
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f75348e;
        MethodCollector.o(1923);
        return str3;
    }

    public static final void a(String str, a aVar) {
        h.f.b.l.d(str, "");
        b.i.b(new e(str, aVar), g.a());
    }

    public static void a(a aVar, int i2, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.a(i2, z, exc);
            } catch (Throwable unused) {
            }
        }
    }
}
