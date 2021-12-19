package com.google.firebase.f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f54367a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54368b;

    static {
        Covode.recordClassIndex(33750);
    }

    @Override // com.google.firebase.f.f
    public final String a() {
        return this.f54367a;
    }

    @Override // com.google.firebase.f.f
    public final String b() {
        return this.f54368b;
    }

    public final int hashCode() {
        return ((this.f54367a.hashCode() ^ 1000003) * 1000003) ^ this.f54368b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.f54367a + ", version=" + this.f54368b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!this.f54367a.equals(fVar.a()) || !this.f54368b.equals(fVar.b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f54367a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f54368b = str2;
    }
}
