package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.services.apm.api.IFdCheck;
import java.util.List;

class NpthCore$4 implements IFdCheck {
    static {
        Covode.recordClassIndex(16131);
    }

    NpthCore$4() {
    }

    @Override // com.bytedance.services.apm.api.IFdCheck
    public final List<String> getFdList() {
        return NativeTools.a().d();
    }
}
