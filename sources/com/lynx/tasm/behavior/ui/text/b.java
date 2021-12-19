package com.lynx.tasm.behavior.ui.text;

import android.text.Layout;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.a.a;
import com.lynx.tasm.behavior.shadow.text.f;

public final class b {
    static {
        Covode.recordClassIndex(35180);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0074 */
    public static a a(float f2, float f3, a aVar, Layout layout, Spanned spanned) {
        f[] fVarArr;
        if (layout != null && f2 <= ((float) layout.getWidth()) && f3 <= ((float) layout.getHeight())) {
            int lineForVertical = layout.getLineForVertical((int) f3);
            if (f3 <= ((float) layout.getLineBottom(lineForVertical)) && f3 >= ((float) layout.getLineTop(lineForVertical)) && f2 >= layout.getLineLeft(lineForVertical) && f2 <= layout.getLineRight(lineForVertical)) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) ((int) f2));
                if (!(spanned == null || (fVarArr = (f[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, f.class)) == null || fVarArr.length == 0)) {
                    int length = spanned.length();
                    int length2 = fVarArr.length;
                    int i2 = 0;
                    f fVar = aVar;
                    int i3 = 0;
                    while (i2 < length2) {
                        f fVar2 = fVarArr[i2];
                        fVar2.f56000a = aVar;
                        int spanStart = spanned.getSpanStart(fVar2);
                        int spanEnd = spanned.getSpanEnd(fVar2);
                        if (offsetForHorizontal >= spanStart && offsetForHorizontal <= spanEnd && spanStart >= i3 && spanEnd <= length) {
                            fVar2.f56000a = aVar;
                            fVar = fVar2;
                        }
                        i2++;
                        i3 = spanStart;
                        length = spanEnd;
                    }
                    return fVar;
                }
            }
        }
        return aVar;
    }
}
