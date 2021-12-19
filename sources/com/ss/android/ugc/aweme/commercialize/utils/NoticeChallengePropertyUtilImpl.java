package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.ss.android.ugc.b;

public final class NoticeChallengePropertyUtilImpl implements NoticeChallengePropertyUtil {
    static {
        Covode.recordClassIndex(46590);
    }

    public static NoticeChallengePropertyUtil a() {
        MethodCollector.i(9495);
        Object a2 = b.a(NoticeChallengePropertyUtil.class, false);
        if (a2 != null) {
            NoticeChallengePropertyUtil noticeChallengePropertyUtil = (NoticeChallengePropertyUtil) a2;
            MethodCollector.o(9495);
            return noticeChallengePropertyUtil;
        }
        if (b.aw == null) {
            synchronized (NoticeChallengePropertyUtil.class) {
                try {
                    if (b.aw == null) {
                        b.aw = new NoticeChallengePropertyUtilImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9495);
                    throw th;
                }
            }
        }
        NoticeChallengePropertyUtilImpl noticeChallengePropertyUtilImpl = (NoticeChallengePropertyUtilImpl) b.aw;
        MethodCollector.o(9495);
        return noticeChallengePropertyUtilImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil
    public final void a(Challenge challenge) {
        CommerceChallengeServiceImpl.e().a(challenge);
    }
}
