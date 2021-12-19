package com.ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e.a.a;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;

final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.core.g.a f104739a;

    static {
        Covode.recordClassIndex(67145);
    }

    j(androidx.core.g.a aVar) {
        this.f104739a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.base.e.a.a
    public final void a(Object obj) {
        androidx.core.g.a aVar = this.f104739a;
        ChallengeDetail challengeDetail = (ChallengeDetail) obj;
        if (challengeDetail != null && challengeDetail.challenge != null) {
            aVar.a(com.ss.android.ugc.aweme.shortvideo.ae.a.a(challengeDetail.challenge));
        }
    }
}
