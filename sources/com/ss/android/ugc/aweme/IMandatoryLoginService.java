package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface IMandatoryLoginService {
    static {
        Covode.recordClassIndex(38378);
    }

    boolean getHasRequestComplianceApi();

    Bundle getLoginActivityBundle();

    void setHasRequestComplianceApi(boolean z);

    boolean shouldShowForcedLogin();

    boolean shouldShowLoginTabFirst();
}
