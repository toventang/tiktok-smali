package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private final long f64099a;

    /* renamed from: b  reason: collision with root package name */
    private final long f64100b;

    /* renamed from: c  reason: collision with root package name */
    private long f64101c;

    /* renamed from: d  reason: collision with root package name */
    private long f64102d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f64103e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f64104f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f64105g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f64106h = new WeakHandler(this);

    /* renamed from: i  reason: collision with root package name */
    private AbstractC1435a f64107i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.a$a  reason: collision with other inner class name */
    public interface AbstractC1435a {
        static {
            Covode.recordClassIndex(39502);
        }

        void a();

        void a(long j2);

        void b();
    }

    public static class b implements AbstractC1435a {
        static {
            Covode.recordClassIndex(39503);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public void a() {
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public void a(long j2) {
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public void b() {
        }
    }

    static {
        Covode.recordClassIndex(39501);
    }

    public final synchronized long b() {
        long j2;
        MethodCollector.i(8586);
        j2 = this.f64101c;
        MethodCollector.o(8586);
        return j2;
    }

    public final synchronized boolean c() {
        boolean z;
        MethodCollector.i(8588);
        z = this.f64104f;
        MethodCollector.o(8588);
        return z;
    }

    public final synchronized boolean d() {
        boolean z;
        MethodCollector.i(8589);
        z = this.f64105g;
        MethodCollector.o(8589);
        return z;
    }

    public final synchronized a a() {
        MethodCollector.i(8585);
        this.f64103e = false;
        this.f64104f = false;
        this.f64105g = true;
        if (this.f64099a <= 0) {
            this.f64104f = true;
            this.f64105g = false;
            AbstractC1435a aVar = this.f64107i;
            if (aVar != null) {
                aVar.b();
            }
            MethodCollector.o(8585);
            return this;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f64099a;
        this.f64102d = elapsedRealtime + j2;
        this.f64101c = j2;
        AbstractC1435a aVar2 = this.f64107i;
        if (aVar2 != null) {
            aVar2.a();
        }
        Handler handler = this.f64106h;
        handler.sendMessage(handler.obtainMessage(1));
        MethodCollector.o(8585);
        return this;
    }

    public final void a(AbstractC1435a aVar) {
        this.f64107i = aVar;
        if (this.f64104f && aVar != null) {
            aVar.b();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        MethodCollector.i(8904);
        synchronized (this) {
            try {
                if (!this.f64103e) {
                    long elapsedRealtime = this.f64102d - SystemClock.elapsedRealtime();
                    this.f64101c = elapsedRealtime;
                    long j2 = 0;
                    if (elapsedRealtime <= 0) {
                        this.f64104f = true;
                        this.f64105g = false;
                        AbstractC1435a aVar = this.f64107i;
                        if (aVar != null) {
                            aVar.b();
                        }
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        AbstractC1435a aVar2 = this.f64107i;
                        if (aVar2 != null) {
                            aVar2.a(this.f64101c);
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                        long j3 = this.f64101c;
                        long j4 = this.f64100b;
                        if (j3 < j4) {
                            long j5 = j3 - elapsedRealtime3;
                            if (j5 >= 0) {
                                j2 = j5;
                            }
                        } else {
                            long j6 = j4 - elapsedRealtime3;
                            while (j6 < 0) {
                                j6 += this.f64100b;
                            }
                            j2 = j6;
                        }
                        Handler handler = this.f64106h;
                        handler.sendMessageDelayed(handler.obtainMessage(1), j2);
                    }
                    MethodCollector.o(8904);
                }
            } finally {
                MethodCollector.o(8904);
            }
        }
    }

    public a(long j2, long j3, AbstractC1435a aVar) {
        this.f64099a = j2;
        this.f64100b = j3;
        this.f64107i = aVar;
    }
}
