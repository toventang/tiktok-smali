package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import h.f.b.l;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f102358a = new ab();

    private ab() {
    }

    static {
        Covode.recordClassIndex(65520);
    }

    public static final SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i2, int i3) {
        l.d(spannableStringBuilder, "");
        l.d(textPaint, "");
        l.d(spannableStringBuilder, "");
        l.d(textPaint, "");
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i3) {
            return spannableStringBuilder;
        }
        float measureText = ((float) i2) - (textPaint.measureText("...") + 0.0f);
        int lineStart = dynamicLayout.getLineStart(i3 - 1);
        while (lineStart < spannableStringBuilder.length() - 0 && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i4 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i4);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i4;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - 0, spannableStringBuilder.length());
        l.b(subSequence, "");
        a.C0730a aVar = new a.C0730a();
        CharSequence subSequence2 = spannableStringBuilder.subSequence(0, lineStart);
        l.b(subSequence2, "");
        return new SpannableStringBuilder(aVar.a(subSequence2).c("...").a(" ").c(subSequence).f33382a);
    }
}
