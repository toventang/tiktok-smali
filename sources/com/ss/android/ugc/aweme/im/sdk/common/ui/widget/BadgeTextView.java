package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;

public class BadgeTextView extends TuxTextView {
    static {
        Covode.recordClassIndex(65663);
    }

    public void setBadgeCount(int i2) {
        String str = null;
        if (i2 >= 0) {
            if (i2 > 99) {
                str = "99+";
            } else if (i2 > 0 && i2 <= 99) {
                str = String.valueOf(i2);
            }
        }
        setText(str);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null || charSequence.toString().equalsIgnoreCase("0")) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
