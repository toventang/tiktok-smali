package com.ss.android.ugc.aweme.question.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.r;
import h.f.b.l;
import h.z;

public final class MonitorSizeChangedLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private r<? super Integer, ? super Integer, ? super Integer, ? super Integer, z> f120017a;

    static {
        Covode.recordClassIndex(77990);
    }

    public MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setOnSizeChangedListener(r<? super Integer, ? super Integer, ? super Integer, ? super Integer, z> rVar) {
        this.f120017a = rVar;
    }

    private /* synthetic */ MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(12273);
        MethodCollector.o(12273);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        r<? super Integer, ? super Integer, ? super Integer, ? super Integer, z> rVar = this.f120017a;
        if (rVar != null) {
            rVar.a(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }
}
