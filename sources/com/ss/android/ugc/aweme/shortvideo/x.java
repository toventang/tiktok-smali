package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ai;

public interface x<T extends ai> {
    static {
        Covode.recordClassIndex(86962);
    }

    void onError(et etVar);

    void onParallelPublishCancel();

    void onParallelPublishPause();

    void onParallelPublishResume();

    void onProgressUpdate(int i2, boolean z);

    void onSuccess(T t, boolean z);

    void onSynthetiseSuccess(String str);
}
