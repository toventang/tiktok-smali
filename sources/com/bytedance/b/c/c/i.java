package com.bytedance.b.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f26103a;

    /* renamed from: b  reason: collision with root package name */
    public String f26104b;

    /* renamed from: c  reason: collision with root package name */
    public long f26105c;

    /* renamed from: d  reason: collision with root package name */
    public double f26106d;

    /* renamed from: e  reason: collision with root package name */
    public String f26107e;

    /* renamed from: f  reason: collision with root package name */
    public String f26108f;

    /* renamed from: g  reason: collision with root package name */
    public long f26109g;

    /* renamed from: h  reason: collision with root package name */
    public int f26110h;

    static {
        Covode.recordClassIndex(15188);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26103a), this.f26104b);
    }

    public final String toString() {
        return "ThreadExceptionItem{threadId=" + this.f26103a + ", threadName='" + this.f26104b + '\'' + ", threadCpuTime=" + this.f26105c + ", processCpuTime=" + this.f26109g + ", cpuUsage=" + this.f26106d + ", weight=" + this.f26107e + ", nice=" + this.f26110h + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f26103a != iVar.f26103a || !this.f26104b.equals(iVar.f26104b)) {
            return false;
        }
        return true;
    }
}
