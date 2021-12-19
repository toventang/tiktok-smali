package com.ss.mediakit.net;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public interface CreateConstructor {
    static {
        Covode.recordClassIndex(101151);
    }

    BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i2, Handler handler);
}
