package com.ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LayerControl;

class FrameAnimationRotation extends FrameAnimationMove {
    static {
        Covode.recordClassIndex(100048);
    }

    public FrameAnimationRotation(int i2, LayerControl.Layer layer, long j2, RectF rectF, int i3) {
        super(i2, layer, j2, rectF, i3);
    }
}
