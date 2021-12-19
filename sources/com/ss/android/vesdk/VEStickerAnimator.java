package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public interface VEStickerAnimator {
    static {
        Covode.recordClassIndex(99211);
    }

    float getDegree(int i2);

    float getScaleX(int i2);

    float getScaleY(int i2);

    float getTransX(int i2);

    float getTransY(int i2);
}
