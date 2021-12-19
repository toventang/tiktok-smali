package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;
import h.f.b.l;

public final class SystemChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81798);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "more";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        s sVar = null;
        if (!(dVar == null || dVar.f124526d == null)) {
            String str = dVar.f124526d;
            if (str == null) {
                l.b();
            }
            sVar = new s(str);
        }
        return sVar;
    }
}
