package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;
import com.ss.android.ttve.nativePort.TELensAlgorithm;
import com.ss.android.vesdk.VEListener;

public class VELensAlgorithm {
    private TELensAlgorithm mLensHandle = new TELensAlgorithm();

    static {
        Covode.recordClassIndex(99142);
    }

    public int destroy() {
        return this.mLensHandle.b();
    }

    public int init() {
        return this.mLensHandle.a();
    }

    public VEBaseLensResults getAlgorithmResults(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, VEListener.z zVar) {
        MethodCollector.i(8708);
        VELensCallBacks vELensCallBacks = new VELensCallBacks();
        vELensCallBacks.setmLensStateListener(zVar);
        TELensAlgorithm tELensAlgorithm = this.mLensHandle;
        if (tELensAlgorithm.f61239a <= 0 || vEBaseLensAlgorithmConfig.algorithmFlag != 16) {
            MethodCollector.o(8708);
            return null;
        }
        VELensVideoStabResults nativeGetVideoStabResult = tELensAlgorithm.nativeGetVideoStabResult(tELensAlgorithm.f61239a, vELensCallBacks, (VEVideoStabConfig) vEBaseLensAlgorithmConfig);
        MethodCollector.o(8708);
        return nativeGetVideoStabResult;
    }
}
