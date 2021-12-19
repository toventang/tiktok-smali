package com.ss.android.ugc.aweme.tools.mvtemplate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MvRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f140922a = 0.5625f;

    static {
        Covode.recordClassIndex(92023);
    }

    public void setRatio(float f2) {
        this.f140922a = f2;
    }

    public MvRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6390);
        MethodCollector.o(6390);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(6442);
        int size = View.MeasureSpec.getSize(i3);
        float f2 = this.f140922a;
        if (f2 != 0.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f2), 1073741824);
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(6442);
    }
}
