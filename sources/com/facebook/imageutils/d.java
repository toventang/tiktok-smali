package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Pair<Integer, Integer> f48475a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorSpace f48476b;

    static {
        Covode.recordClassIndex(29233);
    }

    public d(int i2, int i3, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i2 == -1 || i3 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f48475a = pair;
        this.f48476b = colorSpace;
    }
}
