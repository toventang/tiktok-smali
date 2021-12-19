package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class Coordinate implements Serializable {
    @c(a = "centerX")
    private final Float centerX;
    @c(a = "centerY")
    private final Float centerY;

    static {
        Covode.recordClassIndex(59365);
    }

    public Coordinate() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, Float f2, Float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = coordinate.centerX;
        }
        if ((i2 & 2) != 0) {
            f3 = coordinate.centerY;
        }
        return coordinate.copy(f2, f3);
    }

    public final Float component1() {
        return this.centerX;
    }

    public final Float component2() {
        return this.centerY;
    }

    public final Coordinate copy(Float f2, Float f3) {
        return new Coordinate(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return l.a(this.centerX, coordinate.centerX) && l.a(this.centerY, coordinate.centerY);
    }

    public final int hashCode() {
        Float f2 = this.centerX;
        int i2 = 0;
        int hashCode = (f2 != null ? f2.hashCode() : 0) * 31;
        Float f3 = this.centerY;
        if (f3 != null) {
            i2 = f3.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Coordinate(centerX=" + this.centerX + ", centerY=" + this.centerY + ")";
    }

    public final Float getCenterX() {
        return this.centerX;
    }

    public final Float getCenterY() {
        return this.centerY;
    }

    public Coordinate(Float f2, Float f3) {
        this.centerX = f2;
        this.centerY = f3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Coordinate(java.lang.Float r4, java.lang.Float r5, int r6, h.f.b.g r7) {
        /*
            r3 = this;
            r2 = r6 & 1
            r0 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            if (r2 == 0) goto L_0x000a
            r4 = r1
        L_0x000a:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
        L_0x000f:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.Coordinate.<init>(java.lang.Float, java.lang.Float, int, h.f.b.g):void");
    }
}
