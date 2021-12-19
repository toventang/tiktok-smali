package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.d.a;
import java.util.Objects;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49406a;

    /* renamed from: b  reason: collision with root package name */
    private final a f49407b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49408c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49409d;

    static {
        Covode.recordClassIndex(30913);
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final Context a() {
        return this.f49406a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final a b() {
        return this.f49407b;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final a c() {
        return this.f49408c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final String d() {
        return this.f49409d;
    }

    public final int hashCode() {
        return ((((((this.f49406a.hashCode() ^ 1000003) * 1000003) ^ this.f49407b.hashCode()) * 1000003) ^ this.f49408c.hashCode()) * 1000003) ^ this.f49409d.hashCode();
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.f49406a + ", wallClock=" + this.f49407b + ", monotonicClock=" + this.f49408c + ", backendName=" + this.f49409d + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!this.f49406a.equals(hVar.a()) || !this.f49407b.equals(hVar.b()) || !this.f49408c.equals(hVar.c()) || !this.f49409d.equals(hVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f49406a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f49407b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f49408c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f49409d = str;
    }
}
