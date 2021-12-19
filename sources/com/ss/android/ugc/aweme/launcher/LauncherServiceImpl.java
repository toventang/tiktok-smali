package com.ss.android.ugc.aweme.launcher;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class LauncherServiceImpl implements ILauncherService {
    static {
        Covode.recordClassIndex(68640);
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final String a() {
        return "disabled";
    }

    public static ILauncherService b() {
        MethodCollector.i(5185);
        Object a2 = b.a(ILauncherService.class, false);
        if (a2 != null) {
            ILauncherService iLauncherService = (ILauncherService) a2;
            MethodCollector.o(5185);
            return iLauncherService;
        }
        if (b.cb == null) {
            synchronized (ILauncherService.class) {
                try {
                    if (b.cb == null) {
                        b.cb = new LauncherServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5185);
                    throw th;
                }
            }
        }
        LauncherServiceImpl launcherServiceImpl = (LauncherServiceImpl) b.cb;
        MethodCollector.o(5185);
        return launcherServiceImpl;
    }
}
