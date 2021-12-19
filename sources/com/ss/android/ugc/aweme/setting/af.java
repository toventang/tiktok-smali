package com.ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class af implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122022a;

    static {
        Covode.recordClassIndex(79989);
    }

    af(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122022a = i18nSettingManageMyAccountActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122022a;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            a aVar = (a) th;
            if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                new com.ss.android.ugc.aweme.tux.a.i.a(i18nSettingManageMyAccountActivity).a(R.string.bpa).a();
                return;
            }
            a.C0731a aVar2 = new a.C0731a(i18nSettingManageMyAccountActivity);
            aVar2.f33402b = aVar.getErrorMsg();
            aVar2.a(R.string.gl1, aq.f122076a, false).a().c();
            return;
        }
        i18nSettingManageMyAccountActivity.b();
    }
}
