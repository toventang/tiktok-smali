package com.tencent.wcdb.support;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f154702a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC4112a f154703b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f154704c;

    /* renamed from: com.tencent.wcdb.support.a$a  reason: collision with other inner class name */
    public interface AbstractC4112a {
        static {
            Covode.recordClassIndex(103085);
        }

        void b();
    }

    static {
        Covode.recordClassIndex(103084);
    }

    public final void a() {
        if (b()) {
            throw new OperationCanceledException();
        }
    }

    private boolean b() {
        boolean z;
        MethodCollector.i(58);
        synchronized (this) {
            try {
                z = this.f154702a;
            } finally {
                MethodCollector.o(58);
            }
        }
        return z;
    }

    private void c() {
        MethodCollector.i(64);
        while (this.f154704c) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.o(64);
    }

    public final void a(AbstractC4112a aVar) {
        MethodCollector.i(62);
        synchronized (this) {
            try {
                c();
                if (this.f154703b != aVar) {
                    this.f154703b = aVar;
                    if (!this.f154702a || aVar == null) {
                        MethodCollector.o(62);
                        return;
                    }
                    aVar.b();
                    MethodCollector.o(62);
                }
            } finally {
                MethodCollector.o(62);
            }
        }
    }
}
