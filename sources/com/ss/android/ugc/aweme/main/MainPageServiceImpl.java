package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class MainPageServiceImpl implements IMainPageService {
    static {
        Covode.recordClassIndex(69869);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageService
    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    public static IMainPageService b() {
        MethodCollector.i(2673);
        Object a2 = b.a(IMainPageService.class, false);
        if (a2 != null) {
            IMainPageService iMainPageService = (IMainPageService) a2;
            MethodCollector.o(2673);
            return iMainPageService;
        }
        if (b.cx == null) {
            synchronized (IMainPageService.class) {
                try {
                    if (b.cx == null) {
                        b.cx = new MainPageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2673);
                    throw th;
                }
            }
        }
        MainPageServiceImpl mainPageServiceImpl = (MainPageServiceImpl) b.cx;
        MethodCollector.o(2673);
        return mainPageServiceImpl;
    }
}
