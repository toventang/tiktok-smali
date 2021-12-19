package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

final class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f52619e;

    /* renamed from: a  reason: collision with root package name */
    final Object f52620a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final Handler f52621b = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32597);
        }

        public final boolean handleMessage(Message message) {
            MethodCollector.i(3038);
            if (message.what != 0) {
                MethodCollector.o(3038);
                return false;
            }
            b bVar = b.this;
            C1223b bVar2 = (C1223b) message.obj;
            synchronized (bVar.f52620a) {
                try {
                    if (bVar.f52622c == bVar2 || bVar.f52623d == bVar2) {
                        bVar.a(bVar2, 2);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3038);
                    throw th;
                }
            }
            MethodCollector.o(3038);
            return true;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    C1223b f52622c;

    /* renamed from: d  reason: collision with root package name */
    C1223b f52623d;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(32598);
        }

        void a();

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(32596);
    }

    static b a() {
        if (f52619e == null) {
            f52619e = new b();
        }
        return f52619e;
    }

    private b() {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        C1223b bVar = this.f52623d;
        if (bVar != null) {
            this.f52622c = bVar;
            this.f52623d = null;
            a aVar = bVar.f52625a.get();
            if (aVar != null) {
                aVar.a();
            } else {
                this.f52622c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    public static class C1223b {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a> f52625a;

        /* renamed from: b  reason: collision with root package name */
        int f52626b;

        /* renamed from: c  reason: collision with root package name */
        boolean f52627c;

        static {
            Covode.recordClassIndex(32599);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(a aVar) {
            if (aVar == null || this.f52625a.get() != aVar) {
                return false;
            }
            return true;
        }

        C1223b(int i2, a aVar) {
            this.f52625a = new WeakReference<>(aVar);
            this.f52626b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e(a aVar) {
        C1223b bVar = this.f52622c;
        if (bVar == null || !bVar.a(aVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean f(a aVar) {
        C1223b bVar = this.f52623d;
        if (bVar == null || !bVar.a(aVar)) {
            return false;
        }
        return true;
    }

    public final boolean c(a aVar) {
        boolean e2;
        MethodCollector.i(4026);
        synchronized (this.f52620a) {
            try {
                e2 = e(aVar);
            } finally {
                MethodCollector.o(4026);
            }
        }
        return e2;
    }

    public final void a(a aVar) {
        MethodCollector.i(3275);
        synchronized (this.f52620a) {
            try {
                if (e(aVar) && !this.f52622c.f52627c) {
                    this.f52622c.f52627c = true;
                    this.f52621b.removeCallbacksAndMessages(this.f52622c);
                }
            } finally {
                MethodCollector.o(3275);
            }
        }
    }

    public final void b(a aVar) {
        MethodCollector.i(4025);
        synchronized (this.f52620a) {
            try {
                if (e(aVar) && this.f52622c.f52627c) {
                    this.f52622c.f52627c = false;
                    a(this.f52622c);
                }
            } finally {
                MethodCollector.o(4025);
            }
        }
    }

    public final boolean d(a aVar) {
        boolean z;
        MethodCollector.i(4027);
        synchronized (this.f52620a) {
            try {
                if (!e(aVar)) {
                    if (!f(aVar)) {
                        z = false;
                    }
                }
                z = true;
            } finally {
                MethodCollector.o(4027);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void a(C1223b bVar) {
        if (bVar.f52626b != -2) {
            int i2 = 2750;
            if (bVar.f52626b > 0) {
                i2 = bVar.f52626b;
            } else if (bVar.f52626b == -1) {
                i2 = 1500;
            }
            this.f52621b.removeCallbacksAndMessages(bVar);
            Handler handler = this.f52621b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C1223b bVar, int i2) {
        a aVar = bVar.f52625a.get();
        if (aVar == null) {
            return false;
        }
        this.f52621b.removeCallbacksAndMessages(bVar);
        aVar.a(i2);
        return true;
    }

    public final void a(a aVar, int i2) {
        MethodCollector.i(2614);
        synchronized (this.f52620a) {
            try {
                if (e(aVar)) {
                    a(this.f52622c, i2);
                } else if (f(aVar)) {
                    a(this.f52623d, i2);
                }
            } finally {
                MethodCollector.o(2614);
            }
        }
    }
}
