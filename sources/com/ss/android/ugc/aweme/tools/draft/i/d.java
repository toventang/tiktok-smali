package com.ss.android.ugc.aweme.tools.draft.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Calendar;

public final class d extends a {
    static {
        Covode.recordClassIndex(91377);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.i.a
    public final int a() {
        return R.string.fpp;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.i.a
    public final boolean b(c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (instance.getTimeInMillis() < cVar.I) {
            return true;
        }
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(cVar.I);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }
}
