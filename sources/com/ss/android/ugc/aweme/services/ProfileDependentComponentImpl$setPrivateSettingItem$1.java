package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.services.f;
import f.a.ad;
import f.a.af;
import h.f.b.l;

final class ProfileDependentComponentImpl$setPrivateSettingItem$1<T> implements af {
    final /* synthetic */ String $field;
    final /* synthetic */ int $value;

    static {
        Covode.recordClassIndex(79555);
    }

    ProfileDependentComponentImpl$setPrivateSettingItem$1(String str, int i2) {
        this.$field = str;
        this.$value = i2;
    }

    @Override // f.a.af
    public final void subscribe(ad<BaseResponse> adVar) {
        l.d(adVar, "");
        adVar.a(f.f122672a.a(this.$field, this.$value));
    }
}
