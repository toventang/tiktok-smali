package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.c.e;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

final class n {
    static {
        Covode.recordClassIndex(13075);
    }

    private static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void a(Class<?> cls) {
        a.a(new e(a(cls.getName())));
    }

    public static boolean a(AtomicReference<b> atomicReference, b bVar, Class<?> cls) {
        s.a(bVar, "next is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == d.DISPOSED) {
            return false;
        }
        a(cls);
        return false;
    }
}
