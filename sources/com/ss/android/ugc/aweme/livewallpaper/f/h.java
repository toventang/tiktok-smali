package com.ss.android.ugc.aweme.livewallpaper.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f108917a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f108918b = i.a((h.f.a.a) a.f108919a);

    public static Keva a() {
        return (Keva) f108918b.getValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108919a = new a();

        static {
            Covode.recordClassIndex(69750);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_live_wallpaper", 1);
        }
    }

    public static String[] b() {
        return a().getStringArray("keva_key_wallpaper_active_date", null);
    }

    public static long c() {
        return a().getLong("keva_key_already_upload_date", 0);
    }

    public static int d() {
        return a().getInt("keva_key_active_check_interval_hour", 2);
    }

    public static boolean e() {
        return a().getBoolean("keva_key_enable_double_tap_pause_video", false);
    }

    public static int f() {
        return a().getInt("keva_key_wallpaper_sound_slider_progress", 0);
    }

    public static boolean g() {
        return a().getBoolean("keva_key_last_engine_is_tt_player", false);
    }

    public static void h() {
        a().erase("keva_key_already_upload_date");
    }

    static {
        Covode.recordClassIndex(69749);
    }

    public static void a(int i2) {
        a().storeInt("keva_key_wallpaper_sound_slider_progress", i2);
    }

    public static void a(boolean z) {
        a().storeBoolean("keva_key_enable_double_tap_pause_video", z);
    }

    public static void a(String[] strArr) {
        a().storeStringArray("keva_key_wallpaper_active_date", strArr);
    }
}
