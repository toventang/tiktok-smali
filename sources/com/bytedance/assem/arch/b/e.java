package com.bytedance.assem.arch.b;

import com.bytedance.assem.arch.extensions.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final e f25426a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(14778);
    }

    @Override // com.bytedance.assem.arch.b.n
    public final n a(a aVar) {
        l.c(aVar, "");
        int i2 = f.f25427a[aVar.ordinal()];
        if (i2 == 1) {
            return o.f25429a;
        }
        if (i2 == 2) {
            return f25426a;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return this;
            }
            return z.f25504a;
        } else if (j.f25649d) {
            return f25426a;
        } else {
            return o.f25429a;
        }
    }
}
