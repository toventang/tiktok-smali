package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class TextureViewWrapper extends TextureView implements d {
    static {
        Covode.recordClassIndex(13895);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextureViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(9785);
        MethodCollector.o(9785);
    }
}
