package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public abstract class IByteAudioEngine {
    private static ByteAudioEngine mInstance;

    static {
        Covode.recordClassIndex(15323);
    }

    public abstract void addEventHandler(ByteAudioEventHandler byteAudioEventHandler);

    public abstract int adjustHeadsetMonitorVolume(int i2);

    public abstract int adjustPlaybackVolume(int i2);

    public abstract int adjustRecordVolume(int i2);

    public abstract ByteAudioAuxStream createAuxStream(String str);

    public abstract ByteAudioInputStream createInputStream(String str);

    public abstract ByteAudioOutputStream createOutputStream(String str);

    public abstract void enableAudioRoute(boolean z);

    public abstract int enableEarMonitor(boolean z);

    public abstract void enableLocalAudio(boolean z);

    public abstract ByteAudioStreamOption getValue(int i2);

    public abstract int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream);

    public abstract int releaseInputStream(ByteAudioInputStream byteAudioInputStream);

    public abstract int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream);

    public abstract void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler);

    public abstract int setAudioScenario(int i2);

    public abstract void setEnableSpeakerphone(boolean z);

    public abstract void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public abstract void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public abstract void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i2, int i3);

    public abstract int setServerConfigure(String str);

    public abstract int setValue(int i2, ByteAudioStreamOption byteAudioStreamOption);

    public static synchronized IByteAudioEngine getInstance() {
        ByteAudioEngine byteAudioEngine;
        synchronized (IByteAudioEngine.class) {
            if (mInstance == null) {
                mInstance = new ByteAudioEngine();
            }
            byteAudioEngine = mInstance;
        }
        return byteAudioEngine;
    }

    public static synchronized void releaseInstance() {
        synchronized (IByteAudioEngine.class) {
            ByteAudioEngine byteAudioEngine = mInstance;
            if (byteAudioEngine != null) {
                byteAudioEngine.release();
            }
            mInstance = null;
        }
    }

    public static void setLibraryLoaded(boolean z) {
        ByteAudioEngine.setLibraryLoaded(z);
    }
}
