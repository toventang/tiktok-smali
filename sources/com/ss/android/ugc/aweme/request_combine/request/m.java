package com.ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.UserSettingCombineModel;
import h.f.b.l;

public final class m extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120681a;

    static {
        Covode.recordClassIndex(78602);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120681a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return "/aweme/v1/user/settings/";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new com.ss.android.ugc.aweme.request_combine.request.a.f());
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        UserSettingCombineModel userSettingCombineModel;
        com.ss.android.ugc.aweme.setting.serverpush.a.f userSetting;
        boolean z;
        String str;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            userSettingCombineModel = null;
        } else {
            userSettingCombineModel = data.getUserSettingCombineModel();
        }
        if (!(userSettingCombineModel == null || (userSetting = userSettingCombineModel.getUserSetting()) == null || userSetting.status_code != 0)) {
            this.f120681a = userSettingCombineModel;
            if (userSettingCombineModel.httpCode == 200) {
                com.ss.android.ugc.aweme.setting.serverpush.a.f userSetting2 = userSettingCombineModel.getUserSetting();
                l.d(userSetting2, "");
                IAccountUserService g2 = b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    SettingsRequestServiceImpl.i().a(userSetting2);
                    g.a.a();
                    g.c(Integer.valueOf(userSetting2.n));
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    if (userSetting2.n == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    createIIMServicebyMonsterPlugin.setKeyMtInnerPushSwitchOn(z);
                    createIIMServicebyMonsterPlugin.saveChatUserSetting(userSetting2.C, userSetting2.D, userSetting2.E);
                    g.a.a();
                    g.a(Integer.valueOf(userSetting2.q));
                    g.a.a();
                    g.d(Integer.valueOf(userSetting2.f122566e));
                    g.a.a();
                    g.b(Integer.valueOf(userSetting2.V));
                    if (com.ss.android.ugc.aweme.compliance.api.a.d().h() == 1) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    com.ss.android.ugc.aweme.common.r.a("tns_remove_photosensitive_status", new d().a("status", str).f66730a);
                }
            }
            if (userSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
