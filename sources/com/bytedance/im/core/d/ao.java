package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;

public final class ao implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f37818a;

    /* renamed from: b  reason: collision with root package name */
    public long f37819b;

    /* renamed from: c  reason: collision with root package name */
    public long f37820c = Long.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public long f37821d;

    /* renamed from: e  reason: collision with root package name */
    public long f37822e = -1;

    static {
        Covode.recordClassIndex(22714);
    }

    public final ao a() {
        this.f37822e = -1;
        return this;
    }

    public final boolean b() {
        if (this.f37822e > -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final ao clone() {
        ao aoVar = new ao();
        aoVar.f37818a = this.f37818a;
        aoVar.f37819b = this.f37819b;
        aoVar.a(this.f37820c);
        aoVar.b(this.f37821d);
        aoVar.c(this.f37822e);
        return aoVar;
    }

    public final String toString() {
        return "ParticipantIndexInfo{conversationId='" + this.f37818a + '\'' + ", uid=" + this.f37819b + ", minIndex=" + this.f37820c + ", readIndex=" + this.f37821d + ", readOrder=" + this.f37822e + '}';
    }

    public final ao a(long j2) {
        if (this.f37820c < j2) {
            this.f37820c = j2;
        }
        return this;
    }

    public final ao b(long j2) {
        if (this.f37821d < j2) {
            this.f37821d = j2;
        }
        return this;
    }

    public final ao c(long j2) {
        if (this.f37822e < j2) {
            this.f37822e = j2;
        }
        return this;
    }
}
