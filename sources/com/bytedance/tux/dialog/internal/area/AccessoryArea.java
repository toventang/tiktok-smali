package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AccessoryArea extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public e f44888a;

    static {
        Covode.recordClassIndex(27404);
    }

    public AccessoryArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AccessoryArea(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AccessoryArea(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.br);
        l.c(context, "");
        MethodCollector.i(7742);
        setVisibility(8);
        MethodCollector.o(7742);
    }
}
