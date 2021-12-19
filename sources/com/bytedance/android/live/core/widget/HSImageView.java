package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;

public class HSImageView extends SimpleDraweeView {
    static {
        Covode.recordClassIndex(4736);
    }

    public HSImageView(Context context) {
        super(context);
    }

    public HSImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
