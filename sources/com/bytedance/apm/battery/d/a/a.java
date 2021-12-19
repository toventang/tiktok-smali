package com.bytedance.apm.battery.d.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f24514a;

    /* renamed from: b  reason: collision with root package name */
    public long f24515b;

    /* renamed from: c  reason: collision with root package name */
    public String f24516c;

    static {
        Covode.recordClassIndex(14442);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.f24517d);
            jSONObject.put("end_time", this.f24518e);
            jSONObject.put("thread_name", this.f24519f);
            jSONObject.put("thread_stack", b());
            jSONObject.put("interval", this.f24515b);
            jSONObject.put(StringSet.type, this.f24514a);
            jSONObject.put("intent_info", this.f24516c);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return "AlarmInfo{type=" + this.f24514a + ", interval=" + this.f24515b + ", intentInfo=" + this.f24516c + ", startTime=" + this.f24517d + ", endTime=" + this.f24518e + ", threadName=" + this.f24519f + ", threadStack=" + b() + '}';
    }
}
