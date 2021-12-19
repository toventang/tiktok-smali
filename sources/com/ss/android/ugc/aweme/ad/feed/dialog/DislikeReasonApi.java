package com.ss.android.ugc.aweme.ad.feed.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface DislikeReasonApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65817a = a.f65819b;

    static {
        Covode.recordClassIndex(40497);
    }

    @t(a = "/tiktok/v1/ad/experience/dislike/")
    @g
    f.a.t<BaseResponse> submitReason(@e(a = "item_id") String str, @e(a = "ad_id") String str2, @e(a = "creative_id") String str3, @e(a = "dislike_reasons") String str4, @e(a = "log_extra") String str5, @e(a = "room_id") String str6);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final String f65818a = ("https://" + d.f34604k.f34586a);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f65819b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40498);
        }
    }
}
