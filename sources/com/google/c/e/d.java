package com.google.c.e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.s;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

public final class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final c f54113a;

    /* renamed from: b  reason: collision with root package name */
    final c f54114b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f54115c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<Closeable> f54116d = new ArrayDeque(4);

    interface c {
        static {
            Covode.recordClassIndex(33557);
        }

        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        static final a f54117a = new a();

        a() {
        }

        static {
            Covode.recordClassIndex(33555);
        }

        @Override // com.google.c.e.d.c
        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            c.f54112a.log(Level.WARNING, "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
        }
    }

    static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f54118a = new b();

        /* renamed from: b  reason: collision with root package name */
        static final Method f54119b = a();

        b() {
        }

        static {
            Covode.recordClassIndex(33556);
        }

        private static Method a() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.google.c.e.d.c
        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    Method method = f54119b;
                    Object[] objArr = {th2};
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{th, objArr}, 110000, "java.lang.Object", true, "com_google_common_io_Closer$SuppressingSuppressor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        Object obj = a2.second;
                        return;
                    }
                    com.bytedance.helios.sdk.a.a(method.invoke(th, objArr), method, new Object[]{th, objArr}, "com_google_common_io_Closer$SuppressingSuppressor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                } catch (Throwable unused) {
                    a.f54117a.a(closeable, th, th2);
                }
            }
        }
    }

    static {
        c cVar;
        Covode.recordClassIndex(33554);
        if (b.f54119b != null) {
            cVar = b.f54118a;
        } else {
            cVar = a.f54117a;
        }
        f54113a = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.f54115c;
        while (!this.f54116d.isEmpty()) {
            Closeable removeFirst = this.f54116d.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f54114b.a(removeFirst, th, th2);
                }
            }
        }
        if (this.f54115c == null && th != null) {
            s.a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    public final <C extends Closeable> C a(C c2) {
        if (c2 != null) {
            this.f54116d.addFirst(c2);
        }
        return c2;
    }

    d(c cVar) {
        this.f54114b = (c) k.a(cVar);
    }
}
