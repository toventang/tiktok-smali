package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class TECloudCtrlInvoker {
    public native int nativeVerifyJson(byte[] bArr, byte[] bArr2);

    static {
        Covode.recordClassIndex(37602);
        d.a();
    }
}
