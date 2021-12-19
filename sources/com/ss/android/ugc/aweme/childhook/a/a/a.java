package com.ss.android.ugc.aweme.childhook.a.a;

import android.content.ComponentName;
import android.content.Intent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.childhook.d;
import com.ss.android.ugc.aweme.childhook.e;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a implements d {
    static {
        Covode.recordClassIndex(43330);
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.a.d
    public final boolean a(Intent intent) {
        l.d(intent, "");
        if (intent.getComponent() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.childhook.a.a.d
    public final boolean b(Intent intent) {
        List<String> list;
        String str;
        l.d(intent, "");
        d dVar = e.f70256a;
        if (dVar == null || (list = dVar.f70253b) == null) {
            list = z.INSTANCE;
        }
        if (!(!list.isEmpty())) {
            return false;
        }
        for (String str2 : list) {
            ComponentName component = intent.getComponent();
            if (component == null || (str = component.getClassName()) == null) {
                str = "";
            }
            if (m.a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
