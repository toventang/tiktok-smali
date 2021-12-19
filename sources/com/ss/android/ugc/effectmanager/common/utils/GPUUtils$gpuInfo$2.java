package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.GPUUtils;
import h.f.a.a;
import h.f.b.m;

final class GPUUtils$gpuInfo$2 extends m implements a<GPUUtils.GPUInfo> {
    public static final GPUUtils$gpuInfo$2 INSTANCE = new GPUUtils$gpuInfo$2();

    static {
        Covode.recordClassIndex(95342);
    }

    GPUUtils$gpuInfo$2() {
        super(0);
    }

    @Override // h.f.a.a
    public final GPUUtils.GPUInfo invoke() {
        return GPUUtils.INSTANCE.generateGPUInfo();
    }
}
