package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f90252a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f90253b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f90254c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f90255d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f90256e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f90257f = new k();

    /* renamed from: g  reason: collision with root package name */
    private static final int f90258g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f90259h;

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f90260i;

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f90261j;

    /* renamed from: k  reason: collision with root package name */
    private static final boolean f90262k;

    /* renamed from: l  reason: collision with root package name */
    private static final boolean f90263l;

    private k() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Covode.recordClassIndex(56612);
        int i2 = Keva.getRepo("ab_repo_cold_boot").getInt("zl_async_inflate", 49);
        f90258g = i2;
        boolean z9 = true;
        if ((i2 & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        f90259h = z;
        if ((i2 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f90260i = z2;
        if ((i2 & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f90261j = z3;
        if ((i2 & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f90252a = z4;
        if ((i2 & 256) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f90253b = z5;
        if ((i2 & 512) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        f90254c = z6;
        if ((i2 & 1024) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        f90262k = z7;
        if ((i2 & 2048) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        f90255d = z8;
        if ((i2 & 4096) == 0) {
            z9 = false;
        }
        f90263l = z9;
        f90256e = i2 & 15;
    }
}
