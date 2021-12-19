package com.ss.android.ugc.aweme.util;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class h implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private final long f142493a;

    /* renamed from: b  reason: collision with root package name */
    private final long f142494b = 100;

    /* renamed from: c  reason: collision with root package name */
    private long f142495c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f142496d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f142497e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f142498f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f142499g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f142500h = new WeakHandler(this);

    /* renamed from: i  reason: collision with root package name */
    private a f142501i;

    public interface a {
        static {
            Covode.recordClassIndex(93196);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(93195);
    }

    public final synchronized boolean c() {
        boolean z;
        MethodCollector.i(297);
        z = this.f142497e;
        MethodCollector.o(297);
        return z;
    }

    public final synchronized void a() {
        MethodCollector.i(294);
        this.f142496d = true;
        this.f142498f = false;
        this.f142499g = false;
        this.f142500h.removeMessages(1);
        MethodCollector.o(294);
    }

    public final synchronized h b() {
        MethodCollector.i(296);
        this.f142499g = false;
        this.f142496d = false;
        this.f142497e = false;
        this.f142498f = true;
        if (this.f142493a <= 0) {
            this.f142497e = true;
            this.f142498f = false;
            a aVar = this.f142501i;
            if (aVar != null) {
                aVar.a();
            }
            MethodCollector.o(296);
            return this;
        }
        this.f142495c = SystemClock.elapsedRealtime() + this.f142493a;
        Handler handler = this.f142500h;
        handler.sendMessage(handler.obtainMessage(1));
        MethodCollector.o(296);
        return this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        MethodCollector.i(298);
        synchronized (this) {
            try {
                if (!this.f142496d && !this.f142499g) {
                    long elapsedRealtime = this.f142495c - SystemClock.elapsedRealtime();
                    long j2 = 0;
                    if (elapsedRealtime <= 0) {
                        this.f142497e = true;
                        this.f142498f = false;
                        a aVar = this.f142501i;
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
                        long j3 = this.f142494b;
                        if (elapsedRealtime < j3) {
                            long j4 = elapsedRealtime - elapsedRealtime2;
                            if (j4 >= 0) {
                                j2 = j4;
                            }
                        } else {
                            long j5 = j3 - elapsedRealtime2;
                            while (j5 < 0) {
                                j5 += this.f142494b;
                            }
                            j2 = j5;
                        }
                        Handler handler = this.f142500h;
                        handler.sendMessageDelayed(handler.obtainMessage(1), j2);
                    }
                    MethodCollector.o(298);
                }
            } finally {
                MethodCollector.o(298);
            }
        }
    }

    public h(long j2, a aVar) {
        this.f142493a = j2;
        this.f142501i = aVar;
    }
}
