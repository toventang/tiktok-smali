package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d extends SurfaceView {
    static {
        Covode.recordClassIndex(36404);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        if (i2 == 0) {
            super.onWindowVisibilityChanged(i2);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2024);
        MethodCollector.o(2024);
    }
}
