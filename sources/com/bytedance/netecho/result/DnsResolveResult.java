package com.bytedance.netecho.result;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DnsResolveResult extends Result {
    private final String ip;
    private final boolean success;
    private final String throwableMsg;

    static {
        Covode.recordClassIndex(25443);
    }

    public static /* synthetic */ DnsResolveResult copy$default(DnsResolveResult dnsResolveResult, boolean z, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dnsResolveResult.success;
        }
        if ((i2 & 2) != 0) {
            str = dnsResolveResult.ip;
        }
        if ((i2 & 4) != 0) {
            str2 = dnsResolveResult.throwableMsg;
        }
        return dnsResolveResult.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.ip;
    }

    public final String component3() {
        return this.throwableMsg;
    }

    public final DnsResolveResult copy(boolean z, String str, String str2) {
        return new DnsResolveResult(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DnsResolveResult) {
                DnsResolveResult dnsResolveResult = (DnsResolveResult) obj;
                if (this.success != dnsResolveResult.success || !l.a((Object) this.ip, (Object) dnsResolveResult.ip) || !l.a((Object) this.throwableMsg, (Object) dnsResolveResult.throwableMsg)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.ip;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.throwableMsg;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "DnsResolveResult(success=" + this.success + ", ip=" + this.ip + ", throwableMsg=" + this.throwableMsg + ")";
    }

    public final String getIp() {
        return this.ip;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getThrowableMsg() {
        return this.throwableMsg;
    }

    public DnsResolveResult(boolean z, String str, String str2) {
        this.success = z;
        this.ip = str;
        this.throwableMsg = str2;
    }
}
