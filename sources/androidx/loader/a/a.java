package androidx.loader.a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.d.d;
import androidx.core.g.h;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D> extends c<D> {

    /* renamed from: a  reason: collision with root package name */
    volatile a<D>.RunnableC0050a f3573a;

    /* renamed from: b  reason: collision with root package name */
    volatile a<D>.RunnableC0050a f3574b;

    /* renamed from: c  reason: collision with root package name */
    long f3575c;

    /* renamed from: d  reason: collision with root package name */
    long f3576d;

    /* renamed from: e  reason: collision with root package name */
    Handler f3577e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f3578f;

    static {
        Covode.recordClassIndex(1353);
    }

    public void a(D d2) {
    }

    public abstract D d();

    public void e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.a$a  reason: collision with other inner class name */
    public final class RunnableC0050a extends d<Void, Void, D> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f3579a;

        /* renamed from: h  reason: collision with root package name */
        private final CountDownLatch f3581h = new CountDownLatch(1);

        static {
            Covode.recordClassIndex(1354);
        }

        public final void run() {
            this.f3579a = false;
            a.this.c();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public D a() {
            try {
                return (D) a.this.d();
            } catch (d e2) {
                if (this.f3598f.get()) {
                    return null;
                }
                throw e2;
            }
        }

        RunnableC0050a() {
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.a.d
        public final void a(D d2) {
            try {
                a aVar = a.this;
                if (aVar.f3573a != this) {
                    aVar.a(this, d2);
                } else if (aVar.r) {
                    aVar.a((Object) d2);
                } else {
                    aVar.u = false;
                    aVar.f3576d = SystemClock.uptimeMillis();
                    aVar.f3573a = null;
                    aVar.b(d2);
                }
            } finally {
                this.f3581h.countDown();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.a.d
        public final void b(D d2) {
            try {
                a.this.a(this, d2);
            } finally {
                this.f3581h.countDown();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.a.c
    public final void a() {
        super.a();
        k();
        this.f3573a = new RunnableC0050a();
        c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.a.c
    public final boolean b() {
        if (this.f3573a == null) {
            return false;
        }
        if (!this.q) {
            this.t = true;
        }
        if (this.f3574b != null) {
            if (this.f3573a.f3579a) {
                this.f3573a.f3579a = false;
                this.f3577e.removeCallbacks(this.f3573a);
            }
            this.f3573a = null;
            return false;
        } else if (this.f3573a.f3579a) {
            this.f3573a.f3579a = false;
            this.f3577e.removeCallbacks(this.f3573a);
            this.f3573a = null;
            return false;
        } else {
            a<D>.RunnableC0050a aVar = this.f3573a;
            aVar.f3598f.set(true);
            boolean cancel = aVar.f3596d.cancel(false);
            if (cancel) {
                this.f3574b = this.f3573a;
                e();
            }
            this.f3573a = null;
            return cancel;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f3574b == null && this.f3573a != null) {
            if (this.f3573a.f3579a) {
                this.f3573a.f3579a = false;
                this.f3577e.removeCallbacks(this.f3573a);
            }
            if (this.f3575c <= 0 || SystemClock.uptimeMillis() >= this.f3576d + this.f3575c) {
                this.f3573a.a(this.f3578f);
                return;
            }
            this.f3573a.f3579a = true;
            this.f3577e.postAtTime(this.f3573a, this.f3576d + this.f3575c);
        }
    }

    public a(Context context) {
        this(context, d.f3593c);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f3576d = -10000;
        this.f3578f = executor;
    }

    /* access modifiers changed from: package-private */
    public final void a(a<D>.RunnableC0050a aVar, D d2) {
        a((Object) d2);
        if (this.f3574b == aVar) {
            if (this.u) {
                o();
            }
            this.f3576d = SystemClock.uptimeMillis();
            this.f3574b = null;
            c();
        }
    }

    @Override // androidx.loader.a.c
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.f3573a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f3573a);
            printWriter.print(" waiting=");
            printWriter.println(this.f3573a.f3579a);
        }
        if (this.f3574b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f3574b);
            printWriter.print(" waiting=");
            printWriter.println(this.f3574b.f3579a);
        }
        if (this.f3575c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            h.a(this.f3575c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j2 = this.f3576d;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j2 == 0) {
                printWriter.print("--");
            } else {
                h.a(j2 - uptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }
}
