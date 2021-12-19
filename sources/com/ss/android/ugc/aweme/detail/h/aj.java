package com.ss.android.ugc.aweme.detail.h;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class aj implements ViewPager.f {

    /* renamed from: a  reason: collision with root package name */
    private ai f79686a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f79687b = true;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f79688c = true;

    static {
        Covode.recordClassIndex(49526);
    }

    public aj(ai aiVar) {
        this.f79686a = aiVar;
    }

    private static void b(View view, float f2) {
        int width = view.getWidth();
        int height = view.getHeight();
        float max = Math.max(0.85f, 1.0f - Math.abs(f2));
        float f3 = 1.0f - max;
        float f4 = (((float) height) * f3) / 2.0f;
        float f5 = (((float) width) * f3) / 2.0f;
        if (f2 < 0.0f) {
            view.setTranslationX(f5 - (f4 / 2.0f));
        } else {
            view.setTranslationX((-f5) + (f4 / 2.0f));
        }
        view.setScaleX(max);
        view.setScaleY(max);
        view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public final void a(View view, float f2) {
        if (f2 < -1.0f || f2 > 1.0f) {
            view.setAlpha(0.0f);
        } else if (this.f79686a != null) {
            if (((double) f2) == 0.0d || f2 == -1.0f || f2 == 1.0f) {
                this.f79687b = true;
                this.f79688c = true;
                b(view, 0.0f);
            } else if (this.f79688c.booleanValue()) {
                if (this.f79687b.booleanValue()) {
                    this.f79687b = false;
                    if ((f2 >= 0.0f || f2 <= -0.5f) && (f2 <= 0.5f || f2 >= 1.0f)) {
                        this.f79688c = Boolean.valueOf(this.f79686a.a());
                    } else {
                        this.f79688c = Boolean.valueOf(this.f79686a.b());
                    }
                }
                if (this.f79688c.booleanValue()) {
                    b(view, f2);
                }
            }
        }
    }
}
