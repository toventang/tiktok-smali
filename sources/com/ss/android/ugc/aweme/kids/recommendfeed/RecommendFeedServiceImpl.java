package com.ss.android.ugc.aweme.kids.recommendfeed;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.commonfeed.g.a.b;
import com.ss.android.ugc.aweme.kids.recommendfeed.a.a;
import com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService;

public final class RecommendFeedServiceImpl implements IRecommendFeedService {
    static {
        Covode.recordClassIndex(68278);
    }

    @Override // com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    public final Aweme b() {
        return b.f106127a;
    }

    @Override // com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    public final Fragment a() {
        return new a();
    }

    public static IRecommendFeedService c() {
        MethodCollector.i(8255);
        Object a2 = com.ss.android.ugc.b.a(IRecommendFeedService.class, false);
        if (a2 != null) {
            IRecommendFeedService iRecommendFeedService = (IRecommendFeedService) a2;
            MethodCollector.o(8255);
            return iRecommendFeedService;
        }
        if (com.ss.android.ugc.b.bX == null) {
            synchronized (IRecommendFeedService.class) {
                try {
                    if (com.ss.android.ugc.b.bX == null) {
                        com.ss.android.ugc.b.bX = new RecommendFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8255);
                    throw th;
                }
            }
        }
        RecommendFeedServiceImpl recommendFeedServiceImpl = (RecommendFeedServiceImpl) com.ss.android.ugc.b.bX;
        MethodCollector.o(8255);
        return recommendFeedServiceImpl;
    }
}
