package com.ss.android.ugc.aweme.feed.ui.masklayer2.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.o;

public final class DislikeReasonApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RealApi f94922a = ((RealApi) a.a(b.f59141e, RealApi.class));

    public interface RealApi {
        static {
            Covode.recordClassIndex(60203);
        }

        @o(a = "/aweme/v1/commit/dislike/item/")
        @e
        com.bytedance.retrofit2.b<BaseResponse> disLikeReason(@d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(60202);
    }
}
