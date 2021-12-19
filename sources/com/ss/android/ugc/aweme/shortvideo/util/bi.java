package com.ss.android.ugc.aweme.shortvideo.util;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class bi {

    /* renamed from: a  reason: collision with root package name */
    public static final bi f132261a = new bi();

    private bi() {
    }

    static {
        Covode.recordClassIndex(86622);
    }

    public static final void a(TextView textView, int i2) {
        int fontMetricsInt;
        if (textView != null && textView.getPaint() != null && i2 != (fontMetricsInt = textView.getPaint().getFontMetricsInt(null))) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }
}
