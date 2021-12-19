package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public h.k.c<? extends a> f25555a;

    /* renamed from: b  reason: collision with root package name */
    public a f25556b;

    /* renamed from: c  reason: collision with root package name */
    List<o> f25557c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private h f25558d = h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14881);
    }

    @Override // com.bytedance.assem.arch.core.k
    public final a a() {
        boolean z;
        a aVar = this.f25556b;
        if (aVar == null) {
            h.k.c<? extends a> cVar = this.f25555a;
            if (cVar == null) {
                l.a(StringSet.type);
            }
            aVar = (a) a.a(cVar).newInstance();
        }
        if (this.f25558d == h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        aVar.f25545c = z;
        return aVar;
    }

    public final void a(h.k.c<? extends a> cVar) {
        l.c(cVar, "");
        this.f25555a = cVar;
    }
}
