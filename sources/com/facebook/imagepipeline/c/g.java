package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.c;

public final class g implements c<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static g f47719a;

    static {
        Covode.recordClassIndex(28921);
    }

    private g() {
    }

    public static g a() {
        if (f47719a == null) {
            f47719a = new g();
        }
        return f47719a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.common.h.c
    public final /* synthetic */ void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
