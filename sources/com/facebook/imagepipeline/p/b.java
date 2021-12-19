package com.facebook.imagepipeline.p;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48457a = new C1184b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f48458b = null;

    public interface a {
        static {
            Covode.recordClassIndex(29215);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(29217);
        }
    }

    /* renamed from: com.facebook.imagepipeline.p.b$b  reason: collision with other inner class name */
    static final class C1184b implements a {
        static {
            Covode.recordClassIndex(29216);
        }

        private C1184b() {
        }

        /* synthetic */ C1184b(byte b2) {
            this();
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(29214);
    }

    public static c a() {
        MethodCollector.i(2148);
        if (f48458b == null) {
            synchronized (b.class) {
                try {
                    if (f48458b == null) {
                        f48458b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2148);
                    throw th;
                }
            }
        }
        c cVar = f48458b;
        MethodCollector.o(2148);
        return cVar;
    }
}
