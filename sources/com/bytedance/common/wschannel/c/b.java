package com.bytedance.common.wschannel.c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.common.wschannel.c.a.a f27023a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f27024b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.common.wschannel.channel.a.a.b.b f27025c;

    /* renamed from: d  reason: collision with root package name */
    public a f27026d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f27027e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f27028f = new Runnable() {
        /* class com.bytedance.common.wschannel.c.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15956);
        }

        public final void run() {
            if (b.this.f27024b.getAndSet(false) && b.this.f27026d != null) {
                b.this.f27026d.a();
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(15957);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(15955);
    }

    public b(a aVar, Handler handler) {
        this.f27026d = aVar;
        this.f27027e = handler;
    }
}
