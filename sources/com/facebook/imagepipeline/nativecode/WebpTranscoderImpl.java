package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.h.b;
import com.facebook.h.c;
import java.io.InputStream;
import java.io.OutputStream;

public class WebpTranscoderImpl implements c {
    static {
        Covode.recordClassIndex(29200);
    }

    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i2);

    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    @Override // com.facebook.imagepipeline.nativecode.c
    public boolean isWebpNativelySupported(c cVar) {
        if (cVar == b.f47626f) {
            int i2 = Build.VERSION.SDK_INT;
            return true;
        } else if (cVar == b.f47627g || cVar == b.f47628h || cVar == b.f47629i) {
            return com.facebook.common.l.c.f47138c;
        } else {
            if (cVar == b.f47630j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(9757);
        b.a();
        nativeTranscodeWebpToPng((InputStream) i.a(inputStream), (OutputStream) i.a(outputStream));
        MethodCollector.o(9757);
    }

    @Override // com.facebook.imagepipeline.nativecode.c
    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i2) {
        MethodCollector.i(9595);
        b.a();
        nativeTranscodeWebpToJpeg((InputStream) i.a(inputStream), (OutputStream) i.a(outputStream), i2);
        MethodCollector.o(9595);
    }
}
