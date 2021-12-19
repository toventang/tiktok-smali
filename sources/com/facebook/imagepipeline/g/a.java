package com.facebook.imagepipeline.g;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;

public final class a extends RuntimeException {
    private final e mEncodedImage;

    static {
        Covode.recordClassIndex(29002);
    }

    public final e getEncodedImage() {
        return this.mEncodedImage;
    }

    public a(String str, e eVar) {
        super(str);
        this.mEncodedImage = eVar;
    }

    public a(String str, Throwable th, e eVar) {
        super(str, th);
        this.mEncodedImage = eVar;
    }
}
