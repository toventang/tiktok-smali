package androidx.work.impl.a;

import com.a;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4523a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4524b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4525c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4526d;

    static {
        Covode.recordClassIndex(1774);
    }

    public final int hashCode() {
        int i2;
        if (this.f4523a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f4524b) {
            i2 += 16;
        }
        if (this.f4525c) {
            i2 += 256;
        }
        if (this.f4526d) {
            return i2 + 4096;
        }
        return i2;
    }

    public final String toString() {
        return a.a("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f4523a), Boolean.valueOf(this.f4524b), Boolean.valueOf(this.f4525c), Boolean.valueOf(this.f4526d)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4523a == bVar.f4523a && this.f4524b == bVar.f4524b && this.f4525c == bVar.f4525c && this.f4526d == bVar.f4526d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4523a = z;
        this.f4524b = z2;
        this.f4525c = z3;
        this.f4526d = z4;
    }
}
