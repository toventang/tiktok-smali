package h.f.b;

import com.bytedance.covode.number.Covode;

public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f158724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f158725b;

    static {
        Covode.recordClassIndex(105230);
    }

    @Override // h.f.b.d
    public final Class<?> a() {
        return this.f158724a;
    }

    public final int hashCode() {
        return this.f158724a.hashCode();
    }

    public final String toString() {
        return this.f158724a.toString() + " (Kotlin reflection is not available)";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s) || !l.a(this.f158724a, ((s) obj).f158724a)) {
            return false;
        }
        return true;
    }

    public s(Class<?> cls, String str) {
        l.d(cls, "");
        l.d(str, "");
        this.f158724a = cls;
        this.f158725b = str;
    }
}
