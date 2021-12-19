package com.lynx.tasm.a;

import android.os.Build;
import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.h.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<BaseInterpolator> f55679a = new SparseArray<BaseInterpolator>() {
        /* class com.lynx.tasm.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34836);
        }

        {
            put(0, new LinearInterpolator());
            put(1, new AccelerateInterpolator());
            put(2, new DecelerateInterpolator());
            put(3, new AccelerateDecelerateInterpolator());
        }
    };

    static {
        Covode.recordClassIndex(34835);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        private int f55680a;

        /* renamed from: b  reason: collision with root package name */
        private int f55681b;

        static {
            Covode.recordClassIndex(34837);
        }

        public final float getInterpolation(float f2) {
            float f3;
            int i2;
            int i3;
            int i4 = this.f55681b;
            if (i4 == 1) {
                i2 = this.f55680a;
                i3 = ((int) (f2 * ((float) i2))) + 1;
                if (i3 > i2) {
                    i3 = i2;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int i5 = this.f55680a;
                    int i6 = (int) (f2 * ((float) i5));
                    if (i6 == i5) {
                        i6--;
                    }
                    f3 = (float) i6;
                    i2 = i5 - 1;
                } else if (i4 != 4) {
                    return 0.0f;
                } else {
                    int i7 = this.f55680a;
                    int i8 = ((int) (f2 * ((float) i7))) + 1;
                    if (i8 > i7) {
                        i8 = i7;
                    }
                    f3 = (float) i8;
                    i2 = i7 + 1;
                }
                return f3 / ((float) i2);
            } else {
                i2 = this.f55680a;
                i3 = (int) (f2 * ((float) i2));
                if (i3 == i2) {
                    i3--;
                }
            }
            f3 = (float) i3;
            return f3 / ((float) i2);
        }

        a(int i2, int i3) {
            this.f55680a = i2;
            this.f55681b = i3;
        }
    }

    public static Interpolator a(b bVar) {
        int i2 = bVar.f55637e;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return f55679a.get(i2);
            case 4:
                float f2 = bVar.f55638f;
                float f3 = bVar.f55639g;
                if (Build.VERSION.SDK_INT >= 21) {
                    return new PathInterpolator(f2, f3);
                }
                return new androidx.core.h.b.a(f2, f3);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return b.a(bVar.f55638f, bVar.f55639g, bVar.f55640h, bVar.f55641i);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new a((int) bVar.f55638f, bVar.f55642j);
            default:
                new RuntimeException("layout animation don't support interpolator:".concat(String.valueOf(i2)));
                return f55679a.get(0);
        }
    }
}
