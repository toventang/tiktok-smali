package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class t implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122918a;

    static {
        Covode.recordClassIndex(80699);
    }

    t(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122918a = i18nSettingNewVersionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122918a;
        b.a();
        b.f62864a.k().updateMethodInfo("allow_one_key_login", true);
        i18nSettingNewVersionActivity.E();
        r.a("remember_login_info_confirm", new d().a("user_id", b.g().getCurUserId()).a("enter_from", "logout").f66730a);
    }
}
