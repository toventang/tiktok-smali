package androidx.work.impl.b;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4571a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4572b;

    static {
        Covode.recordClassIndex(1793);
    }

    public final int hashCode() {
        return (this.f4571a.hashCode() * 31) + this.f4572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4572b != dVar.f4572b) {
            return false;
        }
        return this.f4571a.equals(dVar.f4571a);
    }

    public d(String str, int i2) {
        this.f4571a = str;
        this.f4572b = i2;
    }
}
