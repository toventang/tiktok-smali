package com.google.android.datatransport.runtime;

import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.b;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import java.util.Set;

public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f49450a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49451b;

    /* renamed from: c  reason: collision with root package name */
    private final o f49452c;

    static {
        Covode.recordClassIndex(30950);
    }

    public l(Set<b> set, k kVar, o oVar) {
        this.f49450a = set;
        this.f49451b = kVar;
        this.f49452c = oVar;
    }

    @Override // com.google.android.datatransport.g
    public final <T> f<T> a(String str, b bVar, e<T, byte[]> eVar) {
        if (this.f49450a.contains(bVar)) {
            return new m(this.f49451b, str, bVar, eVar, this.f49452c);
        }
        throw new IllegalArgumentException(a.a("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f49450a}));
    }
}
