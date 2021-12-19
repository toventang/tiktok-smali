package com.ss.android.ugc.aweme.setting.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.google.c.h.a.q;
import com.google.gson.l;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;
import f.a.n;
import l.b.f;
import l.b.t;

public interface SettingApi {
    static {
        Covode.recordClassIndex(80027);
    }

    @f(a = "/common")
    n<u<l>> queryABTestCommon(@t(a = "aid") String str, @t(a = "device_id") String str2, @t(a = "client_version") long j2, @t(a = "new_cluster") int i2, @t(a = "cpu_model") String str3, @t(a = "oid") int i3);

    @f(a = "/aweme/v1/settings/")
    q<l> queryRawSetting(@t(a = "cpu_model") String str, @t(a = "oid") int i2, @t(a = "last_settings_version") String str2);

    @f(a = "/aweme/v1/settings/")
    q<IESSettings> querySetting(@t(a = "cpu_model") String str, @t(a = "oid") int i2, @t(a = "last_settings_version") String str2);

    @f(a = "/passport/password/has_set/")
    i<SettingUserHasSetPwd> queryUserHasSetPwd();

    @f(a = "/service/settings/v3/")
    n<u<l>> queryV3Setting(@t(a = "cpu_model") String str, @t(a = "oid") int i2, @t(a = "last_settings_version") String str2);
}
