package com.ss.android.ugc.aweme.at;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.experiment.fh;
import com.ss.android.ugc.aweme.experiment.gx;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.da;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, AtomicBoolean> f67047a = new HashMap(5);

    /* renamed from: b  reason: collision with root package name */
    public static int f67048b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f67049c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67050d = true;

    /* renamed from: e  reason: collision with root package name */
    private static Runnable f67051e = c.f67058a;

    /* renamed from: f  reason: collision with root package name */
    private static Runnable f67052f = d.f67059a;

    /* renamed from: g  reason: collision with root package name */
    private static final Runnable f67053g = e.f67060a;

    /* renamed from: h  reason: collision with root package name */
    private static final Runnable f67054h = f.f67061a;

    /* renamed from: i  reason: collision with root package name */
    private static final Runnable f67055i = g.f67062a;

    /* renamed from: j  reason: collision with root package name */
    private static final Runnable f67056j = h.f67063a;

    private static boolean f() {
        if (!f67050d) {
            return true;
        }
        f67050d = false;
        return false;
    }

    static {
        Covode.recordClassIndex(41316);
    }

    public static void b() {
        if (gx.b() && !e("system_launch_1_minute")) {
            f("system_launch_1_minute");
            m.a().removeCallbacks(f67053g);
            da.a.a("system_launch_1_minute").b();
        }
    }

    public static void c() {
        if (gx.c() && !e("system_launch_1_minute_feed")) {
            f("system_launch_1_minute_feed");
            m.a().removeCallbacks(f67054h);
            da.a.a("system_launch_1_minute_feed").b();
        }
    }

    public static void d() {
        if (gx.d() && !e("system_launch_2_minute")) {
            f("system_launch_2_minute");
            m.a().removeCallbacks(f67055i);
            da.a.a("system_launch_2_minute").b();
        }
    }

    public static void e() {
        if (gx.e() && !e("system_launch_2_minute_feed")) {
            f("system_launch_2_minute_feed");
            m.a().removeCallbacks(f67056j);
            da.a.a("system_launch_2_minute_feed").b();
        }
    }

    public static void a() {
        if (!e("system_launch")) {
            m.a(f67052f, 5000);
        }
        if (!e("system_launch_1_minute") && gx.b()) {
            m.a(f67053g, 60000);
        }
        if (!e("system_launch_1_minute_feed") && gx.c()) {
            m.a(f67054h, 60000);
        }
        if (!e("system_launch_2_minute") && gx.d()) {
            m.a(f67055i, 120000);
        }
        if (!e("system_launch_2_minute_feed") && gx.e()) {
            m.a(f67056j, 120000);
        }
    }

    private static void f(String str) {
        AtomicBoolean atomicBoolean = f67047a.get(str);
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    public static void a(String str) {
        if (f67049c) {
            m.a().removeCallbacks(f67051e);
            c(str);
        }
    }

    public static void b(String str) {
        if (!e("system_launch")) {
            m.a().removeCallbacks(f67052f);
            d(str);
            fh.f90038a = false;
        }
    }

    static void c(String str) {
        f67049c = false;
        da.a.a("video_play").a("is_pause", str);
        da.a.a("video_play").b();
    }

    static void d(String str) {
        if (!e("system_launch")) {
            f("system_launch");
            da.a.a("system_launch").a("is_pause", str);
            da.a.a("system_launch").b();
        }
    }

    private static boolean e(String str) {
        AtomicBoolean atomicBoolean = f67047a.get(str);
        if (atomicBoolean == null) {
            return false;
        }
        return atomicBoolean.get();
    }

    public static String a(Aweme aweme) {
        if (aweme == null) {
            return "others";
        }
        if (aweme.isAd()) {
            return "ad";
        }
        if (aweme.isMixAweme()) {
            return "mix";
        }
        if (aweme.isLive()) {
            return "live";
        }
        if (aweme.getDistributeType() == 2) {
            return "long";
        }
        return "video";
    }

    public static void a(int i2, Aweme aweme) {
        if (f()) {
            f67048b = i2;
            String a2 = a(aweme);
            f67049c = true;
            da.a.a("video_play").a("launch_vv", Integer.toString(i2)).a("current_video", a2).a("video_scene", k.f67079a).a();
            m.a(f67051e, 5000);
        }
    }
}
