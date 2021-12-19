package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private int f68308a;

    static {
        Covode.recordClassIndex(42057);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(1322);
        int i4 = this.f68308a;
        if (i4 <= 0) {
            super.onMeasure(i2, i3);
            MethodCollector.o(1322);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        MethodCollector.o(1322);
    }

    private /* synthetic */ MaxHeightScrollView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MaxHeightScrollView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 16842880);
        l.d(context, "");
        MethodCollector.i(1324);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a55, R.attr.a56, R.attr.aav});
        l.b(obtainStyledAttributes, "");
        this.f68308a = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.o(1324);
    }
}
