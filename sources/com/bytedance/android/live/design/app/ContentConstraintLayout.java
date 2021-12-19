package com.bytedance.android.live.design.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ContentConstraintLayout extends ShapeControllableConstraintLayout {
    static {
        Covode.recordClassIndex(4773);
    }

    public ContentConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.nf);
        if (size > 0) {
            size = Math.min(dimensionPixelSize, (int) (((float) size) * 0.8f));
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.ne);
        if (size2 > 0) {
            size2 = Math.min(dimensionPixelSize2, (int) (((float) size2) * 0.84f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(i3)));
    }
}
