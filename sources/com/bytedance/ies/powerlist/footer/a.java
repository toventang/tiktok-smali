package com.bytedance.ies.powerlist.footer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.b;
import com.bytedance.ies.powerlist.page.c;
import com.bytedance.ies.powerlist.page.h;
import com.bytedance.ies.powerlist.page.i;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a, c {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.powerlist.page.a f34291a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.powerlist.page.config.a<?> f34292b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.ies.powerlist.page.a f34293c;

    static {
        Covode.recordClassIndex(20489);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return b.b(this, aVar);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    private a() {
        this.f34292b = null;
        this.f34291a = new com.bytedance.ies.powerlist.page.a();
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.bytedance.ies.powerlist.page.c
    public final void a(h hVar) {
        l.c(hVar, "");
        com.bytedance.ies.powerlist.page.a aVar = hVar.f34398b;
        l.c(aVar, "");
        this.f34293c = this.f34291a;
        this.f34291a = aVar;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        i iVar;
        com.bytedance.ies.powerlist.page.a aVar2;
        l.c(aVar, "");
        com.bytedance.ies.powerlist.page.a aVar3 = this.f34293c;
        i iVar2 = null;
        if (aVar3 != null) {
            iVar = aVar3.f34345b;
        } else {
            iVar = null;
        }
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar4 = (a) aVar;
        if (!(aVar4 == null || (aVar2 = aVar4.f34291a) == null)) {
            iVar2 = aVar2.f34345b;
        }
        return l.a(iVar, iVar2);
    }
}
