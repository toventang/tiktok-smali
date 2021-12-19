package com.bytedance.aweme.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f25787a;

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorC0547a f25788b = new ExecutorC0547a();

    /* renamed from: c  reason: collision with root package name */
    public static final a f25789c = new a();

    private a() {
    }

    /* renamed from: com.bytedance.aweme.b.a$a  reason: collision with other inner class name */
    public static final class ExecutorC0547a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f25790a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(15058);
        }

        /* renamed from: com.bytedance.aweme.b.a$a$a  reason: collision with other inner class name */
        static final class RunnableC0548a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExecutorC0547a f25792a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f25793b;

            static {
                Covode.recordClassIndex(15059);
            }

            RunnableC0548a(ExecutorC0547a aVar, Runnable runnable) {
                this.f25792a = aVar;
                this.f25793b = runnable;
            }

            public final void run() {
                this.f25793b.run();
            }
        }

        public final void execute(Runnable runnable) {
            if (runnable != null) {
                this.f25790a.post(new RunnableC0548a(this, runnable));
            }
        }
    }

    static {
        Covode.recordClassIndex(15057);
    }
}
