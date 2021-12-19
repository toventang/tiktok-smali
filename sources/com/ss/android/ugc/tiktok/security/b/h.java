package com.ss.android.ugc.tiktok.security.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.web.jsbridge2.w;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f149026a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final f f149027b = new b();

    private h() {
    }

    @Override // com.ss.android.ugc.tiktok.security.b.f
    public final f a() {
        return f149027b;
    }

    static {
        Covode.recordClassIndex(98164);
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f149041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149042b;

        static {
            Covode.recordClassIndex(98170);
        }

        f(boolean z, String str) {
            this.f149041a = z;
            this.f149042b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (this.f149041a) {
                str = "bullet_new";
            } else {
                str = "others";
            }
            c.a aVar = new c.a("bdx_monitor_container_coverage_lynx_pv");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_url", this.f149042b);
            jSONObject.put("container_type", str);
            aVar.f23443c = jSONObject;
            aVar.f23448h = true;
            aVar.f23441a = this.f149042b;
            aVar.f23449i = new com.bytedance.android.monitor.webview.h();
            HybridMonitor.getInstance().customReport(aVar.a());
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxView f149035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f149036c;

        static {
            Covode.recordClassIndex(98167);
        }

        c(String str, LynxView lynxView, boolean z) {
            this.f149034a = str;
            this.f149035b = lynxView;
            this.f149036c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends z> call() {
            Object obj;
            String str;
            Context context;
            Class<?> cls;
            try {
                Uri parse = Uri.parse(this.f149034a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "load_url");
                LynxView lynxView = this.f149035b;
                if (lynxView == null || (cls = lynxView.getClass()) == null) {
                    str = null;
                } else {
                    str = cls.getCanonicalName();
                }
                jSONObject.put("container", str);
                if (this.f149036c) {
                    jSONObject.put(StringSet.type, "bullet");
                } else {
                    jSONObject.put(StringSet.type, "others");
                }
                LynxView lynxView2 = this.f149035b;
                if (lynxView2 != null) {
                    context = lynxView2.getContext();
                } else {
                    context = null;
                }
                h.a(jSONObject, context);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", this.f149034a);
                l.b(parse, "");
                jSONObject2.put("host", parse.getHost());
                com.bytedance.apm.b.a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f149037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149038b;

        static {
            Covode.recordClassIndex(98168);
        }

        d(WebView webView, String str) {
            this.f149037a = webView;
            this.f149038b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends Integer> call() {
            Object obj;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "load_url");
                jSONObject.put("container", this.f149037a.getClass().getCanonicalName());
                h.a(jSONObject, this.f149037a.getContext());
                JSONObject jSONObject2 = new JSONObject();
                Uri parse = Uri.parse(this.f149038b);
                jSONObject2.put("url", this.f149038b);
                l.b(parse, "");
                jSONObject2.put("host", parse.getHost());
                com.bytedance.apm.b.a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = q.m223constructorimpl(0);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149040b;

        static {
            Covode.recordClassIndex(98169);
        }

        e(String str, String str2) {
            this.f149039a = str;
            this.f149040b = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends z> call() {
            Object obj;
            try {
                String builder = Uri.parse(this.f149039a).buildUpon().clearQuery().toString();
                l.b(builder, "");
                c.a aVar = new c.a("bdx_monitor_bridge_pv");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_name", this.f149040b);
                jSONObject.put("_full_url", this.f149039a);
                aVar.f23443c = jSONObject;
                aVar.f23448h = true;
                aVar.f23441a = builder;
                aVar.f23449i = new com.bytedance.android.monitor.webview.h();
                HybridMonitor.getInstance().customReport(aVar.a());
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149044b;

        static {
            Covode.recordClassIndex(98171);
        }

        g(String str, String str2) {
            this.f149043a = str;
            this.f149044b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Throwable th;
            if (p.b(this.f149043a, "http", false)) {
                try {
                    str = Uri.parse(this.f149043a).buildUpon().clearQuery().toString();
                    l.b(str, "");
                    try {
                        q.m223constructorimpl(z.f158842a);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    q.m223constructorimpl(r.a(th));
                    c.a aVar = new c.a("bdx_monitor_container_coverage_web_pv");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("web_url", this.f149043a);
                    jSONObject.put("webview_class", this.f149044b);
                    aVar.f23443c = jSONObject;
                    aVar.f23441a = str;
                    aVar.f23448h = true;
                    aVar.f23449i = new com.bytedance.android.monitor.webview.h();
                    HybridMonitor.getInstance().customReport(aVar.a());
                    return z.f158842a;
                }
                c.a aVar2 = new c.a("bdx_monitor_container_coverage_web_pv");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("web_url", this.f149043a);
                jSONObject2.put("webview_class", this.f149044b);
                aVar2.f23443c = jSONObject2;
                aVar2.f23441a = str;
                aVar2.f23448h = true;
                aVar2.f23449i = new com.bytedance.android.monitor.webview.h();
                HybridMonitor.getInstance().customReport(aVar2.a());
            }
            return z.f158842a;
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.c.a.h f149028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149029b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f149030c;

        static {
            Covode.recordClassIndex(98165);
        }

        a(com.bytedance.ies.bullet.c.c.a.h hVar, List list, JSONObject jSONObject) {
            this.f149028a = hVar;
            this.f149029b = list;
            this.f149030c = jSONObject;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends z> call() {
            Object obj;
            i iVar;
            String str;
            Uri p_;
            String str2;
            Context context;
            T t;
            T t2;
            Class<?> cls;
            com.bytedance.ies.bullet.c.e.a.b bVar;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "jsb_invoke");
                jSONObject.put(StringSet.type, "bullet");
                com.bytedance.ies.bullet.c.c.a.h hVar = this.f149028a;
                if (hVar == null || (bVar = hVar.f32022d) == null) {
                    iVar = null;
                } else {
                    iVar = (i) bVar.c(i.class);
                }
                if (iVar instanceof com.bytedance.ies.bullet.ui.common.c.c) {
                    com.bytedance.ies.bullet.ui.common.c.d q_ = ((com.bytedance.ies.bullet.ui.common.c.c) iVar).q_();
                    if (q_ == null || (t2 = q_.f33078a) == null || (cls = t2.getClass()) == null) {
                        str2 = null;
                    } else {
                        str2 = cls.getCanonicalName();
                    }
                    jSONObject.put("container", str2);
                    com.bytedance.ies.bullet.ui.common.c.d q_2 = ((com.bytedance.ies.bullet.ui.common.c.c) iVar).q_();
                    if (q_2 == null || (t = q_2.f33078a) == null) {
                        context = null;
                    } else {
                        context = t.getContext();
                    }
                    h.a(jSONObject, context);
                }
                JSONObject jSONObject2 = new JSONObject();
                List list = this.f149029b;
                if (list != null && (!list.isEmpty())) {
                    jSONObject2.put(StringSet.name, this.f149029b.get(0));
                }
                jSONObject2.put("params", this.f149030c);
                if (iVar == null || (p_ = iVar.p_()) == null) {
                    str = null;
                } else {
                    str = p_.toString();
                }
                jSONObject2.put("url", str);
                com.bytedance.apm.b.a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.jsbridge2.b f149031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f149032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f149033c;

        static {
            Covode.recordClassIndex(98166);
        }

        b(com.bytedance.ies.web.jsbridge2.b bVar, z.e eVar, w wVar) {
            this.f149031a = bVar;
            this.f149032b = eVar;
            this.f149033c = wVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends h.z> call() {
            Object obj;
            Context context;
            View b2;
            View b3;
            Class<?> cls;
            String canonicalName;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "jsb_invoke");
                com.bytedance.ies.web.jsbridge2.b bVar = this.f149031a;
                if (!(bVar == null || (b3 = bVar.b()) == null || (cls = b3.getClass()) == null || (canonicalName = cls.getCanonicalName()) == null)) {
                    jSONObject.put("container", canonicalName);
                    if (p.e((CharSequence) canonicalName, (CharSequence) "bullet")) {
                        jSONObject.put(StringSet.type, "bullet");
                    } else {
                        jSONObject.put(StringSet.type, "others");
                    }
                }
                com.bytedance.ies.web.jsbridge2.b bVar2 = this.f149031a;
                if (bVar2 == null || (b2 = bVar2.b()) == null) {
                    context = null;
                } else {
                    context = b2.getContext();
                }
                h.a(jSONObject, context);
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(this.f149032b.element)) {
                    jSONObject2.put("url", this.f149032b.element);
                }
                w wVar = this.f149033c;
                if (wVar != null) {
                    jSONObject2.put(StringSet.name, wVar.f35692d);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("namespace", this.f149033c.f35695g);
                    jSONObject3.put("JSSDK", this.f149033c.f35690b);
                    jSONObject3.put("params", this.f149033c.f35693e);
                    jSONObject3.put("__msg_type", this.f149033c.f35691c);
                    jSONObject3.put("__callback_id", this.f149033c.f35694f);
                    jSONObject3.put("__iframe_url", this.f149033c.f35696h);
                    jSONObject2.put("params", jSONObject3);
                }
                com.bytedance.apm.b.a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = q.m223constructorimpl(h.z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(String str, String str2) {
        b.i.b(new e(str2, str), b.i.f4824a);
    }

    @Override // com.ss.android.ugc.tiktok.security.b.e, com.ss.android.ugc.tiktok.security.b.a
    public final h.p<String, Boolean> a(String str, LynxView lynxView) {
        Object obj;
        String str2;
        if (lynxView != null) {
            obj = lynxView.getTag(R.id.a0k);
        } else {
            obj = null;
        }
        boolean a2 = l.a((Object) "bullet", obj);
        if (str == null) {
            str2 = "AndroidNotSet";
        } else {
            str2 = str;
        }
        b.i.b(new f(a2, str2), b.i.f4824a);
        if (!com.ss.android.ugc.tiktok.security.c.a.a()) {
            return super.a(str, lynxView);
        }
        b.i.b(new c(str, lynxView, a2), b.i.f4824a);
        return super.a(str, lynxView);
    }

    public static void a(JSONObject jSONObject, Context context) {
        String str;
        Object data;
        String str2 = null;
        if (context == null) {
            context = null;
        } else if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && context != null) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            Intent intent = activity.getIntent();
            if (intent != null) {
                str = a(intent, "key_calling_context");
            } else {
                str = null;
            }
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                str2 = a(intent2, "enter_from");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("scene", str2);
            } else if (str != null && p.e((CharSequence) str, (CharSequence) "DeepLink")) {
                jSONObject.put("scene", "deeplink");
            }
            jSONObject.put("lastPage", str);
            jSONObject.put("landing", activity.getClass().getCanonicalName());
            Intent intent3 = activity.getIntent();
            if (intent3 != null && (data = intent3.getData()) != null) {
                jSONObject.put("uri", data);
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.b.d, com.ss.android.ugc.tiktok.security.b.a
    public final String a(WebView webView, String str) {
        l.d(webView, "");
        if (str != null) {
            String name = webView.getClass().getName();
            l.b(name, "");
            b.i.b(new g(str, name), b.i.f4824a);
        }
        if (!com.ss.android.ugc.tiktok.security.c.a.a()) {
            return super.a(webView, str);
        }
        if (str != null && !p.b(str, "http", false)) {
            return super.a(webView, str);
        }
        b.i.b(new d(webView, str), b.i.f4824a);
        return super.a(webView, str);
    }

    @Override // com.ss.android.ugc.tiktok.security.b.c, com.ss.android.ugc.tiktok.security.b.a
    public final void a(com.bytedance.ies.web.jsbridge2.b bVar, w wVar) {
        h.z zVar;
        String str;
        View b2;
        z.e eVar = new z.e();
        T t = (T) "";
        eVar.element = t;
        try {
            com.ss.android.ugc.tiktok.security.a.a(bVar, wVar);
            if (!(bVar == null || (b2 = bVar.b()) == null)) {
                if (b2 instanceof WebView) {
                    String url = ((WebView) b2).getUrl();
                    if (url != null) {
                        t = url;
                    }
                    eVar.element = t;
                } else if (b2 instanceof LynxView) {
                    T t2 = (T) ((LynxView) b2).getTemplateUrl();
                    if (t2 == null) {
                        t2 = (T) "LiveLynx";
                    }
                    eVar.element = t2;
                }
            }
            if (wVar == null || (str = wVar.f35692d) == null) {
                zVar = null;
            } else {
                a(str, (String) eVar.element);
                zVar = h.z.f158842a;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        if (com.ss.android.ugc.tiktok.security.c.a.a()) {
            b.i.b(new b(bVar, eVar, wVar), b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.b.c, com.ss.android.ugc.tiktok.security.b.a
    public final void a(com.bytedance.ies.bullet.c.c.a.h hVar, List<String> list, JSONObject jSONObject) {
        try {
            new StringBuilder("handle: ").append(hVar).append(' ').append(list).append(' ').append(jSONObject);
            q.m223constructorimpl(h.z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        if (com.ss.android.ugc.tiktok.security.c.a.a()) {
            b.i.b(new a(hVar, list, jSONObject), b.i.f4824a);
        }
    }
}
