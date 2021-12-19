package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.io.OutputStream;

public interface c {
    static {
        Covode.recordClassIndex(29203);
    }

    boolean isWebpNativelySupported(com.facebook.h.c cVar);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i2);

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream);
}
