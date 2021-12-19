package com.ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.d.c;

public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f76456a;

    /* renamed from: b  reason: collision with root package name */
    private int f76457b;

    /* renamed from: c  reason: collision with root package name */
    private int f76458c;

    static {
        Covode.recordClassIndex(47205);
    }

    public a getKeyBoardObservable() {
        return this.f76456a;
    }

    public final void a() {
        if (c.b()) {
            this.f76457b++;
        }
    }

    public void setKeyBoardObservable(a aVar) {
        this.f76456a = aVar;
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(1465);
        int i4 = this.f76458c;
        int i5 = this.f76457b;
        if (i4 == i5) {
            this.f76456a.a(getContext(), i3);
        } else {
            this.f76458c = i5;
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(1465);
    }

    private MeasureLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1464);
        this.f76456a = new a();
        MethodCollector.o(1464);
    }
}
