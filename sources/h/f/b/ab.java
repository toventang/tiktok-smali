package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;
import h.k.d;

public final class ab {
    static {
        Covode.recordClassIndex(105208);
    }

    public static c a(Class cls) {
        return new e(cls);
    }

    public static String a(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public static d a(Class cls, String str) {
        return new s(cls, str);
    }
}
