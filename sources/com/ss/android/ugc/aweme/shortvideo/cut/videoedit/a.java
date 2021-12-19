package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public abstract class a extends FrameLayout implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126141a;

    static {
        Covode.recordClassIndex(82823);
    }

    public abstract View getEndSlide();

    public abstract View getStartSlide();

    public void setEditViewHeight(boolean z) {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
