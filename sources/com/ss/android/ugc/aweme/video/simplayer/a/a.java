package com.ss.android.ugc.aweme.video.simplayer.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public int f143832a;

    /* renamed from: b  reason: collision with root package name */
    public long f143833b;

    /* renamed from: c  reason: collision with root package name */
    public long f143834c;

    /* renamed from: d  reason: collision with root package name */
    public long f143835d;

    /* renamed from: e  reason: collision with root package name */
    public long f143836e;

    /* renamed from: f  reason: collision with root package name */
    public long f143837f;

    /* renamed from: g  reason: collision with root package name */
    public long f143838g;

    /* renamed from: h  reason: collision with root package name */
    public long f143839h;

    static {
        Covode.recordClassIndex(94132);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void c() {
        this.f143837f = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void d() {
        this.f143838g = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void e() {
        this.f143835d = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void a() {
        this.f143839h = SystemClock.elapsedRealtime();
        a.b.f109011a.b("player_precreate_to_prerender", false);
        a.b.f109011a.a("player_prerender_duration", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void b() {
        this.f143836e = SystemClock.elapsedRealtime();
        a.b.f109011a.b("player_prerender_duration", false);
        a.b.f109011a.a("player_prerender_to_focus", false);
        a.b.f109011a.a("player_prerender_to_ui", false);
        a.b.f109011a.a("player_perrender_to_texture_availble", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void b(int i2) {
        this.f143832a = i2;
        this.f143834c = SystemClock.elapsedRealtime();
        a.b.f109011a.b("player_precreate_duration", false);
        a.b.f109011a.a("player_precreate_to_prerender", false);
        a.b.f109011a.a("player_precreate_end_type", (long) i2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void c(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            r.a("pre_start_end_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void d(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            r.a("pre_on_prepared_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void e(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            r.a("pre_on_render_start_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void a(int i2) {
        this.f143832a = i2;
        this.f143833b = SystemClock.elapsedRealtime();
        a.b.f109011a.b("cold_boot_start_to_precreate", false);
        a.b.f109011a.b("player_init_to_precreate", false);
        a.b.f109011a.a("player_precreate_duration", false);
        a.b.f109011a.a("player_precreate_start_type", (long) i2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void a(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            r.a("pre_pause_end_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.k
    public final void b(long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            r.a("pre_set_surface_end_time", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
