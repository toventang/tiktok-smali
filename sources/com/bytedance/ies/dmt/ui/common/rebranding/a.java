package com.bytedance.ies.dmt.ui.common.rebranding;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Class, C0729a> f33350a = new HashMap<>();

    static {
        Covode.recordClassIndex(19915);
    }

    public static void a() {
        MethodCollector.i(9713);
        HashMap<Class, C0729a> hashMap = f33350a;
        synchronized (hashMap) {
            try {
                for (Map.Entry<Class, C0729a> entry : hashMap.entrySet()) {
                    C0729a value = entry.getValue();
                    if (value != null) {
                        value.f33351a = false;
                        value.f33352b = -1;
                    }
                }
            } finally {
                MethodCollector.o(9713);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a$a  reason: collision with other inner class name */
    public static class C0729a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f33351a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f33352b = -1;

        static {
            Covode.recordClassIndex(19916);
        }

        public C0729a(int i2) {
            this.f33352b = i2;
        }
    }

    public static C0729a a(Class cls) {
        C0729a aVar;
        MethodCollector.i(9885);
        HashMap<Class, C0729a> hashMap = f33350a;
        synchronized (hashMap) {
            try {
                aVar = hashMap.get(cls);
            } finally {
                MethodCollector.o(9885);
            }
        }
        return aVar;
    }

    public static void a(Class cls, C0729a aVar) {
        MethodCollector.i(9884);
        HashMap<Class, C0729a> hashMap = f33350a;
        synchronized (hashMap) {
            try {
                hashMap.put(cls, aVar);
            } finally {
                MethodCollector.o(9884);
            }
        }
    }
}
