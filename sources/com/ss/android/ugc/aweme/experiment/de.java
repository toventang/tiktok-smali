package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class de {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f89775a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f89776b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f89777c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f89778d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f89779e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f89780f;

    /* renamed from: g  reason: collision with root package name */
    public static final de f89781g = new de();

    /* renamed from: h  reason: collision with root package name */
    private static final int f89782h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f89783i;

    private de() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Covode.recordClassIndex(56404);
        boolean z6 = true;
        int a2 = b.a().a(true, "feed_opt_postdelay", 1);
        f89782h = a2;
        f89783i = a2;
        if ((a2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f89775a = z;
        if ((a2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f89776b = z2;
        if ((a2 & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f89777c = z3;
        if ((a2 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f89778d = z4;
        if ((a2 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f89779e = z5;
        if ((a2 & 64) == 0) {
            z6 = false;
        }
        f89780f = z6;
    }
}
