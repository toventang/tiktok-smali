package com.ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

final /* synthetic */ class ap implements IAccountService.g {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122033a;

    /* renamed from: b  reason: collision with root package name */
    private final DialogInterface f122034b;

    static {
        Covode.recordClassIndex(79999);
    }

    ap(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogInterface dialogInterface) {
        this.f122033a = i18nSettingManageMyAccountActivity;
        this.f122034b = dialogInterface;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        this.f122033a.a(this.f122034b, i2, i3);
    }
}
