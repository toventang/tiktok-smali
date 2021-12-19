package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f89586a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f89587b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f89588c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f89589d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f89590e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f89591f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final int f89592g;

    /* renamed from: h  reason: collision with root package name */
    private static final int f89593h;

    private b() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(56303);
        boolean z4 = true;
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "zl_activity_opt_with_gc", 1);
        f89592g = a2;
        f89593h = a2;
        if ((a2 & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        f89586a = z;
        if ((a2 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f89587b = z2;
        if ((a2 & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f89588c = z3;
        if ((a2 & 128) == 0) {
            z4 = false;
        }
        f89589d = z4;
        f89590e = a2 & 15;
    }
}
