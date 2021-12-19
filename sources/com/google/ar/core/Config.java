package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;

public class Config {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    static {
        Covode.recordClassIndex(33005);
    }

    protected Config() {
    }

    private static native long nativeCreate(long j2);

    private static native void nativeDestroy(long j2, long j3);

    private native int nativeGetAugmentedFaceMode(long j2, long j3);

    private native long nativeGetAugmentedImageDatabase(long j2, long j3);

    private native int nativeGetCloudAnchorMode(long j2, long j3);

    private native int nativeGetDepthMode(long j2, long j3);

    private native int nativeGetDepthModePrivate(long j2, long j3);

    private native int nativeGetFocusMode(long j2, long j3);

    private native int nativeGetInstantPlacementMode(long j2, long j3);

    private native int nativeGetInstantPlacementModePrivate(long j2, long j3);

    private native int nativeGetLightEstimationMode(long j2, long j3);

    private native int nativeGetPlaneFindingMode(long j2, long j3);

    private native int nativeGetSegmentationMode(long j2, long j3);

    private native int nativeGetUpdateMode(long j2, long j3);

    private native void nativeSetAugmentedFaceMode(long j2, long j3, int i2);

    private native void nativeSetAugmentedImageDatabase(long j2, long j3, long j4);

    private native void nativeSetCloudAnchorMode(long j2, long j3, int i2);

    private native void nativeSetDepthMode(long j2, long j3, int i2);

    private native void nativeSetDepthModePrivate(long j2, long j3, int i2);

    private native void nativeSetFocusMode(long j2, long j3, int i2);

    private native void nativeSetInstantPlacementMode(long j2, long j3, int i2);

    private native void nativeSetInstantPlacementModePrivate(long j2, long j3, int i2);

    private native void nativeSetLightEstimationMode(long j2, long j3, int i2);

    private native void nativeSetPlaneFindingMode(long j2, long j3, int i2);

    private native void nativeSetSegmentationMode(long j2, long j3, int i2);

