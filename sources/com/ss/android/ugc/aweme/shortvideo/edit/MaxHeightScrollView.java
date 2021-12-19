package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private int f126699a;

    static {
        Covode.recordClassIndex(83104);
    }

    public final void setMaxHeightDp(int i2) {
        this.f126699a = i2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(4695);
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(en.a((double) this.f126699a, i.f115645a), Integer.MIN_VALUE));
        MethodCollector.o(4695);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(4765);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a55, R.attr.a56, R.attr.aav}, 0, 0);
        l.b(obtainStyledAttributes, "");
        try {
            this.f126699a = obtainStyledAttributes.getInteger(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
            MethodCollector.o(4765);
        }
    }
}
