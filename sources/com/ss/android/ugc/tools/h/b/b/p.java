package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import f.a.ab;
import h.f.a.a;
import h.f.b.l;
import java.util.List;

public final class p extends e implements j<ProviderEffect, ProviderEffectModel> {

    /* renamed from: i  reason: collision with root package name */
    private final int f149340i;

    static {
        Covode.recordClassIndex(98344);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<h.p<List<ProviderEffect>, ProviderEffectModel>> a() {
        return a(this.f149340i);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<List<ProviderEffect>> b() {
        return j.a.a(this);
    }

    public /* synthetic */ p(a aVar, String str, String str2, int i2) {
        this(aVar, str, str2, i2, i.f149327a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private p(a<? extends d> aVar, String str, String str2, int i2, l lVar) {
        super(aVar, str, str2, lVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(lVar, "");
        this.f149340i = i2;
    }
}
