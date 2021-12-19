package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public class StyleView extends View {
    static {
        Covode.recordClassIndex(98824);
    }

    public StyleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ StyleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4018);
        GradientDrawable a2 = g.a(context, attributeSet, true);
        if (a2 != null) {
            setBackground(a2);
            MethodCollector.o(4018);
            return;
        }
        MethodCollector.o(4018);
    }
}
