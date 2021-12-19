package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class DoubleColorBallAnimationLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f150285a;

    static {
        Covode.recordClassIndex(98871);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f150285a;
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public DoubleColorBallAnimationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleColorBallAnimationLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5773);
        this.f150285a = a.a(LayoutInflater.from(context), R.layout.b4n, this, true).findViewById(R.id.aou);
        MethodCollector.o(5773);
    }
}
