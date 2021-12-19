package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f25043a;

    /* renamed from: b  reason: collision with root package name */
    static SharedPreferences f25044b;

    /* renamed from: c  reason: collision with root package name */
    static int f25045c;

    /* renamed from: d  reason: collision with root package name */
    static int f25046d;

    /* renamed from: e  reason: collision with root package name */
    public static long f25047e = 16408;

    static {
        Covode.recordClassIndex(14627);
    }

    public static void a() {
        SharedPreferences sharedPreferences = f25044b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", f25046d).putLong("monitor_switch_config_atrace_flag", f25047e).apply();
        }
    }

    public static void a(int i2) {
        f25046d = (i2 & -536870912) + (f25046d & 536870911);
    }

    public static boolean b(int i2) {
        if ((i2 & f25045c) != 0) {
            return true;
        }
        return false;
    }

    public static void a(int i2, boolean z) {
        if (z) {
            f25046d = i2 | f25046d;
            return;
        }
        f25046d = (i2 ^ -1) & f25046d;
    }
}
