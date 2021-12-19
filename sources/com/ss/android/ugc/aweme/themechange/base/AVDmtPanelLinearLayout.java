package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public class AVDmtPanelLinearLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(90722);
    }

    public AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVDmtPanelLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8995);
        Drawable a2 = c.f138716d.a(context, attributeSet);
        if (a2 != null) {
            setBackground(a2);
        }
        MethodCollector.o(8995);
    }
}
