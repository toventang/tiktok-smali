package com.bytedance.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface OnActivityResultCallback {
    static {
        Covode.recordClassIndex(26111);
    }

    void onActivityResult(int i2, int i3, Intent intent);
}
