package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;

public final class FacebookLiteChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81783);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "facebook_lite";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        return new d();
    }
}
