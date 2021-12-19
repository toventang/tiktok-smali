package com.google.ar.core;

import android.util.Range;
import android.util.Size;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;

public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32998);
    }

    protected CameraConfig() {
    }

    private static native void nativeDestroyCameraConfig(long j2, long j3);

    private native String nativeGetCameraId(long j2, long j3);

    private native int nativeGetDepthSensorUsage(long j2, long j3);

    private native int nativeGetFacingDirection(long j2, long j3);

    private native void nativeGetFpsRange(long j2, long j3, int[] iArr);

    private native void nativeGetImageDimensions(long j2, long j3, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j2, long j3);

    private native void nativeGetTextureDimensions(long j2, long j3, int[] iArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(14278);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(14278);
    }

    public String getCameraId() {
        MethodCollector.i(14369);
        String nativeGetCameraId = nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14369);
        return nativeGetCameraId;
    }

    public DepthSensorUsage getDepthSensorUsage() {
        MethodCollector.i(14346);
        DepthSensorUsage forNumber = DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14346);
        return forNumber;
    }

    public FacingDirection getFacingDirection() {
        MethodCollector.i(14387);
        FacingDirection forNumber = FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14387);
        return forNumber;
    }

    public StereoCameraUsage getStereoCameraUsage() {
        MethodCollector.i(14388);
        StereoCameraUsage forNumber = StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14388);
        return forNumber;
    }

    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32999);
        }

        static EnumSet<DepthSensorUsage> forBitFlags(int i2) {
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            DepthSensorUsage[] values = values();
            for (DepthSensorUsage depthSensorUsage : values) {
                if ((depthSensorUsage.nativeCode & i2) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        static DepthSensorUsage forNumber(int i2) {
            DepthSensorUsage[] values = values();
            for (DepthSensorUsage depthSensorUsage : values) {
                if (depthSensorUsage.nativeCode == i2) {
                    return depthSensorUsage;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native DepthSensorUsage, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private DepthSensorUsage(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33000);
        }

        static FacingDirection forNumber(int i2) {
            FacingDirection[] values = values();
            for (FacingDirection facingDirection : values) {
                if (facingDirection.nativeCode == i2) {
                    return facingDirection;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native FacingDirection, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private FacingDirection(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33001);
        }

        static EnumSet<StereoCameraUsage> forBitFlags(int i2) {
            EnumSet<StereoCameraUsage> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            StereoCameraUsage[] values = values();
            for (StereoCameraUsage stereoCameraUsage : values) {
                if ((stereoCameraUsage.nativeCode & i2) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        static StereoCameraUsage forNumber(int i2) {
            StereoCameraUsage[] values = values();
            for (StereoCameraUsage stereoCameraUsage : values) {
                if (stereoCameraUsage.nativeCode == i2) {
                    return stereoCameraUsage;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native StereoCameraUsage, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private StereoCameraUsage(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33002);
        }

        static EnumSet<TargetFps> forBitFlags(int i2) {
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            TargetFps[] values = values();
            for (TargetFps targetFps : values) {
                if ((targetFps.nativeCode & i2) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }

        private TargetFps(int i2) {
            this.nativeCode = i2;
        }
    }

    public Range<Integer> getFpsRange() {
        MethodCollector.i(14345);
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Range<Integer> range = new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        MethodCollector.o(14345);
        return range;
    }

    public Size getImageSize() {
        MethodCollector.i(14279);
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Size size = new Size(iArr[0], iArr[1]);
        MethodCollector.o(14279);
        return size;
    }

    public Size getTextureSize() {
        MethodCollector.i(14315);
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        Size size = new Size(iArr[0], iArr[1]);
        MethodCollector.o(14315);
        return size;
    }

    CameraConfig(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
