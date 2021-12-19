package com.bytedance.tux.status.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.bytedance.tux.widget.spring.g;
import h.f.b.l;

public final class TuxRefreshLayout extends SpringLayout {
    static {
        Covode.recordClassIndex(27641);
    }

    public TuxRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ TuxRefreshLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxRefreshLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        setScrollMode(g.REFRESH);
        setNestedHeader(new a(context, (byte) 0));
    }
}
