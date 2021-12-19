package com.ss.android.medialib.photomovie;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ttve.nativePort.d;

public class MovieCover {
    private long mHandle;

    private native long nativeCreate(int i2, int i3, int i4);

    private native void nativeDestroy(long j2);

    private native CoverInfo nativeGetCover(long j2, String[] strArr, String str, String str2, float f2, int i2, long j3, int i3, int i4);

    static {
        Covode.recordClassIndex(36920);
        d.d();
    }

    public MovieCover() {
        this(new a());
    }

    public void destroy() {
        MethodCollector.i(4160);
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
        MethodCollector.o(4160);
    }

    public MovieCover(a aVar) {
        MethodCollector.i(5239);
        this.mHandle = nativeCreate(aVar.f59766a, aVar.f59767b, aVar.f59768c);
        MethodCollector.o(5239);
    }

    public CoverInfo getCover(String[] strArr, String str, int i2, long j2, int i3, int i4) {
        MethodCollector.i(3984);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, null, 1.0f, i2, j2, i3, i4);
        MethodCollector.o(3984);
        return nativeGetCover;
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f2, int i2, long j2) {
        MethodCollector.i(3986);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, str2, f2, i2, j2, 720, 1280);
        MethodCollector.o(3986);
        return nativeGetCover;
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f2, int i2, long j2, int i3, int i4) {
        MethodCollector.i(4156);
        CoverInfo nativeGetCover = nativeGetCover(this.mHandle, strArr, str, str2, f2, i2, j2, i3, i4);
        MethodCollector.o(4156);
        return nativeGetCover;
    }
}
