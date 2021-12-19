package com.facebook.drawee.c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

public class c<INFO> implements d<INFO> {
    private static final d<Object> NO_OP_LISTENER = new c();

    @Override // com.facebook.drawee.c.d
    public void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.c.d
    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    @Override // com.facebook.drawee.c.d
    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.c.d
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // com.facebook.drawee.c.d
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.c.d
    public void onSubmit(String str, Object obj) {
    }

    public static <INFO> d<INFO> getNoOpListener() {
        return (d<INFO>) NO_OP_LISTENER;
    }

    static {
        Covode.recordClassIndex(28753);
    }
}
