package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AVDrmCreater {
    static {
        Covode.recordClassIndex(101295);
    }

    public static synchronized long createDrm(int i2) {
        synchronized (AVDrmCreater.class) {
            MethodCollector.i(2674);
            if (i2 == 1) {
                long a2 = a("com.ss.ttm.drm.intertrust.IntertrustDrm");
                MethodCollector.o(2674);
                return a2;
            }
            MethodCollector.o(2674);
            return 0;
        }
    }

    private static long a(String str) {
        Class<?> cls;
        ClassLoader a2;
        try {
            if (v.f152119a == null || (a2 = v.f152119a.a()) == null) {
                cls = Class.forName(str);
            } else {
                cls = Class.forName(str, true, a2);
            }
            return Long.parseLong(String.valueOf(cls.getMethod("createDrm", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
