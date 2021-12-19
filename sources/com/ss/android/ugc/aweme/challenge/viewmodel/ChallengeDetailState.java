package com.ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import h.f.b.g;
import h.f.b.l;

public final class ChallengeDetailState implements af {
    private final a<ChallengeDetail> challengeDetail;

    static {
        Covode.recordClassIndex(43323);
    }

    public ChallengeDetailState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeDetailState copy$default(ChallengeDetailState challengeDetailState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = challengeDetailState.challengeDetail;
        }
        return challengeDetailState.copy(aVar);
    }

    public final a<ChallengeDetail> component1() {
        return this.challengeDetail;
    }

    public final ChallengeDetailState copy(a<? extends ChallengeDetail> aVar) {
        l.d(aVar, "");
        return new ChallengeDetailState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChallengeDetailState) && l.a(this.challengeDetail, ((ChallengeDetailState) obj).challengeDetail);
        }
        return true;
    }

    public final int hashCode() {
        a<ChallengeDetail> aVar = this.challengeDetail;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ChallengeDetailState(challengeDetail=" + this.challengeDetail + ")";
    }

    public final a<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailState(a<? extends ChallengeDetail> aVar) {
        l.d(aVar, "");
        this.challengeDetail = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeDetailState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? aq.f39400a : aVar);
    }
}
