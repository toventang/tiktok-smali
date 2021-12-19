package com.ss.android.ttve.vealgorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmResult;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmType;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.an;

public class VEAlgorithm {
    private VEListener.b mErrorListener;
    private long mHandle;
    private VEListener.c mListener;

    static {
        Covode.recordClassIndex(37780);
    }

    public native int nativeAlgorithmCancel(long j2);

    public native long nativeAlgorithmCreate(Object obj);

    public native int nativeAlgorithmDestroy(long j2);

    public native Object nativeAlgorithmGetResult(long j2);

    public native int nativeAlgorithmStart(long j2);

    public void nativeCallback_onError(int i2, String str) {
    }

    public void nativeCallback_onProcess(float f2, boolean z) {
    }

    public int cancel() {
        MethodCollector.i(11776);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(11776);
            return -112;
        }
        int nativeAlgorithmCancel = nativeAlgorithmCancel(j2);
        MethodCollector.o(11776);
        return nativeAlgorithmCancel;
    }

    public int destroy() {
        MethodCollector.i(11778);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(11778);
            return -112;
        }
        int nativeAlgorithmDestroy = nativeAlgorithmDestroy(j2);
        this.mHandle = 0;
        MethodCollector.o(11778);
        return nativeAlgorithmDestroy;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mHandle != 0) {
            an.d("VEAlgorithm", "not destroy algorithm object:" + this.mHandle);
        }
    }

    public VEAlgorithmResult getResult() {
        MethodCollector.i(11777);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(11777);
            return null;
        }
        VEAlgorithmResult vEAlgorithmResult = (VEAlgorithmResult) nativeAlgorithmGetResult(j2);
        MethodCollector.o(11777);
        return vEAlgorithmResult;
    }

    public int start() {
        MethodCollector.i(11775);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(11775);
            return -112;
        }
        int nativeAlgorithmStart = nativeAlgorithmStart(j2);
        MethodCollector.o(11775);
        return nativeAlgorithmStart;
    }

    public void setErrorListener(VEListener.b bVar) {
        this.mErrorListener = bVar;
    }

    public void setProcessListener(VEListener.c cVar) {
        this.mListener = cVar;
    }

    public int init(VEAlgorithmParam vEAlgorithmParam) {
        MethodCollector.i(11774);
        int i2 = vEAlgorithmParam.type;
        if (i2 == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            an.d("VEAlgorithm", "invalid algorithm type:".concat(String.valueOf(i2)));
            MethodCollector.o(11774);
            return -100;
        }
        long nativeAlgorithmCreate = nativeAlgorithmCreate(vEAlgorithmParam);
        this.mHandle = nativeAlgorithmCreate;
        if (nativeAlgorithmCreate == 0) {
            an.d("VEAlgorithm", "nativeAlgorithmCreate failed!");
            MethodCollector.o(11774);
            return -1;
        }
        MethodCollector.o(11774);
        return 0;
    }
}
