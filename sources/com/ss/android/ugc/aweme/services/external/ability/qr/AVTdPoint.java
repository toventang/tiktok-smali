package com.ss.android.ugc.aweme.services.external.ability.qr;

import com.bytedance.covode.number.Covode;

public class AVTdPoint {
    float x;
    float y;

    static {
        Covode.recordClassIndex(79683);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float f2) {
        this.x = f2;
    }

    public void setY(float f2) {
        this.y = f2;
    }
}
