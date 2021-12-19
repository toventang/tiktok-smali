package androidx.g.a.a;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f3060a;

    /* renamed from: b  reason: collision with root package name */
    private final float f3061b;

    static {
        Covode.recordClassIndex(1090);
    }

    protected d(float[] fArr) {
        this.f3060a = fArr;
        this.f3061b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3060a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f3061b;
        float[] fArr2 = this.f3060a;
        return fArr2[min] + (((f2 - (((float) min) * f3)) / f3) * (fArr2[min + 1] - fArr2[min]));
    }
}
