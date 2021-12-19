package com.ss.android.ugc.aweme.challenge.service;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.utils.in;

final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f70015a;

    /* renamed from: b  reason: collision with root package name */
    private final String f70016b;

    static {
        Covode.recordClassIndex(43190);
    }

    b(boolean z, String str) {
        this.f70015a = z;
        this.f70016b = str;
    }

    @Override // b.g
    public final Object then(i iVar) {
        Challenge challenge;
        boolean z = this.f70015a;
        String str = this.f70016b;
        if (iVar.b() || iVar.c() || iVar.d() == null) {
            return null;
        }
        if (!z || (challenge = ((ChallengeDetail) iVar.d()).challenge) == null || !CommerceChallengeServiceImpl.e().b(challenge) || in.d()) {
            return iVar;
        }
        CommerceChallengeServiceImpl.e().a(challenge);
        return ChallengeApi.a(str, str);
    }
}
