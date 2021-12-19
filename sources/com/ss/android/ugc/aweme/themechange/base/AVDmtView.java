package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class AVDmtView extends View {
    static {
        Covode.recordClassIndex(90731);
    }

    public AVDmtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AVDmtView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6318);
        Drawable a2 = c.f138716d.a(context, attributeSet);
        if (a2 != null) {
            setBackground(a2);
        }
        MethodCollector.o(6318);
    }
}
