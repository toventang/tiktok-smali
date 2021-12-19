package com.bytedance.common.wschannel.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f27016a;

    /* renamed from: b  reason: collision with root package name */
    public final c f27017b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27018c;

    static {
        Covode.recordClassIndex(15948);
    }

    public final String toString() {
        return "ConnectEvent{mType=" + this.f27016a + ", connectionState=" + this.f27017b + ", mChannelId=" + this.f27018c + '}';
    }

    public b(c cVar, a aVar, int i2) {
        this.f27017b = cVar;
        this.f27016a = aVar;
        this.f27018c = i2;
    }
}
