package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Arrays;

public final class h extends e {
    static {
        Covode.recordClassIndex(20609);
    }

    @Override // com.bytedance.ies.powerpermissions.e
    public final void a(m mVar, String... strArr) {
        d c2;
        l.c(strArr, "");
        if (mVar != null && (c2 = mVar.c()) != null) {
            c2.a(n.b(Arrays.copyOf(strArr, strArr.length)));
        }
    }
}
