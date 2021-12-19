package com.bytedance.android.livesdk;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.livesdk.ab.a.a;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13930a = d.a("ttlive_ws_connect_status");

    /* renamed from: b  reason: collision with root package name */
    private static final String f13931b = d.b("ttlive_ws_connect_status");

    /* renamed from: c  reason: collision with root package name */
    private long f13932c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13933d;

    public final void a() {
        if (!this.f13933d) {
            this.f13933d = true;
            this.f13932c = SystemClock.uptimeMillis();
        }
    }

    static {
        Covode.recordClassIndex(7725);
    }

    public final long b() {
        long j2;
        if (this.f13932c > 0) {
            j2 = SystemClock.uptimeMillis() - this.f13932c;
        } else {
            j2 = 0;
        }
        this.f13932c = 0;
        this.f13933d = false;
        return j2;
    }

    public final void a(long j2, String str, String str2) {
        b();
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "room_id", j2);
        b.a(jSONObject, "reason", str);
        b.a(jSONObject, "push_server", str2);
        c.b(f13930a, 2, jSONObject);
        a.a();
        a.a(com.bytedance.android.livesdk.ab.a.b.Room.info, "ttlive_ws_connect_status", 2, jSONObject);
    }

    public final void a(long j2, int i2, String str, String str2, HashMap<String, String> hashMap) {
        b();
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "room_id", j2);
        b.a(jSONObject, "error_code", (long) i2);
        b.a(jSONObject, "error_msg", str);
        b.a(jSONObject, "push_server", str2);
        if (hashMap != null) {
            b.a(jSONObject, "params", hashMap.toString());
        }
        c.b(f13930a, 1, jSONObject);
        c.a(f13931b, 1, jSONObject);
        a.a();
        a.a(com.bytedance.android.livesdk.ab.a.b.Room.info, "ttlive_ws_connect_status", 1, jSONObject);
    }
}
