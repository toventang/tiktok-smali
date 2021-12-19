package com.ss.android.ugc.aweme.effect;

import android.graphics.Color;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f88937a = (n.a(i.f115645a) - (((int) n.b(i.f115645a, 24.0f)) * 2));

    /* renamed from: b  reason: collision with root package name */
    static int[] f88938b;

    static {
        Covode.recordClassIndex(55932);
    }

    static int a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }
}
