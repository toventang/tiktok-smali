package com.google.ar.core;

import android.media.ImageReader;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    static final ImageReader.OnImageAvailableListener f53463a = new j();

    static {
        Covode.recordClassIndex(33105);
    }

    private j() {
    }

    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
