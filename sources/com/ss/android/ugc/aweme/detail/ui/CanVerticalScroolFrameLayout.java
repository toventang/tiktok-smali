package com.ss.android.ugc.aweme.detail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;

public final class CanVerticalScroolFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private b<? super Integer, Boolean> f79881a;

    static {
        Covode.recordClassIndex(49695);
    }

    public CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, java.lang.Boolean>, h.f.a.b<java.lang.Integer, java.lang.Boolean> */
    public final b<Integer, Boolean> getChildListCanVerticalScrollCallback() {
        return this.f79881a;
    }

    public final void setChildListCanVerticalScrollCallback(b<? super Integer, Boolean> bVar) {
        this.f79881a = bVar;
    }

    public final boolean canScrollVertically(int i2) {
        b<? super Integer, Boolean> bVar = this.f79881a;
        if (bVar == null) {
            return super.canScrollVertically(i2);
        }
        Boolean invoke = bVar.invoke(Integer.valueOf(i2));
        if (invoke != null) {
            return invoke.booleanValue();
        }
        return super.canScrollVertically(i2);
    }

    private /* synthetic */ CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5269);
        MethodCollector.o(5269);
    }
}
