package com.ss.android.ugc.aweme.favorites.api.notice;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;

public final class CollectionNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    static final f f90471a = a.a(Api.f66569d);

    interface RealApi {
        static {
            Covode.recordClassIndex(56790);
        }

        @l.b.f(a = "/aweme/v1/collection/notice/")
        q<CollectionNotice> getCollectionNotice();
    }

    static {
        Covode.recordClassIndex(56789);
    }
}
