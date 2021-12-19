package com.bytedance.framwork.core.b.d;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static long f29449c = 30000;

    /* renamed from: a  reason: collision with root package name */
    public d f29450a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f29451b;

    /* renamed from: d  reason: collision with root package name */
    CopyOnWriteArraySet<b> f29452d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f29453e;

    /* renamed from: com.bytedance.framwork.core.b.d.a$a  reason: collision with other inner class name */
    public static final class C0627a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f29455a = new a((byte) 0);

        static {
            Covode.recordClassIndex(17155);
        }
    }

    static {
        Covode.recordClassIndex(17153);
    }

    private a() {
        this.f29451b = true;
        this.f29453e = new Runnable() {
            /* class com.bytedance.framwork.core.b.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17154);
            }

            public final void run() {
                try {
                    Iterator<b> it = a.this.f29452d.iterator();
                    while (it.hasNext()) {
                        it.next().a(System.currentTimeMillis());
                    }
                    if (a.this.f29451b) {
                        a.this.f29450a.a(this, a.f29449c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f29452d = new CopyOnWriteArraySet<>();
        d dVar = new d("AsyncEventManager-Thread");
        this.f29450a = dVar;
        dVar.f29465a.start();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        d dVar = this.f29450a;
        dVar.a(dVar.a(runnable), 0);
    }

    public final void a(b bVar) {
        try {
            this.f29452d.add(bVar);
            if (this.f29451b) {
                this.f29450a.b(this.f29453e);
                this.f29450a.a(this.f29453e, f29449c);
            }
        } catch (Throwable unused) {
        }
    }
}
