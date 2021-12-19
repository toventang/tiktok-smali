package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.google.c.a.l;

final /* synthetic */ class bl implements l {

    /* renamed from: a  reason: collision with root package name */
    private final int f88875a;

    static {
        Covode.recordClassIndex(55907);
    }

    bl(int i2) {
        this.f88875a = i2;
    }

    @Override // com.google.c.a.l
    public final boolean a(Object obj) {
        EffectPointModel effectPointModel = (EffectPointModel) obj;
        return effectPointModel != null && effectPointModel.getIndex() == this.f88875a;
    }
}
