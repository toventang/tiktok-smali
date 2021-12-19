package com.ss.videoarch.strategy.inferenceEngine.a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected final String f154498a;

    static {
        Covode.recordClassIndex(102944);
    }

    public final List<String> a() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f154498a);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    arrayList.add(inetAddress.getHostAddress());
                }
            }
            return arrayList;
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    c(String str) {
        this.f154498a = str;
    }
}
