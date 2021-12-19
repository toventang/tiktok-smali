package com.bytedance.ies.abmock.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f31790a;

    /* renamed from: b  reason: collision with root package name */
    public String f31791b;

    /* renamed from: c  reason: collision with root package name */
    public long f31792c;

    static {
        Covode.recordClassIndex(18589);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!l.a((Object) this.f31790a, (Object) cVar.f31790a) || !l.a((Object) this.f31791b, (Object) cVar.f31791b) || this.f31792c != cVar.f31792c) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f31790a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31791b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j2 = this.f31792c;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PullSyncEntity(taskId=" + this.f31790a + ", proxyItemIds=" + this.f31791b + ", timeStamp=" + this.f31792c + ")";
    }
}
