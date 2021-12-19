package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;

public class Anchor {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32981);
    }

    protected Anchor() {
    }

    private native void nativeDetach(long j2, long j3);

    private native String nativeGetCloudAnchorId(long j2, long j3);

    private native int nativeGetCloudAnchorState(long j2, long j3);

    private native int nativeGetCloudLocalizationState(long j2, long j3);

    private native Pose nativeGetPose(long j2, long j3);

    private native int nativeGetTrackingState(long j2, long j3);

    private static native void nativeReleaseAnchor(long j2, long j3);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public void detach() {
        MethodCollector.i(12119);
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(12119);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(11977);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(11977);
    }

    public String getCloudAnchorId() {
        MethodCollector.i(12114);
        String nativeGetCloudAnchorId = nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(12114);
        return nativeGetCloudAnchorId;
    }

    public CloudAnchorState getCloudAnchorState() {
        MethodCollector.i(12115);
        CloudAnchorState forNumber = CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12115);
        return forNumber;
    }

    public CloudLocalizationState getCloudLocalizationState() {
        MethodCollector.i(12117);
        CloudLocalizationState forNumber = CloudLocalizationState.forNumber(nativeGetCloudLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12117);
        return forNumber;
    }

    public Pose getPose() {
        MethodCollector.i(12112);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(12112);
        return nativeGetPose;
    }

    public TrackingState getTrackingState() {
        MethodCollector.i(12113);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12113);
        return forNumber;
    }

    public enum CloudLocalizationState {
        NONE(0),
        EARTH(1),
        LOCAL_MAP(2),
        LOCAL_MAP_AND_EARTH(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32983);
        }

        static CloudLocalizationState forNumber(int i2) {
            CloudLocalizationState[] values = values();
            for (CloudLocalizationState cloudLocalizationState : values) {
                if (cloudLocalizationState.nativeCode == i2) {
                    return cloudLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native CloudLocalizationState, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private CloudLocalizationState(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10),
        ERROR_RESOLVING_LOCALIZED_TOO_FAR_AWAY(-11);
        
        final int nativeCode;

        public final boolean isError() {
            return this.nativeCode < 0;
        }

        static {
            Covode.recordClassIndex(32982);
        }

        public static CloudAnchorState forNumber(int i2) {
            CloudAnchorState[] values = values();
            for (CloudAnchorState cloudAnchorState : values) {
                if (cloudAnchorState.nativeCode == i2) {
                    return cloudAnchorState;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native CloudAnchorState, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private CloudAnchorState(int i2) {
            this.nativeCode = i2;
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Anchor) && ((Anchor) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    Anchor(long j2, Session session2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
