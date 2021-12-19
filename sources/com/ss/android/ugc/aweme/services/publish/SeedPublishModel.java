package com.ss.android.ugc.aweme.services.publish;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class SeedPublishModel {
    private String dataType;
    private String referSeedId;
    private String referSeedName;
    private String seedId;
    private String seedName;

    static {
        Covode.recordClassIndex(79789);
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getReferSeedId() {
        return this.referSeedId;
    }

    public String getReferSeedName() {
        return this.referSeedName;
    }

    public String getSeedName() {
        return this.seedName;
    }

    public String getSeedId() {
        if (!TextUtils.isEmpty(this.seedId)) {
            return this.seedId;
        }
        return "0";
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setReferSeedId(String str) {
        this.referSeedId = str;
    }

    public void setReferSeedName(String str) {
        this.referSeedName = str;
    }

    public void setSeedId(String str) {
        this.seedId = str;
    }

    public void setSeedName(String str) {
        this.seedName = str;
    }
}
