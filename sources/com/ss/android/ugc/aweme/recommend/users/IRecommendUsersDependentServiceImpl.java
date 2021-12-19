package com.ss.android.ugc.aweme.recommend.users;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.friends.i.c;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.main.experiment.g;
import com.ss.android.ugc.aweme.profile.service.f;
import h.f.b.l;

public final class IRecommendUsersDependentServiceImpl implements IRecommendUsersDependentService {
    static {
        Covode.recordClassIndex(78070);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final f a() {
        return c.f96876a;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean b() {
        return g.a();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean a(boolean z) {
        if (!z) {
            return true;
        }
        if (!TextUtils.isEmpty(d.h())) {
            if (!d.a(d.h())) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(d.g())) {
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Boolean> isEuropeCountry = inst.getIsEuropeCountry();
            l.b(isEuropeCountry, "");
            if (!isEuropeCountry.c().booleanValue()) {
                return true;
            }
            return false;
        } else if (!d.a(d.g())) {
            return true;
        } else {
            return false;
        }
    }
}
