package com.ss.android.ugc.aweme.watermark;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.utils.b;
import com.ss.android.ugc.aweme.port.in.c;
import com.zhiliaoapp.musically.R;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f144831a;

    static {
        Covode.recordClassIndex(94702);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r2 == null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[SYNTHETIC, Splitter:B:27:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 9231(0x240f, float:1.2935E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002c }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x002c }
            android.graphics.Bitmap r2 = r5.f144831a     // Catch:{ FileNotFoundException -> 0x0029, all -> 0x0026 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0029, all -> 0x0026 }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0029, all -> 0x0026 }
            r3.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001c:
            android.graphics.Bitmap r0 = r5.f144831a
            com.ss.android.ugc.tools.utils.c.a(r0)
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0026:
            r1 = move-exception
            r2 = r3
            goto L_0x0034
        L_0x0029:
            r0 = move-exception
            r2 = r3
            goto L_0x002d
        L_0x002c:
            r0 = move-exception
        L_0x002d:
            r0.printStackTrace()     // Catch:{ all -> 0x0031 }
            goto L_0x0045
        L_0x0031:
            r1 = move-exception
            if (r2 == 0) goto L_0x003c
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003c:
            android.graphics.Bitmap r0 = r5.f144831a
            com.ss.android.ugc.tools.utils.c.a(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0045:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            android.graphics.Bitmap r0 = r5.f144831a
            com.ss.android.ugc.tools.utils.c.a(r0)
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.q.a(java.lang.String):boolean");
    }

    public final q a(String str, Bitmap bitmap, boolean z) {
        float width;
        MethodCollector.i(9229);
        Resources resources = c.f115622a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 168, 67, true);
        if (TextUtils.isEmpty(str)) {
            this.f144831a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.o2));
            textPaint.setTextSize(30.0f);
            float b2 = b.b(c.f115622a, 1.0f);
            textPaint.setShadowLayer(2.0f * b2, 0.0f, b2, resources.getColor(R.color.bz));
            int measureText = (int) (textPaint.measureText(str) + 5.0f);
            int max = Math.max(createScaledBitmap.getWidth(), measureText) + 15;
            Bitmap createBitmap = Bitmap.createBitmap(max, createScaledBitmap.getHeight() + 44 + 2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                width = 4.0f;
            } else {
                width = (float) (max - createScaledBitmap.getWidth());
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
            canvas.drawText(str, (float) ((max - measureText) - 4), ((float) (createScaledBitmap.getHeight() + 2)) - textPaint.ascent(), textPaint);
            this.f144831a = createBitmap;
        }
        MethodCollector.o(9229);
        return this;
    }
}
