package com.bytedance.tux.dialog.internal.area;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.d.b;
import com.bytedance.tux.dialog.d.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CaptionArea extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public c f44890a;

    static {
        Covode.recordClassIndex(27406);
    }

    public CaptionArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ CaptionArea(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CaptionArea(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.br);
        l.c(context, "");
        MethodCollector.i(7593);
        if (isInEditMode()) {
            b bVar = new b(context);
            bVar.f44851a = "I'm a title.";
            bVar.f44852b = "I'm some message";
            addView(bVar.a());
        }
        MethodCollector.o(7593);
    }
}
