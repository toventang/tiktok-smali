package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.regex.Pattern;

public class TextMeshUtils {
    static {
        Covode.recordClassIndex(2415);
    }

    private static float getDeviceDpi() {
        return (float) Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[SYNTHETIC, Splitter:B:48:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc A[SYNTHETIC, Splitter:B:57:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getAndroidSystemFontPaths() {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.utils.TextMeshUtils.getAndroidSystemFontPaths():java.lang.String[]");
    }

    private static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i2) {
        MethodCollector.i(1147);
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) i2);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(str, (float) (-rect.left), (float) (-rect.top), textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.o(1147);
        return createBitmap;
    }

    private static int a(Canvas canvas, String str, float f2, float f3, Paint paint, int i2) {
        int width;
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", Integer.valueOf(i2));
        System.out.printf("the text length is: %d\n", Integer.valueOf(str.length()));
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            String valueOf = String.valueOf(charAt);
            Math.round(paint.measureText(String.valueOf(charAt)));
            if (charAt > 55296) {
                i3++;
                String str2 = String.valueOf(charAt) + str.charAt(i3);
                if (i3 != 1) {
                    paint.getTextBounds(str, i3, i3 + 1, rect);
                    rect.width();
                }
                int width2 = rect.width() + (i2 / 2);
                f2 += (float) width2;
                i4 += width2;
                canvas.drawText(str2, f2, f3, paint);
            } else {
                if (charAt == ' ') {
                    width = Math.round(paint.measureText(String.valueOf(str.charAt(i3)))) + i2;
                } else {
                    paint.getTextBounds(str, i3, i3 + 1, rect);
                    if (charAt >= 128) {
                        width = rect.width() + (i2 / 2);
                        System.out.printf("%s is not NumOrLetters\n", Character.valueOf(charAt));
                    } else if (Pattern.compile("^[A-Za-z0-9_]+$").matcher(valueOf).matches()) {
                        width = rect.width() + i2;
                        System.out.printf("%s is NumOrLetters\n", Character.valueOf(charAt));
                    } else {
                        width = rect.width() + (i2 * 2);
                    }
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i3)), Integer.valueOf(width), Integer.valueOf(i2), Integer.valueOf(rect.width()));
                }
                f2 += (float) width;
                i4 += width;
                canvas.drawText(String.valueOf(str.charAt(i3)), f2, f3, paint);
            }
            i3++;
        }
        return i4;
    }

    private static float[] generateImageSize(String str, float f2, byte[] bArr, int i2, boolean z, float f3, int i3, boolean z2, float f4, float f5, int i4, float f6) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f2);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i2);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f3 = 0.0f;
        }
        if (!z2) {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        return new float[]{(float) rect.left, (float) rect.right, (float) (-rect.bottom), (float) (-rect.top), fArr[0], (f3 + Math.max(Math.abs(f4), Math.abs(f5))) * f2, textPaint.ascent(), textPaint.descent()};
    }

    private static Bitmap generateImage(String str, float f2, byte[] bArr, int i2, boolean z, float f3, int i3, boolean z2, float f4, float f5, int i4, float f6) {
        float f7 = f3;
        float f8 = f6;
        float f9 = f5;
        MethodCollector.i(1168);
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f2);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i2);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[str2.length()]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.bottom;
        int i8 = rect.top;
        float f10 = 0.0f;
        if (!z) {
            f7 = 0.0f;
        }
        if (!z2) {
            f9 = 0.0f;
            f8 = 0.0f;
        } else {
            f10 = f4;
        }
        float max = Math.max(Math.abs(f10), Math.abs(f9)) + f7;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f2);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f7 * 2.0f * f2);
            textPaint2.setColor(i3);
            if (z2) {
                textPaint2.setShadowLayer(f8 * f2, f10 * f2, f9 * f2, i4);
            }
        }
        float f11 = 2.0f * max * f2;
        Bitmap createBitmap = Bitmap.createBitmap((int) (((float) rect.width()) + f11), (int) (((float) rect.height()) + f11), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z || z2) {
            float f12 = max * f2;
            canvas.drawText(str2, ((float) (-rect.left)) + f12, ((float) (-rect.top)) + f12, textPaint2);
        }
        float f13 = max * f2;
        canvas.drawText(str2, ((float) (-rect.left)) + f13, ((float) (-rect.top)) + f13, textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.o(1168);
        return createBitmap;
    }

    private static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i2, int i3, int i4, float f2, int i5, float f3, int i6, float f4, float f5, float f6, int i7, int i8, int i9, int i10) {
        int i11 = i4;
        MethodCollector.i(1140);
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i9, i10);
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i3);
        float f7 = (float) i2;
        textPaint.setTextSize(f7);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i8 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i8 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i5 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i5 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i5 & 4) == 4) {
            textPaint.setTextSkewX((-f2) / 90.0f);
        }
        if ((i5 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i5 & 2) == 2) {
            textPaint.setShadowLayer(f4, f5, f6, i7);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f8 = fontMetrics.top;
        float f9 = fontMetrics.bottom;
        String[] split = str2.split("\n");
        int length = split.length;
        if ((i5 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i6);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f3) / f7);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f10 = ((float) i11) / f7;
            float f11 = (-fontMetrics.ascent) + fontMetrics.descent;
            float f12 = f11 * 0.1f;
            int i12 = 0;
            while (i12 < length) {
                double centerY = (double) ((int) ((((float) rect.centerY()) - (f8 / 2.0f)) - (f9 / 2.0f)));
                double d2 = (double) (length - 1);
                Double.isNaN(d2);
                double d3 = (double) i12;
                Double.isNaN(d3);
                double d4 = (d2 * 0.5d) - d3;
                double d5 = (double) (f12 + f11);
                Double.isNaN(d5);
                Double.isNaN(centerY);
                int i13 = (int) (centerY - (d4 * d5));
                if (Build.VERSION.SDK_INT >= 21) {
                    textPaint2.setLetterSpacing(f10);
                    if (i8 == 0) {
                        canvas.drawText(split[i12], (float) rect.left, (float) i13, textPaint2);
                    } else if (i8 == 1) {
                        canvas.drawText(split[i12], (float) rect.centerX(), (float) i13, textPaint2);
                    } else {
                        canvas.drawText(split[i12], (float) rect.right, (float) i13, textPaint2);
                    }
                } else {
                    Rect rect2 = new Rect();
                    textPaint.getTextBounds(split[i12], 0, split[i12].length(), rect2);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < split[i12].length()) {
                        if (split[i12].charAt(i14) > 55296) {
                            i14++;
                            i15++;
                        }
                        i14++;
                    }
                    if (i8 == 0) {
                        a(canvas, split[i12], 0.0f, (float) i13, textPaint2, i4);
                    } else if (i8 == 1) {
                        i4 = i4;
                        a(canvas, split[i12], (float) ((((rect.width() - rect2.width()) + (i15 * i2)) - ((str2.length() - 1) * i4)) / 2), (float) i13, textPaint2, i4);
                    } else {
                        i4 = i4;
                        a(canvas, split[i12], (float) (((rect.width() - rect2.width()) + (i15 * i2)) - ((str2.length() - 1) * i4)), (float) i13, textPaint2, i4);
                    }
                }
                i12++;
                i11 = i4;
            }
        }
        float f13 = ((float) i11) / f7;
        float f14 = (-fontMetrics.ascent) + fontMetrics.descent;
        float f15 = 0.1f * f14;
        for (int i16 = 0; i16 < length; i16++) {
            double centerY2 = (double) ((int) ((((float) rect.centerY()) - (f8 / 2.0f)) - (f9 / 2.0f)));
            double d6 = (double) (length - 1);
            Double.isNaN(d6);
            double d7 = (double) i16;
            Double.isNaN(d7);
            double d8 = (d6 * 0.5d) - d7;
            double d9 = (double) (f15 + f14);
            Double.isNaN(d9);
            Double.isNaN(centerY2);
            int i17 = (int) (centerY2 - (d8 * d9));
            if (Build.VERSION.SDK_INT >= 21) {
                textPaint.setLetterSpacing(f13);
                if (i8 == 0) {
                    canvas.drawText(split[i16], (float) rect.left, (float) i17, textPaint);
                } else if (i8 == 1) {
                    canvas.drawText(split[i16], (float) rect.centerX(), (float) i17, textPaint);
                } else {
                    canvas.drawText(split[i16], (float) rect.right, (float) i17, textPaint);
                }
            } else {
                Rect rect3 = new Rect();
                textPaint.getTextBounds(split[i16], 0, split[i16].length(), rect3);
                int i18 = 0;
                int i19 = 0;
                while (i18 < split[i16].length()) {
                    if (split[i16].charAt(i18) > 55296) {
                        i18++;
                        i19++;
                    }
                    i18++;
                }
                if (i8 == 0) {
                    a(canvas, split[i16], 0.0f, (float) i17, textPaint, i4);
                } else if (i8 == 1) {
                    a(canvas, split[i16], (float) ((((rect.width() - rect3.width()) + (i19 * i2)) - ((str2.length() - 1) * i4)) / 2), (float) i17, textPaint, i4);
                } else {
                    a(canvas, split[i16], (float) (((rect.width() - rect3.width()) + (i19 * i2)) - ((str2.length() - 1) * i4)), (float) i17, textPaint, i4);
                }
            }
        }
        canvas.save();
        canvas.restore();
        MethodCollector.o(1140);
        return createBitmap;
    }
}
