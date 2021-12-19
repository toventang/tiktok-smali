package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ae f50051a;

    static {
        Covode.recordClassIndex(31231);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.f50051a.f50024b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.f50051a.f50024b.unlock();
            }
        } catch (RuntimeException e2) {
            aw awVar = this.f50051a.f50023a;
            awVar.f50072e.sendMessage(awVar.f50072e.obtainMessage(2, e2));
        } finally {
            this.f50051a.f50024b.unlock();
        }
    }

    private ao(ae aeVar) {
        this.f50051a = aeVar;
    }

    /* synthetic */ ao(ae aeVar, byte b2) {
        this(aeVar);
    }
}
