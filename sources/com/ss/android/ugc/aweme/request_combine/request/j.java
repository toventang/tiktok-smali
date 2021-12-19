package com.ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.b.f;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import h.f.b.l;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    private VideoBitRateABManager f120675a;

    /* renamed from: b  reason: collision with root package name */
    private a f120676b;

    static {
        Covode.recordClassIndex(78597);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120676b;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        if (f.a()) {
            return "/aweme/v1/rate/settings/";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        this.f120675a = VideoBitRateABManager.f143220a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        RateSettingCombineModel rateSettingCombineModel;
        RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a> rateSetting;
        SettingCombineDataModel data;
        this.f120675a = VideoBitRateABManager.f143220a;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            rateSettingCombineModel = null;
        } else {
            rateSettingCombineModel = data.getRateSettingCombineModel();
        }
        if (!(rateSettingCombineModel == null || (rateSetting = rateSettingCombineModel.getRateSetting()) == null || rateSetting.status_code != 0)) {
            this.f120676b = rateSettingCombineModel;
            if (rateSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
