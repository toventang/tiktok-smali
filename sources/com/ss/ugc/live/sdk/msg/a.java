package com.ss.ugc.live.sdk.msg;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import h.f.b.l;
import org.json.JSONObject;

public final class a implements ILogger, IMonitor {

    /* renamed from: a  reason: collision with root package name */
    private final ILogger f154104a;

    /* renamed from: b  reason: collision with root package name */
    private final IMonitor f154105b;

    static {
        Covode.recordClassIndex(102789);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final void log(String str, String str2) {
        this.f154104a.log(str, str2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f154105b.monitor(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f154105b.monitorLatency(str, j2, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final boolean supportDebugInfo() {
        return this.f154104a.supportDebugInfo();
    }

    public a(ILogger iLogger, IMonitor iMonitor) {
        l.c(iLogger, "");
        l.c(iMonitor, "");
        this.f154104a = iLogger;
        this.f154105b = iMonitor;
    }
}
