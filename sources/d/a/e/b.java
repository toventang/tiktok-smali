package d.a.e;

import com.bytedance.covode.number.Covode;
import d.a.b.a;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f156639a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static a<a> f156640b = new a<>(new c());

    private b() {
    }

    static {
        Covode.recordClassIndex(104004);
    }

    private static String a(String str) {
        return "EPKN.-".concat(String.valueOf(str));
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        d.a.b.b.a(f156640b, aVar);
    }

    public static void a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        if (f156640b.f156544a.getEnabled()) {
            f156640b.f156544a.logDebug(a(str), str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        l.c(str, "");
        l.c(str2, "");
        if (th != null) {
            f156640b.f156544a.logError(a(str), str2, th);
        } else {
            f156640b.f156544a.logError(a(str), str2);
        }
    }
}
