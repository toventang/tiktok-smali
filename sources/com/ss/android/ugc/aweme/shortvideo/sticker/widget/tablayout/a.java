package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.g.a.a.b;
import androidx.g.a.a.c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Interpolator f130782a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    static final Interpolator f130783b = new b();

    /* renamed from: c  reason: collision with root package name */
    static final Interpolator f130784c = new androidx.g.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    static final Interpolator f130785d = new c();

    /* renamed from: e  reason: collision with root package name */
    static final Interpolator f130786e = new DecelerateInterpolator();

    static {
        Covode.recordClassIndex(85707);
    }

    static int a(int i2, int i3, float f2) {
        return i2 + Math.round(f2 * ((float) (i3 - i2)));
    }
}
