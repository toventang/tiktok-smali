package com.google.vr.dynamite.client;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f54908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54909b;

    static {
        Covode.recordClassIndex(34135);
    }

    public f(String str, String str2) {
        this.f54908a = str;
        this.f54909b = str2;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f54908a) * 37) + Objects.hashCode(this.f54909b);
    }

    public final String toString() {
        return "[packageName=" + this.f54908a + ",libraryName=" + this.f54909b + "]";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!Objects.equals(this.f54908a, fVar.f54908a) || !Objects.equals(this.f54909b, fVar.f54909b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
