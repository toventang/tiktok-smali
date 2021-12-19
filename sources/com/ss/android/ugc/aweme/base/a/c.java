package com.ss.android.ugc.aweme.base.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f67961a = R.anim.f354do;

    /* renamed from: b  reason: collision with root package name */
    public static final int f67962b = R.anim.dx;

    /* renamed from: c  reason: collision with root package name */
    public static final int f67963c = R.anim.dq;

    /* renamed from: d  reason: collision with root package name */
    public static final int f67964d = R.anim.dv;

    /* renamed from: e  reason: collision with root package name */
    public static final int f67965e = R.anim.dp;

    /* renamed from: f  reason: collision with root package name */
    public static final int f67966f = R.anim.dy;

    /* renamed from: g  reason: collision with root package name */
    public static final int f67967g = R.anim.dr;

    /* renamed from: h  reason: collision with root package name */
    public static final int f67968h = R.anim.dw;

    /* renamed from: i  reason: collision with root package name */
    public static final int f67969i = R.anim.af;

    /* renamed from: j  reason: collision with root package name */
    public static final int f67970j = R.anim.ah;

    static {
        Covode.recordClassIndex(41841);
    }

    public static void a(Activity activity) {
        activity.overridePendingTransition(f67961a, f67962b);
    }

    public static void a(Activity activity, int i2) {
        int i3;
        int i4 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = f67967g;
                    i3 = f67968h;
                } else if (i2 == 3) {
                    i4 = f67969i;
                } else if (i2 != 4) {
                    i4 = f67963c;
                    i3 = f67964d;
                } else {
                    i4 = f67961a;
                    i3 = f67962b;
                }
            }
            i3 = 0;
        } else {
            i4 = f67963c;
            i3 = f67964d;
        }
        activity.overridePendingTransition(i4, i3);
    }
}
