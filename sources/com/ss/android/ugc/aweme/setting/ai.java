package com.ss.android.ugc.aweme.setting;

import android.app.Dialog;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.sdk.a.f.h;
import com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi;
import com.ss.android.ugc.aweme.setting.api.c;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.a.b;
import h.f.b.l;
import h.z;

final /* synthetic */ class ai implements b {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingManageMyAccountActivity f122026a;

    static {
        Covode.recordClassIndex(79992);
    }

    ai(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f122026a = i18nSettingManageMyAccountActivity;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f122026a;
        o oVar = new o(i18nSettingManageMyAccountActivity);
        oVar.show();
        IUnbindValidateApi iUnbindValidateApi = IUnbindValidateApi.a.f122054a;
        String a2 = h.a(com.ss.android.c.b.f59141e + "/passport/mobile/unbind_validate/");
        l.b(a2, "");
        iUnbindValidateApi.unbindMobileValidate(a2).a(new g<c, Object>(oVar) {
            /* class com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f122000a;

            static {
                Covode.recordClassIndex(79971);
            }

            @Override // b.g
            public final Object then(i<c> iVar) {
                this.f122000a.dismiss();
                if (!ai.a(iVar) || iVar.d().f122073b == null) {
                    I18nSettingManageMyAccountActivity.this.c();
                    I18nSettingManageMyAccountActivity.a("unlink", true, false, -1);
                    return null;
                }
                c.a aVar = iVar.d().f122073b;
                int i2 = aVar.f122074a;
                I18nSettingManageMyAccountActivity.a("unlink", true, false, i2);
                if (i2 == 0) {
                    I18nSettingManageMyAccountActivity.this.f121981c = true;
                    com.ss.android.ugc.aweme.account.b.e().unbindPhone(I18nSettingManageMyAccountActivity.this, aVar.f122075b, "manage_my_account");
                    return null;
                }
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                i18nSettingManageMyAccountActivity.b(i18nSettingManageMyAccountActivity.a(true, aVar.f122074a));
                return null;
            }

            {
                this.f122000a = r2;
            }
        }, i.f4826c, null);
        return z.f158842a;
    }
}
