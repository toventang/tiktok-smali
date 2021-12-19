package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public interface OnGetVideoCoverCallback {
    static {
        Covode.recordClassIndex(79864);
    }

    void onGetVideoCoverFailed(int i2);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}
