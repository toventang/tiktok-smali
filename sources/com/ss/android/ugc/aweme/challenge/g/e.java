package com.ss.android.ugc.aweme.challenge.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.challenge.data.a;
import com.ss.android.ugc.aweme.challenge.data.f;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f69981a = new e();

    static {
        Covode.recordClassIndex(43144);
    }

    private e() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<com.ss.android.ugc.aweme.challenge.data.e> a2;
        ChallengeList challengeList = new ChallengeList();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(d.d().a("hash_tag_history_version", ""), "")) {
            d.d().b("hash_tag_history_version", "v2");
            if (!AccountService.a().e().isLogin() && (a2 = f.a()) != null && a2.size() > 0) {
                com.ss.android.ugc.aweme.challenge.data.d.a().a(a2);
                for (com.ss.android.ugc.aweme.challenge.data.e eVar : a2) {
                    Challenge challenge = new Challenge();
                    challenge.setChallengeName(eVar.f69943a);
                    arrayList.add(challenge);
                }
            }
        } else {
            List<a> list = com.ss.android.ugc.aweme.challenge.data.d.a().f69936b;
            if (list != null && list.size() > 0) {
                for (a aVar : list) {
                    Challenge challenge2 = new Challenge();
                    challenge2.setChallengeName(aVar.f69924a);
                    arrayList.add(challenge2);
                }
            }
        }
        challengeList.items = arrayList;
        return challengeList;
    }
}
