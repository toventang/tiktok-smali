package com.ss.android.ugc.aweme.utils;

import android.content.res.Resources;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.e;

public final class ab extends e {
    static {
        Covode.recordClassIndex(93296);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "BadTokenAndResourceNotFoundCrashPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.view.ViewRootImpl".equals(stackTraceElement.getClassName()) && "setView".equals(stackTraceElement.getMethodName())) {
                    g.a(g.a.ERROR);
                    return true;
                }
            }
        }
        if (th instanceof Resources.NotFoundException) {
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                if ("org.chromium.ui.base.DeviceFormFactor".equals(stackTraceElement2.getClassName()) && "isTablet".equals(stackTraceElement2.getMethodName())) {
                    g.a(g.a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
