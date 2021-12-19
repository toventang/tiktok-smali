package com.bytedance.android.livesdk.aj;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public long f13858a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f13859b;

    /* renamed from: c  reason: collision with root package name */
    public int f13860c;

    /* renamed from: d  reason: collision with root package name */
    public t f13861d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, Long> f13862e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Long> f13863f = new HashMap(6);

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f13864g;

    static {
        Covode.recordClassIndex(7705);
    }

    public static Pair<String, String> b() {
        return new Pair<>(e.a(), e.d());
    }

    public static void c() {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "error_code", 0L);
        a.a(jSONObject, "error_msg", "show live end fg");
        c.a("ttlive_audience_enter_room_all", 0, jSONObject);
    }

    public final long a() {
        long j2;
        if (this.f13858a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f13858a;
        } else {
            j2 = 0;
        }
        this.f13858a = 0;
        return j2;
    }

    public final void a(String str) {
        a(str, System.currentTimeMillis());
    }

    public final long b(String str) {
        Long l2 = this.f13862e.get(str);
        if (l2 == null || l2.longValue() <= 0) {
            return 0;
        }
        return l2.longValue();
    }

    public final void a(long j2) {
        if (!this.f13859b) {
            this.f13859b = true;
            long a2 = a();
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "enter_room_type", "other");
            a(jSONObject, "room_id", j2);
            Pair<String, String> b2 = b();
            a(jSONObject, "enter_from_merge", (String) b2.first);
            a(jSONObject, "enter_method", (String) b2.second);
            c.a("ttlive_audience_enter_room_all", 2, a2, jSONObject);
            c.a("ttlive_audience_enter_room_error", 2, jSONObject);
            com.bytedance.android.livesdk.ab.a.a.a();
            com.bytedance.android.livesdk.ab.a.a.a(b.Room.info, "ttlive_audience_enter_room", 2, jSONObject);
            if (u.a().b().d()) {
                c.a("ttlive_audience_minor_enter_room_all", 2, a2, jSONObject);
                c.a("ttlive_audience_minor_enter_room_error", 2, jSONObject);
            }
        }
    }

    private void a(String str, long j2) {
        this.f13862e.put(str, Long.valueOf(j2));
    }

    public final void a(int i2, String str) {
        if (!this.f13864g) {
            this.f13864g = true;
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "exit_code", (long) i2);
            a(jSONObject, "exit_msg", str);
            c.a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    public final void a(int i2, String str, long j2) {
        if (!this.f13864g) {
            if (i2 != 115) {
                this.f13864g = true;
            }
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "exit_code", (long) i2);
            a(jSONObject, "exit_msg", str);
            a(jSONObject, "room_id", j2);
            c.a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    public final void a(int i2, String str, long j2, String str2, String str3) {
        if (!this.f13859b) {
            this.f13859b = true;
            a();
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "enter_room_type", "other");
            a(jSONObject, "room_type", str2);
            a(jSONObject, "error_code", (long) i2);
            a(jSONObject, "error_msg", str);
            a(jSONObject, "room_id", j2);
            a(jSONObject, "pull_url", str3);
            Pair<String, String> b2 = b();
            a(jSONObject, "enter_from_merge", (String) b2.first);
            a(jSONObject, "enter_method", (String) b2.second);
            c.b("ttlive_audience_enter_room_all", 1, jSONObject);
            c.a("ttlive_audience_enter_room_error", 1, jSONObject);
            com.bytedance.android.livesdk.ab.a.a.a();
            com.bytedance.android.livesdk.ab.a.a.a(b.Room.info, "ttlive_audience_enter_room", 1, jSONObject);
            if (u.a().b().d()) {
                c.b("ttlive_audience_minor_enter_room_all", 1, jSONObject);
                c.a("ttlive_audience_minor_enter_room_error", 1, jSONObject);
            }
        }
    }
}
