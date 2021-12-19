package com.ss.android.ugc.aweme.kids.commonfeed.g;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.kids.commonfeed.a.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    protected static int f106129a;

    /* renamed from: b  reason: collision with root package name */
    protected static int f106130b;

    /* renamed from: e  reason: collision with root package name */
    private static int f106131e;

    /* renamed from: f  reason: collision with root package name */
    private static int f106132f;

    /* renamed from: g  reason: collision with root package name */
    private static int f106133g;

    /* renamed from: c  reason: collision with root package name */
    public int f106134c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f106135d = -1;

    static {
        Covode.recordClassIndex(67876);
    }

    public static void a(Context context) {
        try {
            f106131e = n.e(context);
            f106132f = i.c();
            b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void b(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f106133g = displayMetrics.heightPixels;
        f106130b = displayMetrics.heightPixels + f106131e;
        f106129a = displayMetrics.widthPixels;
    }

    private static void a(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width == i3 && marginLayoutParams.height == i2) {
                int i4 = Build.VERSION.SDK_INT;
                return;
            }
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i2;
            view.setLayoutParams(marginLayoutParams);
            view.setRotation(0.0f);
        }
    }

    public final void a(Context context, View view, int i2, int i3) {
        b(context, view, i2, i3);
    }

    private void b(Context context, View view, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (f106130b == 0 || f106129a == 0) {
            b(context);
        }
        int i5 = a.C2699a.f105969a.f105962e;
        int i6 = f106129a;
        double d2 = (double) i6;
        int i7 = f106130b;
        double d3 = (double) i7;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 <= 0.5d) {
            c(view, i2, i3, i5, i6);
            return;
        }
        double d4 = (double) i6;
        double d5 = (double) i7;
        Double.isNaN(d4);
        Double.isNaN(d5);
        if (d4 / d5 >= 0.6666666666666666d) {
            a(view, i2, i3, i6, i7);
        } else {
            b(view, i2, i3, i5, i6);
        }
    }

    private static void a(View view, int i2, int i3, int i4, int i5) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 > 1.0d) {
            if (i2 <= 0 || i3 <= 0) {
                i5 = i4;
            } else {
                i5 = (i3 * i4) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i4 = i5;
        } else {
            i4 = (i2 * i5) / i3;
        }
        a(view, i5, i4);
    }

    private void c(View view, int i2, int i3, int i4, int i5) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i5;
        double d6 = (double) i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 > 0.625d || d7 > 0.625d || d4 < 0.4699999988079071d) {
            if (i2 <= 0 || i3 <= 0) {
                i4 = i5;
            } else {
                i4 = (i3 * i5) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i5 = i4;
        } else {
            i5 = (i2 * i4) / i3;
        }
        this.f106134c = i4;
        this.f106135d = i5;
        if (view != null) {
            a(view, i4, i5);
        }
    }

    private void b(View view, int i2, int i3, int i4, int i5) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i5;
        double d6 = (double) i4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 > 0.5625d || d7 > 0.5625d || d4 < 0.4699999988079071d) {
            if (i2 <= 0 || i3 <= 0) {
                i4 = i5;
            } else {
                i4 = (i3 * i5) / i2;
            }
        } else if (i2 <= 0 || i3 <= 0) {
            i5 = i4;
        } else {
            i5 = (i2 * i4) / i3;
        }
        this.f106135d = i5;
        this.f106134c = i4;
        if (view != null) {
            a(view, i4, i5);
        }
    }
}
