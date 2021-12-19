package com.bytedance.nita.d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a {
    static {
        Covode.recordClassIndex(25480);
    }

    public final void c() {
        b();
    }

    static final class a implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f41642a;

        static {
            Covode.recordClassIndex(25481);
        }

        a(c cVar) {
            this.f41642a = cVar;
        }

        public final boolean queueIdle() {
            this.f41642a.c();
            return true;
        }
    }

    static final class b implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f41643a;

        static {
            Covode.recordClassIndex(25482);
        }

        b(c cVar) {
            this.f41643a = cVar;
        }

        public final boolean queueIdle() {
            this.f41643a.c();
            return true;
        }
    }

    /* renamed from: com.bytedance.nita.d.c$c  reason: collision with other inner class name */
    static final class RunnableC1018c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f41644a;

        static {
            Covode.recordClassIndex(25483);
        }

        RunnableC1018c(c cVar) {
            this.f41644a = cVar;
        }

        public final void run() {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                /* class com.bytedance.nita.d.c.RunnableC1018c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RunnableC1018c f41645a;

                static {
                    Covode.recordClassIndex(25484);
                }

                {
                    this.f41645a = r1;
                }

                public final boolean queueIdle() {
                    this.f41645a.f41644a.c();
                    return true;
                }
            });
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 23) {
            Looper mainLooper = Looper.getMainLooper();
            l.a((Object) mainLooper, "");
            mainLooper.getQueue().addIdleHandler(new a(this));
            return;
        }
        MessageQueue messageQueue = (MessageQueue) com.bytedance.nita.e.c.a(this.f41633a, "mQueue");
        if (messageQueue != null) {
            messageQueue.addIdleHandler(new b(this));
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC1018c(this));
        }
    }

    public final boolean handleMessage(Message message) {
        l.c(message, "");
        b();
        return true;
    }

    @Override // com.bytedance.nita.d.d, com.bytedance.nita.d.a
    public final void a(com.bytedance.nita.api.c cVar, Context context, int i2) {
        l.c(cVar, "");
        l.c(context, "");
        super.a(cVar, context, i2);
        if (this.f41634b.size() != 0 && !this.f41633a.hasMessages(1)) {
            a();
        }
    }
}
