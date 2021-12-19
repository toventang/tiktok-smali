package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122912a;

    static {
        Covode.recordClassIndex(80695);
    }

    p(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122912a = i18nSettingNewVersionActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122912a;
        I18nSettingNewVersionActivity.a aVar = (I18nSettingNewVersionActivity.a) obj;
        if (aVar.f122771b && com.bytedance.ies.ugc.appcontext.f.f34637l) {
            aVar.f122770a.h();
        }
        if (i18nSettingNewVersionActivity.f122762b != null) {
            i18nSettingNewVersionActivity.f122762b.dispose();
        }
    }
}
