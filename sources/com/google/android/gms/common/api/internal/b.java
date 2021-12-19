package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.p;
import java.util.Arrays;

public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f50084a;

    /* renamed from: b  reason: collision with root package name */
    public final a<O> f50085b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50086c;

    /* renamed from: d  reason: collision with root package name */
    private final O f50087d;

    static {
        Covode.recordClassIndex(31243);
    }

    public final int hashCode() {
        return this.f50086c;
    }

    public b(a<O> aVar) {
        this.f50084a = true;
        this.f50085b = aVar;
        this.f50086c = System.identityHashCode(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f50084a || bVar.f50084a || !p.a(this.f50085b, bVar.f50085b) || !p.a(this.f50087d, bVar.f50087d)) {
            return false;
        }
        return true;
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    private b(a<O> aVar, O o) {
        this.f50085b = aVar;
        this.f50087d = o;
        this.f50086c = Arrays.hashCode(new Object[]{aVar, o});
    }
}
