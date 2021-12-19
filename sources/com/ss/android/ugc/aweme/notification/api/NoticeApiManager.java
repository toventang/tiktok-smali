package com.ss.android.ugc.aweme.notification.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.notification.bean.e;
import com.ss.android.ugc.aweme.notification.bean.s;
import l.b.f;
import l.b.t;

public final class NoticeApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static NoticeApi f113218a = ((NoticeApi) RetrofitFactory.a().a(a.f113228e).a(NoticeApi.class));

    public interface NoticeApi {
        static {
            Covode.recordClassIndex(72792);
        }

        @f(a = "/aweme/v1/digg/list/")
        i<e> fetchLikeList(@t(a = "max_cursor") long j2, @t(a = "min_cursor") long j3, @t(a = "count") int i2, @t(a = "is_new") boolean z, @t(a = "digg_type") int i3, @t(a = "ref_id") String str);

        @f(a = "/tiktok/cla/translation_like/list/v1/")
        i<s> fetchTranslationLikeList(@t(a = "subtitle_id") String str, @t(a = "item_id") String str2, @t(a = "offset") long j2, @t(a = "max_cursor") long j3);
    }

    static {
        Covode.recordClassIndex(72791);
    }
}
