package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class ae implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122021a;

    static {
        Covode.recordClassIndex(79988);
    }

    ae(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122021a = i18nSettingManageMyAccountActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f122021a.a((in.c() == null || in.c().getCommerceUserLevel() != 2) ? R.string.gl0 : R.string.gky, R.string.gkz);
    }
}
