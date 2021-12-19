package com.bytedance.sysoptimizer;

import android.content.Context;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;

public class LayoutInflaterAsyncCrashOptimizer {
    private static boolean hasFixed;

    static {
        Covode.recordClassIndex(26993);
    }

    public static final class FixLayoutInflaterAsyncHashMap<K, V> extends HashMap<K, V> {
        static {
            Covode.recordClassIndex(26994);
        }

        public final synchronized void clear() {
            MethodCollector.i(12630);
            super.clear();
            MethodCollector.o(12630);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final synchronized V remove(Object obj) {
            V v;
            MethodCollector.i(12629);
            v = (V) super.remove(obj);
            MethodCollector.o(12629);
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final synchronized V put(K k2, V v) {
            V v2;
            MethodCollector.i(12628);
            v2 = (V) super.put(k2, v);
            MethodCollector.o(12628);
            return v2;
        }
    }

    public static synchronized void fix(Context context) {
        synchronized (LayoutInflaterAsyncCrashOptimizer.class) {
            MethodCollector.i(11607);
            if (hasFixed) {
                MethodCollector.o(11607);
                return;
            }
            hasFixed = true;
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("sConstructorMap");
                declaredField.setAccessible(true);
                declaredField.set(null, new FixLayoutInflaterAsyncHashMap());
                MethodCollector.o(11607);
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(11607);
            }
        }
    }
}
