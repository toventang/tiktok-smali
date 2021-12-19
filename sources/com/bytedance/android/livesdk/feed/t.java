package com.bytedance.android.livesdk.feed;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class t extends a {

    /* renamed from: a  reason: collision with root package name */
    public long f17653a;

    /* renamed from: b  reason: collision with root package name */
    public long f17654b;

    static {
        Covode.recordClassIndex(9793);
    }

    private long b() {
        long j2;
        if (this.f17653a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f17653a;
        } else {
            j2 = 0;
        }
        this.f17653a = 0;
        return j2;
    }

    public final long a() {
        long j2;
        if (this.f17654b > 0) {
            j2 = SystemClock.uptimeMillis() - this.f17654b;
        } else {
            j2 = 0;
        }
        this.f17654b = 0;
        return j2;
    }

    public static void a(float f2) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "feed_fps", f2);
        c.b("ttlive_feed_list_fps_all", 0, jSONObject);
    }

    public final void a(String str) {
        long b2 = b();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "request_type", str);
        c.a("ttlive_request_feed_api_all", 0, b2, jSONObject);
    }

    public final void a(String str, Throwable th) {
        int i2;
        String str2;
        b();
        JSONObject jSONObject = new JSONObject();
        if (th instanceof com.bytedance.android.live.a.a.a) {
            i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
        } else {
            i2 = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        a(jSONObject, "error_code", (long) i2);
        a(jSONObject, "error_msg", str2);
        a(jSONObject, "request_type", str);
        c.b("ttlive_request_feed_api_all", 1, jSONObject);
        c.a("ttlive_request_feed_api_error", 1, jSONObject);
    }
}
