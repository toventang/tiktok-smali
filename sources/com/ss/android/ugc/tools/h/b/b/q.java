package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import f.a.ab;
import h.f.a.a;
import h.f.b.l;
import h.p;
import java.util.List;

public final class q extends f implements j<ProviderEffect, ProviderEffectModel> {

    /* renamed from: j  reason: collision with root package name */
    private final int f149341j;

    static {
        Covode.recordClassIndex(98345);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<p<List<ProviderEffect>, ProviderEffectModel>> a() {
        return a(this.f149341j);
    }

    @Override // com.ss.android.ugc.tools.h.a.j
    public final ab<List<ProviderEffect>> b() {
        return j.a.a(this);
    }

    public /* synthetic */ q(a aVar, String str, String str2, String str3, int i2) {
        this(aVar, str, str2, str3, i2, i.f149327a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private q(a<? extends d> aVar, String str, String str2, String str3, int i2, l lVar) {
        super(aVar, str, str2, str3, lVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(lVar, "");
        this.f149341j = i2;
    }
}
