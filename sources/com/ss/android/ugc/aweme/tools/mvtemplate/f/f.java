package com.ss.android.ugc.aweme.tools.mvtemplate.f;

import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class f implements ViewPager.f {

    /* renamed from: a  reason: collision with root package name */
    private float f140851a;

    static {
        Covode.recordClassIndex(91967);
    }

    public f(float f2) {
        this.f140851a = f2;
    }

    private static boolean a(float f2) {
        if (f2 == 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public final void a(View view, float f2) {
        b(view, f2);
    }

    public final void b(View view, float f2) {
        float f3;
        float f4;
        float f5 = 1.0f;
        if (f2 < -1.0f) {
            f2 = -1.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 < 0.0f) {
            f3 = f2 + 1.0f;
        } else {
            f3 = 1.0f - f2;
        }
        float f6 = (f3 * 0.100000024f) + 0.9f;
        if (a(f6)) {
            f6 = 1.0f;
        }
        view.setScaleX(f6);
        view.setScaleY(f6);
        if (f2 < 0.0f) {
            f4 = f2 + 1.0f;
        } else {
            f4 = 1.0f - f2;
        }
        float f7 = this.f140851a;
        float f8 = f7 + (f4 * (1.0f - f7));
        if (!a(f8)) {
            f5 = f8;
        }
        view.setAlpha(f5);
        int i2 = Build.VERSION.SDK_INT;
    }
}
