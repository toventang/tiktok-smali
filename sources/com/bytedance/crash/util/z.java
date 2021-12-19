package com.bytedance.crash.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f28024a;

    static {
        Covode.recordClassIndex(16408);
    }

    public static Map<String, Object> a() {
        b();
        return f28024a;
    }

    private static void b() {
        MethodCollector.i(10289);
        Context context = m.f27724a;
        if (f28024a == null) {
            f28024a = new HashMap();
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("slardar.properties"));
                for (Map.Entry entry : properties.entrySet()) {
                    f28024a.put(String.valueOf(entry.getKey()), entry.getValue());
                }
                MethodCollector.o(10289);
            } catch (Throwable unused) {
                MethodCollector.o(10289);
            }
        } else {
            MethodCollector.o(10289);
        }
    }
}
