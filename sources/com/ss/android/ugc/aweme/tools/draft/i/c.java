package com.ss.android.ugc.aweme.tools.draft.i;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Calendar;

public final class c extends a {
    static {
        Covode.recordClassIndex(91376);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.i.a
    public final int a() {
        return R.string.fpo;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.i.a
    public final boolean b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        instance2.setTimeInMillis(cVar.I);
        int i2 = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i2 < 7 || i2 >= 30) {
            return false;
        }
        return true;
    }
}
