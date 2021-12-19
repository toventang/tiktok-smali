package com.ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n f68155a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68156b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f68157c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Executor f68160a;

        static {
            Covode.recordClassIndex(41994);
        }
    }

    static {
        Covode.recordClassIndex(41992);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Callable<?> f68158a;

        /* renamed from: b  reason: collision with root package name */
        private final Message f68159b;

        static {
            Covode.recordClassIndex(41993);
        }

        public final void run() {
            Object e2;
            try {
                e2 = this.f68158a.call();
            } catch (Exception e3) {
                e2 = e3;
            }
            Message message = this.f68159b;
            if (message != null) {
                message.obj = e2;
                this.f68159b.sendToTarget();
            }
        }

        public final String toString() {
            return "TaskManager[" + this.f68158a.toString() + "]";
        }

        private a(Callable<?> callable, Message message) {
            this.f68158a = callable;
            this.f68159b = message;
        }

        /* synthetic */ a(Callable callable, Message message, byte b2) {
            this(callable, message);
        }
    }

    public static n a() {
        MethodCollector.i(3161);
        if (f68155a == null) {
            synchronized (n.class) {
                try {
                    if (f68155a == null) {
                        f68155a = new n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3161);
                    throw th;
                }
            }
        }
        n nVar = f68155a;
        MethodCollector.o(3161);
        return nVar;
    }

    private static void a(n nVar) {
        if (!nVar.f68156b) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    private static Runnable b(Handler handler, Callable<?> callable, int i2) {
        if (handler == null) {
            return new a(callable, null, (byte) 0);
        }
        return new a(callable, handler.obtainMessage(i2), (byte) 0);
    }

    public final void a(Handler handler, Callable<?> callable, int i2) {
        a(this);
        this.f68157c.execute(b(handler, callable, i2));
    }
}
