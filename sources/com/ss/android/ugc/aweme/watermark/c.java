package com.ss.android.ugc.aweme.watermark;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.utils.b;
import com.ss.android.ugc.aweme.df.e;
import com.zhiliaoapp.musically.R;
import java.io.File;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f144779b = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f144780a;

    static {
        Covode.recordClassIndex(94684);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004b A[SYNTHETIC, Splitter:B:31:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 10177(0x27c1, float:1.4261E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            android.graphics.Bitmap r0 = r6.f144780a
            r4 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "mBitmap is null"
            com.ss.android.ugc.tools.utils.q.b(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0013:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0035 }
            r3.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0035 }
            android.graphics.Bitmap r2 = r6.f144780a     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r3.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002a:
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x002f:
            r1 = move-exception
            r2 = r3
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x0049
        L_0x003a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0045
        L_0x003d:
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r1
        L_0x0049:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0053:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.c.a(java.lang.String):boolean");
    }

    public final c a(int i2, int i3, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f2;
        int i4;
        float width;
        float f3;
        float f4;
        float f5;
        float width2;
        float f6;
        MethodCollector.i(10508);
        if (i2 == 0 || i3 == 0) {
            f2 = 1.0f;
        } else {
            f2 = Math.min(((float) i2) / 750.0f, ((float) i3) / 750.0f);
        }
        Resources resources = com.ss.android.ugc.aweme.port.in.c.f115622a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90.0f * f2), (int) (87.0f * f2), true);
        if (TextUtils.isEmpty(str)) {
            this.f144780a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.o2));
            float f7 = 20.0f * f2;
            textPaint.setTextSize(f7);
            b.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 1.0f);
            textPaint.setShadowLayer(0.0f, 1.0f, 4.0f, resources.getColor(R.color.fj));
            int i5 = (int) f7;
            int measureText = (int) (textPaint.measureText(str) + (5.0f * f2));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i4 = ((int) Math.ceil((double) (f2 * 4.0f))) + i5;
            } else {
                i4 = 0;
            }
            int max = Math.max(width3, i4 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f2)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, 2131232712, null), i5, i5, true);
                if (z2) {
                    f5 = 0.0f;
                } else {
                    f5 = ((float) (max - measureText)) - (((float) i5) + (f2 * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f5, ((float) createScaledBitmap.getHeight()) + (6.0f * f2), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f6 = ((float) i5) + (f2 * 4.0f);
                } else {
                    f6 = (float) (max - measureText);
                }
                canvas.drawText(str, f6, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f2 * 4.0f), textPaint);
            } else {
                if (z2) {
                    f3 = 0.0f;
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                    f3 = 0.0f;
                }
                canvas.drawBitmap(createScaledBitmap, width, f3, paint);
                if (z2) {
                    f4 = 0.0f;
                } else {
                    f4 = (float) (max - measureText);
                }
                canvas.drawText(str, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f2 * 4.0f), textPaint);
            }
            this.f144780a = createBitmap;
        }
        MethodCollector.o(10508);
        return this;
    }

    public final c a(int i2, int i3, String str, Bitmap bitmap, boolean z, boolean z2, d dVar) {
        float f2;
        int i4;
        float width;
        float f3;
        float width2;
        float f4;
        float f5;
        MethodCollector.i(10347);
        if (i2 == 0 || i3 == 0) {
            f2 = 1.0f;
        } else {
            f2 = Math.min(((float) i2) / 750.0f, ((float) i3) / 750.0f);
        }
        Resources resources = com.ss.android.ugc.aweme.port.in.c.f115622a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90.0f * f2), (int) (87.0f * f2), true);
        if (TextUtils.isEmpty(str)) {
            this.f144780a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.o2));
            float f6 = 20.0f * f2;
            textPaint.setTextSize(f6);
            float b2 = b.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 1.0f);
            float f7 = b2 * 4.0f;
            float f8 = 0.0f;
            textPaint.setShadowLayer(0.0f, b2, f7, resources.getColor(R.color.fj));
            int i5 = (int) f6;
            int measureText = (int) (textPaint.measureText(str) + (5.0f * f2));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i4 = ((int) Math.ceil((double) (f2 * 4.0f))) + i5;
            } else {
                i4 = 0;
            }
            int max = Math.max(width3, i4 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f2)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShadowLayer(0.0f, b2, f7, resources.getColor(R.color.fj));
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, dVar.f144781a, null), i5, i5, true);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = ((float) (max - measureText)) - (((float) i5) + (f2 * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f3, ((float) createScaledBitmap.getHeight()) + (6.0f * f2), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    float f9 = (float) i5;
                    f4 = 4.0f;
                    f5 = f9 + (f2 * 4.0f);
                } else {
                    f4 = 4.0f;
                    f5 = (float) (max - measureText);
                }
                canvas.drawText(str, f5, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f2 * f4), textPaint);
            } else {
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (!z2) {
                    f8 = (float) (max - measureText);
                }
                canvas.drawText(str, f8, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f2 * 4.0f), textPaint);
            }
            this.f144780a = createBitmap;
        }
        MethodCollector.o(10347);
        return this;
    }

    public final c a(int i2, int i3, String str, String str2, boolean z, boolean z2, boolean z3, d dVar) {
        MethodCollector.i(10179);
        Bitmap decodeFile = BitmapFactory.decodeFile(str2);
        if (decodeFile == null) {
            e.a("I18nWaterMarkImage --> pic Path   => ".concat(String.valueOf(str2)));
            File file = new File(str2);
            e.a("I18nWaterMarkImage --> pic exists => " + file.exists());
            e.a("I18nWaterMarkImage --> pic size   => " + file.length());
            MethodCollector.o(10179);
            return this;
        } else if (!z2) {
            c a2 = a(i2, i3, str, decodeFile, z, z3, dVar);
            MethodCollector.o(10179);
            return a2;
        } else {
            c a3 = a(i2, i3, str, decodeFile, z, z3);
            MethodCollector.o(10179);
            return a3;
        }
    }
}
