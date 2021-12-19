package com.google.android.material.a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.g.a.a.b;
import androidx.g.a.a.c;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f52126a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f52127b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f52128c = new androidx.g.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f52129d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f52130e = new DecelerateInterpolator();

    static {
        Covode.recordClassIndex(32410);
    }

    public static int a(int i2, int i3, float f2) {
        return i2 + Math.round(f2 * ((float) (i3 - i2)));
    }
}
