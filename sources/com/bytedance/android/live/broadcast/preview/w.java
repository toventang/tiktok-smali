package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.f;
import com.bytedance.android.live.u.g;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private final v f8326a;

    static {
        Covode.recordClassIndex(4239);
    }

    w(v vVar) {
        this.f8326a = vVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        v vVar = this.f8326a;
        f fVar = (f) obj;
        if (vVar.f8293a != null) {
            g.b(new x(vVar, fVar), null);
            g.b(new y(vVar, fVar), null);
            g.b(new z(vVar), null);
        }
        return z.f158842a;
    }
}
