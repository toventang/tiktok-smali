package com.ss.android.ugc.aweme.captcha.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class CaptchaHelperServiceImpl implements ICaptchaHelperService {
    static {
        Covode.recordClassIndex(43014);
    }

    public static ICaptchaHelperService a() {
        MethodCollector.i(42);
        Object a2 = b.a(ICaptchaHelperService.class, false);
        if (a2 != null) {
            ICaptchaHelperService iCaptchaHelperService = (ICaptchaHelperService) a2;
            MethodCollector.o(42);
            return iCaptchaHelperService;
        }
        if (b.Y == null) {
            synchronized (ICaptchaHelperService.class) {
                try {
                    if (b.Y == null) {
                        b.Y = new CaptchaHelperServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(42);
                    throw th;
                }
            }
        }
        CaptchaHelperServiceImpl captchaHelperServiceImpl = (CaptchaHelperServiceImpl) b.Y;
        MethodCollector.o(42);
        return captchaHelperServiceImpl;
    }
}
