package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.core.a.b;
import com.bytedance.bpea.core.a.c;
import com.bytedance.bpea.core.c.f;
import com.bytedance.bpea.core.d.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends a {
    static {
        Covode.recordClassIndex(15701);
    }

    public d() {
        super(f.START_LEGAL_CHECK, f.END_LEGAL_CHECK);
    }

    @Override // com.bytedance.bpea.core.checker.c
    public final h b(com.bytedance.bpea.basics.d dVar, com.bytedance.bpea.basics.f fVar) {
        l.c(fVar, "");
        if (dVar == null) {
            l.c("current cert is empty", "");
            c a2 = b.a(fVar, com.bytedance.bpea.core.a.d.EMPTY_CERT);
            if (a2 == c.WARNING) {
                a(com.bytedance.bpea.core.c.d.WARN);
                return a.C0566a.a(new h(-1000, "empty cert"));
            } else if (a2 != c.ERROR) {
                return a.C0566a.a(a.C0566a.a());
            } else {
                a(com.bytedance.bpea.core.c.d.ERROR);
                throw new com.bytedance.bpea.basics.a(-1000, "current empty cert is not allowed");
            }
        } else {
            try {
                dVar.validate(fVar);
                return a.C0566a.a();
            } catch (com.bytedance.bpea.basics.a e2) {
                c a3 = b.a(fVar, com.bytedance.bpea.core.a.d.CONTENT_ILLEGAL);
                if (a3 == c.WARNING) {
                    a(com.bytedance.bpea.core.c.d.WARN);
                    return a.C0566a.a(a.C0566a.b());
                } else if (a3 != c.ERROR) {
                    return a.C0566a.a(a.C0566a.a());
                } else {
                    a(com.bytedance.bpea.core.c.d.ERROR);
                    throw new com.bytedance.bpea.basics.a(-1001, e2.getErrorMsg());
                }
            }
        }
    }
}
