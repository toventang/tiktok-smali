package com.facebook.imagepipeline.l;

import android.graphics.BitmapFactory;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.facebook.common.l.b;
import com.facebook.common.l.c;
import com.facebook.imagepipeline.memory.d;

public final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final b f48012b = c.a();

    static {
        Covode.recordClassIndex(29031);
    }

    @Override // com.facebook.imagepipeline.l.b, com.facebook.imagepipeline.l.e
    public final int a(int i2, int i3, BitmapFactory.Options options) {
        return super.a(i2, i3, options);
    }

    public f(d dVar, int i2, f.c cVar) {
        super(dVar, i2, cVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    @Override // com.facebook.imagepipeline.l.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(java.io.InputStream r4, android.graphics.BitmapFactory.Options r5, int r6, int r7, android.graphics.Bitmap r8) {
        /*
            r3 = this;
            r2 = 14329(0x37f9, float:2.0079E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L_0x0028
            com.facebook.common.l.b r0 = r3.f48012b
            if (r0 == 0) goto L_0x0028
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.graphics.Bitmap$Config r0 = r5.inPreferredConfig
            r8.reconfigure(r6, r7, r0)
            com.facebook.common.l.b r0 = r3.f48012b
            android.graphics.Bitmap r0 = r0.decodeStream(r4, r1, r5)
            if (r0 != 0) goto L_0x0024
        L_0x0020:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r4, r1, r5)
        L_0x0024:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return r0
        L_0x0028:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.l.f.a(java.io.InputStream, android.graphics.BitmapFactory$Options, int, int, android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
