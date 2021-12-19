package com.ss.android.ugc.aweme.newfollow.statistics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService;
import com.ss.android.ugc.b;

public class FollowStatisticsServiceImpl implements IFollowStatisticsService {
    static {
        Covode.recordClassIndex(72357);
    }

    public static IFollowStatisticsService a() {
        MethodCollector.i(4176);
        Object a2 = b.a(IFollowStatisticsService.class, false);
        if (a2 != null) {
            IFollowStatisticsService iFollowStatisticsService = (IFollowStatisticsService) a2;
            MethodCollector.o(4176);
            return iFollowStatisticsService;
        }
        if (b.cT == null) {
            synchronized (IFollowStatisticsService.class) {
                try {
                    if (b.cT == null) {
                        b.cT = new FollowStatisticsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4176);
                    throw th;
                }
            }
        }
        FollowStatisticsServiceImpl followStatisticsServiceImpl = (FollowStatisticsServiceImpl) b.cT;
        MethodCollector.o(4176);
        return followStatisticsServiceImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    @Override // com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
