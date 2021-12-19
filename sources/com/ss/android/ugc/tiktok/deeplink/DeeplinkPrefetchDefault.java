package com.ss.android.ugc.tiktok.deeplink;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DeeplinkPrefetchDefault implements IDeepLinkSecurityService {
    static {
        Covode.recordClassIndex(98104);
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final b a(a aVar) {
        l.d(aVar, "");
        return new b((byte) 0);
    }
}
