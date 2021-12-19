package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends b {

    /* renamed from: b  reason: collision with root package name */
    public int f23476b;

    /* renamed from: c  reason: collision with root package name */
    public int f23477c;

    /* renamed from: d  reason: collision with root package name */
    public String f23478d;

    /* renamed from: e  reason: collision with root package name */
    public String f23479e;

    /* renamed from: f  reason: collision with root package name */
    public String f23480f;

    /* renamed from: g  reason: collision with root package name */
    public String f23481g;

    static {
        Covode.recordClassIndex(13953);
    }

    public g() {
        super("jsbError");
    }

    public final String toString() {
        return "JsbErrorData(isSync=" + this.f23476b + ", errorCode=" + this.f23477c + ", errorMessage=" + this.f23478d + ", bridgeName=" + this.f23479e + ", errorActivity=" + this.f23480f + ", protocol=" + this.f23481g + ')';
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "is_sync", this.f23476b);
        d.a(jSONObject, "error_code", this.f23477c);
        d.a(jSONObject, "error_message", this.f23478d);
        d.a(jSONObject, "bridge_name", this.f23479e);
        d.a(jSONObject, "error_activity", this.f23480f);
        d.a(jSONObject, "protocol_version", this.f23481g);
    }
}
