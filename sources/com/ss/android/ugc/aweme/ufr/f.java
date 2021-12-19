package com.ss.android.ugc.aweme.ufr;

import com.bytedance.common.utility.collection.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.g;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<e<g>> f141695a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final f f141696b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(92609);
    }

    public static void a(com.ss.android.ugc.aweme.recommend.f fVar) {
        l.d(fVar, "");
        for (e eVar : n.p(f141695a)) {
            g gVar = (g) eVar.get();
            if (gVar != null) {
                gVar.a(fVar);
            }
        }
    }
}
