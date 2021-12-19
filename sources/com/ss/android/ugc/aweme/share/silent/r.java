package com.ss.android.ugc.aweme.share.silent;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;

final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f124363a;

    static {
        Covode.recordClassIndex(81655);
    }

    r(j jVar) {
        this.f124363a = jVar;
    }

    @Override // com.bytedance.lobby.auth.a
    public final void a(AuthResult authResult) {
        j jVar = this.f124363a;
        if (authResult.f40147a) {
            String str = authResult.f40152f;
            String str2 = authResult.f40153g;
            jVar.a(jVar.f124346b, true);
            b.g().updateHasTwitterToken(true);
            b.g().updateTwExpireTime();
            SharePrefCache.inst().getTwitterAccessToken().b(str);
            SharePrefCache.inst().getTwitterSecret().b(str2);
            SharePrefCache.inst().getAutoSendTwitter().b(true);
            com.ss.android.ugc.trill.c.a.a.c(str, str2);
        }
    }
}
