package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.common.d.i;
import com.facebook.h.c;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.q;
import com.facebook.imagepipeline.q.a;
import com.facebook.imagepipeline.q.b;
import java.io.InputStream;
import java.io.OutputStream;

public class NativeJpegTranscoder implements b {
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i4);

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i4);

    @Override // com.facebook.imagepipeline.q.b
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    static {
        Covode.recordClassIndex(29198);
        com.facebook.imageutils.b.a("imagepipeline");
    }

    @Override // com.facebook.imagepipeline.q.b
    public boolean canTranscode(c cVar) {
        if (cVar == com.facebook.h.b.f47621a) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i2, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i2;
        this.mUseDownsamplingRatio = z2;
    }

    @Override // com.facebook.imagepipeline.q.b
    public boolean canResize(e eVar, com.facebook.imagepipeline.common.e eVar2, d dVar) {
        if (eVar2 == null) {
            eVar2 = com.facebook.imagepipeline.common.e.f47751b;
        }
        if (com.facebook.imagepipeline.q.d.a(eVar2, dVar, eVar, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MethodCollector.i(14464);
        boolean z6 = true;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i3 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (i4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        i.a(z3);
        if (i4 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        i.a(z4);
        if (i2 < 0 || i2 > 270 || i2 % 90 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        i.a(z5);
        if (i3 == 8 && i2 == 0) {
            z6 = false;
        }
        i.a(z6, "no transformation requested");
        nativeTranscodeJpeg((InputStream) i.a(inputStream), (OutputStream) i.a(outputStream), i2, i3, i4);
        MethodCollector.o(14464);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MethodCollector.i(14477);
        boolean z6 = false;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i3 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (i4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        i.a(z3);
        if (i4 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        i.a(z4);
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        i.a(z5);
        if (!(i3 == 8 && i2 == 1)) {
            z6 = true;
        }
        i.a(z6, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) i.a(inputStream), (OutputStream) i.a(outputStream), i2, i3, i4);
        MethodCollector.o(14477);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.q.b
    public a transcode(e eVar, OutputStream outputStream, com.facebook.imagepipeline.common.e eVar2, d dVar, c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (eVar2 == null) {
            eVar2 = com.facebook.imagepipeline.common.e.f47751b;
        }
        int a2 = q.a(eVar2, dVar, eVar, this.mMaxBitmapSize);
        try {
            int a3 = com.facebook.imagepipeline.q.d.a(eVar2, dVar, eVar, this.mResizingEnabled);
            int i2 = 1;
            int max = Math.max(1, 8 / a2);
            if (this.mUseDownsamplingRatio) {
                a3 = max;
            }
            InputStream b2 = eVar.b();
            if (com.facebook.imagepipeline.q.d.f48460a.contains(Integer.valueOf(eVar.e()))) {
                transcodeJpegWithExifOrientation(b2, outputStream, com.facebook.imagepipeline.q.d.b(eVar2, eVar), a3, num.intValue());
            } else {
                transcodeJpeg(b2, outputStream, com.facebook.imagepipeline.q.d.a(eVar2, eVar), a3, num.intValue());
            }
            com.facebook.common.d.b.a(b2);
            if (a2 != 1) {
                i2 = 0;
            }
            return new a(i2);
        } catch (Throwable th) {
            com.facebook.common.d.b.a((InputStream) null);
            throw th;
        }
    }
}
