package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public String f23482b;

    /* renamed from: c  reason: collision with root package name */
    public int f23483c;

    /* renamed from: d  reason: collision with root package name */
    public String f23484d;

    /* renamed from: e  reason: collision with root package name */
    public String f23485e;

    /* renamed from: f  reason: collision with root package name */
    public long f23486f;

    /* renamed from: g  reason: collision with root package name */
    public long f23487g;

    /* renamed from: h  reason: collision with root package name */
    public long f23488h;

    /* renamed from: i  reason: collision with root package name */
    public long f23489i;

    static {
        Covode.recordClassIndex(13954);
    }

    public h() {
        super("jsbPerf");
    }

    public final String toString() {
        return "JsbInfoData(bridgeName=" + this.f23482b + ", statusCode=" + this.f23483c + ", statusDescription=" + this.f23484d + ", protocolVersion=" + this.f23485e + ", costTime=" + this.f23486f + ", invokeTime=" + this.f23487g + ", callbackTime=" + this.f23488h + ", fireEventTime=" + this.f23489i + ')';
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "bridge_name", this.f23482b);
        d.a(jSONObject, "status_code", this.f23483c);
        d.a(jSONObject, "status_description", this.f23484d);
        d.a(jSONObject, "protocol_version", this.f23485e);
        d.a(jSONObject, "cost_time", this.f23486f);
        d.a(jSONObject, "invoke_ts", this.f23487g);
        d.a(jSONObject, "callback_ts", this.f23488h);
        d.a(jSONObject, "fireEvent_ts", this.f23489i);
    }
}
