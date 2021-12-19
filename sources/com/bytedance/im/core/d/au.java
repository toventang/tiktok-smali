package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public int f37841a;

    /* renamed from: b  reason: collision with root package name */
    public long f37842b;

    /* renamed from: c  reason: collision with root package name */
    public long f37843c;

    /* renamed from: d  reason: collision with root package name */
    public long f37844d;

    /* renamed from: e  reason: collision with root package name */
    public long f37845e;

    static {
        Covode.recordClassIndex(22721);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestTimestampModel{");
        sb.append("cmd=").append(this.f37841a);
        sb.append(", clientStartTime=").append(this.f37842b);
        sb.append(", clientEndTime=").append(this.f37843c);
        sb.append(", serverArrivedTime=").append(this.f37844d);
        sb.append(", serverExecutionEndTime=").append(this.f37845e);
        sb.append('}');
        return sb.toString();
    }
}
