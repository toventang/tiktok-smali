package com.ss.ugc.live.sdk.msg.c;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.a;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import h.f.b.l;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    g f154168a;

    /* renamed from: b  reason: collision with root package name */
    g f154169b;

    /* renamed from: c  reason: collision with root package name */
    boolean f154170c;

    /* renamed from: d  reason: collision with root package name */
    boolean f154171d;

    /* renamed from: e  reason: collision with root package name */
    long f154172e;

    /* renamed from: f  reason: collision with root package name */
    long f154173f;

    /* renamed from: g  reason: collision with root package name */
    boolean f154174g;

    /* renamed from: h  reason: collision with root package name */
    int f154175h;

    /* renamed from: i  reason: collision with root package name */
    String f154176i = "";

    /* renamed from: j  reason: collision with root package name */
    private final long f154177j;

    /* renamed from: k  reason: collision with root package name */
    private final long f154178k;

    static {
        Covode.recordClassIndex(102814);
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        if (this.f154173f > this.f154172e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service_id", this.f154178k);
            jSONObject.put("status_code", this.f154175h);
            jSONObject.put("expect_strategy", this.f154168a.getStrategy(this.f154170c));
            jSONObject.put("actual_strategy", this.f154169b.getStrategy(this.f154171d));
            jSONObject.put("ws_connected_on_send", this.f154170c);
            jSONObject.put("ws_connected_on_finish", this.f154171d);
            jSONObject.put("success", this.f154174g);
            long j2 = this.f154173f - this.f154172e;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("use_time", j2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("unique_id", this.f154177j);
            jSONObject3.put("status_message", this.f154176i);
            jSONObject3.put("send_time", this.f154172e);
            jSONObject3.put("finish_time", this.f154173f);
            aVar.monitorLatency("uplink_status_all", j2, jSONObject, jSONObject2, jSONObject3);
            if (!this.f154174g) {
                aVar.monitor("uplink_status_error", jSONObject, jSONObject2, jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", jSONObject);
            jSONObject4.put("metric", jSONObject2);
            jSONObject4.put("extra", jSONObject3);
            com.ss.ugc.live.sdk.msg.d.a.a(aVar, "uplink stat: ".concat(String.valueOf(jSONObject4)));
        }
    }

    public f(long j2, long j3) {
        this.f154177j = j2;
        this.f154178k = j3;
        g gVar = g.WS_MSG_ORIGIN;
        this.f154168a = gVar;
        this.f154169b = gVar;
    }

    public final void a(SdkUplinkPacket sdkUplinkPacket, g gVar, boolean z) {
        l.c(sdkUplinkPacket, "");
        l.c(gVar, "");
        this.f154173f = System.currentTimeMillis();
        this.f154169b = gVar;
        this.f154171d = z;
        this.f154174g = true;
        Integer num = sdkUplinkPacket.statusCode;
        l.a((Object) num, "");
        this.f154175h = num.intValue();
        String str = sdkUplinkPacket.statusMessage;
        l.a((Object) str, "");
        this.f154176i = str;
    }

    public final void a(Exception exc, g gVar, boolean z) {
        int i2;
        l.c(exc, "");
        l.c(gVar, "");
        this.f154173f = System.currentTimeMillis();
        this.f154169b = gVar;
        this.f154171d = z;
        this.f154174g = false;
        if (exc instanceof c) {
            i2 = ((c) exc).getStatusCode();
        } else {
            i2 = -1;
        }
        this.f154175h = i2;
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown Exception";
        }
        this.f154176i = message;
    }
}
