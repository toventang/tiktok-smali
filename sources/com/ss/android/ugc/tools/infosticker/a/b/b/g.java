package com.ss.android.ugc.tools.infosticker.a.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.h.b.b.p;
import com.ss.android.ugc.tools.h.b.b.q;
import com.ss.android.ugc.tools.infosticker.a.b.c;
import h.f.a.a;
import h.f.b.l;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a<d> f149442a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f149443b;

    /* renamed from: c  reason: collision with root package name */
    private final a<String> f149444c;

    /* renamed from: d  reason: collision with root package name */
    private final int f149445d;

    /* renamed from: e  reason: collision with root package name */
    private final int f149446e;

    static {
        Covode.recordClassIndex(98399);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.c
    public final /* synthetic */ j a() {
        return new p(this.f149442a, this.f149443b.invoke(), this.f149444c.invoke(), this.f149445d);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.c
    public final /* synthetic */ j a(String str) {
        l.d(str, "");
        return new q(this.f149442a, this.f149443b.invoke(), this.f149444c.invoke(), str, this.f149446e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(a<? extends d> aVar, a<String> aVar2, a<String> aVar3, int i2, int i3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f149442a = aVar;
        this.f149443b = aVar2;
        this.f149444c = aVar3;
        this.f149445d = i2;
        this.f149446e = i3;
    }
}
