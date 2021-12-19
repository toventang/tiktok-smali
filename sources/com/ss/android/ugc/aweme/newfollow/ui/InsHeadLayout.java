package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class InsHeadLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(72364);
    }

    public InsHeadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3789);
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth == 0) {
                MethodCollector.o(3789);
                return;
            } else if (getChildAt(0).getVisibility() == 8) {
                MethodCollector.o(3789);
                return;
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() != 8) {
                        measureChild(childAt, i2, i3);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        i4 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                }
                if (i4 > measuredWidth) {
                    View childAt2 = getChildAt(0);
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(measuredWidth - (i4 - childAt2.getMeasuredWidth()), 0), Integer.MIN_VALUE), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt2.getLayoutParams().height));
                }
            }
        }
        MethodCollector.o(3789);
    }

    private InsHeadLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, -1);
        MethodCollector.i(3518);
        setOrientation(0);
        MethodCollector.o(3518);
    }
}
