package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService;

public final class SplitVideoServiceImpl implements ISplitVideoService {
    static {
        Covode.recordClassIndex(79886);
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean showPlayList() {
        if (b.a().a(true, "tiktok_playlist_status", 0) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean playListAutoTake() {
        if (b.a().a(true, "tiktok_playlist_status", 0) == 2) {
            return true;
        }
        return false;
    }

    public static ISplitVideoService a() {
        MethodCollector.i(8843);
        Object a2 = com.ss.android.ugc.b.a(ISplitVideoService.class, false);
        if (a2 != null) {
            ISplitVideoService iSplitVideoService = (ISplitVideoService) a2;
            MethodCollector.o(8843);
            return iSplitVideoService;
        }
        if (com.ss.android.ugc.b.dI == null) {
            synchronized (ISplitVideoService.class) {
                try {
                    if (com.ss.android.ugc.b.dI == null) {
                        com.ss.android.ugc.b.dI = new SplitVideoServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8843);
                    throw th;
                }
            }
        }
        SplitVideoServiceImpl splitVideoServiceImpl = (SplitVideoServiceImpl) com.ss.android.ugc.b.dI;
        MethodCollector.o(8843);
        return splitVideoServiceImpl;
    }
}
