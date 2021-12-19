package com.ss.android.ugc.aweme.kids.setting.api;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;

public interface ISettingService {
    static {
        Covode.recordClassIndex(68302);
    }

    void a(Activity activity);

    void a(KidsComplianceSettings kidsComplianceSettings);
}
