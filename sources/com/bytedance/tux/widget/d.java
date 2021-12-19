package com.bytedance.tux.widget;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f45668a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45669b;

    static {
        Covode.recordClassIndex(27793);
    }

    public final boolean getRemoveBottomInsets() {
        return this.f45669b;
    }

    public final boolean getRemoveTopInsets() {
        return this.f45668a;
    }

    public final void setRemoveBottomInsets(boolean z) {
        this.f45669b = z;
    }

    public final void setRemoveTopInsets(boolean z) {
        this.f45668a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(4575);
        MethodCollector.o(4575);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        if (this.f45668a && rect != null) {
            rect.top = 0;
        }
        if (this.f45669b && rect != null) {
            rect.bottom = 0;
        }
        return super.fitSystemWindows(rect);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
