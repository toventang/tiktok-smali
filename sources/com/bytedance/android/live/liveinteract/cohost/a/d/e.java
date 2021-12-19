package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d f10133a;

    static {
        Covode.recordClassIndex(5315);
    }

    e(d dVar) {
        this.f10133a = dVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        this.f10133a.b(PrivacyCert.Builder.with("bpea-520").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        return z.f158842a;
    }
}
