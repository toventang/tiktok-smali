package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.utils.fr;

public final class fs {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90077a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f90078b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f90079c;

    /* renamed from: d  reason: collision with root package name */
    public static final fs f90080d = new fs();

    /* renamed from: e  reason: collision with root package name */
    private static final int f90081e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f90082f;

    private fs() {
    }

    static {
        boolean z;
        boolean z2;
        Covode.recordClassIndex(56520);
        boolean z3 = true;
        int a2 = b.a().a(true, "zl_profile_opt_preload", 1);
        f90081e = a2;
        if (fr.a() && a2 == 1) {
            a2 = 65535;
        }
        f90082f = a2;
        if ((a2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f90077a = z;
        if ((a2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f90078b = z2;
        if ((a2 & 8) == 0) {
            z3 = false;
        }
        f90079c = z3;
    }
}
