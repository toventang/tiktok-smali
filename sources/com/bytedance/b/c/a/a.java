package com.bytedance.b.c.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0556a f25981a;

    /* renamed from: b  reason: collision with root package name */
    public double f25982b;

    /* renamed from: c  reason: collision with root package name */
    public double f25983c;

    /* renamed from: d  reason: collision with root package name */
    public double f25984d;

    /* renamed from: e  reason: collision with root package name */
    public double f25985e;

    /* renamed from: f  reason: collision with root package name */
    public String f25986f;

    /* renamed from: g  reason: collision with root package name */
    public long f25987g;

    /* renamed from: h  reason: collision with root package name */
    public int f25988h;

    static {
        Covode.recordClassIndex(15146);
    }

    /* renamed from: com.bytedance.b.c.a.a$a  reason: collision with other inner class name */
    public enum EnumC0556a {
        MIX,
        FRONT,
        BACK;

        static {
            Covode.recordClassIndex(15147);
        }
    }

    public final String toString() {
        return "CpuCacheItem{type=" + this.f25981a + ", metricRate=" + this.f25982b + ", metricMaxRate=" + this.f25983c + ", metricCpuStats=" + this.f25984d + ", metricMaxCpuStats=" + this.f25985e + ", sceneString='" + this.f25986f + '\'' + ", firstTs=" + this.f25987g + ", times=" + this.f25988h + '}';
    }

    public a(EnumC0556a aVar, long j2) {
        this.f25981a = aVar;
        this.f25987g = j2;
    }
}
