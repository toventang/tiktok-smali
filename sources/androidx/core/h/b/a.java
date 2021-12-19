package androidx.core.h.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f2523a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f2524b;

    static {
        Covode.recordClassIndex(847);
    }

    private a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.f2523a = new float[i2];
        this.f2524b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((((float) i3) * length) / ((float) (i2 - 1)), fArr, null);
            this.f2523a[i3] = fArr[0];
            this.f2524b[i3] = fArr[1];
        }
    }

    public final float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f2523a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f2523a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f2523a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f2524b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f2524b;
        float f5 = fArr2[i2];
        return f5 + (f4 * (fArr2[length] - f5));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(float r3, float r4) {
        /*
            r2 = this;
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0 = 0
            r1.moveTo(r0, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.quadTo(r3, r4, r0, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.h.b.a.<init>(float, float):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a(float r9, float r10, float r11, float r12) {
        /*
            r8 = this;
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0 = 0
            r1.moveTo(r0, r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r8.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.h.b.a.<init>(float, float, float, float):void");
    }
}
