package com.bytedance.android.live.broadcast.preview.c.a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d implements a {
    static {
        Covode.recordClassIndex(4076);
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        Context context = aVar.f8150a;
        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107224c = com.bytedance.common.utility.l.d(context);
        }
        if (j.f107224c != l.a.MOBILE_2G) {
            return false;
        }
        ao.a(context, (int) R.string.gwq);
        return true;
    }
}
