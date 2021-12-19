package com.ss.android.ugc.aweme.newfollow.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.d;
import com.ss.android.e.b;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f112570a;

    /* renamed from: b  reason: collision with root package name */
    private float f112571b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC2878a f112572c;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2878a {
        static {
            Covode.recordClassIndex(72344);
        }

        void processorFinish(Object obj);
    }

    static {
        Covode.recordClassIndex(72343);
    }

    @Override // com.facebook.imagepipeline.o.d
    public final String getName() {
        return "blurProcessor";
    }

    @Override // com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        return new j("blur_bitmap_processor");
    }

    @Override // com.facebook.imagepipeline.o.d
    public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
        float f2;
        int i2;
        MethodCollector.i(3029);
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
        if (this.f112571b != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f112570a)) > 0.2f) {
                float f5 = this.f112571b;
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
        Bitmap a3 = a2.a();
        b.a(createScaledBitmap, a3, this.f112570a);
        createScaledBitmap.recycle();
        AbstractC2878a aVar = this.f112572c;
        if (aVar != null) {
            aVar.processorFinish(a3);
        }
        MethodCollector.o(3029);
        return a2;
    }

    public a(int i2, float f2, AbstractC2878a aVar) {
        this.f112571b = f2;
        this.f112570a = i2;
        this.f112572c = aVar;
    }
}
