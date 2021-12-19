package com.ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public class WebViewFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(49002);
    }

    public WebViewFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ WebViewFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebViewFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11960);
        MethodCollector.o(11960);
    }
}
