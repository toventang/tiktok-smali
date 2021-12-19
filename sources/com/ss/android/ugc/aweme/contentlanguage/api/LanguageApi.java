package com.ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface LanguageApi {
    static {
        Covode.recordClassIndex(48459);
    }

    @f(a = "/aweme/v1/config/list/")
    t<ConfigListResponse> getUnloginContentLanguage(@l.b.t(a = "type") String str, @l.b.t(a = "content_language") String str2);

    @f(a = "/aweme/v1/config/list/")
    t<ConfigListResponse> getUserConfig(@l.b.t(a = "type") String str);

    @o(a = "/aweme/v1/user/set/settings/")
    @e
    t<BaseResponse> setContentLanguage(@c(a = "field") String str, @c(a = "content_language") String str2, @c(a = "action_type") int i2);

    @o(a = "/aweme/v1/user/set/settings/")
    @e
    t<BaseResponse> setContentLanguageDialogShown(@c(a = "field") String str);

    @o(a = "/aweme/v1/user/set/settings/")
    @e
    t<BaseResponse> setUnloginContentPreference(@c(a = "field") String str, @c(a = "settings_not_login") String str2);
}
