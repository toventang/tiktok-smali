package com.lynx.tasm.ui.image;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface GlobalImageLoadListener {
    static {
        Covode.recordClassIndex(35412);
    }

    void onLoadAttempt(Uri uri);
}
