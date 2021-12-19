package com.ss.android.ugc.aweme.challenge.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.google.c.h.a.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.b.a;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import h.f.a.b;
import h.f.b.l;
import java.util.HashMap;

public final class ChallengeNetPreload implements c<ChallengeApi.RealApi, q<ChallengeAwemeList>> {
    private String EXTRA_CHALLENGE_IS_HASHTAG = "extra_challenge_is_hashtag";

    static {
        Covode.recordClassIndex(43101);
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final i getPreloadStrategy(Bundle bundle) {
        return new i(0, ChallengeApi.f69888a, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final boolean handleException(Exception exc) {
        l.d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.d
    public final boolean enable(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("id", "");
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || a.a(str, 0, 20, 2, bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false), "challenge_video", null, null) != null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final q<ChallengeAwemeList> preload(Bundle bundle, b<? super Class<ChallengeApi.RealApi>, ? extends ChallengeApi.RealApi> bVar) {
        String str;
        String str2;
        l.d(bVar, "");
        if (bundle == null || (str = bundle.getString("id", "")) == null) {
            str = "";
        }
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        }
        if (CommerceChallengeServiceImpl.e().b(str)) {
            str2 = ChallengeApi.f69892e;
        } else {
            str2 = ChallengeApi.f69889b;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("cursor", "0");
        hashMap.put("count", "20");
        hashMap.put(StringSet.type, "5");
        hashMap.put("source", "challenge_video");
        q<ChallengeAwemeList> challengeAwemeList = ((ChallengeApi.RealApi) bVar.invoke(ChallengeApi.RealApi.class)).getChallengeAwemeList(str2, hashMap);
        l.b(challengeAwemeList, "");
        return challengeAwemeList;
    }
}
