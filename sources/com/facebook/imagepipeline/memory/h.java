package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.g.d;
import com.ss.android.ugc.aweme.statistic.a;

public final class h extends a<Bitmap> implements d {
    static {
        Covode.recordClassIndex(29054);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int c(int i2) {
        return i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int d(int i2) {
        return i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.memory.f] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ Bitmap a(f<Bitmap> fVar) {
        Bitmap bitmap = (Bitmap) super.a((f) fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ void b(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        i.a(bitmap2);
        bitmap2.recycle();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ int c(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        i.a(bitmap2);
        return bitmap2.getAllocationByteCount();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ boolean d(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        i.a(bitmap2);
        if (bitmap2.isRecycled() || !bitmap2.isMutable()) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ Bitmap b(int i2) {
        MethodCollector.i(14585);
        a.f134684b = i2;
        a.f134683a = Thread.currentThread().getName();
        double d2 = (double) i2;
        Double.isNaN(d2);
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
        MethodCollector.o(14585);
        return createBitmap;
    }

    public h(d dVar, ad adVar, ae aeVar) {
        super(dVar, adVar, aeVar);
        a();
    }
}
