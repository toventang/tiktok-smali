package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.e.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class ImageArea extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public h f44891a;

    static {
        Covode.recordClassIndex(27407);
    }

    public ImageArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a() {
        MethodCollector.i(7787);
        removeAllViews();
        Space space = new Space(getContext());
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        space.setLayoutParams(new FrameLayout.LayoutParams(-1, a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()))));
        addView(space);
        MethodCollector.o(7787);
    }

    private /* synthetic */ ImageArea(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ImageArea(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.br);
        l.c(context, "");
        MethodCollector.i(7836);
        a();
        MethodCollector.o(7836);
    }
}
