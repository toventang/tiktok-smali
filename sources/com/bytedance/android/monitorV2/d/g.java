package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends b {

    /* renamed from: b  reason: collision with root package name */
    public int f23888b;

    /* renamed from: c  reason: collision with root package name */
    public int f23889c;

    /* renamed from: d  reason: collision with root package name */
    public String f23890d;

    /* renamed from: e  reason: collision with root package name */
    public String f23891e;

    /* renamed from: f  reason: collision with root package name */
    public String f23892f;

    /* renamed from: g  reason: collision with root package name */
    public String f23893g;

    static {
        Covode.recordClassIndex(14120);
    }

    public g() {
        super("jsbError");
    }

    @Override // com.bytedance.android.monitorV2.a.b
    public final String toString() {
        return "JsbErrorData(isSync=" + this.f23888b + ", errorCode=" + this.f23889c + ", errorMessage=" + this.f23890d + ", bridgeName=" + this.f23891e + ", errorActivity=" + this.f23892f + ", protocol=" + this.f23893g + ')';
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "is_sync", this.f23888b);
        f.a(jSONObject, "error_code", this.f23889c);
        f.a(jSONObject, "error_message", this.f23890d);
        f.a(jSONObject, "bridge_name", this.f23891e);
        f.a(jSONObject, "error_activity", this.f23892f);
        f.a(jSONObject, "protocol_version", this.f23893g);
    }
}
