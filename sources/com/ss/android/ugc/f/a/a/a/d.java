package com.ss.android.ugc.f.a.a.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class d implements Serializable {
    public double duration;
    public double preloadSize;
    public boolean shift;
    public double speed;
    public int type;
    public double videoSize;

    static {
        Covode.recordClassIndex(95621);
    }

    public d(double d2, double d3, double d4, double d5, boolean z, int i2) {
        this.preloadSize = d2;
        this.videoSize = d3;
        this.duration = d4;
        this.speed = d5;
        this.shift = z;
        this.type = i2;
    }
}
