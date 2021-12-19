package com.bytedance.framwork.core.b.d;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static long f29456c = 5000;

    /* renamed from: a  reason: collision with root package name */
    public d f29457a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f29458b;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f29459d;

    /* renamed from: e  reason: collision with root package name */
    public CopyOnWriteArraySet<b> f29460e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f29462a = new c((byte) 0);

        static {
            Covode.recordClassIndex(17159);
        }
    }

    static {
        Covode.recordClassIndex(17157);
    }

    private c() {
        this.f29458b = true;
        this.f29459d = new Runnable() {
            /* class com.bytedance.framwork.core.b.d.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17158);
            }

            public final void run() {
                try {
                    Iterator<b> it = c.this.f29460e.iterator();
                    while (it.hasNext()) {
                        it.next().a(System.currentTimeMillis());
                    }
                    if (c.this.f29458b) {
                        c.this.f29457a.a(this, c.f29456c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f29460e = new CopyOnWriteArraySet<>();
        d dVar = new d("LogSendManager-Thread");
        this.f29457a = dVar;
        dVar.f29465a.start();
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
