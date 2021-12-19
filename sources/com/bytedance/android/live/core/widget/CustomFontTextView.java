package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class CustomFontTextView extends LiveTextView {
    static {
        Covode.recordClassIndex(4730);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
