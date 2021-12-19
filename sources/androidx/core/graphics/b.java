package androidx.core.graphics;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2405a = new b(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f2406b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2407c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2408d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2409e;

    static {
        Covode.recordClassIndex(779);
    }

    public final int hashCode() {
        return (((((this.f2406b * 31) + this.f2407c) * 31) + this.f2408d) * 31) + this.f2409e;
    }

    public final String toString() {
        return "Insets{left=" + this.f2406b + ", top=" + this.f2407c + ", right=" + this.f2408d + ", bottom=" + this.f2409e + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2409e == bVar.f2409e && this.f2406b == bVar.f2406b && this.f2408d == bVar.f2408d && this.f2407c == bVar.f2407c) {
            return true;
        }
        return false;
    }

    private b(int i2, int i3, int i4, int i5) {
        this.f2406b = i2;
        this.f2407c = i3;
        this.f2408d = i4;
        this.f2409e = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return f2405a;
        }
        return new b(i2, i3, i4, i5);
    }
}
