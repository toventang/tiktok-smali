package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IActivityNameService {
    static {
        Covode.recordClassIndex(79849);
    }

    Class<? extends Activity> getDraftBoxActivity();

    Class<? extends Activity> getVideoEditActivityClass();

    Class<? extends Activity> getVideoPublishActivityClass();

    Class<? extends Activity> getVideoPublishPreviewActivityClass();

    Class<? extends Activity> getVideoRecordActivityClass();

    Class<? extends Activity> getVideoRecordPermissionActivityClass();
}
