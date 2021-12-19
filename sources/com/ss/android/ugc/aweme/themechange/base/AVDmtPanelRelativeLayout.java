package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class AVDmtPanelRelativeLayout extends RelativeLayout {
    static {
        Covode.recordClassIndex(90725);
    }

    public AVDmtPanelRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AVDmtPanelRelativeLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtPanelRelativeLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8117);
        Drawable a2 = c.f138716d.a(context, attributeSet);
        if (a2 != null) {
            setBackground(a2);
        }
        MethodCollector.o(8117);
    }
}
