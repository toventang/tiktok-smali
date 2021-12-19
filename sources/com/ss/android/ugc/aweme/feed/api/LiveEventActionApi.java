package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.EventDetailData;
import f.a.t;
import l.b.f;
import l.b.o;

public final class LiveEventActionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final LiveEventActionApi f91937a = new LiveEventActionApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f91938b = ((RealApi) RetrofitFactory.a().b(b.f59141e).d().a(RealApi.class));

    public interface RealApi {
        static {
            Covode.recordClassIndex(57885);
        }

        @f(a = "/tiktok/event/get/v1")
        t<EventDetailData> getEventDetail(@l.b.t(a = "event_id") String str);

        @o(a = "/tiktok/event/subscribe/v1")
        t<BaseResponse> registerEvent(@l.b.t(a = "event_id") String str);

        @o(a = "/tiktok/event/unsubscribe/v1")
        t<BaseResponse> unregisterEvent(@l.b.t(a = "event_id") String str);
    }

    private LiveEventActionApi() {
    }

    static {
        Covode.recordClassIndex(57884);
    }
}
