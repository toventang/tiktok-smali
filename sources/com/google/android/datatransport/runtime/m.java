package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.b;
import com.google.android.datatransport.c;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.runtime.b;

final class m<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k f49453a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49454b;

    /* renamed from: c  reason: collision with root package name */
    private final b f49455c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f49456d;

    /* renamed from: e  reason: collision with root package name */
    private final o f49457e;

    static {
        Covode.recordClassIndex(30951);
    }

    @Override // com.google.android.datatransport.f
    public final void a(c<T> cVar) {
        this.f49457e.a(new b.a().a(this.f49453a).a((c<?>) cVar).a(this.f49454b).a((e<?, byte[]>) this.f49456d).a(this.f49455c).a(), n.f49458a);
    }

    m(k kVar, String str, com.google.android.datatransport.b bVar, e<T, byte[]> eVar, o oVar) {
        this.f49453a = kVar;
        this.f49454b = str;
        this.f49455c = bVar;
        this.f49456d = eVar;
        this.f49457e = oVar;
    }
}
