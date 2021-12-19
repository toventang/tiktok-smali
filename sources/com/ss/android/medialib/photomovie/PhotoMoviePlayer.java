package com.ss.android.medialib.photomovie;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;

public class PhotoMoviePlayer {

    /* renamed from: a  reason: collision with root package name */
    private long f59764a = nativeCreatePlayer();

    /* renamed from: b  reason: collision with root package name */
    private Context f59765b;

    private native long nativeCreatePlayer();

    private native long nativeGetDuration(long j2);

    private native void nativeOnSizeChanged(long j2, int i2, int i3);

    private native int nativePause(long j2);

    private native void nativePlayCover(long j2, int i2, int i3);

    private native int nativePrepare(long j2, String[] strArr, String str, int i2, int i3, int i4, int i5, int i6);

    private native void nativeRelease(long j2);

    private native int nativeReset(long j2);

    private native int nativeResume(long j2);

    private native void nativeSeekTo(long j2, long j3);

    private native void nativeSetFilter(long j2, String str, String str2, float f2);

    private native void nativeSetLoop(long j2, boolean z);

    private native void nativeSetOrientation(long j2, int i2);

    private native int nativeStart(long j2, Surface surface, int i2, int i3);

    private native void nativeStop(long j2);

    private native void nativeSwitchPlayMode(long j2, int i2);

    static {
        Covode.recordClassIndex(36925);
        d.d();
    }

    public PhotoMoviePlayer(Context context) {
        MethodCollector.i(3512);
        this.f59765b = context;
        MethodCollector.o(3512);
    }
}
