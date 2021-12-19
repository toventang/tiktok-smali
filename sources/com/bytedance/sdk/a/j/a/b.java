package com.bytedance.sdk.a.j.a;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.j.a.e;
import java.util.concurrent.BlockingQueue;

final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f43351a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<e> f43352b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<e> f43353c;

    static {
        Covode.recordClassIndex(26567);
    }

    public final void run() {
        c cVar;
        Process.setThreadPriority(10);
        while (true) {
            try {
                e take = this.f43352b.take();
                if ((take instanceof c) && (cVar = (c) take) != null) {
                    String name = Thread.currentThread().getName();
                    String str = cVar.f43359e;
                    try {
                        if (!cVar.a()) {
                            if (!m.a(str) && !m.a(name)) {
                                Thread.currentThread().setName("ApiLocalDispatcher-".concat(String.valueOf(str)));
                            }
                            if (Logger.debug()) {
                                this.f43352b.size();
                                this.f43353c.size();
                            }
                            if (cVar.d() == e.a.IMMEDIATE) {
                                com.bytedance.common.utility.b.e.a(cVar);
                            } else {
                                cVar.f();
                                this.f43353c.add(cVar);
                            }
                            if (!m.a(str) && !m.a(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f43351a) {
                    return;
                }
            }
        }
    }

    public b(BlockingQueue<e> blockingQueue, BlockingQueue<e> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f43352b = blockingQueue;
        this.f43353c = blockingQueue2;
    }
}
