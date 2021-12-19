package com.ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IReplaceMusicDownloadService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ReplaceMusicDownloadService implements IReplaceMusicDownloadService {
    static {
        Covode.recordClassIndex(69996);
    }

    public static IReplaceMusicDownloadService a() {
        MethodCollector.i(8820);
        Object a2 = b.a(IReplaceMusicDownloadService.class, false);
        if (a2 != null) {
            IReplaceMusicDownloadService iReplaceMusicDownloadService = (IReplaceMusicDownloadService) a2;
            MethodCollector.o(8820);
            return iReplaceMusicDownloadService;
        }
        if (b.cy == null) {
            synchronized (IReplaceMusicDownloadService.class) {
                try {
                    if (b.cy == null) {
                        b.cy = new ReplaceMusicDownloadService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8820);
                    throw th;
                }
            }
        }
        ReplaceMusicDownloadService replaceMusicDownloadService = (ReplaceMusicDownloadService) b.cy;
        MethodCollector.o(8820);
        return replaceMusicDownloadService;
    }

    @Override // com.ss.android.ugc.aweme.IReplaceMusicDownloadService
    public final void a(String str, Activity activity, String str2) {
        l.d(str, "");
        l.d(activity, "");
        l.d(str2, "");
        SmartRouter.buildRoute(activity, "//replace_music/download").withParam("aweme_id", str).open();
    }
}
