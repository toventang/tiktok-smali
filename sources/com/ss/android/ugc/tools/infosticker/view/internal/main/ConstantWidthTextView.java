package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import h.f.b.l;

public final class ConstantWidthTextView extends StyleTextView {
    static {
        Covode.recordClassIndex(98524);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(0, i3);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
