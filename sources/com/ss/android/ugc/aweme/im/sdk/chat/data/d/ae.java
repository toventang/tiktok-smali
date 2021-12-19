package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ae implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f100273a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(63927);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    @Override // f.a.b.b
    public boolean isDisposed() {
        return this.f100273a.get();
    }

    @Override // f.a.b.b
    public void dispose() {
        if (this.f100273a.compareAndSet(false, true)) {
            a();
        }
    }
}
