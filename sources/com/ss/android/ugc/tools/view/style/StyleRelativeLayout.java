package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public class StyleRelativeLayout extends RelativeLayout {
    static {
        Covode.recordClassIndex(98819);
    }

    public StyleRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ StyleRelativeLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleRelativeLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4224);
        GradientDrawable a2 = g.a(context, attributeSet, true);
        if (a2 != null) {
            setBackground(a2);
            MethodCollector.o(4224);
            return;
        }
        MethodCollector.o(4224);
    }
}
