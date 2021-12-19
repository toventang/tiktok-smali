package com.ss.android.ugc.aweme.audiorecord;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class Point implements Serializable {
    @c(a = "time")
    private long t;
    @c(a = "x")
    private int x;
    @c(a = "y")
    private int y;

    static {
        Covode.recordClassIndex(41339);
    }

    public final long getT() {
        return this.t;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final void setT(long j2) {
        this.t = j2;
    }

    public final void setX(int i2) {
        this.x = i2;
    }

    public final void setY(int i2) {
        this.y = i2;
    }

    public final boolean isEqual(Point point) {
        l.d(point, "");
        if (this.x == point.x && this.y == point.y && this.t == point.t) {
            return true;
        }
        return false;
    }

    public Point(int i2, int i3, long j2) {
        this.x = i2;
        this.y = i3;
        this.t = j2;
    }
}
