package androidx.core.g;

import com.bytedance.covode.number.Covode;

public class e<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f2397a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2398b;

    static {
        Covode.recordClassIndex(771);
    }

    public int hashCode() {
        int hashCode;
        F f2 = this.f2397a;
        int i2 = 0;
        if (f2 == null) {
            hashCode = 0;
        } else {
            hashCode = f2.hashCode();
        }
        S s = this.f2398b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2397a) + " " + String.valueOf(this.f2398b) + "}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!d.a(eVar.f2397a, this.f2397a) || !d.a(eVar.f2398b, this.f2398b)) {
            return false;
        }
        return true;
    }

    public e(F f2, S s) {
        this.f2397a = f2;
        this.f2398b = s;
    }

    public static <A, B> e<A, B> a(A a2, B b2) {
        return new e<>(a2, b2);
    }
}
