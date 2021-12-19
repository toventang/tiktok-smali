package com.ss.android.ugc.aweme.childhook.a.b;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.childhook.d;
import com.ss.android.ugc.aweme.childhook.e;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a implements c {
    static {
        Covode.recordClassIndex(43334);
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.b.c
    public final boolean b(String str) {
        l.d(str, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.b.c
    public final boolean a(String str) {
        List<String> list;
        l.d(str, "");
        d dVar = e.f70256a;
        if (dVar == null || (list = dVar.f70254c) == null) {
            list = z.INSTANCE;
        }
        for (String str2 : list) {
            if (m.a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
