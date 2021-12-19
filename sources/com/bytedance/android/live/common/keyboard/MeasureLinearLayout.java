package com.bytedance.android.live.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public a f8822a;

    /* renamed from: b  reason: collision with root package name */
    private int f8823b;

    /* renamed from: c  reason: collision with root package name */
    private int f8824c;

    static {
        Covode.recordClassIndex(4514);
    }

    public a getKeyBoardObservable() {
        return this.f8822a;
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(12372);
        int i4 = this.f8824c;
        int i5 = this.f8823b;
        if (i4 == i5) {
            this.f8822a.a(getContext(), i3);
        } else {
            this.f8824c = i5;
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(12372);
    }

    private MeasureLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12224);
        this.f8822a = new a();
        MethodCollector.o(12224);
    }
}
