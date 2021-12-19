package com.ss.android.ugc.aweme.services.external.ui;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IPublishPageService {
    static {
        Covode.recordClassIndex(79697);
    }

    void startPublish(Activity activity, PublishConfig publishConfig);
}
