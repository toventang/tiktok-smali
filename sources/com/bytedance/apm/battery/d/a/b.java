package com.bytedance.apm.battery.d.a;

import com.bytedance.covode.number.Covode;

public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    public long f24517d;

    /* renamed from: e  reason: collision with root package name */
    public long f24518e;

    /* renamed from: f  reason: collision with root package name */
    public String f24519f;

    /* renamed from: g  reason: collision with root package name */
    public StackTraceElement[] f24520g;

    static {
        Covode.recordClassIndex(14443);
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 9; i2 < this.f24520g.length; i2++) {
            sb.append("\tat ").append(this.f24520g[i2].toString()).append("\n");
        }
        return sb.toString();
    }
}
