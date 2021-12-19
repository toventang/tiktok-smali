package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.a.a;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;
import h.f.b.l;

public final class SnapchatChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81797);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "snapchat";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        r rVar = null;
        if (!(dVar == null || dVar.f124524b == null)) {
            a aVar = dVar.f124524b;
            if (aVar == null) {
                l.b();
            }
            rVar = new r(aVar);
        }
        return rVar;
    }
}
