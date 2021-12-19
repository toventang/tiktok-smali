package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.a.a;
import h.f.b.m;

/* access modifiers changed from: package-private */
public final class TwoStepVerificationService$pushChallengeKeva$2 extends m implements a<Keva> {
    public static final TwoStepVerificationService$pushChallengeKeva$2 INSTANCE = new TwoStepVerificationService$pushChallengeKeva$2();

    static {
        Covode.recordClassIndex(79574);
    }

    TwoStepVerificationService$pushChallengeKeva$2() {
        super(0);
    }

    @Override // h.f.a.a
    public final Keva invoke() {
        return Keva.getRepo("aweme_open_push_challenge_page_list");
    }
}
