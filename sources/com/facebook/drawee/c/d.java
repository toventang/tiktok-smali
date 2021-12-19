package com.facebook.drawee.c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

public interface d<INFO> {
    static {
        Covode.recordClassIndex(28754);
    }

    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
