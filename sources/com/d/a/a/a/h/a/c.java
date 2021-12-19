package com.d.a.a.a.h.a;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.h.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f46434a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f46435b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f46436c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f46437d = null;

    static {
        Covode.recordClassIndex(28346);
    }

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f46434a = linkedBlockingQueue;
        this.f46435b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b poll = this.f46436c.poll();
        this.f46437d = poll;
        if (poll != null) {
            poll.a(this.f46435b);
        }
    }

    @Override // com.d.a.a.a.h.a.b.a
    public final void a() {
        this.f46437d = null;
        b();
    }

    public final void a(b bVar) {
        bVar.f46432d = this;
        this.f46436c.add(bVar);
        if (this.f46437d == null) {
            b();
        }
    }
}
