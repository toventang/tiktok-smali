package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f30095a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30096b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30097c;

    static {
        Covode.recordClassIndex(17478);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f30095a, cVar.f30095a) && this.f30096b == cVar.f30096b && this.f30097c == cVar.f30097c;
    }

    public final int hashCode() {
        String str = this.f30095a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f30096b;
        return (((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f30097c;
    }

    public final String toString() {
        return "ResourceInfoModel(accessKey=" + this.f30095a + ", accessKeyResourceUsage=" + this.f30096b + ", ChannelCount=" + this.f30097c + ")";
    }

    public c(String str, long j2, int i2) {
        l.c(str, "");
        this.f30095a = str;
        this.f30096b = j2;
        this.f30097c = i2;
    }
}
