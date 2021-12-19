package com.bytedance.android.monitor.webview.c.a;

import com.bytedance.android.monitor.b.f;
import com.bytedance.android.monitor.d.a;
import com.bytedance.android.monitor.d.i;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.c.b.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class c extends com.bytedance.android.monitor.b.c implements b {

    /* renamed from: a  reason: collision with root package name */
    private String f23703a;

    /* renamed from: b  reason: collision with root package name */
    private String f23704b;

    /* renamed from: c  reason: collision with root package name */
    private String f23705c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f23706d;

    /* renamed from: e  reason: collision with root package name */
    public b f23707e;

    /* renamed from: f  reason: collision with root package name */
    public a f23708f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f23709g;

    static {
        Covode.recordClassIndex(14056);
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b
    public void a(JSONObject jSONObject) {
    }

    /* renamed from: k */
    public abstract a e();

    @Override // com.bytedance.android.monitor.b.c
    public final i a() {
        return this.f23707e;
    }

    @Override // com.bytedance.android.monitor.b.g, com.bytedance.android.monitor.b.c
    public final /* bridge */ /* synthetic */ f b() {
        return this.f23707e;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final JSONObject c() {
        return this.f23709g;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final JSONObject d() {
        return this.f23706d;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final /* bridge */ /* synthetic */ f g() {
        return this.f23708f;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final String h() {
        return this.f23704b;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final String i() {
        return this.f23705c;
    }

    @Override // com.bytedance.android.monitor.b.g
    public final String j() {
        return this.f23703a;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b
    public boolean l() {
        if (e() != null) {
            return e().f23702c;
        }
        return true;
    }

    @Override // com.bytedance.android.monitor.webview.c.a.b
    public void m() {
        if (e() != null) {
            e().b();
        }
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f23706d = new JSONObject();
            this.f23709g = new JSONObject();
            d.a(this.f23706d, jSONObject.optJSONObject("jsBase"));
            d.a(this.f23709g, jSONObject.optJSONObject("jsInfo"));
        }
    }

    public c(b bVar, String str, String str2) {
        this.f23707e = bVar;
        this.f23703a = com.bytedance.android.monitor.webview.i.f23765b.e(bVar.b().get());
        this.f23704b = str;
        this.f23705c = str2;
    }
}
