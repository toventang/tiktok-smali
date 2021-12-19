package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface TeenageModeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106928a = a.f106929a;

    static {
        Covode.recordClassIndex(68392);
    }

    @t(a = "/tiktok/v1/kids/user/check/password/")
    @g
    f.a.t<BaseResponse> checkTeenagePassword(@e(a = "password") String str);

    @t(a = "/tiktok/v1/kids/user/set/settings/")
    @g
    f.a.t<a> setMinorSettings(@e(a = "settings") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f106929a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68393);
        }
    }
}
