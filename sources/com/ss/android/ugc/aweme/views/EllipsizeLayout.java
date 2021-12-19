package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class EllipsizeLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(94575);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z;
        MethodCollector.i(3239);
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i2) == 1073741824) {
            TextView textView = null;
            int childCount = getChildCount();
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            while (true) {
                z = true;
                if (i4 < childCount && !z2) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8)) {
                        if (childAt instanceof TextView) {
                            TextView textView2 = (TextView) childAt;
                            if (textView2.getEllipsize() != null) {
                                if (textView == null) {
                                    textView2.setMaxWidth(Integer.MAX_VALUE);
                                    textView = textView2;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        if (layoutParams.weight <= 0.0f) {
                            z = false;
                        }
                        z2 |= z;
                        measureChildWithMargins(childAt, i2, 0, i3, 0);
                        i5 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    }
                    i4++;
                }
            }
            if (!(textView == null || i5 == 0)) {
                z = false;
            }
            boolean z3 = z2 | z;
            int size = View.MeasureSpec.getSize(i2);
            if (!z3 && i5 > size) {
                int measuredWidth = textView.getMeasuredWidth() - (i5 - size);
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                textView.setMaxWidth(measuredWidth);
            }
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(3239);
    }

    private EllipsizeLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2760);
        MethodCollector.o(2760);
    }
}
