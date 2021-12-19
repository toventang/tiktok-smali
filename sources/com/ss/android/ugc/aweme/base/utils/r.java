package com.ss.android.ugc.aweme.base.utils;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f68446a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(42146);
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i2, int i3, int i4, int i5) {
        l.d(spannableStringBuilder, "");
        l.d(textPaint, "");
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i3) {
            return spannableStringBuilder;
        }
        float measureText = ((float) i2) - (textPaint.measureText("... ") + ((float) i5));
        int lineStart = dynamicLayout.getLineStart(i3 - 1);
        while (lineStart < spannableStringBuilder.length() - i4 && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i6 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i6);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i6;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i4, spannableStringBuilder.length());
        l.b(subSequence, "");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append((CharSequence) "... ");
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}
