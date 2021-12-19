package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;

final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final TabLayout.h f130790a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130791b;

    /* renamed from: c  reason: collision with root package name */
    private final int f130792c;

    /* renamed from: d  reason: collision with root package name */
    private final TabLayout f130793d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f130794e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f130795f;

    static {
        Covode.recordClassIndex(85709);
    }

    c(TabLayout.h hVar, int i2, int i3, TabLayout tabLayout, boolean z, boolean z2) {
        this.f130790a = hVar;
        this.f130791b = i2;
        this.f130792c = i3;
        this.f130793d = tabLayout;
        this.f130794e = z;
        this.f130795f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TabLayout.h hVar = this.f130790a;
        int i2 = this.f130791b;
        int i3 = this.f130792c;
        TabLayout tabLayout = this.f130793d;
        boolean z = this.f130794e;
        boolean z2 = this.f130795f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i2 >= i3 || hVar.f130763a) {
            floatValue = 1.0f - floatValue;
        } else {
            i3--;
        }
        tabLayout.a(i3, floatValue, z, z2);
    }
}
