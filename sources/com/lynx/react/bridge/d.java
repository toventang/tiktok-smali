package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.e;

public abstract class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f55530a;

    static {
        Covode.recordClassIndex(34779);
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (RuntimeException e2) {
            this.f55530a.a(e2);
        }
    }

    public d(e eVar) {
        this.f55530a = eVar;
    }
}
