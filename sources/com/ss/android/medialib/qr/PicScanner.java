package com.ss.android.medialib.qr;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.utils.BitmapLoader;

public class PicScanner {
    public long handle = nativeCreate();
    private a listener;
    private boolean success;

    public interface a {
        static {
            Covode.recordClassIndex(36959);
        }
    }

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j2);

    private native void nativeRelease(long j2);

    private native int nativeStart(long j2, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j2);

    public void onResult(boolean z) {
    }

    public boolean isSuccess() {
        return this.success;
    }

    static {
        Covode.recordClassIndex(36958);
        d.c();
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public PicScanner() {
        MethodCollector.i(1675);
        MethodCollector.o(1675);
    }

    public void stop() {
        MethodCollector.i(1741);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(1741);
            return;
        }
        nativeStop(j2);
        MethodCollector.o(1741);
    }

    public EnigmaResult getEnigmaResult() {
        MethodCollector.i(1749);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(1749);
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j2);
        if (!(nativeGetEnigmaResult == null || nativeGetEnigmaResult.getResult() == null)) {
            this.success = true;
        }
        MethodCollector.o(1749);
        return nativeGetEnigmaResult;
    }

    public synchronized void release() {
        MethodCollector.i(1744);
        an.a("PicScanner", "release");
        long j2 = this.handle;
        if (j2 == 0) {
            an.c("PicScanner", "release skip");
            MethodCollector.o(1744);
            return;
        }
        nativeRelease(j2);
        this.handle = 0;
        MethodCollector.o(1744);
    }

    public void setListener(a aVar) {
        this.listener = aVar;
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        MethodCollector.i(1729);
        if (bitmap == null) {
            MethodCollector.o(1729);
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        MethodCollector.o(1729);
        return 0;
    }

    public int start(String str, ScanSettings scanSettings) {
        MethodCollector.i(1692);
        if (this.handle == 0) {
            MethodCollector.o(1692);
            return -1;
        }
        Bitmap bitmap = null;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
            if (loadBitmap != null) {
                int width = loadBitmap.getWidth();
                int height = loadBitmap.getHeight();
                if (width * height > 4000000) {
                    float sqrt = (float) (1.0d / Math.sqrt((double) ((((float) width) * ((float) height)) / 4000000.0f)));
                    Matrix matrix = new Matrix();
                    matrix.postScale(sqrt, sqrt);
                    bitmap = Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                } else {
                    bitmap = loadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
                if (!loadBitmap.isRecycled()) {
                    loadBitmap.recycle();
                }
            }
            int start = start(bitmap, scanSettings);
            MethodCollector.o(1692);
            return start;
        } catch (Exception unused) {
            MethodCollector.o(1692);
            return -2;
        } catch (OutOfMemoryError unused2) {
            MethodCollector.o(1692);
            return -3;
        }
    }
}
