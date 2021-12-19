package com.ss.android.ugc.aweme.search.middlepage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.ss.android.ugc.aweme.discover.ui.ag;
import h.f.b.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public VisitedAccount f121485a;

    /* renamed from: b  reason: collision with root package name */
    public String f121486b;

    /* renamed from: c  reason: collision with root package name */
    public ag f121487c;

    static {
        Covode.recordClassIndex(79143);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        l.d(aVar, "");
        if (aVar instanceof d) {
            return l.a((Object) this.f121485a.getUid(), (Object) ((d) aVar).f121485a.getUid());
        }
        return false;
    }

    public d(VisitedAccount visitedAccount, String str, ag agVar) {
        l.d(visitedAccount, "");
        l.d(agVar, "");
        this.f121485a = visitedAccount;
        this.f121486b = str;
        this.f121487c = agVar;
    }
}
