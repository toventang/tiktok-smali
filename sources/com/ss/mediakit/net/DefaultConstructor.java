package com.ss.mediakit.net;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public class DefaultConstructor implements CreateConstructor {
    static {
        Covode.recordClassIndex(101158);
    }

    @Override // com.ss.mediakit.net.CreateConstructor
    public BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i2, Handler handler) {
        try {
            return new HTTPDNS(str, aVMDLNetClient, i2, handler);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
