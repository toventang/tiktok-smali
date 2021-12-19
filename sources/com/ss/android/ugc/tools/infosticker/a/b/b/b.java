package com.ss.android.ugc.tools.infosticker.a.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.a.b.f;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f149416a;

    static {
        Covode.recordClassIndex(98389);
    }

    public b(String str) {
        l.d(str, "");
        this.f149416a = str;
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.f
    public final boolean b(ProviderEffect providerEffect) {
        l.d(providerEffect, "");
        return i.a(a(providerEffect));
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.f
    public final String a(ProviderEffect providerEffect) {
        l.d(providerEffect, "");
        return com.ss.android.ugc.aweme.filter.repository.a.a.b.a(this.f149416a) + providerEffect.getId() + ".gif";
    }
}
