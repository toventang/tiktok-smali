package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.util.Properties;

public final class t {
    static {
        Covode.recordClassIndex(16401);
    }

    public static Properties a(String str) {
        MethodCollector.i(10291);
        String str2 = str + "/map_size.txt";
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(str2));
            MethodCollector.o(10291);
            return properties;
        } catch (Throwable unused) {
            MethodCollector.o(10291);
            return null;
        }
    }
}
