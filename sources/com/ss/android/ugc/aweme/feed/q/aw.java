package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.e.o;
import h.f.b.l;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    final o f93778a;

    /* renamed from: b  reason: collision with root package name */
    final al f93779b;

    static {
        Covode.recordClassIndex(59665);
    }

    public final String a() {
        aj bf = this.f93779b.bf();
        if (bf == null) {
            return "no story list viewholder";
        }
        l.b(bf, "");
        if (bf.U() == null) {
            return "no story viewholder";
        }
        o oVar = this.f93778a;
        aj U = bf.U();
        l.b(U, "");
        String a2 = oVar.a(U.b(), false, bf.U());
        l.b(a2, "");
        return a2;
    }

    public aw(o oVar, al alVar) {
        l.d(oVar, "");
        l.d(alVar, "");
        this.f93778a = oVar;
        this.f93779b = alVar;
    }
}
