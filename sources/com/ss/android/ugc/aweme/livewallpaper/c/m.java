package com.ss.android.ugc.aweme.livewallpaper.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f108831a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(69706);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.g
    public final int a() {
        return this.f108831a.getAndIncrement();
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.g
    public final int b() {
        return this.f108831a.getAndDecrement();
    }
}
