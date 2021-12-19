package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.g.b;
import com.toutiao.proxyserver.x;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d implements Runnable, Callable<Void> {

    /* renamed from: d  reason: collision with root package name */
    private static final ExecutorService f154816d = new ThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
        /* class com.toutiao.proxyserver.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103118);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("video-cache-writer-" + thread.getId());
            return thread;
        }
    });

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f154817a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f154818b;

    /* renamed from: c  reason: collision with root package name */
    private BlockingQueue<a> f154819c;

    /* renamed from: e  reason: collision with root package name */
    private x f154820e;

    /* renamed from: f  reason: collision with root package name */
    private x.a f154821f;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: f  reason: collision with root package name */
        static final Queue<a> f154822f = new LinkedBlockingQueue(16);

        /* renamed from: a  reason: collision with root package name */
        x f154823a;

        /* renamed from: b  reason: collision with root package name */
        byte[] f154824b;

        /* renamed from: c  reason: collision with root package name */
        int f154825c;

        /* renamed from: d  reason: collision with root package name */
        int f154826d;

        /* renamed from: e  reason: collision with root package name */
        public int f154827e;

        private a() {
        }

        static {
            Covode.recordClassIndex(103119);
        }

        public final void b() {
            x xVar = this.f154823a;
            if (xVar != null) {
                b.a(xVar.f155049a);
            }
        }

        public final x a() {
            x xVar = this.f154823a;
            if (xVar != null) {
                try {
                    xVar.a(this.f154824b, this.f154825c, this.f154826d);
                } catch (x.a e2) {
                    b.a(this.f154823a.f155049a);
                    throw e2;
                }
            }
            return this.f154823a;
        }

        static a a(int i2) {
            a poll = f154822f.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f154827e = i2;
            return poll;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        run();
        return null;
    }

    static {
        Covode.recordClassIndex(103117);
    }

    public final Future<Void> b() {
        if (this.f154818b && !this.f154817a) {
            this.f154817a = true;
            try {
                return f154816d.submit((Callable) this);
            } catch (Exception unused) {
                this.f154818b = false;
            }
        }
        return null;
    }

    public final void a() {
        if (!this.f154818b || this.f154819c == null || !this.f154817a) {
            x xVar = this.f154820e;
            if (xVar != null) {
                b.a(xVar.f155049a);
                return;
            }
            return;
        }
        this.f154819c.clear();
        BlockingQueue<a> blockingQueue = this.f154819c;
        x xVar2 = this.f154820e;
        a a2 = a.a(2);
        a2.f154823a = xVar2;
        blockingQueue.offer(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != 3) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.d.run():void");
    }

    public d(x xVar) {
        boolean z = u.A;
        this.f154818b = z;
        if (z) {
            this.f154819c = new LinkedBlockingQueue();
        }
        this.f154820e = xVar;
        this.f154817a = false;
    }

    public final void a(byte[] bArr, int i2) {
        if (!this.f154818b) {
            x xVar = this.f154820e;
            if (xVar != null) {
                xVar.a(bArr, 0, i2);
            }
        } else if (this.f154821f != null || !this.f154817a) {
            x.a aVar = this.f154821f;
            if (aVar != null && this.f154820e != null) {
                this.f154820e = null;
                throw aVar;
            }
        } else {
            BlockingQueue<a> blockingQueue = this.f154819c;
            x xVar2 = this.f154820e;
            a a2 = a.a(1);
            a2.f154823a = xVar2;
            if (a2.f154824b == null || a2.f154824b.length != bArr.length) {
                a2.f154824b = new byte[bArr.length];
            }
            System.arraycopy(bArr, 0, a2.f154824b, 0, bArr.length);
            a2.f154825c = 0;
            a2.f154826d = i2;
            blockingQueue.offer(a2);
        }
    }
}
