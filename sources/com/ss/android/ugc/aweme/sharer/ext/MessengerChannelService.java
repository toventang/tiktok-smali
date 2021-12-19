package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.a.a;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;
import h.f.b.l;

public final class MessengerChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81791);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "messenger";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        l lVar = null;
        if (!(dVar == null || dVar.f124524b == null)) {
            a aVar = dVar.f124524b;
            if (aVar == null) {
                l.b();
            }
            lVar = new l(aVar);
        }
        return lVar;
    }
}
