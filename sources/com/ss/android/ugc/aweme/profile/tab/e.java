package com.ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;

public abstract class e extends RelativeLayout {
    static {
        Covode.recordClassIndex(75386);
    }

    public abstract void setAnimationEnabled(boolean z);

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
