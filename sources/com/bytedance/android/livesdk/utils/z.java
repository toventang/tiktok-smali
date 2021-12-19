package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.d;

public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f22369a;

    /* renamed from: b  reason: collision with root package name */
    private float f22370b;

    /* renamed from: c  reason: collision with root package name */
    private a f22371c;

    public interface a {
        static {
            Covode.recordClassIndex(13207);
        }
    }

    static {
        Covode.recordClassIndex(13206);
    }

    @Override // com.facebook.imagepipeline.o.d
    public final String getName() {
        return "blurProcessor";
    }

    public z() {
        this.f22369a = 5;
    }

    @Override // com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        return new j("blur_bitmap_processor");
    }

    public z(int i2, float f2) {
        this.f22370b = f2;
        this.f22369a = i2;
        this.f22371c = null;
    }

    @Override // com.facebook.imagepipeline.o.d
    public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
        float f2;
        int i2;
        MethodCollector.i(10758);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f2 = 0.6f;
        } else if (width < 200 || height < 200) {
            f2 = 0.3f;
        } else {
            f2 = 0.1f;
        }
        int round = Math.round(((float) width) * f2);
        int round2 = Math.round(((float) height) * f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.f22370b != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f22369a)) > 0.2f) {
                float f5 = this.f22370b;
                int i3 = (int) (f3 / f5);
                if (i3 > round2) {
                    i2 = (int) (f4 * f5);
                    i3 = round2;
                } else {
                    i2 = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i2) >> 1, (round2 - i3) >> 1, i2, i3);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i2;
                round2 = i3;
            }
        }
        com.facebook.common.h.a<Bitmap> a2 = fVar.a(round, round2);
        e.a(createScaledBitmap, a2.a(), this.f22369a);
        createScaledBitmap.recycle();
        MethodCollector.o(10758);
        return a2;
    }
}
