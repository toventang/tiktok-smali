package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.google.gson.g;

public class NormalGson {
    private static f gson;

    static {
        Covode.recordClassIndex(7359);
    }

    private NormalGson() {
    }

    public static synchronized f singleton() {
        f fVar;
        synchronized (NormalGson.class) {
            MethodCollector.i(660);
            if (gson == null) {
                g gVar = new g();
                gVar.f54715e = false;
                gson = gVar.b();
            }
            fVar = gson;
            MethodCollector.o(660);
        }
        return fVar;
    }
}
