package d.a.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f156641a;

    static {
        Covode.recordClassIndex(104005);
    }

    @Override // d.a.e.a
    public final void logError(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
    }

    @Override // d.a.e.a
    public final void logError(String str, String str2, Throwable th) {
        l.c(str, "");
        l.c(str2, "");
        l.c(th, "");
    }

    @Override // d.a.e.a
    public final boolean getEnabled() {
        return this.f156641a;
    }

    @Override // d.a.e.a
    public final void logDebug(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        getEnabled();
    }
}
