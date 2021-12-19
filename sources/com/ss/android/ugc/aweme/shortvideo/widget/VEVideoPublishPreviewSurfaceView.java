package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class VEVideoPublishPreviewSurfaceView extends SurfaceView {
    static {
        Covode.recordClassIndex(86921);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VEVideoPublishPreviewSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(11306);
        setWillNotDraw(false);
        MethodCollector.o(11306);
    }
}
