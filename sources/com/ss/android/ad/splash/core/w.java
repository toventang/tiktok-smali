package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public int f58909a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58910b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f58911c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58912d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58913e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f58914f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f58915g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f58916h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f58917i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f58918j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f58919k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f58920l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f58921m;
    public long n = 400;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    static {
        Covode.recordClassIndex(36456);
    }

    public static w a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        w wVar = new w();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i2 = 2;
        int optInt = jSONObject.optInt("max_crash_time", 2);
        if (optInt > 0) {
            i2 = optInt;
        }
        wVar.f58909a = i2;
        boolean z18 = true;
        if (jSONObject.optInt("enable_refactor_track_method", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        wVar.f58910b = z;
        if (jSONObject.optInt("enable_safe_cache_path") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        wVar.f58911c = z2;
        if (jSONObject.optInt("enable_add_show_count_for_empty_array", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        wVar.f58912d = z3;
        if (jSONObject.optInt("enable_old_view_align", 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        wVar.f58915g = z4;
        if (jSONObject.optInt("enable_new_clean_strategy", 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        wVar.f58913e = z5;
        if (jSONObject.optInt("enable_send_event_async", 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        wVar.f58914f = z6;
        if (jSONObject.optInt("enable_remove_empty_list_return", 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        wVar.f58916h = z7;
        if (jSONObject.optInt("enable_remove_default_language", 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        wVar.f58917i = z8;
        if (jSONObject.optInt("enable_cold_launch_interval", 0) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        wVar.f58918j = z9;
        if (jSONObject.optInt("enable_post_stop_video", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        wVar.f58919k = z10;
        if (jSONObject.optInt("enable_video_engine_release_async", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        wVar.f58921m = z11;
        if (jSONObject.optInt("enable_pause_video_on_background", 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        wVar.f58920l = z12;
        long j2 = 400;
        long optLong = jSONObject.optLong("reset_count_down_timer_delay", 400);
        if (optLong >= 0) {
            j2 = optLong;
        }
        wVar.n = j2;
        if (jSONObject.optInt("enable_async_video_controller") == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        wVar.o = z13;
        if (jSONObject.optInt("enable_over_refactor", 0) == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        wVar.p = z14;
        if (jSONObject.optInt("enable_full_screen_height_adapt", 1) == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        wVar.r = z15;
        if (jSONObject.optInt("enable_fix_skip_area", 1) == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        wVar.q = z16;
        if (jSONObject.optInt("enable_metric", 0) == 1) {
            z17 = true;
        } else {
            z17 = false;
        }
        wVar.s = z17;
        if (jSONObject.optInt("enable_adjust_stock_check", 1) != 1) {
            z18 = false;
        }
        wVar.t = z18;
        return wVar;
    }
}
