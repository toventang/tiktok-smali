package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.b;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.c;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.d;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.e;
import h.f.a.a;
import h.h;
import h.i;

public final class IMServiceProvider {
    public static final IMServiceProvider INSTANCE = new IMServiceProvider();
    private static final h familiarService$delegate = i.a((a) IMServiceProvider$familiarService$2.INSTANCE);
    private static final h inboxAdapterService$delegate = i.a((a) IMServiceProvider$inboxAdapterService$2.INSTANCE);
    private static final h relationService$delegate = i.a((a) IMServiceProvider$relationService$2.INSTANCE);
    private static final h shareService$delegate = i.a((a) IMServiceProvider$shareService$2.INSTANCE);
    private static final h systemSmallEmojiService$delegate = i.a((a) IMServiceProvider$systemSmallEmojiService$2.INSTANCE);

    public final b getFamiliarService() {
        return (b) familiarService$delegate.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a getInboxAdapterService() {
        return (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a) inboxAdapterService$delegate.getValue();
    }

    public final c getRelationService() {
        return (c) relationService$delegate.getValue();
    }

    public final d getShareService() {
        return (d) shareService$delegate.getValue();
    }

    public final e getSystemSmallEmojiService() {
        return (e) systemSmallEmojiService$delegate.getValue();
    }

    private IMServiceProvider() {
    }

    static {
        Covode.recordClassIndex(65504);
    }
}
