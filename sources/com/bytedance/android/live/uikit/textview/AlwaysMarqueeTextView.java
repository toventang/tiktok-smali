package com.bytedance.android.live.uikit.textview;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class AlwaysMarqueeTextView extends LiveTextView {
    static {
        Covode.recordClassIndex(7180);
    }

    public boolean isFocused() {
        return true;
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
