package com.ss.android.ugc.aweme.compliance.protection.familypairing.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.a.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import java.util.Map;
import l.b.c;
import l.b.d;
import l.b.e;
import l.b.f;
import l.b.o;

public final class FamilyPairingApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f77989a;

    /* renamed from: b  reason: collision with root package name */
    public static API f77990b;

    public interface API {
        static {
            Covode.recordClassIndex(48344);
        }

        @f(a = "/aweme/v2/guardian/platform/dynamic/password/")
        t<a> getDynamicPassword(@l.b.t(a = "child_user_id") String str, @l.b.t(a = "sec_child_user_id") String str2);

        @o(a = "/aweme/v1/guardian/platform/child/restriction/management/")
        @e
        t<BaseResponse> modifyChildRestriction(@d Map<String, String> map);

        @o(a = "/aweme/v1/guardian/platform/child/manage/")
        @e
        t<BaseResponse> modifyChildSetting(@d Map<String, String> map);

        @o(a = "/aweme/v2/guardian/platform/verify/password/")
        @e
        t<BaseResponse> verifyPassword(@c(a = "pass_code") String str);
    }

    static {
        Covode.recordClassIndex(48343);
        String str = Api.f66569d;
        f77989a = str;
        f77990b = (API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(API.class);
    }

    public static t<BaseResponse> a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return null;
        }
        map.put("user_id", str);
        map.put("sec_user_id", str2);
        return f77990b.modifyChildSetting(map);
    }
}
