package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;
import h.f.b.l;

public final class BandChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81780);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "band";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        a aVar = null;
        if (!(dVar == null || dVar.f124523a == null)) {
            String str = dVar.f124523a;
            if (str == null) {
                l.b();
            }
            aVar = new a(str);
        }
        return aVar;
    }
}
