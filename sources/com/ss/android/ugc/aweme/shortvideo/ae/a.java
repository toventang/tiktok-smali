package com.ss.android.ugc.aweme.shortvideo.ae;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

public final class a implements f<Challenge, AVChallenge> {
    static {
        Covode.recordClassIndex(82053);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ AVChallenge a(Challenge challenge) {
        return a(challenge);
    }

    public static ArrayList<AVChallenge> a(List<Challenge> list) {
        return ap.a((Iterable) ap.a(list, new a()));
    }

    public static AVChallenge a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        return aVChallenge;
    }
}
