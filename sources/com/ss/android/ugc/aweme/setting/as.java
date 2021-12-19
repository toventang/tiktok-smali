package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.bg;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class as implements bg {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122078a;

    static {
        Covode.recordClassIndex(80036);
    }

    as(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122078a = i18nSettingManageMyAccountActivity;
    }

    @Override // com.ss.android.ugc.aweme.bg
    public final void a(String str, boolean z) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122078a;
        if (z) {
            new b(i18nSettingManageMyAccountActivity).e(R.string.ql).b(R.raw.icon_tick_fill_small).c(androidx.core.content.b.c(i18nSettingManageMyAccountActivity, R.color.a9)).b();
            i18nSettingManageMyAccountActivity.f121991m.a(i18nSettingManageMyAccountActivity.a(str));
        }
    }
}
