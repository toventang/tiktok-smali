package com.lynx.tasm.behavior.ui.a;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

public final class g extends a {

    /* renamed from: h  reason: collision with root package name */
    private int f56122h;

    /* renamed from: i  reason: collision with root package name */
    private PointF f56123i = new PointF(0.5f, 0.5f);

    static {
        Covode.recordClassIndex(35056);
    }

    public g(ReadableArray readableArray) {
        if (readableArray == null) {
            LLog.d("RadialGradient", "native parser error, array is null");
            return;
        }
        if (readableArray.size() != 3) {
            LLog.d("RadialGradient", "native parser error, array.size must be 3");
        }
        this.f56122h = readableArray.getArray(0).getInt(1);
        a(readableArray.getArray(1), readableArray.getArray(2));
    }

    public final void setBounds(Rect rect) {
        float f2;
        float f3;
        double sqrt;
        float f4;
        this.f56101b = rect.width();
        this.f56102c = rect.height();
        if (this.f56123i.x < 1.0f) {
            f2 = this.f56123i.x * ((float) rect.width());
        } else {
            f2 = this.f56123i.x;
        }
        if (this.f56123i.y < 1.0f) {
            f3 = this.f56123i.y * ((float) rect.height());
        } else {
            f3 = this.f56123i.y;
        }
        int i2 = this.f56122h;
        if (i2 != 0) {
            if (i2 == 1) {
                f4 = Math.max(Math.max(f2, ((float) this.f56101b) - f2), Math.max(f3, ((float) this.f56102c) - f3));
            } else if (i2 == 2) {
                float min = Math.min(f2, ((float) this.f56101b) - f2);
                float min2 = Math.min(f3, ((float) this.f56102c) - f3);
                sqrt = Math.sqrt((double) ((min * min) + (min2 * min2)));
            } else if (i2 != 3) {
                sqrt = 0.0d;
            } else {
                f4 = Math.min(Math.min(f2, ((float) this.f56101b) - f2), Math.min(f3, ((float) this.f56102c) - f3));
            }
            sqrt = (double) f4;
        } else {
            float max = Math.max(f2, ((float) this.f56101b) - f2);
            float max2 = Math.max(f3, ((float) this.f56102c) - f3);
            sqrt = Math.sqrt((double) ((max * max) + (max2 * max2)));
        }
        if (this.f56103d == null || this.f56103d.length < 2 || this.f56104e == null || this.f56104e.length < 2) {
            this.f56100a = null;
        } else {
            try {
                this.f56100a = new RadialGradient(f2, f3, (float) sqrt, this.f56103d, this.f56104e, Shader.TileMode.CLAMP);
            } catch (Exception e2) {
                this.f56100a = null;
                e2.printStackTrace();
                LLog.c("BackgroundRadialGradientLayer", "exception:\n" + e2.toString());
            }
        }
        super.setBounds(rect);
    }
}
