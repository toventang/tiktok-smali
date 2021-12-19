package com.ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.utils.c;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f107238a;

    /* renamed from: b  reason: collision with root package name */
    private static int f107239b = -1;

    static {
        Covode.recordClassIndex(68588);
    }

    public static boolean b() {
        if (f107239b == -1) {
            if (SettingsManager.a().a("benchmark_poor_perf_device", false)) {
                f107239b = 1;
            } else {
                f107239b = 0;
            }
        }
        if (f107239b > 0) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        if (!c.f142752a) {
            return b.a().a(true, "enable_benchmark_performance", false);
        }
        if (f107238a == null) {
            f107238a = Boolean.valueOf(b.a().a(true, "enable_benchmark_performance", false));
        }
        return f107238a.booleanValue();
    }
}
