package com.ss.android.ugc.aweme.compliance.business.vzbv.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final PrivacyAccountTipActivity f77271a;

    static {
        Covode.recordClassIndex(47782);
    }

    a(PrivacyAccountTipActivity privacyAccountTipActivity) {
        this.f77271a = privacyAccountTipActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        PrivacyAccountTipActivity privacyAccountTipActivity = this.f77271a;
        SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().b(true);
        if (!privacyAccountTipActivity.isDestroyed()) {
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = PrivacyAccountTipActivity.b();
            }
            if (!j.f107226e) {
                new b(privacyAccountTipActivity).a(privacyAccountTipActivity.getString(R.string.de2)).b();
                com.ss.android.ugc.aweme.compliance.api.a.i().d();
                SettingServiceImpl.v().providePushSettingChangePresenter().a("notify_private_account", 1);
                com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("privacy_account_setting_confirm", privacyAccountTipActivity.f77266a);
                r.a("tns_privacy_notify_confirm_check", new d().f66730a);
            }
        }
        if (privacyAccountTipActivity.f77267b == null) {
            privacyAccountTipActivity.a();
        }
        privacyAccountTipActivity.f77267b.a();
        privacyAccountTipActivity.finish();
        com.ss.android.ugc.aweme.compliance.api.a.i().d();
        SettingServiceImpl.v().providePushSettingChangePresenter().a("notify_private_account", 1);
        com.ss.android.ugc.aweme.compliance.business.vzbv.a.a.a("privacy_account_setting_confirm", privacyAccountTipActivity.f77266a);
        r.a("tns_privacy_notify_confirm_check", new d().f66730a);
    }
}
