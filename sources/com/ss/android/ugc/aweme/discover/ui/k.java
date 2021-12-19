package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f82599a;

    static {
        Covode.recordClassIndex(51425);
    }

    k(b bVar) {
        this.f82599a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f82599a;
        ((ITpcConsentService) obj).i();
        if (bVar.s != null) {
            bVar.s.dispose();
        }
    }
}
