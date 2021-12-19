package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.TEBundle;

public class VsyncModule extends NativeObject {
    private InternalObserver mInternalObserver;

    public interface Observer {
        static {
            Covode.recordClassIndex(99843);
        }

        void onEvent(int i2, int i3, long j2, String str);
    }

    static {
        Covode.recordClassIndex(99841);
    }

    private native void nativeAdjustLastTimeMills(long j2, String str, long j3);

    private native long nativeComputeDiffAtNowMills(long j2, String str);

    private native long nativeComputeDiffMs(long j2, String str, String str2);

    private native long nativeConvertToNowMills(long j2, String str, long j3);

    private native long nativeGetFirstFrameTimestampMs(long j2, String str);

    private native long nativeGetMaxIntevalMs(long j2, String str);

    private native TEBundle nativeGetOption(long j2);

    private native boolean nativeIsEnable(long j2);

    private native long nativeLastOriginTimeMills(long j2, String str);

    private native long nativeLastTimeMills(long j2, String str);

    private static native long nativeNowNanos();

    private native void nativeRegisertObserver(long j2, InternalObserver internalObserver);

    private native void nativeRelease(long j2);

    private native void nativeReset(long j2);

    private native void nativeResetWithTrack(long j2, String str);

    private native void nativeSetEnable(long j2, boolean z);

    private native void nativeSetOption(long j2, TEBundle tEBundle);

    private native void nativeSetupOriginAudioTrackId(long j2, String str);

    private native void nativeSetupOriginVideoTrackId(long j2, String str);

    private native void nativeUnRegisertObserver(long j2, InternalObserver internalObserver);

    private native long nativeUpdateTimeMs(long j2, String str, long j3);

    public String toString() {
        return super.toString();
    }

    public static long nowNanos() {
        MethodCollector.i(14385);
        long nativeNowNanos = nativeNowNanos();
        MethodCollector.o(14385);
        return nativeNowNanos;
    }

    public TEBundle getOption() {
        MethodCollector.i(14400);
        TEBundle nativeGetOption = nativeGetOption(this.mNativeObj);
        MethodCollector.o(14400);
        return nativeGetOption;
    }

    public boolean isEnable() {
        MethodCollector.i(14403);
        boolean nativeIsEnable = nativeIsEnable(this.mNativeObj);
        MethodCollector.o(14403);
        return nativeIsEnable;
    }

    public void reset() {
        MethodCollector.i(14596);
        nativeReset(this.mNativeObj);
        MethodCollector.o(14596);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(9737);
        if (this.mInternalObserver != null) {
            nativeUnRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0;
        InternalObserver internalObserver = this.mInternalObserver;
        if (internalObserver != null) {
            internalObserver.release();
            this.mInternalObserver = null;
        }
        MethodCollector.o(9737);
    }

    class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99842);
        }

        public InternalObserver() {
        }

        public synchronized void registerObserver(Observer observer) {
            MethodCollector.i(13870);
            this.mObserver = observer;
            MethodCollector.o(13870);
        }

        @Override // com.ss.avframework.engine.VsyncModule.Observer
        public void onEvent(int i2, int i3, long j2, String str) {
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onEvent(i2, i3, j2, str);
            }
        }
    }

    public VsyncModule(long j2) {
        setNativeObj(j2);
    }

    public long computeDiffAtNowMills(String str) {
        MethodCollector.i(14587);
        long nativeComputeDiffAtNowMills = nativeComputeDiffAtNowMills(this.mNativeObj, str);
        MethodCollector.o(14587);
        return nativeComputeDiffAtNowMills;
    }

    public long getFirstFrameTimestampMs(String str) {
        MethodCollector.i(14620);
        long nativeGetFirstFrameTimestampMs = nativeGetFirstFrameTimestampMs(this.mNativeObj, str);
        MethodCollector.o(14620);
        return nativeGetFirstFrameTimestampMs;
    }

    public long getMaxIntevalMs(String str) {
        MethodCollector.i(9578);
        long nativeGetMaxIntevalMs = nativeGetMaxIntevalMs(this.mNativeObj, str);
        MethodCollector.o(9578);
        return nativeGetMaxIntevalMs;
    }

    public long lastOriginTimeMills(String str) {
        MethodCollector.i(14533);
        long nativeLastOriginTimeMills = nativeLastOriginTimeMills(this.mNativeObj, str);
        MethodCollector.o(14533);
        return nativeLastOriginTimeMills;
    }

    public long lastTimeMills(String str) {
        MethodCollector.i(14495);
        long nativeLastTimeMills = nativeLastTimeMills(this.mNativeObj, str);
        MethodCollector.o(14495);
        return nativeLastTimeMills;
    }

    public void setEnable(boolean z) {
        MethodCollector.i(14457);
        nativeSetEnable(this.mNativeObj, z);
        MethodCollector.o(14457);
    }

    public void setOption(TEBundle tEBundle) {
        MethodCollector.i(14401);
        nativeSetOption(this.mNativeObj, tEBundle);
        MethodCollector.o(14401);
    }

    public void setupOriginAudioTrackId(String str) {
        MethodCollector.i(14471);
        nativeSetupOriginAudioTrackId(this.mNativeObj, str);
        MethodCollector.o(14471);
    }

    public void setupOriginVideoTrackId(String str) {
        MethodCollector.i(14493);
        nativeSetupOriginVideoTrackId(this.mNativeObj, str);
        MethodCollector.o(14493);
    }

    public void reset(String str) {
        MethodCollector.i(14603);
        nativeResetWithTrack(this.mNativeObj, str);
        MethodCollector.o(14603);
    }

    public synchronized void registerObserver(Observer observer) {
        MethodCollector.i(14367);
        if (this.mInternalObserver == null) {
            this.mInternalObserver = new InternalObserver();
            nativeRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        this.mInternalObserver.registerObserver(observer);
        MethodCollector.o(14367);
    }

    public long computeDiffMs(String str, String str2) {
        MethodCollector.i(14583);
        long nativeComputeDiffMs = nativeComputeDiffMs(this.mNativeObj, str, str2);
        MethodCollector.o(14583);
        return nativeComputeDiffMs;
    }

    public void adjustLastTimeMills(String str, long j2) {
        MethodCollector.i(14612);
        nativeAdjustLastTimeMills(this.mNativeObj, str, j2);
        MethodCollector.o(14612);
    }

    public long convertToNowMills(String str, long j2) {
        MethodCollector.i(14557);
        long nativeConvertToNowMills = nativeConvertToNowMills(this.mNativeObj, str, j2);
        MethodCollector.o(14557);
        return nativeConvertToNowMills;
    }

    /* access modifiers changed from: protected */
    public long updateTimeMs(String str, long j2) {
        MethodCollector.i(14494);
        long nativeUpdateTimeMs = nativeUpdateTimeMs(this.mNativeObj, str, j2);
        MethodCollector.o(14494);
        return nativeUpdateTimeMs;
    }
}
