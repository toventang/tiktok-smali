package com.bytedance.z.a.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.c.b;
import com.bytedance.z.a.d.a;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f46285a;

    /* renamed from: b  reason: collision with root package name */
    public int f46286b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f46287c;

    /* renamed from: d  reason: collision with root package name */
    public long f46288d;

    /* renamed from: e  reason: collision with root package name */
    public long f46289e;

    /* renamed from: f  reason: collision with root package name */
    public double f46290f;

    static {
        Covode.recordClassIndex(28258);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("proc_stat:{pid=").append(this.f46286b).append(" process_name:").append(this.f46285a).append(" history cpu_time:").append(this.f46287c).append(" delta cpu_time:").append(this.f46288d).append(" delta cpu_time * cpuNum:").append(this.f46288d * ((long) a.a())).append(" cpu_usage:").append(this.f46290f * 100.0d).append("%}");
        return sb.toString();
    }

    public final void a(long j2) {
        if (this.f46288d >= 0) {
            double a2 = (double) a.a();
            double d2 = (double) this.f46288d;
            Double.isNaN(a2);
            Double.isNaN(d2);
            double d3 = a2 * d2;
            double d4 = (double) j2;
            Double.isNaN(d4);
            this.f46290f = d3 / d4;
        }
    }

    public final void a(b bVar) {
        long j2;
        long j3 = this.f46287c;
        if (bVar == null) {
            j2 = 0;
        } else {
            j2 = ((c) bVar).f46287c;
        }
        long j4 = j3 - j2;
        this.f46288d = j4;
        if (this.f46289e == 0) {
            this.f46289e = j4;
        }
    }
}
