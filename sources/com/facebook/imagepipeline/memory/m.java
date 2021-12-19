package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.b;

public final class m implements d {
    static {
        Covode.recordClassIndex(29059);
    }

    @Override // com.facebook.common.g.c
    public final void a(b bVar) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.common.h.c, com.facebook.common.g.f
    public final /* synthetic */ void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.g.f
    public final /* synthetic */ Bitmap a(int i2) {
        MethodCollector.i(14579);
        double d2 = (double) i2;
        Double.isNaN(d2);
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
        MethodCollector.o(14579);
        return createBitmap;
    }
}
