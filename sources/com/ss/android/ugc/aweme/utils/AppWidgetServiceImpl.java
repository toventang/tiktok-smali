package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class AppWidgetServiceImpl implements IAppWidgetService {
    static {
        Covode.recordClassIndex(93239);
    }

    public static IAppWidgetService a() {
        MethodCollector.i(14413);
        Object a2 = b.a(IAppWidgetService.class, false);
        if (a2 != null) {
            IAppWidgetService iAppWidgetService = (IAppWidgetService) a2;
            MethodCollector.o(14413);
            return iAppWidgetService;
        }
        if (b.ew == null) {
            synchronized (IAppWidgetService.class) {
                try {
                    if (b.ew == null) {
                        b.ew = new AppWidgetServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14413);
                    throw th;
                }
            }
        }
        AppWidgetServiceImpl appWidgetServiceImpl = (AppWidgetServiceImpl) b.ew;
        MethodCollector.o(14413);
        return appWidgetServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void a(Context context) {
        l.d(context, "");
        p.a(context);
    }
}
