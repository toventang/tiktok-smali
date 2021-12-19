package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.utils.fr;

public final class fp {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90063a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f90064b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f90065c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f90066d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f90067e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f90068f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f90069g;

    /* renamed from: h  reason: collision with root package name */
    public static final fp f90070h = new fp();

    /* renamed from: i  reason: collision with root package name */
    private static final int f90071i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f90072j;

    private fp() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Covode.recordClassIndex(56517);
        boolean z7 = true;
        int a2 = b.a().a(true, "zl_profile_opt_launch_fix", 1);
        f90071i = a2;
        if (fr.a() && a2 == 1) {
            a2 = 65535;
        }
        f90072j = a2;
        if ((a2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f90063a = z;
        if ((a2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f90064b = z2;
        if ((a2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f90065c = z3;
        if ((a2 & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f90066d = z4;
        if ((a2 & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f90067e = z5;
        if ((a2 & 64) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        f90068f = z6;
        if ((a2 & 128) == 0) {
            z7 = false;
        }
        f90069g = z7;
    }
}
