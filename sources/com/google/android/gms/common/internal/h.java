package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.d.g;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class h implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final a f50405a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<i.b> f50406b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<i.b> f50407c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<i.c> f50408d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f50409e = false;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f50410f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public boolean f50411g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f50412h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f50413i = new Object();

    public interface a {
        static {
            Covode.recordClassIndex(31403);
        }

        boolean g();
    }

    static {
        Covode.recordClassIndex(31402);
    }

    public final void a() {
        this.f50409e = false;
        this.f50410f.incrementAndGet();
    }

    public final void a(i.c cVar) {
        MethodCollector.i(11097);
        r.a(cVar);
        synchronized (this.f50413i) {
            try {
                if (this.f50408d.contains(cVar)) {
                    String.valueOf(String.valueOf(cVar)).length();
                } else {
                    this.f50408d.add(cVar);
                }
            } finally {
                MethodCollector.o(11097);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        MethodCollector.i(11254);
        if (message.what == 1) {
            i.b bVar = (i.b) message.obj;
            synchronized (this.f50413i) {
                try {
                    if (this.f50409e && this.f50405a.g() && this.f50406b.contains(bVar)) {
                        bVar.a(null);
                    }
                } finally {
                    MethodCollector.o(11254);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        MethodCollector.o(11254);
        return false;
    }

    public h(Looper looper, a aVar) {
        this.f50405a = aVar;
        this.f50412h = new g(looper, this);
    }
}
