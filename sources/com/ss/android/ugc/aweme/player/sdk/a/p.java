package com.ss.android.ugc.aweme.player.sdk.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.n.b.h;
import java.util.ArrayList;
import java.util.List;

public final class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.ttvideoengine.j.p f115300a;

    static {
        Covode.recordClassIndex(74052);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.b.c
    public final Object c() {
        return this.f115300a;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.b.c
    public final String b() {
        com.ss.ttvideoengine.j.p pVar = this.f115300a;
        if (pVar == null || pVar.f152968d == null) {
            return null;
        }
        return this.f115300a.f152968d.f152983h;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.b.c
    public final List<Pair<b, Integer>> a() {
        q qVar;
        List<o> a2;
        ArrayList arrayList = new ArrayList();
        com.ss.ttvideoengine.j.p pVar = this.f115300a;
        if (!(pVar == null || (qVar = pVar.f152968d) == null || (a2 = qVar.a()) == null || a2.size() <= 0)) {
            for (o oVar : a2) {
                arrayList.add(new Pair(f.a(oVar.c()), Integer.valueOf(oVar.a(3))));
            }
        }
        return arrayList;
    }

    public p(com.ss.ttvideoengine.j.p pVar) {
        this.f115300a = pVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.b.c
    public final b a(b bVar) {
        return f.a(aj.a(this.f115300a, f.a(bVar), 1, (h) null));
    }
}
