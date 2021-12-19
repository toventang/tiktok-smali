package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import l.b.t;

public final class LiveEventApi {

    /* renamed from: a  reason: collision with root package name */
    static final f f108633a = RetrofitFactory.a().b(Api.f66569d).d();

    /* renamed from: b  reason: collision with root package name */
    public static final LiveEventApi f108634b = new LiveEventApi();

    public interface RealApi {
        static {
            Covode.recordClassIndex(69624);
        }

        @l.b.f(a = "/tiktok/event/list/v1")
        q<k> getAnchorSelectionResponse(@t(a = "host_user_id") String str, @t(a = "query_type") int i2, @t(a = "offset") int i3, @t(a = "count") int i4);
    }

    private LiveEventApi() {
    }

    static {
        Covode.recordClassIndex(69623);
    }
}
