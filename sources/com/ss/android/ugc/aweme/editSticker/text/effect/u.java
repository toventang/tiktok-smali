package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class u extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f88599a;

    static {
        Covode.recordClassIndex(55755);
    }

    public final float getScale() {
        return this.f88599a;
    }

    public final void setScale(float f2) {
        this.f88599a = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private u(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(3096);
        this.f88599a = 1.0f;
        MethodCollector.o(3096);
    }

    public /* synthetic */ u(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2892);
        super.onMeasure(i2, i3);
        setMeasuredDimension(i2, View.MeasureSpec.makeMeasureSpec((int) (((float) getMeasuredHeight()) * this.f88599a), View.MeasureSpec.getMode(i3)));
        MethodCollector.o(2892);
    }
}
