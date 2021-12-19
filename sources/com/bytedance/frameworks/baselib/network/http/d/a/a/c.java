package com.bytedance.frameworks.baselib.network.http.d.a.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class c implements Serializable, Comparable<c> {
    private long mCreatedTime = System.currentTimeMillis();
    private String mHost;
    public g mHttpDnsCallback;
    private boolean mIsLocalDnsExpired;

    static {
        Covode.recordClassIndex(17048);
    }

    public String getHost() {
        return this.mHost;
    }

    public boolean isLocalDnsExpired() {
        return this.mIsLocalDnsExpired;
    }

    public int compareTo(c cVar) {
        long j2 = cVar.mCreatedTime;
        long j3 = this.mCreatedTime;
        if (j2 == j3) {
            return 0;
        }
        if (j2 < j3) {
            return -1;
        }
        return 1;
    }

    public c(String str, g gVar, boolean z) {
        this.mHost = str;
        this.mHttpDnsCallback = gVar;
        this.mIsLocalDnsExpired = z;
    }
}
