package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class DouPlusTagLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public b f74518a;

    static {
        Covode.recordClassIndex(45954);
    }

    public DouPlusTagLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public DouPlusTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DouPlusTagLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9275);
        MethodCollector.o(9275);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ DouPlusTagLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
