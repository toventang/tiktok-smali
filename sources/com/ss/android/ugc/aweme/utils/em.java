package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.nita.c.a;
import com.ss.android.ugc.aweme.utils.hc;

public final class em {
    private static final int[] A;
    private static final int[] B;

    /* renamed from: a  reason: collision with root package name */
    private static final Context f142867a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f142868b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f142869c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f142870d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f142871e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f142872f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f142873g;

    /* renamed from: h  reason: collision with root package name */
    private static final int f142874h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f142875i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f142876j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f142877k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f142878l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f142879m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int[] q;
    private static final int[] r;
    private static final int[] s;
    private static final int[] t;
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;
    private static final int[] z;

    static {
        Covode.recordClassIndex(93487);
        Context a2 = d.a();
        f142867a = a2;
        int a3 = (int) hc.a.a(a2, 32.0f);
        f142868b = a3;
        int a4 = (int) hc.a.a(a2, 48.0f);
        f142869c = a4;
        int a5 = (int) hc.a.a(a2, 52.0f);
        f142870d = a5;
        int a6 = (int) hc.a.a(a2, 64.0f);
        f142871e = a6;
        int a7 = (int) hc.a.a(a2, 90.0f);
        f142872f = a7;
        int a8 = (int) hc.a.a(a2, 94.0f);
        f142873g = a8;
        int a9 = (int) hc.a.a(a2, 120.0f);
        f142874h = a9;
        int a10 = (int) hc.a.a(a2, 124.0f);
        f142875i = a10;
        int a11 = (int) hc.a.a(a2, 165.0f);
        f142876j = a11;
        int a12 = (int) hc.a.a(a2, 186.0f);
        f142877k = a12;
        int a13 = (int) hc.a.a(a2, 180.0f);
        f142878l = a13;
        int a14 = (int) hc.a.a(a2, 211.0f);
        f142879m = a14;
        int a15 = (int) hc.a.a(a2, 248.0f);
        n = a15;
        int a16 = (int) hc.a.a(a2, 280.0f);
        o = a16;
        int a17 = (int) hc.a.a(a2, 375.0f);
        p = a17;
        q = new int[]{a3, a3};
        r = new int[]{a4, a4};
        s = new int[]{a5, a5};
        t = new int[]{a6, a6};
        u = new int[]{a8, a8};
        v = new int[]{a9, a9};
        w = new int[]{a10, a11};
        x = new int[]{a12, a15};
        y = new int[]{a17, a7};
        z = new int[]{a17, a13};
        A = new int[]{a17, a14};
        B = new int[]{a17, a16};
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static int[] a(int i2) {
        if (i2 == 200) {
            return w;
        }
        if (i2 == 201) {
            return x;
        }
        if (i2 == 400) {
            return s;
        }
        if (i2 != 500) {
            if (i2 == 700) {
                return A;
            }
            if (i2 == 600) {
                return z;
            }
            if (i2 == 601) {
                return y;
            }
            switch (i2) {
                case a.f41622a:
                    break;
                case 101:
                    return r;
                case 102:
                    return u;
                default:
                    switch (i2) {
                        case 300:
                            break;
                        case 301:
                            break;
                        case 302:
                            return v;
                        case 303:
                            return B;
                        default:
                            return null;
                    }
            }
            return q;
        }
        return t;
    }
}
