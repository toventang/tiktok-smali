package com.ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.tux.dialog.b.a;
import com.bytedance.tux.g.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.model.h;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.z;

final /* synthetic */ class ac implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122017a;

    /* renamed from: b  reason: collision with root package name */
    private final o f122018b;

    static {
        Covode.recordClassIndex(79986);
    }

    ac(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, o oVar) {
        this.f122017a = i18nSettingManageMyAccountActivity;
        this.f122018b = oVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122017a;
        h hVar = (h) obj;
        this.f122018b.dismiss();
        int i2 = 0;
        if (hVar == null || hVar.status_code != 0) {
            new b(i18nSettingManageMyAccountActivity).e(R.string.g21).b();
            c cVar = new c();
            if (hVar != null) {
                i2 = hVar.error_code;
            }
            com.ss.android.ugc.aweme.base.o.a("compliance_api_status", cVar.a("error_message", Integer.valueOf(i2)).a(StringSet.type, "/tiktok/v1/edibility/birthdate/").a("status", (Integer) 1).a());
            i18nSettingManageMyAccountActivity.a();
            return;
        }
        com.ss.android.ugc.aweme.base.o.a("compliance_api_status", new c().a(StringSet.type, "/tiktok/v1/edibility/birthdate/").a("status", (Integer) 0).a());
        i18nSettingManageMyAccountActivity.f121982d = hVar;
        i18nSettingManageMyAccountActivity.a();
        if (i18nSettingManageMyAccountActivity.f121982d.getType().intValue() == 3 || i18nSettingManageMyAccountActivity.f121982d.getType().intValue() == 4 || i18nSettingManageMyAccountActivity.f121982d.getType().intValue() == 0 || i18nSettingManageMyAccountActivity.f121982d.getType().intValue() == 5) {
            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(i18nSettingManageMyAccountActivity);
            if (i18nSettingManageMyAccountActivity.f121982d.getType().intValue() != 4 || TextUtils.isEmpty(i18nSettingManageMyAccountActivity.f121982d.getAppealUrl())) {
                bVar.a(R.string.c7, (h.f.a.b<? super a, z>) null);
            } else {
                bVar.a(R.string.qo, new ar(i18nSettingManageMyAccountActivity));
                bVar.a(R.string.a9e, (h.f.a.b<? super a, z>) null);
            }
            ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(i18nSettingManageMyAccountActivity).a(R.string.qm)).d(i18nSettingManageMyAccountActivity.f121982d.getMsg()).a(bVar).a(false)).a().b().show();
            r.a("show_age_edit_ineligible_popup", new d().a("enter_from", "age_edit_page").a("user_age_status", i18nSettingManageMyAccountActivity.f121982d.getType()).f66730a);
            return;
        }
        com.ss.android.ugc.aweme.account.b.d().a(i18nSettingManageMyAccountActivity, new as(i18nSettingManageMyAccountActivity), i18nSettingManageMyAccountActivity.f121982d.getDefaultDoB(), "click_dob_from_manage_account", i18nSettingManageMyAccountActivity.f121982d.getType().intValue(), i18nSettingManageMyAccountActivity.f121982d.getUpperBoundDate(), i18nSettingManageMyAccountActivity.f121982d.getDescType().intValue());
    }
}
