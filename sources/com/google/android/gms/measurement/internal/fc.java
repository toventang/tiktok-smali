package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
public final class fc extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f51586a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<fd<?>> f51587b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51588c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ex f51589d;

    static {
        Covode.recordClassIndex(32224);
    }

    public final void a() {
        MethodCollector.i(8364);
        synchronized (this.f51586a) {
            try {
                this.f51586a.notifyAll();
            } finally {
                MethodCollector.o(8364);
            }
        }
    }

    private final void b() {
        MethodCollector.i(8363);
        synchronized (this.f51589d.f51567c) {
            try {
                if (!this.f51588c) {
                    this.f51589d.f51568d.release();
                    this.f51589d.f51567c.notifyAll();
                    if (this == this.f51589d.f51565a) {
                        this.f51589d.f51565a = null;
                    } else if (this == this.f51589d.f51566b) {
                        this.f51589d.f51566b = null;
                    } else {
                        this.f51589d.q().f51468c.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f51588c = true;
                }
            } finally {
                MethodCollector.o(8363);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0089, code lost:
        b();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8359);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.fc.run():void");
    }

    private final void a(InterruptedException interruptedException) {
        this.f51589d.q().f51471f.a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public fc(ex exVar, String str, BlockingQueue<fd<?>> blockingQueue) {
        this.f51589d = exVar;
        r.a((Object) str);
        r.a(blockingQueue);
        this.f51587b = blockingQueue;
        setName(str);
    }
}
