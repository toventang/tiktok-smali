package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.e.a;
import com.ss.android.ugc.asve.e.b;
import com.ss.android.ugc.aweme.record.c;
import com.ss.android.ugc.aweme.setting.ci;
import com.ss.android.ugc.aweme.setting.v;

public final class InternalRecordServiceImpl$getABService$1 implements c {
    static {
        Covode.recordClassIndex(79503);
    }

    InternalRecordServiceImpl$getABService$1() {
    }

    @Override // com.ss.android.ugc.aweme.record.c
    public final int getCameraOpenRetryCount() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.record.c
    public final int getCameraPreviewRetryCount() {
        return b.a();
    }

    @Override // com.ss.android.ugc.aweme.record.c
    public final boolean getCloseCameraAsyncIsOpen() {
        return com.ss.android.ugc.asve.e.c.a();
    }

    @Override // com.ss.android.ugc.aweme.record.c
    public final boolean getEnablePreReleaseGPUResource() {
        return v.a();
    }

    @Override // com.ss.android.ugc.aweme.record.c
    public final boolean getEnableRenderPause() {
        return ci.a();
    }
}
