package com.ss.android.ugc.aweme.browserecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;
import l.b.f;

final class BrowseRecordSettingApi {

    /* renamed from: a  reason: collision with root package name */
    public static final BrowseRecordSettingApi f68792a = new BrowseRecordSettingApi();

    /* renamed from: b  reason: collision with root package name */
    private static final Api f68793b;

    interface Api {
        static {
            Covode.recordClassIndex(42369);
        }

        @f(a = "/aweme/v1/user/set/settings/")
        t<BaseResponse> setSetting(@l.b.t(a = "field") String str, @l.b.t(a = "value") int i2);
    }

    private BrowseRecordSettingApi() {
    }

    static {
        Covode.recordClassIndex(42368);
        String str = b.f59141e;
        l.b(str, "");
        f68793b = (Api) a.a().a(str).a(Api.class);
    }
}
