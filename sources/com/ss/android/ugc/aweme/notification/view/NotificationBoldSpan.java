package com.ss.android.ugc.aweme.notification.view;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;

public class NotificationBoldSpan extends ForegroundColorSpan {
    static {
        Covode.recordClassIndex(73254);
    }

    public NotificationBoldSpan() {
        super(b.c(d.a(), R.color.bx));
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
