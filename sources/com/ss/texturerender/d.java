package com.ss.texturerender;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f151828a;

    static {
        Covode.recordClassIndex(101250);
    }

    @Override // com.ss.texturerender.a
    public final int a() {
        return this.f151828a.getAndIncrement();
    }

    @Override // com.ss.texturerender.a
    public final int b() {
        return this.f151828a.getAndDecrement();
    }

    private d() {
        this.f151828a = new AtomicInteger(0);
    }

    public d(byte b2) {
        this();
    }
}
