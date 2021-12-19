package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import f.a.d.f;

final /* synthetic */ class am implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ae f109161a;

    static {
        Covode.recordClassIndex(69900);
    }

    am(ae aeVar) {
        this.f109161a = aeVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ae aeVar = this.f109161a;
        ((ITpcConsentService) obj).i();
        if (aeVar.F != null) {
            aeVar.F.dispose();
        }
    }
}
