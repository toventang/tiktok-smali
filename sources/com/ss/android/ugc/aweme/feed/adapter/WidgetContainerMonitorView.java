package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class WidgetContainerMonitorView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f91579a;

    static {
        Covode.recordClassIndex(57666);
    }

    public WidgetContainerMonitorView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public WidgetContainerMonitorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final ViewPropertyAnimator animate() {
        this.f91579a = true;
        ViewPropertyAnimator animate = super.animate();
        l.b(animate, "");
        return animate;
    }

    public final void setAnimate(boolean z) {
        this.f91579a = z;
    }

    public final void setAlpha(float f2) {
        super.setAlpha(f2);
        if (f2 == 0.0f) {
            cl.a(-1, 0.0f, false);
        }
    }

    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z && this.f91579a) {
            cl.a(getVisibility(), getAlpha(), this.f91579a);
        }
    }

    public final void setVisibility(int i2) {
        if (i2 != 0) {
            try {
                cl.a(i2, -1.0f, false);
            } catch (Exception unused) {
            }
        } else if (getAlpha() == 0.0f) {
            cl.a(i2, getAlpha(), false);
        }
        super.setVisibility(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WidgetContainerMonitorView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8797);
        MethodCollector.o(8797);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ WidgetContainerMonitorView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
