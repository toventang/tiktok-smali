package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.b;
import com.ss.android.ugc.aweme.feed.helper.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.av;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final af f94234a;

    static {
        Covode.recordClassIndex(59872);
    }

    ak(af afVar) {
        this.f94234a = afVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.helper.g.b
    public final void a() {
        af afVar = this.f94234a;
        g gVar = afVar.z;
        av avVar = afVar.n;
        if (avVar != null && !gVar.a(avVar.aC())) {
            b bVar = avVar.W;
            l.b(bVar, "");
            List<Aweme> e2 = bVar.e();
            if (e2 != null) {
                Iterator<T> it = e2.iterator();
                while (it.hasNext()) {
                    gVar.a((Aweme) it.next());
                }
            }
        }
    }
}
