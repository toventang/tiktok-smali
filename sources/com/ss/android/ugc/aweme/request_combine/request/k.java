package com.ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.ShareSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.a.d;
import com.ss.android.ugc.aweme.setting.cg;
import com.ss.android.ugc.aweme.setting.model.p;
import h.f.b.l;

public final class k extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120677a;

    static {
        Covode.recordClassIndex(78598);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/aweme/v2/platform/share/settings/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120677a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new d());
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        ShareSettingCombineModel shareSettingCombineModel;
        p shareSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            shareSettingCombineModel = null;
        } else {
            shareSettingCombineModel = data.getShareSettingCombineModel();
        }
        if (!(shareSettingCombineModel == null || (shareSetting = shareSettingCombineModel.getShareSetting()) == null || shareSetting.status_code != 0)) {
            this.f120677a = shareSettingCombineModel;
            if (shareSettingCombineModel.httpCode == 200) {
                cg.a().a((Object) shareSettingCombineModel.getShareSetting());
            }
            if (shareSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
