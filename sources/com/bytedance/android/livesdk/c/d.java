package com.bytedance.android.livesdk.c;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public c f14860a;

    /* renamed from: b  reason: collision with root package name */
    public e f14861b;

    /* renamed from: c  reason: collision with root package name */
    public float f14862c;

    static {
        Covode.recordClassIndex(8233);
    }

    public float getInterpolation(float f2) {
        this.f14862c = f2;
        e eVar = this.f14861b;
        if (eVar != null) {
            return eVar.a(f2);
        }
        return f2;
    }
}
