package com.d.a.a.a.g;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.d;
import com.d.a.a.a.b.k;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.e;
import com.d.a.a.a.f.b;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public b f46402a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public com.d.a.a.a.b.a f46403b;

    /* renamed from: c  reason: collision with root package name */
    public com.d.a.a.a.b.a.b f46404c;

    /* renamed from: d  reason: collision with root package name */
    public EnumC1154a f46405d;

    /* renamed from: e  reason: collision with root package name */
    public long f46406e;

    /* renamed from: com.d.a.a.a.g.a$a  reason: collision with other inner class name */
    public enum EnumC1154a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE;

        static {
            Covode.recordClassIndex(28334);
        }
    }

    static {
        Covode.recordClassIndex(28333);
    }

    public a() {
        d();
    }

    public void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(WebView webView) {
        this.f46402a = new b(webView);
    }

    public void a(l lVar, d dVar) {
        a(lVar, dVar, null);
    }

    public void b() {
        this.f46402a.clear();
    }

    public final WebView c() {
        return (WebView) this.f46402a.get();
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    public final void a(l lVar, d dVar, JSONObject jSONObject) {
        String str = lVar.f46361f;
        JSONObject jSONObject2 = new JSONObject();
        com.d.a.a.a.e.b.a(jSONObject2, "environment", "app");
        com.d.a.a.a.e.b.a(jSONObject2, "adSessionType", dVar.f46344h);
        com.d.a.a.a.e.b.a(jSONObject2, "deviceInfo", com.d.a.a.a.e.a.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.d.a.a.a.e.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.d.a.a.a.e.b.a(jSONObject3, "partnerName", dVar.f46337a.f46350a);
        com.d.a.a.a.e.b.a(jSONObject3, "partnerVersion", dVar.f46337a.f46351b);
        com.d.a.a.a.e.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.d.a.a.a.e.b.a(jSONObject4, "libraryVersion", "1.3.0-Bytedance");
        com.d.a.a.a.e.b.a(jSONObject4, "appId", a(com.d.a.a.a.c.d.f46381a.f46382b).getPackageName());
        com.d.a.a.a.e.b.a(jSONObject2, "app", jSONObject4);
        if (dVar.f46343g != null) {
            com.d.a.a.a.e.b.a(jSONObject2, "contentUrl", dVar.f46343g);
        }
        if (dVar.f46342f != null) {
            com.d.a.a.a.e.b.a(jSONObject2, "customReferenceData", dVar.f46342f);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (k kVar : Collections.unmodifiableList(dVar.f46339c)) {
            com.d.a.a.a.e.b.a(jSONObject5, kVar.f46352a, kVar.f46354c);
        }
        e.f46383a.a(c(), str, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(String str) {
        e.f46383a.a(c(), str, (JSONObject) null);
    }

    public final void a(String str, JSONObject jSONObject) {
        e.f46383a.a(c(), str, jSONObject);
    }

    public final void a(float f2) {
        e.f46383a.a(c(), f2);
    }

    public final void d() {
        this.f46406e = System.nanoTime();
        this.f46405d = EnumC1154a.AD_STATE_IDLE;
    }
}
