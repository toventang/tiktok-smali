package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public class StyleFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(98814);
    }

    public StyleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ StyleFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4402);
        GradientDrawable a2 = g.a(context, attributeSet, true);
        if (a2 != null) {
            setBackground(a2);
            MethodCollector.o(4402);
            return;
        }
        MethodCollector.o(4402);
    }
}
