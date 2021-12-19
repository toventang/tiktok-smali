package com.bytedance.b.i.a.a;

import com.bytedance.b.h.b;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f26294a;
    protected final String o = "log_type";
    protected final String p = "extra_status";
    protected final String q = "extra_values";
    protected final String r = "filters";
    protected final String s = "service";
    protected final String t = "scene";

    static {
        Covode.recordClassIndex(15262);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return "performance_monitor";
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract JSONObject e();

    /* access modifiers changed from: protected */
    public abstract JSONObject f();

    /* access modifiers changed from: protected */
    public abstract JSONObject g();

    /* access modifiers changed from: protected */
    public JSONObject h() {
        return new JSONObject();
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        try {
            if (this.f26294a == null) {
                this.f26294a = h();
            }
            this.f26294a.put("log_type", "performance_monitor");
            this.f26294a.put("service", d());
            JSONObject e2 = e();
            if (!e.a(e2)) {
                this.f26294a.put("extra_values", e2);
            }
            JSONObject f2 = f();
            if (!e.a(f2)) {
                this.f26294a.put("extra_status", f2);
            }
            JSONObject g2 = g();
            if (!e.a(g2)) {
                this.f26294a.put("filters", g2);
            }
            return this.f26294a;
        } catch (JSONException unused) {
            return null;
        }
    }
}
