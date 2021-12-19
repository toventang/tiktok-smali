package com.ss.android.ugc.aweme.shortvideo.af.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.bk;
import java.io.Serializable;

public final class e implements Serializable {
    public bk position;
    public int xOffset;
    public int yOffset;

    static {
        Covode.recordClassIndex(82075);
    }

    public final String toString() {
        return "WaterMarkPositionConfig{xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ", position=" + this.position + '}';
    }
}
