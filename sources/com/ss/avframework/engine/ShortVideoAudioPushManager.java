package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.utils.TEBundle;

public class ShortVideoAudioPushManager extends NativeObject {
    private static ShortVideoAudioPushManager mSingleInstance;

    static {
        Covode.recordClassIndex(99828);
    }

    private native void nativeCreate();

    private native long nativeGetPlayerWrapper(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3, boolean z);

    private native boolean nativeGetReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j2, TEBundle tEBundle);

    private native void nativePause();

    private native void nativeResume();

    private ShortVideoAudioPushManager() {
        MethodCollector.i(12279);
        nativeCreate();
        MethodCollector.o(12279);
    }

    public static void dispose() {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.release();
            mSingleInstance = null;
        }
    }

    public static void pause() {
        MethodCollector.i(12427);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativePause();
        }
        MethodCollector.o(12427);
    }

    public static void resume() {
        MethodCollector.i(12428);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativeResume();
        }
        MethodCollector.o(12428);
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3) {
        return getAudioLongAddress(audioRenderSink, i2, i3, false);
    }

    public static boolean getReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j2, TEBundle tEBundle) {
        MethodCollector.i(12429);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            boolean nativeGetReportStats = shortVideoAudioPushManager.nativeGetReportStats(audioRenderSink, j2, tEBundle);
            MethodCollector.o(12429);
            return nativeGetReportStats;
        }
        MethodCollector.o(12429);
        return false;
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3, boolean z) {
        MethodCollector.i(12426);
        if (mSingleInstance == null) {
            mSingleInstance = new ShortVideoAudioPushManager();
        }
        long nativeGetPlayerWrapper = mSingleInstance.nativeGetPlayerWrapper(audioRenderSink, i2, i3, z);
        MethodCollector.o(12426);
        return nativeGetPlayerWrapper;
    }
}
