package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;

public final class j {
    static {
        Covode.recordClassIndex(35002);
    }

    public static StaticLayout a(CharSequence charSequence, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, TextDirectionHeuristic textDirectionHeuristic) {
        int i5 = i4;
        if (i5 == -1 && textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, 1.0f, f2, z);
        }
        try {
            Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            objArr[1] = 0;
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = textPaint;
            objArr[4] = Integer.valueOf(i3);
            objArr[5] = alignment;
            objArr[6] = textDirectionHeuristic;
            objArr[7] = Float.valueOf(1.0f);
            objArr[8] = Float.valueOf(f2);
            objArr[9] = Boolean.valueOf(z);
            objArr[10] = truncateAt;
            objArr[11] = Integer.valueOf(i3);
            if (i5 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            objArr[12] = Integer.valueOf(i5);
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Throwable unused) {
            return new StaticLayout(charSequence, 0, i2, textPaint, i3, alignment, 1.0f, f2, z);
        }
    }
}
