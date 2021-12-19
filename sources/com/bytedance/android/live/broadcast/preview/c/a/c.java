package com.bytedance.android.live.broadcast.preview.c.a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements a {
    static {
        Covode.recordClassIndex(4075);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        Context context = aVar.f8150a;
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = a();
        }
        if (j.f107226e) {
            return false;
        }
        ao.a(context, (int) R.string.gm_);
        return true;
    }
}
