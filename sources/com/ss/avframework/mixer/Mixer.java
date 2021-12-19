package com.ss.avframework.mixer;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.TEBundle;

public abstract class Mixer extends NativeObject {
    static {
        Covode.recordClassIndex(100511);
    }

    private native boolean nativeEnable();

    private native int nativeGetOriginTrackIndex();

    private native int[] nativeGetTracks();

    private native boolean nativeRemoveTrack(int i2);

    private native void nativeSetEnable(boolean z);

    private native void nativeSetOriginTrackIndex(int i2);

    public abstract boolean getParameter(TEBundle tEBundle);

    public abstract boolean isAudioMixer();

    public boolean isEnable(int i2) {
        return false;
    }

    public boolean isNativeMixer() {
        return false;
    }

    /* access modifiers changed from: protected */
    public native int nativeCreateTrack(Object obj);

    /* access modifiers changed from: protected */
    public native Object nativeGetDescription(int i2);

    /* access modifiers changed from: protected */
    public native void nativeUpdateDescription(int i2, Object obj);

    public void setEnable(int i2, boolean z) {
    }

    public abstract boolean setParameter(TEBundle tEBundle);

    public boolean enable() {
        return nativeEnable();
    }

    public int getOriginTrackIndex() {
        return nativeGetOriginTrackIndex();
    }

    public int[] getTracks() {
        return nativeGetTracks();
    }

    public void removeTrack(int i2) {
        nativeRemoveTrack(i2);
    }

    public void setOriginTrackIndex(int i2) {
        nativeSetOriginTrackIndex(i2);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }
}
