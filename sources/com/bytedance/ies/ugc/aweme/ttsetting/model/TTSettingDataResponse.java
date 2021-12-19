package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class TTSettingDataResponse {
    private TTSettingData ttSettingData;
    private JSONObject ttSettingDataJSONObject;

    static {
        Covode.recordClassIndex(21104);
    }

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData tTSettingData, JSONObject jSONObject) {
        l.c(tTSettingData, "");
        l.c(jSONObject, "");
        this.ttSettingData = tTSettingData;
        this.ttSettingDataJSONObject = jSONObject;
    }
}
