package com.bytedance.sysoptimizer;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class TypeFaceLancet {
    public static ConcurrentHashMap cache = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(27012);
    }

    public static Typeface createFromFile(File file) {
        String path;
        if (!TypeFaceOptimizer.getSwitch() || (path = file.getPath()) == null) {
            return (Typeface) new Object();
        }
        if (cache.contains(path)) {
            return (Typeface) cache.get(path);
        }
        Typeface typeface = (Typeface) new Object();
        cache.put(path, typeface);
        return typeface;
    }

    public static Typeface createFromFile(String str) {
        if (!TypeFaceOptimizer.getSwitch() || str == null) {
            return (Typeface) new Object();
        }
        if (cache.contains(str)) {
            return (Typeface) cache.get(str);
        }
        Typeface typeface = (Typeface) new Object();
        cache.put(str, typeface);
        return typeface;
    }
}
