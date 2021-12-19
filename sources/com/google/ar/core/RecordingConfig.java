package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33038);
    }

    protected RecordingConfig() {
    }

    private native void nativeAddExternalDataTrack(long j2, long j3, long j4);

    private static native long nativeCreateRecordingConfig(long j2);

    private static native void nativeDestroyRecordingConfig(long j2, long j3);

    private native boolean nativeGetAutoStopOnPause(long j2, long j3);

    private native String nativeGetMp4DatasetFilePath(long j2, long j3);

    private native int nativeGetRecordingRotation(long j2, long j3);

    private native void nativeSetAutoStopOnPause(long j2, long j3, boolean z);

    private native void nativeSetMp4DatasetFilePath(long j2, long j3, String str);

    private native void nativeSetRecordingRotation(long j2, long j3, int i2);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(13348);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(13348);
    }

    public boolean getAutoStopOnPause() {
        MethodCollector.i(13512);
        boolean nativeGetAutoStopOnPause = nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13512);
        return nativeGetAutoStopOnPause;
    }

    public String getMp4DatasetFilePath() {
        MethodCollector.i(13510);
        String nativeGetMp4DatasetFilePath = nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13510);
        return nativeGetMp4DatasetFilePath;
    }

    public int getRecordingRotation() {
        MethodCollector.i(13514);
        int nativeGetRecordingRotation = nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13514);
        return nativeGetRecordingRotation;
    }

    public RecordingConfig(Session session2) {
        MethodCollector.i(13272);
        this.session = session2;
        this.nativeHandle = nativeCreateRecordingConfig(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.o(13272);
    }

    public RecordingConfig addExternalDataTrack(ExternalDataTrack externalDataTrack) {
        MethodCollector.i(13515);
        nativeAddExternalDataTrack(this.session.nativeWrapperHandle, this.nativeHandle, externalDataTrack.nativeHandle);
        MethodCollector.o(13515);
        return this;
    }

    public RecordingConfig setAutoStopOnPause(boolean z) {
        MethodCollector.i(13511);
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z);
        MethodCollector.o(13511);
        return this;
    }

    public RecordingConfig setMp4DatasetFilePath(String str) {
        MethodCollector.i(13423);
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        MethodCollector.o(13423);
        return this;
    }

    public RecordingConfig setRecordingRotation(int i2) {
        MethodCollector.i(13513);
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i2);
        MethodCollector.o(13513);
        return this;
    }
}
