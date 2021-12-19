package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import f.a.d.f;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122910a;

    static {
        Covode.recordClassIndex(80693);
    }

    n(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122910a = i18nSettingNewVersionActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122910a;
        ((ITpcConsentService) obj).i();
        if (i18nSettingNewVersionActivity.f122762b != null) {
            i18nSettingNewVersionActivity.f122762b.dispose();
        }
    }
}
