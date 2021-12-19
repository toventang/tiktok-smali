package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import f.a.ab;
import h.f.a.a;
import h.f.b.l;
import h.p;
import java.util.List;

public final class n extends c implements j<Effect, CategoryEffectModel> {

    /* renamed from: i  reason: collision with root package name */
    private final int f149338i;

    static {
        Covode.recordClassIndex(98342);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<p<List<Effect>, CategoryEffectModel>> a() {
        return a(this.f149338i);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<List<Effect>> b() {
        return j.a.a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(a<? extends d> aVar, String str, int i2, k kVar, boolean z) {
        super(aVar, str, kVar, z);
        l.d(aVar, "");
        l.d(str, "");
        l.d(kVar, "");
        this.f149338i = i2;
    }
}
