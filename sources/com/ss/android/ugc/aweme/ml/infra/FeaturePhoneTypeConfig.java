package com.ss.android.ugc.aweme.ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class FeaturePhoneTypeConfig extends FeatureTypeConfig {
    @c(a = "need_phone_features")
    private String needPhoneFeatures = "all";
    private List<String> phoneFeatureList;

    static {
        Covode.recordClassIndex(70957);
    }

    public final String getNeedPhoneFeatures() {
        return this.needPhoneFeatures;
    }

    public final boolean isNeedAllPhoneFeatures() {
        return TextUtils.equals(this.needPhoneFeatures, "all");
    }

    public final List<String> getPhoneFeatureList() {
        if (TextUtils.isEmpty(this.needPhoneFeatures)) {
            return null;
        }
        if (this.phoneFeatureList == null) {
            this.phoneFeatureList = p.b(this.needPhoneFeatures, new String[]{"|"});
        }
        return this.phoneFeatureList;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig
    public final String toString() {
        return "PhoneType{super=" + super.toString() + ", needPhoneFeatures=" + this.needPhoneFeatures + '}';
    }

    public final void setNeedPhoneFeatures(String str) {
        l.d(str, "");
        this.needPhoneFeatures = str;
    }
}
