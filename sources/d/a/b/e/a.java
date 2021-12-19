package d.a.b.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f156573a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f156574b;

    static {
        Covode.recordClassIndex(103968);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f156573a == aVar.f156573a && l.a(this.f156574b, aVar.f156574b);
    }

    public final int hashCode() {
        int i2 = this.f156573a * 31;
        Runnable runnable = this.f156574b;
        return i2 + (runnable != null ? runnable.hashCode() : 0);
    }

    public final String toString() {
        return "WorkerRequest(contextId=" + this.f156573a + ", runnable=" + this.f156574b + ")";
    }
}
