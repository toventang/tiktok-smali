package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;

public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33025);
    }

    protected LightEstimate() {
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j2, long j3);

    private static native long nativeCreateLightEstimate(long j2);

    private static native void nativeDestroyLightEstimate(long j2, long j3);

    private native void nativeGetColorCorrection(long j2, long j3, float[] fArr, int i2);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j2, long j3, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j2, long j3, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j2, long j3, float[] fArr);

    private native float nativeGetPixelIntensity(long j2, long j3);

    private native int nativeGetState(long j2, long j3);

    private native long nativeGetTimestamp(long j2, long j3);

    public ArImage[] acquireEnvironmentalHdrCubeMap() {
        MethodCollector.i(14041);
        ArImage[] convertNativeArImageCubemapToArray = convertNativeArImageCubemapToArray(nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14041);
        return convertNativeArImageCubemapToArray;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(14033);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(14033);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        MethodCollector.i(14040);
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.o(14040);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        MethodCollector.i(14038);
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.o(14038);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        MethodCollector.i(14039);
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        MethodCollector.o(14039);
        return fArr;
    }

    public float getPixelIntensity() {
        MethodCollector.i(14035);
        float nativeGetPixelIntensity = nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14035);
        return nativeGetPixelIntensity;
    }

    public State getState() {
        MethodCollector.i(14034);
        State forNumber = State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14034);
        return forNumber;
    }

    public long getTimestamp() {
        MethodCollector.i(14037);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14037);
        return nativeGetTimestamp;
    }

    public enum State {
        NOT_VALID(0),
        VALID(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33026);
        }

        static State forNumber(int i2) {
            State[] values = values();
            for (State state : values) {
                if (state.nativeCode == i2) {
                    return state;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimate.State, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private State(int i2) {
            this.nativeCode = i2;
        }
    }

    LightEstimate(Session session2) {
        MethodCollector.i(14032);
        this.session = session2;
        this.nativeHandle = nativeCreateLightEstimate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.o(14032);
    }

    private ArImage[] convertNativeArImageCubemapToArray(long[] jArr) {
        ArImage[] arImageArr = new ArImage[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            arImageArr[i2] = new ArImage(this.session, jArr[i2]);
        }
        return arImageArr;
    }

    public void getColorCorrection(float[] fArr, int i2) {
        MethodCollector.i(14036);
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2);
        MethodCollector.o(14036);
    }
}
