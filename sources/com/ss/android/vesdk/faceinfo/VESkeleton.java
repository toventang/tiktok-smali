package com.ss.android.vesdk.faceinfo;

import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

public class VESkeleton {
    private int ID;
    private PointF[] points;
    private RectF rect;

    static {
        Covode.recordClassIndex(99439);
    }

    public int getID() {
        return this.ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i2) {
        this.ID = i2;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
