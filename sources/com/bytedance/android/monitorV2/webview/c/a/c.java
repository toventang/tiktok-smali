package com.bytedance.android.monitorV2.webview.c.a;

import com.bytedance.android.monitorV2.a.f;
import com.bytedance.android.monitorV2.d.a;
import com.bytedance.android.monitorV2.d.i;
import com.bytedance.android.monitorV2.webview.c.b.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class c extends com.bytedance.android.monitorV2.a.c implements b {

    /* renamed from: a  reason: collision with root package name */
    private String f24166a;

    /* renamed from: b  reason: collision with root package name */
    private String f24167b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f24168c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f24169d;

    /* renamed from: e  reason: collision with root package name */
    public b f24170e;

    /* renamed from: f  reason: collision with root package name */
    public a f24171f;

    static {
        Covode.recordClassIndex(14235);
    }

    /* renamed from: j */
    public abstract a e();

    @Override // com.bytedance.android.monitorV2.a.c
    public final i a() {
        return this.f24170e;
    }

    @Override // com.bytedance.android.monitorV2.a.g, com.bytedance.android.monitorV2.a.c
    public final /* bridge */ /* synthetic */ f b() {
        return this.f24170e;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final JSONObject c() {
        return this.f24169d;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final JSONObject d() {
        return this.f24168c;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final /* bridge */ /* synthetic */ f g() {
        return this.f24171f;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final String h() {
        return this.f24166a;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final String i() {
        return this.f24167b;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.b
    public boolean k() {
        if (e() != null) {
            return e().f24165c;
        }
        return true;
    }

    @Override // com.bytedance.android.monitorV2.webview.c.a.b
    public void l() {
        if (e() != null) {
            e().b();
        }
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f24168c = new JSONObject();
            this.f24169d = new JSONObject();
            com.bytedance.android.monitorV2.l.f.a(this.f24168c, jSONObject.optJSONObject("jsBase"));
            com.bytedance.android.monitorV2.l.f.a(this.f24169d, jSONObject.optJSONObject("jsInfo"));
        }
    }

    public c(b bVar, String str, String str2) {
        this.f24170e = bVar;
        this.f24166a = str;
        this.f24167b = str2;
    }
}
