package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public String f23894b;

    /* renamed from: c  reason: collision with root package name */
    public int f23895c;

    /* renamed from: d  reason: collision with root package name */
    public String f23896d;

    /* renamed from: e  reason: collision with root package name */
    public String f23897e;

    /* renamed from: f  reason: collision with root package name */
    public long f23898f;

    /* renamed from: g  reason: collision with root package name */
    public long f23899g;

    /* renamed from: h  reason: collision with root package name */
    public long f23900h;

    /* renamed from: i  reason: collision with root package name */
    public long f23901i;

    static {
        Covode.recordClassIndex(14121);
    }

    public h() {
        super("jsbPerf");
    }

    @Override // com.bytedance.android.monitorV2.a.b
    public final String toString() {
        return "JsbInfoData(bridgeName=" + this.f23894b + ", statusCode=" + this.f23895c + ", statusDescription=" + this.f23896d + ", protocolVersion=" + this.f23897e + ", costTime=" + this.f23898f + ", invokeTime=" + this.f23899g + ", callbackTime=" + this.f23900h + ", fireEventTime=" + this.f23901i + ')';
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "bridge_name", this.f23894b);
        f.a(jSONObject, "status_code", this.f23895c);
        f.a(jSONObject, "status_description", this.f23896d);
        f.a(jSONObject, "protocol_version", this.f23897e);
        f.a(jSONObject, "cost_time", this.f23898f);
        f.a(jSONObject, "invoke_ts", this.f23899g);
        f.a(jSONObject, "callback_ts", this.f23900h);
        f.a(jSONObject, "fireEvent_ts", this.f23901i);
    }
}
