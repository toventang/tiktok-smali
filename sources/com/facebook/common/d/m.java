package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class m {
    static {
        Covode.recordClassIndex(28646);
    }

    public static void a(Throwable th) {
        a(th, Error.class);
        a(th, RuntimeException.class);
    }

    public static RuntimeException b(Throwable th) {
        a((Throwable) i.a(th));
        throw new RuntimeException(th);
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }
}
