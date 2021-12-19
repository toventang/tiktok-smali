package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f49294a = null;

    /* renamed from: b  reason: collision with root package name */
    private final T f49295b;

    /* renamed from: c  reason: collision with root package name */
    private final d f49296c;

    static {
        Covode.recordClassIndex(30851);
    }

    @Override // com.google.android.datatransport.c
    public final Integer a() {
        return this.f49294a;
    }

    @Override // com.google.android.datatransport.c
    public final T b() {
        return this.f49295b;
    }

    @Override // com.google.android.datatransport.c
    public final d c() {
        return this.f49296c;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f49294a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f49295b.hashCode()) * 1000003) ^ this.f49296c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f49294a + ", payload=" + ((Object) this.f49295b) + ", priority=" + this.f49296c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f49294a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (!this.f49295b.equals(cVar.b()) || !this.f49296c.equals(cVar.c())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    a(T t, d dVar) {
        Objects.requireNonNull(t, "Null payload");
        this.f49295b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f49296c = dVar;
    }
}
