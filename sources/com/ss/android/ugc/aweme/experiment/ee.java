package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.lego.b.c;

public final class ee {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f89901a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f89902b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f89903c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f89904d;

    /* renamed from: e  reason: collision with root package name */
    public static final ee f89905e = new ee();

    /* renamed from: f  reason: collision with root package name */
    private static final int f89906f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f89907g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f89908h;

    private ee() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Covode.recordClassIndex(56453);
        boolean z5 = true;
        int a2 = b.a().a(true, "zl_launch_opt_doframe", 62);
        f89906f = a2;
        f89907g = a2;
        if ((a2 & 2) == 0 || !c.a()) {
            z = false;
        } else {
            z = true;
        }
        f89901a = z;
        if ((a2 & 4) == 0 || !c.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        f89908h = z2;
        if ((a2 & 8) == 0 || !c.a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        f89902b = z3;
        if ((a2 & 16) == 0 || !c.a()) {
            z4 = false;
        } else {
            z4 = true;
        }
        f89903c = z4;
        if ((a2 & 32) == 0 || !c.a()) {
            z5 = false;
        }
        f89904d = z5;
    }
}
