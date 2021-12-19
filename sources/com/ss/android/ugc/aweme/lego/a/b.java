package com.ss.android.ugc.aweme.lego.a;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f107371a = a.COLD_BOOT_BEGIN;

    /* renamed from: b  reason: collision with root package name */
    public static final b f107372b = new b();

    private b() {
    }

    public static boolean a() {
        if (f107371a == a.COLD_BOOT_BEGIN || f107371a == a.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (f107371a == a.COLD_BOOT_END || f107371a == a.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(68726);
    }
}
