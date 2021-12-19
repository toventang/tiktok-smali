package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public class TextLayoutUtils {
    static {
        Covode.recordClassIndex(2895);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE;
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        static {
            /*
                r0 = 2896(0xb50, float:4.058E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE[] r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bef.effectsdk.text.TextLayoutUtils.AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = r1
                r3 = 1
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.COLOR_TYPE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r2 = 2
                int[] r1 = com.bef.effectsdk.text.TextLayoutUtils.AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.COLOR_TYPE_RGBA     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.bef.effectsdk.text.data.BitmapType[] r0 = com.bef.effectsdk.text.data.BitmapType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bef.effectsdk.text.TextLayoutUtils.AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType = r1
                com.bef.effectsdk.text.data.BitmapType r0 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_SHAKE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r1 = com.bef.effectsdk.text.TextLayoutUtils.AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType     // Catch:{ NoSuchFieldError -> 0x003d }
                com.bef.effectsdk.text.data.BitmapType r0 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_NEON_ALPHA     // Catch:{ NoSuchFieldError -> 0x003d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.AnonymousClass1.<clinit>():void");
        }
    }

    enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA;

        static {
            Covode.recordClassIndex(2897);
        }
    }

    public static String[] splitLyric(String str) {
        int i2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i4 % 5) % 3 == 0) {
                i2 = 6;
            } else {
                i2 = 10;
            }
            int i5 = 0;
            while (i3 < split.length && (split[i3].length() + i5 + 1 <= i2 || i5 <= 3)) {
                i5 += split[i3].length() + 1;
                int i6 = i3 + 1;
                sb.append(split[i3]).append(" ");
                if (i6 == split.length - 1 && split[i6].length() < 3) {
                    sb.append(split[i6]);
                }
                i3 = i6;
            }
            i4++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int length;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < split.length) {
            if (!split[i2].isEmpty()) {
                int length2 = sb.toString().length();
                if (length2 == 0) {
                    if (split[i2].length() < 10) {
                        sb.append(split[i2]);
                    } else if (split[i2].length() == 10) {
                        arrayList.add(split[i2]);
                    } else {
                        arrayList.add(split[i2].substring(0, 10));
                        if ((split[i2].length() - 10) % 9 == 0) {
                            z = true;
                            length = (split[i2].length() - 10) / 9;
                        } else {
                            z = false;
                            length = ((split[i2].length() - 10) / 9) + 1;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            if (i3 != 0) {
                                int i4 = ((i3 - 1) * 9) + 19;
                                if (i3 < length - 1) {
                                    String sb2 = sb.append("-").append(split[i2].substring(i4, (i3 * 9) + 19)).toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else if (z) {
                                    String sb3 = sb.append("-").append(split[i2].substring(i4, (i3 * 9) + 19)).toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                } else {
                                    sb.append("-").append(split[i2].substring(i4, split[i2].length()));
                                }
                            } else if (z) {
                                String sb4 = sb.append("-").append(split[i2].substring(10, 19)).toString();
                                arrayList.add(sb4);
                                sb.delete(0, sb4.length());
                            } else if (length == 1) {
                                sb.append("-").append(split[i2].substring(10, split[i2].length()));
                                break;
                            } else {
                                String sb5 = sb.append("-").append(split[i2].substring(10, 19)).toString();
                                arrayList.add(sb5);
                                sb.delete(0, sb5.length());
                            }
                            i3++;
                        }
                    }
                } else if (sb.toString().length() + split[i2].length() + 1 <= 10) {
                    sb.append(" ").append(split[i2]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length2);
                    i2--;
                }
            }
            i2++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i2 = AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i2 == 1) {
            return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
        }
        if (i2 != 2) {
            return null;
        }
        return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        float f2;
        float f3;
        float f4;
        MethodCollector.i(1694);
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            MethodCollector.o(1694);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr = new int[splitLyric.length];
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i2 = 0; i2 < splitLyric.length; i2++) {
            int i3 = 10;
            String str2 = splitLyric[i2];
            textPaint.setTextSize(10.0f);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= ((float) textLayoutParam.lineWidth); measureText = textPaint.measureText(str2, 0, str2.length())) {
                i3 += 2;
                textPaint.setTextSize((float) i3);
            }
            iArr[i2] = i3 - 2;
            textPaint.setTextSize((float) iArr[i2]);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (z) {
                f3 = fontMetrics.bottom;
                f4 = fontMetrics.top;
            } else {
                f3 = fontMetrics.descent;
                f4 = fontMetrics.ascent;
            }
            f6 += f3 - f4;
        }
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f6, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i4 = 0;
        float f7 = 0.0f;
        while (i4 < splitLyric.length) {
            String str3 = splitLyric[i4];
            textPaint.setTextSize((float) iArr[i4]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (Build.VERSION.SDK_INT >= 23) {
                int length = str3.length();
                int width = canvas.getWidth();
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                int i7 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str3, i5, length, textPaint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f5, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = new StaticLayout(str3, 0, str3.length(), textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                f2 = fontMetrics2.bottom - fontMetrics2.top;
                charLayout.baseline = (f7 - fontMetrics2.top) / f6;
            } else {
                f2 = fontMetrics2.descent - fontMetrics2.ascent;
                charLayout.baseline = (f7 - fontMetrics2.ascent) / f6;
            }
            charLayout.top = f7 / f6;
            f7 += f2;
            charLayout.bottom = f7 / f6;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i4] = charLayout;
            canvas.translate(0.0f, f2);
            i4++;
            f5 = 0.0f;
            z2 = false;
        }
        MethodCollector.o(1694);
        return textBitmapResult;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        MethodCollector.i(1690);
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(1690);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f2 = (float) textLayoutParam.lineWidth;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (i3 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i3];
            if (Build.VERSION.SDK_INT >= 23) {
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str2, i4, str2.length(), textPaint, (int) f2).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(f3, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = r19;
                StaticLayout staticLayout2 = new StaticLayout(str2, 0, str2.length(), textPaint, (int) f2, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            i2 += staticLayout.getLineCount();
            arrayList.add(staticLayout);
            f4 += (float) staticLayout.getHeight();
            i3++;
            f3 = 0.0f;
            z2 = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i2;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i2];
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f4, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        float f5 = 0.0f;
        int i7 = 0;
        for (int i8 = 0; i8 < lyricShakeSplit.length; i8++) {
            float height = (float) ((StaticLayout) arrayList.get(i8)).getHeight();
            float lineCount = height / ((float) ((StaticLayout) arrayList.get(i8)).getLineCount());
            for (int i9 = 0; i9 < ((StaticLayout) arrayList.get(i8)).getLineCount(); i9++) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((StaticLayout) arrayList.get(i8)).getLineWidth(i9);
                if (z) {
                    charLayout.baseline = (f5 - fontMetrics.top) / f4;
                } else {
                    charLayout.baseline = (f5 - fontMetrics.ascent) / f4;
                }
                charLayout.top = f5 / f4;
                f5 += lineCount;
                charLayout.bottom = (f5 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / f4;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f2 - lineWidth) / f2;
                } else {
                    charLayout.left = (f2 - lineWidth) / f2;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i7] = charLayout;
                i7++;
            }
            ((StaticLayout) arrayList.get(i8)).draw(canvas);
            canvas.translate(0.0f, height * ((float) ((StaticLayout) arrayList.get(i8)).getLineCount()));
        }
        MethodCollector.o(1690);
        return textBitmapResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0349  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapAtlasUTF8(java.lang.String r27, com.bef.effectsdk.text.data.TextLayoutParam r28, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r29) {
        /*
        // Method dump skipped, instructions count: 957
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapAtlasUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r28, com.bef.effectsdk.text.data.TextLayoutParam r29, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r30) {
        /*
        // Method dump skipped, instructions count: 785
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
