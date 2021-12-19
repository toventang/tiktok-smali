package com.ss.android.ugc.aweme.kids.commonfeed.digg;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.a.a;
import f.a.t;

public final class DiggApi {

    /* renamed from: a  reason: collision with root package name */
    public static final DiggApi f106018a = new DiggApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RetrofitApi f106019b = ((RetrofitApi) RetrofitFactory.a().a(a.f105880a).a(RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67828);
        }

        @h(a = "/tiktok/v1/kids/commit/item/digg/")
        t<BaseResponse> diggAweme(@z(a = "aweme_id") String str, @z(a = "type") int i2);
    }

    private DiggApi() {
    }

    static {
        Covode.recordClassIndex(67827);
    }

    public static t<BaseResponse> a(String str, int i2) {
        return f106019b.diggAweme(str, i2);
    }
}
