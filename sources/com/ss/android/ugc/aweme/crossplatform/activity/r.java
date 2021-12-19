package com.ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MixActivityContainer f78561a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f78562b;

    static {
        Covode.recordClassIndex(48789);
    }

    r(MixActivityContainer mixActivityContainer, boolean z) {
        this.f78561a = mixActivityContainer;
        this.f78562b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MixActivityContainer mixActivityContainer = this.f78561a;
        boolean z = this.f78562b;
        ((ITpcConsentService) obj).i();
        if (!z && a.r().a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null) && a.r().b()) {
            a.r().a(mixActivityContainer.f78505a, "deeplink");
        }
        if (mixActivityContainer.f78513i != null) {
            mixActivityContainer.f78513i.dispose();
        }
    }
}
