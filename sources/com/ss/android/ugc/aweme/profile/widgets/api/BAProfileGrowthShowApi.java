package com.ss.android.ugc.aweme.profile.widgets.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface BAProfileGrowthShowApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f117647a = a.f117648a;

    static {
        Covode.recordClassIndex(76105);
    }

    @t(a = "/tiktok/v1/ad/ba/profile/message/show/")
    @g
    f.a.t<BaseResponse> sendMessageIsShown(@e(a = "message_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f117648a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(76106);
        }
    }
}
