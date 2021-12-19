package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.g;
import com.ss.android.ugc.aweme.setting.serverpush.b.j;

public abstract class BaseSettingServiceImpl implements ISettingService {
    static {
        Covode.recordClassIndex(80497);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public String getReleaseBuildString() {
        return i.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public c<b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePrivateSettingChangePresenter() {
        return new g();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public c<b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePushSettingChangePresenter() {
        return new com.ss.android.ugc.aweme.setting.serverpush.b.i();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public c<b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter() {
        return new j();
    }
}
