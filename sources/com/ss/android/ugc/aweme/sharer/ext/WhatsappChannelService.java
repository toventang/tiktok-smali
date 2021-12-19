package com.ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.IChannelApi;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.d;

public final class WhatsappChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81803);
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final String a() {
        return "whatsapp";
    }

    @Override // com.ss.android.ugc.aweme.sharer.IChannelApi
    public final b a(d dVar) {
        return new x();
    }
}
