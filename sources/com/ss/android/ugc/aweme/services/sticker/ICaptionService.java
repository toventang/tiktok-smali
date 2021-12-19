package com.ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;

public interface ICaptionService {
    static {
        Covode.recordClassIndex(79803);
    }

    boolean getAlwaysShowCaptionStatus();

    String getCaptionCacheDir();

    boolean isConsumptionEnableAutoCaption();

    void setAlwaysShowCaptionStatus(boolean z);
}
