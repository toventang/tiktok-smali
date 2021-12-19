package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class FollowFeedTagGroup extends LinearLayout {
    static {
        Covode.recordClassIndex(72362);
    }

    public FollowFeedTagGroup(Context context) {
        this(context, null);
    }

    public FollowFeedTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3560);
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 1; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i2, i3);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    i5 = childAt.getMeasuredHeight();
                    i4 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
            View childAt2 = getChildAt(0);
            if (childAt2.getVisibility() == 8) {
                MethodCollector.o(3560);
                return;
            }
            measureChild(childAt2, i2, i3);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            if (childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + i4 < measuredWidth) {
                MethodCollector.o(3560);
                return;
            }
            int i7 = ((measuredWidth - i4) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            if (i5 == 0) {
                i5 = childAt2.getMeasuredHeight();
            }
            measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        MethodCollector.o(3560);
    }

    private FollowFeedTagGroup(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(3551);
        setOrientation(0);
        MethodCollector.o(3551);
    }
}