    private native void nativeSetUpdateMode(long j2, long j3, int i2);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(12789);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(12789);
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        MethodCollector.i(11811);
        AugmentedFaceMode forNumber = AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11811);
        return forNumber;
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        MethodCollector.i(11654);
        AugmentedImageDatabase augmentedImageDatabase = new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11654);
        return augmentedImageDatabase;
    }

    public CloudAnchorMode getCloudAnchorMode() {
        MethodCollector.i(11322);
        CloudAnchorMode forNumber = CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11322);
        return forNumber;
    }

    public DepthMode getDepthMode() {
        MethodCollector.i(12787);
        DepthMode forNumber = DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12787);
        return forNumber;
    }

    public DepthMode getDepthModePrivate() {
        MethodCollector.i(12788);
        DepthMode forNumber = DepthMode.forNumber(nativeGetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12788);
        return forNumber;
    }

    public FocusMode getFocusMode() {
        MethodCollector.i(11976);
        FocusMode forNumber = FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11976);
        return forNumber;
    }

    public InstantPlacementMode getInstantPlacementMode() {
        MethodCollector.i(12267);
        InstantPlacementMode forNumber = InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12267);
        return forNumber;
    }

    public InstantPlacementMode getInstantPlacementModePrivate() {
        MethodCollector.i(12417);
        InstantPlacementMode forNumber = InstantPlacementMode.forNumber(nativeGetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12417);
        return forNumber;
    }

    public LightEstimationMode getLightEstimationMode() {
        MethodCollector.i(10352);
        LightEstimationMode forNumber = LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(10352);
        return forNumber;
    }

    public PlaneFindingMode getPlaneFindingMode() {
        MethodCollector.i(10669);
        PlaneFindingMode forNumber = PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(10669);
        return forNumber;
    }

    public SegmentationMode getSegmentationMode() {
        MethodCollector.i(11814);
        SegmentationMode forNumber = SegmentationMode.forNumber(nativeGetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11814);
        return forNumber;
    }

    public UpdateMode getUpdateMode() {
        MethodCollector.i(10998);
        UpdateMode forNumber = UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(10998);
        return forNumber;
    }

    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1),
        ENABLED_WITH_EARTH_LOCALIZATION(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33007);
        }

        static CloudAnchorMode forNumber(int i2) {
            CloudAnchorMode[] values = values();
            for (CloudAnchorMode cloudAnchorMode : values) {
                if (cloudAnchorMode.nativeCode == i2) {
                    return cloudAnchorMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AnchorHostingMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private CloudAnchorMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        ALWAYS_ENABLED(4),
        RAW_DEPTH_ONLY(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33008);
        }

        static DepthMode forNumber(int i2) {
            DepthMode[] values = values();
            for (DepthMode depthMode : values) {
                if (depthMode.nativeCode == i2) {
                    return depthMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native DepthMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private DepthMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum FocusMode {
        FIXED(0),
        AUTO(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33009);
        }

        static FocusMode forNumber(int i2) {
            FocusMode[] values = values();
            for (FocusMode focusMode : values) {
                if (focusMode.nativeCode == i2) {
                    return focusMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FocusMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private FocusMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum InstantPlacementMode {
        DISABLED(0),
        ENABLED(1),
        LOCAL_Y_UP(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33010);
        }

        static InstantPlacementMode forNumber(int i2) {
            InstantPlacementMode[] values = values();
            for (InstantPlacementMode instantPlacementMode : values) {
                if (instantPlacementMode.nativeCode == i2) {
                    return instantPlacementMode;
                }
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Unexpected value for native InstantPlacementMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private InstantPlacementMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33011);
        }

        static LightEstimationMode forNumber(int i2) {
            LightEstimationMode[] values = values();
            for (LightEstimationMode lightEstimationMode : values) {
                if (lightEstimationMode.nativeCode == i2) {
                    return lightEstimationMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimationMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private LightEstimationMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3),
        HORIZONTAL_AND_VERTICAL_LOW_FEATURE_GROWTH(4);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33012);
        }

        static PlaneFindingMode forNumber(int i2) {
            PlaneFindingMode[] values = values();
            for (PlaneFindingMode planeFindingMode : values) {
                if (planeFindingMode.nativeCode == i2) {
                    return planeFindingMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native PlaneFindingMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private PlaneFindingMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum SegmentationMode {
        DISABLED(0),
        PEOPLE(6);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33013);
        }

        static SegmentationMode forNumber(int i2) {
            SegmentationMode[] values = values();
            for (SegmentationMode segmentationMode : values) {
                if (segmentationMode.nativeCode == i2) {
                    return segmentationMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native SegmentationMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private SegmentationMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33014);
        }

        static UpdateMode forNumber(int i2) {
            UpdateMode[] values = values();
            for (UpdateMode updateMode : values) {
                if (updateMode.nativeCode == i2) {
                    return updateMode;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native UpdateMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private UpdateMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2),
        MESH3D_IMPROVED_LIP_EYE(401),
        MESH3D_IMPROVED_EYE(405),
        MESH3D_FRONT_OR_BACK_PARTNER(418);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33006);
        }

        static AugmentedFaceMode forNumber(int i2) {
            AugmentedFaceMode[] values = values();
            for (AugmentedFaceMode augmentedFaceMode : values) {
                if (augmentedFaceMode.nativeCode == i2) {
                    return augmentedFaceMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AugmentedFaceMode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private AugmentedFaceMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public Config(Session session2) {
        MethodCollector.i(10189);
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.o(10189);
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        MethodCollector.i(11812);
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        MethodCollector.o(11812);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        long j2;
        MethodCollector.i(11479);
        long j3 = this.session.nativeWrapperHandle;
        long j4 = this.nativeHandle;
        if (augmentedImageDatabase == null) {
            j2 = 0;
        } else {
            j2 = augmentedImageDatabase.nativeHandle;
        }
        nativeSetAugmentedImageDatabase(j3, j4, j2);
        MethodCollector.o(11479);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        MethodCollector.i(11320);
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        MethodCollector.o(11320);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        MethodCollector.i(12554);
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        MethodCollector.o(12554);
        return this;
    }

    public Config setDepthModePrivate(DepthMode depthMode) {
        MethodCollector.i(12665);
        nativeSetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        MethodCollector.o(12665);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        MethodCollector.i(12111);
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        MethodCollector.o(12111);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        MethodCollector.i(12116);
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        MethodCollector.o(12116);
        return this;
    }

    public Config setInstantPlacementModePrivate(InstantPlacementMode instantPlacementMode) {
        MethodCollector.i(12118);
        nativeSetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        MethodCollector.o(12118);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        MethodCollector.i(10514);
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        MethodCollector.o(10514);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        MethodCollector.i(10823);
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        MethodCollector.o(10823);
        return this;
    }

    public Config setSegmentationMode(SegmentationMode segmentationMode) {
        MethodCollector.i(11975);
        nativeSetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle, segmentationMode.nativeCode);
        MethodCollector.o(11975);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        MethodCollector.i(11165);
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        MethodCollector.o(11165);
        return this;
    }

    Config(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
