package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public final class f extends l {
    static {
        Covode.recordClassIndex(101212);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public k call() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f151764a);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (a(hostAddress)) {
                        arrayList.add(hostAddress);
                    }
                }
            }
            if (g.f151742a) {
                g.a();
            }
            return new k(this.f151764a, arrayList);
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            if (g.f151742a) {
                g.a();
            }
            return new k(this.f151764a, null);
        }
    }

    f(String str) {
        super(str);
    }
}
