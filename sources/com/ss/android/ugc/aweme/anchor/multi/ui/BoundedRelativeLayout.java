package com.ss.android.ugc.aweme.anchor.multi.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class BoundedRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f66410a;

    /* renamed from: b  reason: collision with root package name */
    private int f66411b;

    static {
        Covode.recordClassIndex(40804);
    }

    public BoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setMaxHeight(int i2) {
        this.f66411b = i2;
        requestLayout();
    }

    public final void setMaxWidth(int i2) {
        this.f66410a = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(9414);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f66410a;
        if (1 <= i4 && size > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f66410a, View.MeasureSpec.getMode(i2));
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i5 = this.f66411b;
        if (1 <= i5 && size2 > i5) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.f66411b, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(9414);
    }

    private /* synthetic */ BoundedRelativeLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BoundedRelativeLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9575);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.l3, R.attr.l6});
        l.b(obtainStyledAttributes, "");
        this.f66410a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f66411b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.o(9575);
    }
}
