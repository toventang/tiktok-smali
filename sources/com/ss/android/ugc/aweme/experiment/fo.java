package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.utils.fr;

public final class fo {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90054a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f90055b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f90056c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f90057d;

    /* renamed from: e  reason: collision with root package name */
    public static final fo f90058e = new fo();

    /* renamed from: f  reason: collision with root package name */
    private static final int f90059f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f90060g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f90061h;

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f90062i;

    private fo() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Covode.recordClassIndex(56516);
        boolean z6 = true;
        int a2 = b.a().a(true, "zl_profile_opt_gc", 1);
        f90059f = a2;
        if (fr.a() && a2 == 1) {
            a2 = 65535;
        }
        f90060g = a2;
        if ((a2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f90054a = z;
        if ((a2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f90055b = z2;
        if ((a2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f90061h = z3;
        if ((a2 & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f90062i = z4;
        if ((a2 & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f90056c = z5;
        if ((a2 & 64) == 0) {
            z6 = false;
        }
        f90057d = z6;
    }
}
