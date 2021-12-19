package com.google.firebase.components;

import com.bytedance.covode.number.Covode;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f54336a;

    /* renamed from: b  reason: collision with root package name */
    final int f54337b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54338c = 0;

    static {
        Covode.recordClassIndex(33734);
    }

    public final boolean b() {
        if (this.f54338c == 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.f54337b == 2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f54336a.hashCode() ^ 1000003) * 1000003) ^ this.f54337b) * 1000003) ^ this.f54338c;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Dependency{anInterface=").append(this.f54336a).append(", type=");
        int i2 = this.f54337b;
        boolean z = true;
        if (i2 == 1) {
            str = "required";
        } else if (i2 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        StringBuilder append2 = append.append(str).append(", direct=");
        if (this.f54338c != 0) {
            z = false;
        }
        return append2.append(z).append("}").toString();
    }

    public static n a(Class<?> cls) {
        return new n(cls, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f54336a == nVar.f54336a && this.f54337b == nVar.f54337b && this.f54338c == nVar.f54338c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public n(Class<?> cls, int i2) {
        this.f54336a = (Class) u.a(cls, "Null dependency anInterface.");
        this.f54337b = i2;
    }
}
