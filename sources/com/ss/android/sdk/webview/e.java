package com.ss.android.sdk.webview;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.al;
import com.bytedance.ies.web.jsbridge2.an;
import com.bytedance.ies.web.jsbridge2.n;
import com.bytedance.ies.web.jsbridge2.o;
import com.bytedance.ies.web.jsbridge2.q;
import com.bytedance.ies.web.jsbridge2.r;
import com.bytedance.ies.web.jsbridge2.s;
import com.bytedance.ies.web.jsbridge2.w;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.ies.web.jsbridge2.y;
import com.bytedance.sdk.xbridge.registry.core_api.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.utils.ic;
import h.f.b.m;
import h.m.p;
import h.z;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e {

    /* renamed from: j */
    public static final b f60183j = new b((byte) 0);

    /* renamed from: a */
    public a f60184a;

    /* renamed from: b */
    public com.bytedance.ies.web.a.a f60185b;

    /* renamed from: c */
    public boolean f60186c;

    /* renamed from: d */
    public x f60187d;

    /* renamed from: e */
    public boolean f60188e;

    /* renamed from: f */
    public l f60189f;

    /* renamed from: g */
    public p f60190g;

    /* renamed from: h */
    public c f60191h;

    /* renamed from: i */
    public final WebView f60192i;

    /* renamed from: k */
    private WebViewClient f60193k;

    /* renamed from: l */
    private WebChromeClient f60194l;

    /* renamed from: m */
    private y f60195m;
    private x n;
    private final h.h o;
    private final h.h p;

    public enum a {
        PUBLIC,
        PRIVATE;

        static {
            Covode.recordClassIndex(37178);
        }
    }

    static {
        Covode.recordClassIndex(37177);
    }

    public final com.google.gson.f a() {
        return (com.google.gson.f) this.o.getValue();
    }

    public final com.bytedance.sdk.xbridge.registry.core_api.a b() {
        return (com.bytedance.sdk.xbridge.registry.core_api.a) this.p.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(37179);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static e a(WebView webView) {
            h.f.b.l.d(webView, "");
            return new e(webView);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<com.bytedance.sdk.xbridge.registry.core_api.a> {

        /* renamed from: a */
        public static final c f60197a = new c();

        static {
            Covode.recordClassIndex(37180);
        }

        c() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a invoke() {
            return new com.bytedance.sdk.xbridge.registry.core_api.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a */
        public static final d f60198a = new d();

        static {
            Covode.recordClassIndex(37181);
        }

        d() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            return new com.google.gson.f();
        }
    }

    public static final class j implements s {

        /* renamed from: a */
        final /* synthetic */ e f60209a;

        static {
            Covode.recordClassIndex(37188);
        }

        j(e eVar) {
            this.f60209a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.s
        public final void a() {
            a aVar = this.f60209a.f60184a;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    public static final class h implements q {

        /* renamed from: a */
        final /* synthetic */ e f60202a;

        /* renamed from: b */
        final /* synthetic */ h.f.a.m f60203b;

        /* renamed from: c */
        final /* synthetic */ List f60204c;

        /* renamed from: d */
        final /* synthetic */ h.f.a.q f60205d;

        static {
            Covode.recordClassIndex(37185);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(w wVar, int i2) {
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, String str2, int i2) {
            r.a(this, str, str2, i2);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, String str2, int i2, String str3, al alVar) {
            r.b(this, str, str2, i2);
        }

        static final class a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ h f60206a;

            /* renamed from: b */
            final /* synthetic */ String f60207b;

            static {
                Covode.recordClassIndex(37186);
            }

            a(h hVar, String str) {
                this.f60206a = hVar;
                this.f60207b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Toast makeText = Toast.makeText(this.f60206a.f60202a.f60192i.getContext(), this.f60207b, 1);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
                return z.f158842a;
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str) {
            a aVar;
            if (str != null) {
                h.f.a.m mVar = this.f60203b;
                if (this.f60204c.contains(str)) {
                    aVar = a.PUBLIC;
                } else {
                    aVar = a.PRIVATE;
                }
                mVar.invoke(str, aVar);
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, al alVar) {
            a(str);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void b(String str, String str2, int i2) {
            String a2;
            a aVar;
            if (str2 != null) {
                h.f.a.q qVar = this.f60205d;
                if (this.f60204c.contains(str2)) {
                    aVar = a.PUBLIC;
                } else {
                    aVar = a.PRIVATE;
                }
                qVar.invoke(str2, aVar, Integer.valueOf(i2));
            }
            if (this.f60202a.f60188e) {
                if (i2 == 1) {
                    a2 = p.a(str + " failed to visit func: " + str2 + ", reason: " + i2 + ";\n                                                Permission Denied;\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                            ");
                } else if (i2 == 2) {
                    a2 = p.a(str + " failed to visit func: " + str2 + ", reason: " + i2 + ";\n                                                Method not registered;\n                                            ");
                } else if (i2 == 3) {
                    a2 = p.a(str + " failed to visit func: " + str2 + ", reason: " + i2 + ";\n                                                Malformed data;\n                                            ");
                } else if (i2 != 4) {
                    a2 = p.a(str + " failed to visit func: " + str2 + ", reason: " + i2 + ";\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                            ");
                } else {
                    a2 = p.a(str + " failed to visit func: " + str2 + ", reason: " + i2 + ";\n                                                BridgeMethod Released;\n                                            ");
                }
                b.i.b(new a(this, a2), b.i.f4826c);
            }
        }

        h(e eVar, h.f.a.m mVar, List list, h.f.a.q qVar) {
            this.f60202a = eVar;
            this.f60203b = mVar;
            this.f60204c = list;
            this.f60205d = qVar;
        }
    }

    public static final class g implements o {

        /* renamed from: a */
        final /* synthetic */ e f60201a;

        static {
            Covode.recordClassIndex(37184);
        }

        g(e eVar) {
            this.f60201a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.o
        public final <T> String a(T t) {
            String b2 = this.f60201a.a().b(t);
            h.f.b.l.b(b2, "");
            return b2;
        }

        @Override // com.bytedance.ies.web.jsbridge2.o
        public final <T> T a(String str, Type type) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(type, "");
            return (T) this.f60201a.a().a(str, type);
        }
    }

    public static final class i implements q {

        /* renamed from: a */
        final /* synthetic */ e f60208a;

        static {
            Covode.recordClassIndex(37187);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(w wVar, int i2) {
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str) {
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, String str2, int i2) {
            r.a(this, str, str2, i2);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void b(String str, String str2, int i2) {
        }

        i(e eVar) {
            this.f60208a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, al alVar) {
            if (this.f60208a.f60188e) {
                com.google.gson.f fVar = new com.google.gson.f();
                List<TimeLineEvent> list = alVar.f35616a;
                if (list != null && !list.isEmpty()) {
                    fVar.b(alVar.f35616a);
                }
                List<TimeLineEvent> list2 = alVar.f35617b;
                if (list2 != null && !list2.isEmpty()) {
                    fVar.b(alVar.f35617b);
                }
                List<TimeLineEvent> list3 = alVar.f35618c;
                if (list3 != null && !list3.isEmpty()) {
                    fVar.b(alVar.f35618c);
                }
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, String str2, int i2, String str3, al alVar) {
            com.ss.android.ugc.aweme.ax.a.k kVar;
            List<TimeLineEvent> list;
            boolean z;
            List<TimeLineEvent> list2;
            String b2;
            String str4;
            String str5;
            List<TimeLineEvent> list3;
            List<TimeLineEvent> list4;
            List<TimeLineEvent> list5;
            c cVar = this.f60208a.f60191h;
            if (cVar != null && (kVar = (com.ss.android.ugc.aweme.ax.a.k) cVar.a(com.ss.android.ugc.aweme.ax.a.k.class)) != null) {
                com.google.gson.f fVar = new com.google.gson.f();
                List<TimeLineEvent> list6 = null;
                if (alVar != null) {
                    list = alVar.f35616a;
                } else {
                    list = null;
                }
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b2 = "";
                } else {
                    if (alVar != null) {
                        list2 = alVar.f35616a;
                    } else {
                        list2 = null;
                    }
                    b2 = fVar.b(list2);
                }
                if (alVar == null || (list4 = alVar.f35617b) == null || list4.isEmpty()) {
                    str4 = "";
                } else {
                    if (alVar != null) {
                        list5 = alVar.f35617b;
                    } else {
                        list5 = null;
                    }
                    str4 = fVar.b(list5);
                }
                if (alVar == null || (list3 = alVar.f35618c) == null || list3.isEmpty()) {
                    str5 = "";
                } else {
                    if (alVar != null) {
                        list6 = alVar.f35618c;
                    }
                    str5 = fVar.b(list6);
                }
                com.ss.android.ugc.aweme.ax.a.m mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class);
                if (mVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("bridge_name", str2);
                    jSONObject.put("bridge_access", "false");
                    jSONObject.put("reason", i2);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("url", str);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("log", str3);
                    jSONObject.put("jsb_sdk_init_time_line", b2);
                    jSONObject.put("jsb_instance_time_line", str4);
                    jSONObject.put("jsb_call_time_line", str5);
                    mVar.a("jsb_call_monitor", "jsb_call_rejected", jSONObject, null, null);
                }
                if (!this.f60208a.f60188e) {
                }
            }
        }
    }

    public static final class k implements n.c {

        /* renamed from: a */
        final /* synthetic */ e f60210a;

        static {
            Covode.recordClassIndex(37189);
        }

        k(e eVar) {
            this.f60210a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.n.c
        public final boolean a(String str) {
            if (str == null || this.f60210a.f60190g == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            HashMap<String, HashMap<String, String>> hashMap = p.f60246d;
            h.f.b.l.b(parse, "");
            String host = parse.getHost();
            Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            return hashMap.containsKey(host);
        }

        @Override // com.bytedance.ies.web.jsbridge2.n.c
        public final boolean a(String str, String str2) {
            com.ss.android.ugc.aweme.ax.a.k kVar;
            com.ss.android.ugc.aweme.ax.a.m mVar;
            h.f.b.l.d(str2, "");
            boolean z = false;
            if (str == null) {
                return false;
            }
            p pVar = this.f60210a.f60190g;
            if (pVar != null) {
                if (str2 == null) {
                    Boolean.valueOf(false);
                }
                Uri parse = Uri.parse(str);
                HashMap<String, HashMap<String, String>> hashMap = p.f60246d;
                h.f.b.l.b(parse, "");
                HashMap<String, String> hashMap2 = hashMap.get(parse.getHost());
                if (hashMap2 != null) {
                    z = !hashMap2.containsKey(String.valueOf(str2));
                }
                c cVar = pVar.f60250c;
                if (!(cVar == null || (kVar = (com.ss.android.ugc.aweme.ax.a.k) cVar.a(com.ss.android.ugc.aweme.ax.a.k.class)) == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringSet.type, "jsb");
                    jSONObject.put("bridge_name", str2);
                    jSONObject.put("bridge_access", String.valueOf(!z));
                    jSONObject.put("bridge_list", String.valueOf(p.f60246d.get(parse.getHost())));
                    jSONObject.put("stage", "open_jsb_auth");
                    mVar.a("open_jsb_monitor", "open_jsb_auth", jSONObject, null, null);
                }
            }
            return z;
        }
    }

    public final e a(WebChromeClient webChromeClient) {
        h.f.b.l.d(webChromeClient, "");
        this.f60194l = webChromeClient;
        return this;
    }

    public static final class l implements com.bytedance.sdk.xbridge.registry.core_api.a.c {

        /* renamed from: a */
        public final String f60211a = "bridgesdk";

        /* renamed from: b */
        public final an f60212b = new an();

        /* renamed from: c */
        final /* synthetic */ e f60213c;

        static {
            Covode.recordClassIndex(37190);
        }

        l(e eVar) {
            this.f60213c = eVar;
        }

        static final class a implements com.bytedance.ies.web.jsbridge2.i {

            /* renamed from: a */
            final /* synthetic */ l f60214a;

            /* renamed from: b */
            final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a.b f60215b;

            static {
                Covode.recordClassIndex(37191);
            }

            a(l lVar, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
                this.f60214a = lVar;
                this.f60215b = bVar;
            }

            @Override // com.bytedance.ies.web.jsbridge2.i
            public final void a(w wVar, int i2) {
                if (wVar != null) {
                    String str = wVar.f35694f;
                    h.f.b.l.b(str, "");
                    if (!p.b(str, this.f60214a.f60211a, false)) {
                        return;
                    }
                    if (i2 == 1) {
                        this.f60215b.a(com.bytedance.sdk.xbridge.registry.core_api.a.a.NO_PERMISSION);
                    } else if (i2 == 2) {
                        this.f60215b.a(com.bytedance.sdk.xbridge.registry.core_api.a.a.NOT_FOUND);
                    }
                }
            }
        }

        static final class b implements com.bytedance.ies.web.a.a.a {

            /* renamed from: a */
            final /* synthetic */ l f60216a;

            /* renamed from: b */
            final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a.b f60217b;

            static {
                Covode.recordClassIndex(37192);
            }

            b(l lVar, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
                this.f60216a = lVar;
                this.f60217b = bVar;
            }

            @Override // com.bytedance.ies.web.a.a.a
            public final com.bytedance.ies.web.a.a.b a(String str, JSONObject jSONObject, int i2) {
                if (i2 == 1) {
                    if (str == null || !p.b(str, this.f60216a.f60211a, false)) {
                        return null;
                    }
                    com.bytedance.sdk.xbridge.registry.core_api.a.b bVar = this.f60217b;
                    h.f.b.l.b(jSONObject, "");
                    bVar.a(jSONObject);
                    String substring = str.substring(this.f60216a.f60211a.length());
                    h.f.b.l.b(substring, "");
                    return new com.bytedance.ies.web.a.a.b(substring, jSONObject);
                } else if (i2 != 2) {
                    return null;
                } else {
                    com.bytedance.sdk.xbridge.registry.core_api.a.b bVar2 = this.f60217b;
                    h.f.b.l.b(str, "");
                    bVar2.a(str, jSONObject);
                    return null;
                }
            }
        }

        @Override // com.bytedance.sdk.xbridge.registry.core_api.a.c
        public final void a(Object obj, String str, String str2, String str3, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(bVar, "");
            this.f60212b.f35625a = this.f60213c.f60187d;
            this.f60212b.a(new a(this, bVar));
            JSONObject jSONObject = new JSONObject(str3);
            jSONObject.put("__callback_id", this.f60211a + jSONObject.opt("__callback_id"));
            jSONObject.put("shouldHook", true);
            this.f60212b.a(jSONObject.toString());
            com.bytedance.ies.web.a.a aVar = this.f60213c.f60185b;
            if (aVar != null) {
                aVar.f35521l = new b(this, bVar);
            }
        }
    }

    public e(WebView webView) {
        h.f.b.l.d(webView, "");
        this.f60192i = webView;
        this.f60186c = true;
        this.o = h.i.a((h.f.a.a) d.f60198a);
        this.p = h.i.a((h.f.a.a) c.f60197a);
    }

    public final e a(WebViewClient webViewClient) {
        h.f.b.l.d(webViewClient, "");
        this.f60193k = webViewClient;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(com.bytedance.ies.web.jsbridge2.x r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            android.webkit.WebView r0 = r3.f35712c
            if (r0 != 0) goto L_0x000c
            h.f.b.l.b()
        L_0x000c:
            h.f.b.l.b(r0, r1)
            r2.<init>(r0)
            r2.n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.e.<init>(com.bytedance.ies.web.jsbridge2.x):void");
    }

    public final e a(a aVar) {
        h.f.b.l.d(aVar, "");
        this.f60184a = aVar;
        return this;
    }

    /* renamed from: com.ss.android.sdk.webview.e$e */
    public static final class C1309e extends m implements h.f.a.m<String, a, z> {

        /* renamed from: a */
        public static final C1309e f60199a = new C1309e();

        static {
            Covode.recordClassIndex(37182);
        }

        C1309e() {
            super(2);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, a aVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(aVar, "");
            return z.f158842a;
        }
    }

    public final e a(String str, com.bytedance.ies.web.a.d dVar) {
        y yVar = this.f60195m;
        if (yVar != null) {
            yVar.a(str, dVar);
        } else {
            com.bytedance.ies.web.a.a aVar = this.f60185b;
            if (aVar != null) {
                aVar.a(str, dVar);
            }
        }
        return this;
    }

    public final void a(String str, JSONObject jSONObject) {
        com.bytedance.ies.web.a.a aVar = this.f60185b;
        if (aVar != null) {
            aVar.b(str, jSONObject);
        }
    }

    public static final class f extends m implements h.f.a.q<String, a, Integer, z> {

        /* renamed from: a */
        public static final f f60200a = new f();

        static {
            Covode.recordClassIndex(37183);
        }

        f() {
            super(3);
        }

        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, a aVar, Integer num) {
            num.intValue();
            h.f.b.l.d(str, "");
            h.f.b.l.d(aVar, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: com.ss.android.sdk.webview.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: com.ss.android.sdk.webview.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e a(e eVar, List list, boolean z, h.f.a.m mVar, h.f.a.q qVar, int i2) {
        com.bytedance.ies.web.a.a aVar;
        com.bytedance.ies.web.a.a aVar2;
        com.bytedance.ies.web.jsbridge2.l a2;
        if ((i2 & 1) != 0) {
            list = h.a.n.a("host");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            mVar = C1309e.f60199a;
        }
        if ((i2 & 8) != 0) {
            qVar = f.f60200a;
        }
        h.f.b.l.d(list, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(qVar, "");
        a aVar3 = eVar.f60184a;
        if (aVar3 == null) {
            h.f.b.l.b();
        }
        List<String> a3 = aVar3.a();
        h.f.b.l.b(a3, "");
        if (eVar.f60186c) {
            x xVar = eVar.n;
            if (xVar == null) {
                a2 = x.a(eVar.f60192i);
            } else {
                a2 = x.a(xVar);
            }
            a2.f35680i = true;
            a2.f35675d = "ToutiaoJSBridge";
            com.bytedance.ies.web.jsbridge2.l a4 = a2.b(a3).a(new g(eVar));
            a aVar4 = eVar.f60184a;
            if (aVar4 == 0) {
                h.f.b.l.b();
            }
            com.bytedance.ies.web.jsbridge2.l a5 = a4.a(aVar4.a(list, z));
            a5.f35678g = false;
            a5.f35679h = true;
            com.bytedance.ies.web.jsbridge2.l b2 = a5.b(new h(eVar, mVar, a3, qVar)).b(new i(eVar));
            b2.f35682k = new j(eVar);
            b2.q = new k(eVar);
            a aVar5 = eVar.f60184a;
            if (aVar5 == null) {
                h.f.b.l.b();
            }
            if (aVar5.b()) {
                a2.p = true;
            }
            eVar.f60187d = a2.d();
            p pVar = new p(eVar.f60187d, eVar.f60191h);
            eVar.f60190g = pVar;
            pVar.f60248a = eVar.f60189f;
            x xVar2 = eVar.f60187d;
            if (xVar2 != null) {
                xVar2.a("openConfig", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new com.ss.android.sdk.webview.a.f(eVar.f60190g, eVar.f60191h));
            }
            y a6 = y.a(eVar.f60192i, eVar.f60187d);
            eVar.f60195m = a6;
            if (a6 == null) {
                h.f.b.l.b();
            }
            eVar.f60185b = a6.f35719a;
            a.b.c();
            if (com.bytedance.sdk.xbridge.registry.core_api.a.f44053d && !list.contains("webcast")) {
                eVar.b().a((View) eVar.f60192i, UUID.randomUUID().toString(), false);
                eVar.b().a("dmtJSB", new l(eVar));
                com.bytedance.sdk.xbridge.registry.core.f.a(eVar.f60192i, new com.bytedance.sdk.xbridge.registry.core.a());
            }
        } else {
            eVar.f60185b = com.bytedance.ies.web.a.a.a(eVar.f60192i);
        }
        com.bytedance.ies.web.a.a aVar6 = eVar.f60185b;
        if (aVar6 == null) {
            h.f.b.l.b();
        }
        if (eVar.f60184a == null) {
            h.f.b.l.b();
        }
        aVar6.f35514e = "bytedance";
        a aVar7 = eVar.f60184a;
        if (aVar7 == null) {
            h.f.b.l.b();
        }
        aVar6.f35519j = aVar7;
        a aVar8 = eVar.f60184a;
        if (aVar8 == 0) {
            h.f.b.l.b();
        }
        aVar6.f35515f = aVar8.a((List<String>) list, false);
        h.f.b.l.b(aVar6, "");
        aVar6.f35516g = a3;
        WebChromeClient webChromeClient = eVar.f60194l;
        if (!(webChromeClient == null || (aVar2 = eVar.f60185b) == null)) {
            aVar2.a(webChromeClient);
        }
        WebViewClient webViewClient = eVar.f60193k;
        if (!(webViewClient == null || (aVar = eVar.f60185b) == null)) {
            aVar.a(webViewClient);
        }
        return eVar;
    }
}
