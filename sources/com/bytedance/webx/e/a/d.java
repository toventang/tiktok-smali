package com.bytedance.webx.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f45977a;

    public interface a {
        static {
            Covode.recordClassIndex(28109);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(28108);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f45978a;

        static {
            MethodCollector.i(13301);
            Covode.recordClassIndex(28110);
            f45978a = true;
            if (d.f45977a != null) {
                synchronized (d.class) {
                    try {
                        if (d.f45977a != null) {
                            f45978a = d.f45977a.a();
                        }
                    } finally {
                        MethodCollector.o(13301);
                    }
                }
                return;
            }
            MethodCollector.o(13301);
        }
    }
}
