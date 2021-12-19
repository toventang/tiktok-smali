package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.r;
import java.util.List;

public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    private long f55841a;

    static {
        Covode.recordClassIndex(34910);
    }

    public d(long j2) {
        super(9);
        this.f55841a = j2;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        List<r> list = qVar.f55933c.u;
        if (list != null) {
            for (r rVar : list) {
                rVar.a();
            }
        }
    }
}
