package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.a;
import com.bytedance.ies.web.jsbridge2.h;
import com.bytedance.ies.web.jsbridge2.w;
import com.ss.android.ugc.tiktok.security.b.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, h> f35629a = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    protected Context f35630e;

    /* renamed from: f  reason: collision with root package name */
    protected Set<q> f35631f;

    /* renamed from: g  reason: collision with root package name */
    protected j f35632g;

    /* renamed from: h  reason: collision with root package name */
    protected Handler f35633h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    protected String f35634i;

    /* renamed from: j  reason: collision with root package name */
    protected volatile boolean f35635j = false;

    /* renamed from: k  reason: collision with root package name */
    protected a f35636k;

    /* renamed from: l  reason: collision with root package name */
    public h f35637l;

    /* renamed from: m  reason: collision with root package name */
    protected List<TimeLineEvent> f35638m;

    static {
        Covode.recordClassIndex(21283);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(l lVar);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract Context b(l lVar);

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject, w wVar) {
        a(jSONObject.toString(), wVar);
    }

    public final void a(String str, String str2, int i2, String str3, List<TimeLineEvent> list) {
        for (q qVar : this.f35631f) {
            qVar.a(str, str2, i2, str3, new al(x.f35708g, this.f35638m, list));
        }
    }

    public View b() {
        return this.f35636k.b();
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f35637l.a();
        for (h hVar : this.f35629a.values()) {
            hVar.a();
        }
        this.f35633h.removeCallbacksAndMessages(null);
        this.f35635j = true;
    }

    private void c(w wVar) {
        for (q qVar : this.f35631f) {
            qVar.a(wVar, 2);
        }
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f35635j) {
            TimeLineEvent.a a2 = new TimeLineEvent.a().a();
            a2.f35540a = TimeLineEvent.b.aL;
            final TimeLineEvent b2 = a2.b();
            this.f35633h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21284);
                }

                public final void run() {
                    if (!b.this.f35635j) {
                        w wVar = null;
                        try {
                            wVar = b.this.a(new JSONObject(str));
                            if (wVar != null) {
                                wVar.f35698j.add(b2);
                            }
                        } catch (JSONException e2) {
                            k.b(e2);
                        }
                        if (!w.a(wVar)) {
                            b.this.b(wVar);
                        } else if (wVar != null) {
                            new TimeLineEvent.a().a(TimeLineEvent.b.f35551e, str).a(TimeLineEvent.b.f35550d, TimeLineEvent.b.T).a(TimeLineEvent.b.as, wVar.f35698j);
                            b bVar = b.this;
                            bVar.a(bVar.a(), wVar.f35692d, 3, TimeLineEvent.b.T, wVar.f35698j);
                            b.this.b(aj.a((Throwable) new z(wVar.f35689a, "Failed to parse invocation.")), wVar);
                        }
                    }
                }
            });
        }
    }

    public final w a(JSONObject jSONObject) {
        if (this.f35635j) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String a2 = a();
        if (a2 == null) {
            a(null, null, 3, TimeLineEvent.b.R, null);
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String string2 = jSONObject.getString("params");
            String string3 = jSONObject.getString("JSSDK");
            String optString3 = jSONObject.optString("namespace");
            String optString4 = jSONObject.optString("__iframe_url");
            Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("shouldHook", false));
            w.a a3 = w.a();
            a3.f35699a = string3;
            a3.f35700b = string;
            a3.f35701c = optString2;
            a3.f35702d = string2;
            a3.f35703e = optString;
            a3.f35704f = optString3;
            a3.f35705g = optString4;
            a3.f35706h = valueOf;
            return a3.a();
        } catch (JSONException e2) {
            k.b(e2);
            a(a2, optString2, 3, TimeLineEvent.b.S, null);
            return new w(optString);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final w wVar) {
        if (!this.f35635j) {
            TimeLineEvent.a a2 = new TimeLineEvent.a().a();
            a2.f35540a = TimeLineEvent.b.aL;
            final TimeLineEvent b2 = a2.b();
            this.f35633h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(21285);
                }

                public final void run() {
                    if (!b.this.f35635j) {
                        w wVar = wVar;
                        if (wVar != null) {
                            wVar.f35698j.add(b2);
                        }
                        if (!w.a(wVar)) {
                            b.this.b(wVar);
                        } else if (wVar != null) {
                            new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.U).a(TimeLineEvent.b.as, wVar.f35698j);
                            b bVar = b.this;
                            bVar.a(bVar.a(), wVar.f35692d, 3, TimeLineEvent.b.U, wVar.f35698j);
                            b.this.b(aj.a((Throwable) new z(wVar.f35689a, "Failed to parse invocation.")), wVar);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void b(w wVar) {
        String str;
        h hVar;
        h.f149026a.a(this, wVar);
        if (!this.f35635j) {
            String a2 = a();
            TimeLineEvent.a aVar = new TimeLineEvent.a();
            String str2 = TimeLineEvent.b.f35547a;
            if (a2 == null) {
                str = TimeLineEvent.b.f35554h;
            } else {
                str = a2;
            }
            aVar.a(str2, str).a(TimeLineEvent.b.aJ, wVar.f35698j);
            if (a2 != null) {
                String str3 = wVar.f35695g;
                if (TextUtils.equals(str3, this.f35634i) || TextUtils.isEmpty(str3)) {
                    hVar = this.f35637l;
                } else {
                    hVar = this.f35629a.get(str3);
                }
                if (hVar == null) {
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.O).a(TimeLineEvent.b.as, wVar.f35698j);
                    a(a(), wVar.f35692d, 2, TimeLineEvent.b.O, wVar.f35698j);
                    c(wVar);
                    b(aj.a((Throwable) new z(-4, "Namespace " + wVar.f35695g + " unknown.")), wVar);
                    return;
                }
                g gVar = new g();
                gVar.f35647b = a2;
                gVar.f35646a = this.f35630e;
                gVar.f35648c = hVar;
                gVar.f35649d = this.f35636k.b();
                try {
                    h.a a3 = hVar.a(wVar, gVar);
                    if (a3 == null) {
                        new TimeLineEvent.a().a(TimeLineEvent.b.f35550d, TimeLineEvent.b.P).a(TimeLineEvent.b.as, wVar.f35698j);
                        a(a(), wVar.f35692d, 2, TimeLineEvent.b.P, wVar.f35698j);
                        c(wVar);
                        b(aj.a((Throwable) new z(-2, "Function " + wVar.f35692d + " is not registered.")), wVar);
                        return;
                    }
                    if (a3.f35666a) {
                        if (a3.f35668c != null) {
                            b(a3.f35668c, wVar);
                        } else {
                            b(a3.f35667b, wVar);
                        }
                    }
                    a(a(), wVar.f35692d, wVar.f35698j);
                } catch (Exception e2) {
                    k.a(e2);
                    b(aj.a((Throwable) e2), wVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(l lVar, ad adVar) {
        a aVar;
        this.f35630e = b(lVar);
        this.f35632g = lVar.f35676e;
        this.f35631f = lVar.f35681j;
        this.f35637l = new h(lVar, this, adVar);
        this.f35634i = lVar.f35683l;
        this.f35638m = lVar.s;
        if (lVar.f35672a != null) {
            aVar = new a.C0808a(lVar.f35672a);
        } else {
            aVar = lVar.f35673b;
        }
        this.f35636k = aVar;
        a(lVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(JSONObject jSONObject, w wVar) {
        if (this.f35635j || TextUtils.isEmpty(wVar.f35694f)) {
            return;
        }
        if (wVar.f35697i == null || !wVar.f35697i.booleanValue()) {
            new TimeLineEvent.a().a(TimeLineEvent.b.aM, wVar.f35698j);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("__msg_type", "callback");
                jSONObject2.put("__callback_id", wVar.f35694f);
                jSONObject2.put("__params", jSONObject);
                a(jSONObject2, wVar);
                new TimeLineEvent.a().a(TimeLineEvent.b.aN, wVar.f35698j);
            } catch (JSONException unused) {
                b(jSONObject.toString(), wVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, w wVar) {
        String str2;
        JSONObject jSONObject;
        if (this.f35635j || TextUtils.isEmpty(wVar.f35694f)) {
            return;
        }
        if (wVar.f35697i == null || !wVar.f35697i.booleanValue()) {
            new TimeLineEvent.a().a(TimeLineEvent.b.aM, wVar.f35698j);
            if (!str.startsWith("{") || !str.endsWith("}")) {
                k.a((RuntimeException) new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
            }
            if (x.f35709h == null || !x.f35709h.a(ak.XSS_CALLBACK_ID_SWITCH)) {
                str2 = "{\"__msg_type\":\"callback\",\"__callback_id\":\"" + wVar.f35694f + "\",\"__params\":" + str + "}";
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                str2 = new v().a("__msg_type", "callback").a("__callback_id", wVar.f35694f).a("__params", jSONObject).a();
            }
            a(str2, wVar);
            new TimeLineEvent.a().a(TimeLineEvent.b.aN, wVar.f35698j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, h hVar) {
        this.f35629a.put(str, hVar);
    }

    /* access modifiers changed from: protected */
    public void a(String str, w wVar) {
        a(str);
    }

    /* access modifiers changed from: package-private */
    public final <T> void a(String str, T t) {
        String str2;
        JSONObject jSONObject;
        if (!this.f35635j) {
            if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("__msg_type", "event");
                    jSONObject2.put("__event_id", str);
                    jSONObject2.put("__params", t);
                    a(jSONObject2.toString());
                    return;
                } catch (JSONException unused) {
                }
            }
            String a2 = this.f35632g.a((Object) t);
            if (x.f35709h == null || !x.f35709h.a(ak.XSS_CALLBACK_ID_SWITCH)) {
                str2 = "{\"__msg_type\":\"event\",\"__event_id\":\"" + str + "\",\"__params\":" + a2 + "}";
            } else {
                try {
                    jSONObject = new JSONObject(a2);
                } catch (Exception unused2) {
                    jSONObject = new JSONObject();
                }
                str2 = new v().a("__msg_type", "event").a("__event_id", str).a("__params", jSONObject).a();
            }
            a(str2);
        }
    }

    private void a(String str, String str2, List<TimeLineEvent> list) {
        for (q qVar : this.f35631f) {
            qVar.a(str2, new al(x.f35708g, this.f35638m, list));
        }
    }
}
