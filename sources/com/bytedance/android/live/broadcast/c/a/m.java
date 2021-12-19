package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.broadcast.c.a.g;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g.AnonymousClass1 f7818a;

    static {
        Covode.recordClassIndex(3865);
    }

    m(g.AnonymousClass1 r1) {
        this.f7818a = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.android.livesdk.model.message.cg> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.android.livesdk.model.message.cg> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = g.this;
        r rVar = (r) obj;
        if (rVar != null) {
            if (rVar.f19677e) {
                gVar.f7802a.add(0, rVar);
            } else {
                gVar.f7802a.add(rVar);
            }
            gVar.b();
        }
    }
}
