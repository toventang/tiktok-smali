package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.notice.api.ab.NoticeABService;
import h.f.b.l;

public final class NoticeABServiceImpl implements NoticeABService {
    static {
        Covode.recordClassIndex(79531);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final int getEnablePushGuide() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final int getShowRedDotType() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final boolean isEnableMultiAccountLogin() {
        bo b2 = b.b();
        l.b(b2, "");
        return b2.isEnableMultiAccountLogin();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.ab.NoticeABService
    public final boolean isFtcBindEnable() {
        return com.bytedance.ies.abmock.b.a().a(true, "ftc_bind_enable", false);
    }

    public static NoticeABService createNoticeABServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(4428);
        Object a2 = com.ss.android.ugc.b.a(NoticeABService.class, z);
        if (a2 != null) {
            NoticeABService noticeABService = (NoticeABService) a2;
            MethodCollector.o(4428);
            return noticeABService;
        }
        if (com.ss.android.ugc.b.dx == null) {
            synchronized (NoticeABService.class) {
                try {
                    if (com.ss.android.ugc.b.dx == null) {
                        com.ss.android.ugc.b.dx = new NoticeABServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4428);
                    throw th;
                }
            }
        }
        NoticeABServiceImpl noticeABServiceImpl = (NoticeABServiceImpl) com.ss.android.ugc.b.dx;
        MethodCollector.o(4428);
        return noticeABServiceImpl;
    }
}
