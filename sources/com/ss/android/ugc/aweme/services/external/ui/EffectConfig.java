package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class EffectConfig implements Serializable {
    private String effectImage;
    private String effectMetaInfo;

    static {
        Covode.recordClassIndex(79692);
    }

    public final String getEffectImage() {
        return this.effectImage;
    }

    public final String getEffectMetaInfo() {
        return this.effectMetaInfo;
    }

    public final void setEffectImage(String str) {
        this.effectImage = str;
    }

    public final void setEffectMetaInfo(String str) {
        this.effectMetaInfo = str;
    }
}
