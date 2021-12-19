package com.ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import h.f.b.l;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final f f133825a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.social.widget.card.a.a f133826b;

    static {
        Covode.recordClassIndex(87548);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public com.ss.android.ugc.aweme.social.widget.card.a.a a() {
        return this.f133826b;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        l.d(aVar, "");
        f fVar = this.f133825a;
        f fVar2 = null;
        if (!(aVar instanceof c)) {
            aVar = null;
        }
        c cVar = (c) aVar;
        if (cVar != null) {
            fVar2 = cVar.f133825a;
        }
        if (fVar == fVar2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        l.d(aVar, "");
        f fVar = this.f133825a;
        f fVar2 = null;
        if (!(aVar instanceof c)) {
            aVar = null;
        }
        c cVar = (c) aVar;
        if (cVar != null) {
            fVar2 = cVar.f133825a;
        }
        if (fVar == fVar2) {
            return true;
        }
        return false;
    }

    public c(f fVar, com.ss.android.ugc.aweme.social.widget.card.a.a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        this.f133825a = fVar;
        this.f133826b = aVar;
    }
}
