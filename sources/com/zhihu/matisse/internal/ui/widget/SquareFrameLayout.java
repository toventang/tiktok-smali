package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SquareFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(103921);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2906);
        MethodCollector.o(2906);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(2909);
        super.onMeasure(i2, i2);
        MethodCollector.o(2909);
    }
}
