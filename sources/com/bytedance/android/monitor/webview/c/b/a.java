package com.bytedance.android.monitor.webview.c.b;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.b.f;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.c.a.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private C0512a f23710a = new C0512a("falconPerf");

    static {
        Covode.recordClassIndex(14057);
    }

    @Override // com.bytedance.android.monitor.b.g
    public final f f() {
        return null;
    }

    @Override // com.bytedance.android.monitor.b.g, com.bytedance.android.monitor.webview.c.a.c
    public final /* bridge */ /* synthetic */ b e() {
        return this.f23710a;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.c
    public final com.bytedance.android.monitor.webview.c.a.a k() {
        return this.f23710a;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b, com.bytedance.android.monitor.webview.c.a.c
    public final boolean l() {
        return this.f23710a.f23702c;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b, com.bytedance.android.monitor.webview.c.a.c
    public final void m() {
        this.f23710a.f23702c = false;
    }

    /* renamed from: com.bytedance.android.monitor.webview.c.b.a$a  reason: collision with other inner class name */
    class C0512a extends com.bytedance.android.monitor.webview.c.a.a {

        /* renamed from: b  reason: collision with root package name */
        JSONArray f23711b = new JSONArray();

        static {
            Covode.recordClassIndex(14058);
        }

        @Override // com.bytedance.android.monitor.webview.c.a.a
        public final void b() {
            this.f23702c = false;
        }

        @Override // com.bytedance.android.monitor.b.a
        public final void a(JSONObject jSONObject) {
            d.a(jSONObject, "resource_list", this.f23711b);
        }

        public C0512a(String str) {
            super(str);
        }
    }

    public a(b bVar) {
        super(bVar, "falconPerf", bVar.f23492c);
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b, com.bytedance.android.monitor.webview.c.a.c
    public final void a(JSONObject jSONObject) {
        C0512a aVar = this.f23710a;
        if (jSONObject != null) {
            aVar.f23711b.put(jSONObject);
            aVar.f23702c = true;
        }
    }
}
