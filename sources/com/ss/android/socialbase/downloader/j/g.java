package com.ss.android.socialbase.downloader.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Object f60728a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<b> f60729b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public a f60730c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f60731d;

    static {
        Covode.recordClassIndex(37472);
    }

    public class a extends HandlerThread {
        static {
            Covode.recordClassIndex(37473);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            MethodCollector.i(11121);
            super.onLooperPrepared();
            Looper looper = getLooper();
            synchronized (g.this.f60728a) {
                try {
                    g.this.f60731d = new Handler(looper);
                } finally {
                    MethodCollector.o(11121);
                }
            }
            while (!g.this.f60729b.isEmpty()) {
                b poll = g.this.f60729b.poll();
                g.this.f60731d.postDelayed(poll.f60733a, poll.f60734b);
            }
        }

        a(String str) {
            super(str);
        }
    }

    public g(String str) {
        this.f60730c = new a(str);
    }

    public final void a(Runnable runnable, long j2) {
        MethodCollector.i(10794);
        if (this.f60731d == null) {
            synchronized (this.f60728a) {
                try {
                    if (this.f60731d == null) {
                        this.f60729b.add(new b(runnable, j2));
                        return;
                    }
                } finally {
                    MethodCollector.o(10794);
                }
            }
        }
        this.f60731d.postDelayed(runnable, j2);
        MethodCollector.o(10794);
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f60733a;

        /* renamed from: b  reason: collision with root package name */
        public long f60734b;

        static {
            Covode.recordClassIndex(37474);
        }

        public b(Runnable runnable, long j2) {
            this.f60733a = runnable;
            this.f60734b = j2;
        }
    }
}
