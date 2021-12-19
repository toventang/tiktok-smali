package com.ss.android.ugc.aweme.feed.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.feed.ui.foryoutab.ForYouTab;
import com.ss.android.ugc.aweme.feed.ui.foryoutab.a;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class FeedModuleServiceImpl extends FeedModuleServiceCommonImpl {
    static {
        Covode.recordClassIndex(57876);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final String getFeedRequstParam() {
        return null;
    }

    public static IFeedModuleService a() {
        MethodCollector.i(8337);
        Object a2 = b.a(IFeedModuleService.class, false);
        if (a2 != null) {
            IFeedModuleService iFeedModuleService = (IFeedModuleService) a2;
            MethodCollector.o(8337);
            return iFeedModuleService;
        }
        if (b.bn == null) {
            synchronized (IFeedModuleService.class) {
                try {
                    if (b.bn == null) {
                        b.bn = new FeedModuleServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8337);
                    throw th;
                }
            }
        }
        FeedModuleServiceCommonImpl feedModuleServiceCommonImpl = (FeedModuleServiceCommonImpl) b.bn;
        MethodCollector.o(8337);
        return feedModuleServiceCommonImpl;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final dj a(Context context) {
        l.d(context, "");
        return a.a(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final by b(Context context) {
        l.d(context, "");
        return new ForYouTab(context);
    }
}
