package com.bytedance.android.live.broadcast.preview.c.a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements a {
    static {
        Covode.recordClassIndex(4074);
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        Context context = aVar.f8150a;
        f b2 = u.a().b();
        l.b(b2, "");
        if (b2.e()) {
            return false;
        }
        f b3 = u.a().b();
        j.a a2 = j.a();
        a2.f14158a = y.a((int) R.string.gw2);
        a2.f14160c = -1;
        a2.f14162e = "video_take";
        a2.f14163f = "open_live";
        a2.f14161d = "bottom_tab";
        b3.a(context, a2.a()).b(new g());
        return true;
    }
}
