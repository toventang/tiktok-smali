package com.ss.texturerender;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static a f151836a;

    public interface a {
        static {
            Covode.recordClassIndex(101260);
        }

        int a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(101259);
    }

    public static synchronized void a(a aVar) {
        synchronized (l.class) {
            MethodCollector.i(10536);
            f151836a = aVar;
            MethodCollector.o(10536);
        }
    }

    public static int a(String str, String str2) {
        a aVar = f151836a;
        if (aVar == null) {
            return 0;
        }
        return aVar.a(str, str2);
    }
}
