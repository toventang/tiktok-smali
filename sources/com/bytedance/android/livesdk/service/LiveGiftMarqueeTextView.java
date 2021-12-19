package com.bytedance.android.livesdk.service;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public final class LiveGiftMarqueeTextView extends LiveTextView {
    static {
        Covode.recordClassIndex(12481);
    }

    public final boolean isFocused() {
        return true;
    }

    public LiveGiftMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
