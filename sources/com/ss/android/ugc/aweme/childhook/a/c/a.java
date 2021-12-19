package com.ss.android.ugc.aweme.childhook.a.c;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.childhook.d;
import com.ss.android.ugc.aweme.childhook.e;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a implements c {
    static {
        Covode.recordClassIndex(43337);
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.c.c
    public final boolean b(String str) {
        l.d(str, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.c.c
    public final boolean a(String str) {
        List<String> list;
        l.d(str, "");
        d dVar = e.f70256a;
        if (dVar == null || (list = dVar.f70255d) == null) {
            list = z.INSTANCE;
        }
        if (!(!list.isEmpty())) {
            return false;
        }
        for (String str2 : list) {
            if (m.a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
