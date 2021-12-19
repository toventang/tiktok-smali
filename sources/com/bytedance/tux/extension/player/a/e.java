package com.bytedance.tux.extension.player.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.extension.player.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f44960a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(27438);
    }

    public static g a(int i2, int i3, int i4, int i5) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (double) i4;
        double d5 = (double) i5;
        Double.isNaN(d4);
        Double.isNaN(d5);
        if (d2 / d3 > d4 / d5) {
            Double.isNaN(d4);
            Double.isNaN(d3);
            Double.isNaN(d2);
            i5 = (int) ((d4 * d3) / d2);
        } else {
            Double.isNaN(d5);
            Double.isNaN(d2);
            Double.isNaN(d3);
            i4 = (int) ((d5 * d2) / d3);
        }
        return new g(i4, i5);
    }
}
