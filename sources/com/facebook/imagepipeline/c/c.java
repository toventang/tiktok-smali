package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.h.a;

public final class c extends f {
    static {
        Covode.recordClassIndex(28916);
    }

    @Override // com.facebook.imagepipeline.c.f
    public final a<Bitmap> a(int i2, int i3, Bitmap.Config config) {
        MethodCollector.i(11989);
        a<Bitmap> a2 = a.a(Bitmap.createBitmap(i2, i3, config), g.a());
        MethodCollector.o(11989);
        return a2;
    }
}
