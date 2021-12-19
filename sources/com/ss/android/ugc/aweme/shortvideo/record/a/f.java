package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

final class f {

    /* renamed from: a  reason: collision with root package name */
    Context f130022a;

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f130023b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f130024c;

    /* renamed from: d  reason: collision with root package name */
    int f130025d;

    /* renamed from: e  reason: collision with root package name */
    int f130026e;

    /* renamed from: f  reason: collision with root package name */
    int f130027f;

    static {
        Covode.recordClassIndex(85321);
    }

    f(ViewGroup viewGroup) {
        this.f130022a = viewGroup.getContext();
        this.f130023b = viewGroup;
    }

    public final void a(boolean z) {
        TextView textView = this.f130024c;
        if (textView != null && textView.getVisibility() == 0) {
            if (z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.ss.android.ugc.aweme.shortvideo.record.a.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(85322);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        f.this.f130024c.setVisibility(8);
                    }
                });
                this.f130024c.startAnimation(alphaAnimation);
                return;
            }
            this.f130024c.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        this.f130025d = i2;
        this.f130026e = i3;
        this.f130027f = i4;
    }
}
