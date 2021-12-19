package com.ss.android.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private Context f59493a;

    /* renamed from: b  reason: collision with root package name */
    private int f59494b;

    /* renamed from: c  reason: collision with root package name */
    private float f59495c;

    public interface a {
        static {
            Covode.recordClassIndex(36733);
        }
    }

    static {
        Covode.recordClassIndex(36732);
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
        float f3;
        int i2;
        MethodCollector.i(3127);
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
        if (this.f59495c != 0.0f) {
            float f4 = (float) round;
            float f5 = (float) round2;
            if (Math.abs((f4 / f5) - ((float) this.f59494b)) > 0.2f) {
                float f6 = this.f59495c;
                int i3 = (int) (f4 / f6);
                if (i3 > round2) {
                    i2 = (int) (f5 * f6);
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
        Context context = this.f59493a;
        int i4 = this.f59494b;
        int i5 = Build.VERSION.SDK_INT;
        RenderScript create = RenderScript.create(context);
        Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap2, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        if (i4 > 0) {
            while (true) {
                if (i4 - 10 > 0) {
                    f3 = 10.0f;
                } else {
                    f3 = (float) i4;
                }
                create2.setRadius(f3);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                i4 -= 10;
                if (i4 <= 0) {
                    break;
                }
                createFromBitmap.copyFrom(createTyped);
            }
            createTyped.copyTo(a3);
        }
        createBitmap2.recycle();
        createScaledBitmap.recycle();
        MethodCollector.o(3127);
        return a2;
    }
}
