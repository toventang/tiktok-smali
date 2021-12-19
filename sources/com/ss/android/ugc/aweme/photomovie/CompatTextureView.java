package com.ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.e;

public class CompatTextureView extends TextureView {
    static {
        Covode.recordClassIndex(73906);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e2) {
            e.a((Throwable) e2);
        }
    }

    public CompatTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(4323);
        MethodCollector.o(4323);
    }
}
