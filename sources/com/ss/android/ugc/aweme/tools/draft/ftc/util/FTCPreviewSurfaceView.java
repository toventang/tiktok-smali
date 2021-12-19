package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class FTCPreviewSurfaceView extends SurfaceView {
    static {
        Covode.recordClassIndex(91303);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCPreviewSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(152);
        setWillNotDraw(false);
        MethodCollector.o(152);
    }
}
