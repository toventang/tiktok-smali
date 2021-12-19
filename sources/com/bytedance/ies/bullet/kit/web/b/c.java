package com.bytedance.ies.bullet.kit.web.b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.g;
import com.bytedance.ies.bullet.kit.web.b.b;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.al;
import com.bytedance.ies.web.jsbridge2.n;
import com.bytedance.ies.web.jsbridge2.o;
import com.bytedance.ies.web.jsbridge2.q;
import com.bytedance.ies.web.jsbridge2.r;
import com.bytedance.ies.web.jsbridge2.w;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.ies.web.jsbridge2.y;
import com.google.gson.f;
import h.a.ag;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c implements a {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WebViewClient f32408a;

    /* renamed from: b  reason: collision with root package name */
    public WebChromeClient f32409b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f32410c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<String> f32411d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<String> f32412e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f32413f;

    /* renamed from: g  reason: collision with root package name */
    public String f32414g = "bytedance";

    /* renamed from: h  reason: collision with root package name */
    public boolean f32415h;

    /* renamed from: i  reason: collision with root package name */
    public b.a f32416i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.ies.web.a.a f32417j;

    /* renamed from: k  reason: collision with root package name */
    public y f32418k;

    /* renamed from: l  reason: collision with root package name */
    public x f32419l;

    /* renamed from: m  reason: collision with root package name */
    public m<? super String, ? super g, z> f32420m;
    public final Map<String, g> n = new LinkedHashMap();
    private List<String> p = new ArrayList();
    private String q = "ToutiaoJSBridge";
    private q r;
    private final h s = i.a((h.f.a.a) e.f32424a);
    private final WebView t;

    static {
        Covode.recordClassIndex(19192);
    }

    public final f a() {
        return (f) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19193);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(WebView webView) {
            l.c(webView, "");
            return new c(webView);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f32424a = new e();

        static {
            Covode.recordClassIndex(19197);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    public final c b() {
        List<String> list;
        com.bytedance.ies.web.jsbridge2.l b2 = x.a(this.t).a().a(this.q).b(this.f32411d).a(new b(this)).b(new C0694c(this));
        b.a aVar = this.f32416i;
        if (aVar != null) {
            b2.a(new d(aVar));
        }
        List<String> list2 = this.p;
        if (list2 == null || list2.isEmpty()) {
            list = this.f32410c;
        } else {
            list = this.p;
        }
        com.bytedance.ies.web.jsbridge2.l a2 = b2.a(list).a(this.f32413f).b().a(this.r);
        if (this.f32415h) {
            a2.c();
        }
        x d2 = a2.d();
        this.f32419l = d2;
        y a3 = y.a(this.t, d2);
        this.f32418k = a3;
        if (a3 == null) {
            l.a();
        }
        this.f32417j = a3.f35719a;
        return this;
    }

    public static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32421a;

        static {
            Covode.recordClassIndex(19194);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f32421a = cVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.o
        public final <T> String a(T t) {
            String b2 = this.f32421a.a().b(t);
            l.a((Object) b2, "");
            return b2;
        }

        @Override // com.bytedance.ies.web.jsbridge2.o
        public final <T> T a(String str, Type type) {
            l.c(str, "");
            l.c(type, "");
            return (T) this.f32421a.a().a(str, type);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$c  reason: collision with other inner class name */
    public static final class C0694c implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32422a;

        static {
            Covode.recordClassIndex(19195);
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
        public final void a(String str, String str2, int i2, String str3, al alVar) {
            r.b(this, str, str2, i2);
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void b(String str, String str2, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0694c(c cVar) {
            this.f32422a = cVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, al alVar) {
            try {
                List<TimeLineEvent> list = alVar.f35618c;
                z zVar = null;
                if (list != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.h.b(ag.a(n.a((Iterable) list, 10)), 16));
                    for (T t : list) {
                        T t2 = t;
                        l.a((Object) t2, "");
                        linkedHashMap.put(t2.getLabel(), t);
                    }
                    TimeLineEvent timeLineEvent = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.b.ar);
                    if (timeLineEvent != null) {
                        HashMap<String, Object> extra = timeLineEvent.getExtra();
                        Object obj = extra != null ? extra.get("callbackId") : null;
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        String str2 = (String) obj;
                        if (str2 != null) {
                            g b2 = this.f32422a.b(str2);
                            TimeLineEvent timeLineEvent2 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.b.aL);
                            if (timeLineEvent2 != null) {
                                b2.a(timeLineEvent2.getTimeInMillis());
                            }
                            TimeLineEvent timeLineEvent3 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.b.aJ);
                            if (timeLineEvent3 != null) {
                                b2.b(timeLineEvent3.getTimeInMillis());
                            }
                            TimeLineEvent timeLineEvent4 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.b.aO);
                            if (timeLineEvent4 != null) {
                                b2.c(timeLineEvent4.getTimeInMillis());
                            }
                            if (b2.a()) {
                                this.f32422a.n.remove(str2);
                                m<? super String, ? super g, z> mVar = this.f32422a.f32420m;
                                if (mVar != null) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    mVar.invoke(str, b2);
                                }
                            }
                            zVar = z.f158842a;
                        }
                    }
                }
                h.q.m223constructorimpl(zVar);
            } catch (Throwable th) {
                h.q.m223constructorimpl(h.r.a(th));
            }
        }
    }

    public static final class d implements n.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f32423a;

        static {
            Covode.recordClassIndex(19196);
        }

        d(b.a aVar) {
            this.f32423a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.n.c
        public final boolean a(String str) {
            return this.f32423a.b();
        }

        @Override // com.bytedance.ies.web.jsbridge2.n.c
        public final boolean a(String str, String str2) {
            return this.f32423a.a();
        }
    }

    public final c a(q qVar) {
        l.c(qVar, "");
        this.r = qVar;
        return this;
    }

    public final c c(String str) {
        l.c(str, "");
        this.q = str;
        return this;
    }

    public final c d(String str) {
        l.c(str, "");
        this.f32414g = str;
        return this;
    }

    public final c a(List<String> list) {
        l.c(list, "");
        this.f32410c.addAll(list);
        return this;
    }

    public final c b(List<String> list) {
        l.c(list, "");
        this.p.addAll(list);
        return this;
    }

    public final c c(List<String> list) {
        l.c(list, "");
        this.f32411d.addAll(list);
        return this;
    }

    public final c d(List<String> list) {
        l.c(list, "");
        this.f32412e.addAll(list);
        return this;
    }

    public final g b(String str) {
        g gVar = this.n.get(str);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        this.n.put(str, gVar2);
        return gVar2;
    }

    public c(WebView webView) {
        l.c(webView, "");
        this.t = webView;
    }

    @Override // com.bytedance.ies.bullet.kit.web.b.a
    public final boolean a(String str) {
        com.bytedance.ies.web.a.a aVar = this.f32417j;
        if (aVar == null || !aVar.b(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.kit.web.b.a
    public final void a(String str, JSONObject jSONObject) {
        com.bytedance.ies.web.a.a aVar = this.f32417j;
        if (aVar != null) {
            aVar.b(str, jSONObject);
        }
    }

    public final void a(com.bytedance.ies.bullet.c.c.a.q qVar, String str, JSONObject jSONObject) {
        g gVar;
        l.c(qVar, "");
        if (str != null) {
            gVar = b(str);
            if (gVar != null) {
                gVar.f32013e = System.currentTimeMillis();
            }
        } else {
            gVar = null;
        }
        com.bytedance.ies.web.a.a aVar = this.f32417j;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
        if (gVar != null) {
            gVar.f32014f = System.currentTimeMillis();
            gVar.f32015g = System.currentTimeMillis();
            if (gVar.a()) {
                if (str != null) {
                    this.n.remove(str);
                }
                m<? super String, ? super g, z> mVar = this.f32420m;
                if (mVar != null) {
                    mVar.invoke(qVar.d(), gVar);
                }
            }
        }
    }
}
