package com.ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.bf.d;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static int f65501a = -1;

    static {
        Covode.recordClassIndex(40281);
    }

    public static int a() {
        return c().getInt("ftc_age_gate_response_mode", 0);
    }

    public static String b() {
        return c().getString("after_login_birthday", "");
    }

    public static SharedPreferences c() {
        return d.a(a.f62426a, "aweme-app", 0);
    }

    public static SharedPreferences d() {
        return d.a(a.f62426a, "aweme_account_terminal_relative_sp", 0);
    }

    public static int a(String str) {
        return c().getInt("ftc_age_gate_response_mode".concat(String.valueOf(str)), -1);
    }

    public static void b(String str) {
        c().edit().putString("after_login_birthday", str).apply();
    }

    public static void c(boolean z) {
        c().edit().putBoolean("ftc_create_password_showing", z).apply();
    }

    public static void d(boolean z) {
        d().edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    public static void b(boolean z) {
        c().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    public static void a(boolean z) {
        c().edit().putBoolean("ftc_delete_video_alert_showing", z).apply();
    }

    public static void a(String str, int i2) {
        c().edit().putInt("ftc_age_gate_response_mode".concat(String.valueOf(str)), i2).apply();
    }
}
