package com.ss.android.ugc.aweme.video.bitrate;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import h.f.b.l;

public final class RateSettingCombineModel extends a {
    @c(a = "body")
    private RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a> rateSetting;

    static {
        Covode.recordClassIndex(93814);
    }

    public final RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a> getRateSetting() {
        return this.rateSetting;
    }

    public final void setRateSetting(RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a> rateSettingsResponse) {
        l.d(rateSettingsResponse, "");
        this.rateSetting = rateSettingsResponse;
    }

    public RateSettingCombineModel(RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a> rateSettingsResponse) {
        l.d(rateSettingsResponse, "");
        this.rateSetting = rateSettingsResponse;
    }
}
