package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

/* access modifiers changed from: package-private */
public final class ChallengeDetailParam$enterFrom$2 extends m implements a<String> {
    final /* synthetic */ ChallengeDetailParam this$0;

    static {
        Covode.recordClassIndex(43159);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChallengeDetailParam$enterFrom$2(ChallengeDetailParam challengeDetailParam) {
        super(0);
        this.this$0 = challengeDetailParam;
    }

    @Override // h.f.a.a
    public final String invoke() {
        String challengeFrom = this.this$0.getChallengeFrom();
        if (challengeFrom == null || challengeFrom.length() == 0) {
            return this.this$0.getFrom();
        }
        return challengeFrom;
    }
}
