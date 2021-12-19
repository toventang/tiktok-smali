package com.bytedance.apm.battery.d.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f24521a;

    /* renamed from: b  reason: collision with root package name */
    public String f24522b;

    static {
        Covode.recordClassIndex(14444);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.f24521a);
            jSONObject.put("tag", this.f24522b);
            jSONObject.put("start_time", this.f24517d);
            jSONObject.put("end_time", this.f24518e);
            jSONObject.put("thread_name", this.f24519f);
            jSONObject.put("thread_stack", b());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return "WakeLockInfo{flags=" + this.f24521a + ", tag=" + this.f24522b + ", startTime=" + this.f24517d + ", endTime=" + this.f24518e + ", threadName=" + this.f24519f + ", threadStack=" + b() + '}';
    }
}
