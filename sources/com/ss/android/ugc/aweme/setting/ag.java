package com.ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122023a;

    /* renamed from: b  reason: collision with root package name */
    private final int f122024b = 0;

    static {
        Covode.recordClassIndex(79990);
    }

    ag(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122023a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122023a;
        b.i().switchProAccount(this.f122024b, null, null, 0, new ap(i18nSettingManageMyAccountActivity, dialogInterface));
    }
}
