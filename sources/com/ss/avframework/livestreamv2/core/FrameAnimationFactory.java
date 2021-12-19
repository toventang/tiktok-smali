package com.ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LayerControl;

class FrameAnimationFactory {
    static {
        Covode.recordClassIndex(100045);
    }

    FrameAnimationFactory() {
    }

    public static FrameAnimationBase create(int i2, LayerControl.Layer layer, long j2, RectF rectF, int i3) {
        if (i2 == 0) {
            return null;
        }
        if (i2 == 1) {
            return new FrameAnimationRotation(1, layer, j2, rectF, i3);
        }
        if (i2 == 2) {
            return new FrameAnimationGradualRect(2, layer, j2, rectF, i3);
        }
        if (i2 != 3) {
            return new FrameAnimationBase(i2, layer, j2, rectF, i3);
        }
        return new FrameAnimationMove(3, layer, j2, rectF, i3);
    }
}
