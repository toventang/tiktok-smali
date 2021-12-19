package com.ss.android.ugc.aweme.share.improve.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.sharer.ui.c;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;
import java.util.List;

public final class a implements c<h> {
    static {
        Covode.recordClassIndex(81357);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.c
    public final List<h> a(List<h> list) {
        l.d(list, "");
        if (SettingsManager.a().a("enable_compliance_biz_monitor", true)) {
            T t = null;
            int i2 = 2;
            int i3 = 0;
            int i4 = 0;
            for (T t2 : list) {
                if (l.a((Object) t2.c(), (Object) "live_photo") && t2.f()) {
                    t = t2;
                }
                if ((l.a((Object) t2.c(), (Object) "duet") || l.a((Object) t2.c(), (Object) "stitch")) && !t2.f()) {
                    i2--;
                    if (i3 == 0) {
                        i3 = i4;
                    }
                }
                i4++;
            }
            if (t != null && i2 == 0) {
                list.remove(t);
                list.add(i3, t);
            }
        }
        return list;
    }
}
