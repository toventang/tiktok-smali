package com.bytedance.webx.c.a;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    protected static final Bitmap.Config f45935a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    protected static Bitmap f45936b;

    /* renamed from: c  reason: collision with root package name */
    public float f45937c = 0.1f;

    static {
        Covode.recordClassIndex(28078);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r2 = new android.graphics.Canvas(r4);
        r0 = r6.f45937c;
        r2.scale(r0, r0);
        r7.computeScroll();
        r2.translate((float) (-r7.getScrollX()), (float) (-r7.getScrollY()));
        r7.draw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r5 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r0 = com.bytedance.webx.c.a.a.f45936b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r0 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (r0.isRecycled() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        com.bytedance.webx.c.a.a.f45936b.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        com.bytedance.webx.c.a.a.f45936b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        r3.f45938a = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        return r3;
     */
    @Override // com.bytedance.webx.c.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.webx.c.a.c a(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.c.a.a.a(android.view.View):com.bytedance.webx.c.a.c");
    }

    private static Bitmap a(View view, int i2, int i3) {
        Bitmap bitmap;
        MethodCollector.i(672);
        try {
            int i4 = Build.VERSION.SDK_INT;
            bitmap = Bitmap.createBitmap(view.getContext().getResources().getDisplayMetrics(), i2, i3, f45935a);
        } catch (OutOfMemoryError unused) {
            bitmap = null;
        }
        MethodCollector.o(672);
        return bitmap;
    }
}
