package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static final int f89581a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f89582b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f89583c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f89584d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f89585e;

    public static boolean a() {
        if (f89582b || f89585e) {
            return true;
        }
        return false;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(56302);
        boolean z4 = true;
        int i2 = Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_measure_opt", 1);
        f89581a = i2;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        f89584d = z;
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        f89582b = z2;
        if (i2 == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        f89585e = z3;
        if (i2 != 6) {
            z4 = false;
        }
        f89583c = z4;
    }

    public static void a(int i2) {
        Keva.getRepo("ab_repo_cold_boot").storeInt("cold_boot_measure_opt", i2);
    }
}
