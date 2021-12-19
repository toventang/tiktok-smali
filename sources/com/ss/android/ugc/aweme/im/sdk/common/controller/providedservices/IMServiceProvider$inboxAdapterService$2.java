package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;

final class IMServiceProvider$inboxAdapterService$2 extends m implements a<com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a> {
    public static final IMServiceProvider$inboxAdapterService$2 INSTANCE = new IMServiceProvider$inboxAdapterService$2();

    static {
        Covode.recordClassIndex(65506);
    }

    IMServiceProvider$inboxAdapterService$2() {
        super(0);
    }

    @Override // h.f.a.a
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a invoke() {
        return new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a();
    }
}
