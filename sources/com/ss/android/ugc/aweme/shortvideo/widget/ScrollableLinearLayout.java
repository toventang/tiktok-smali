package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ScrollableLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f132846a;

    static {
        Covode.recordClassIndex(86911);
    }

    public ScrollableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10869);
        MethodCollector.o(10869);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
            i4 += childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight());
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            int i7 = this.f132846a;
            if (i4 < size + i7) {
                i4 = size + i7;
            }
        }
        setMeasuredDimension(i4, resolveSize(i5, i3));
    }
}
