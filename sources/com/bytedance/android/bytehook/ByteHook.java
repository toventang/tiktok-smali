package com.bytedance.android.bytehook;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class ByteHook {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6804a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6805b = c.AUTOMATIC.value;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6806c;

    /* renamed from: d  reason: collision with root package name */
    private static int f6807d = 1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f6808a;

        /* renamed from: b  reason: collision with root package name */
        public int f6809b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6810c;

        static {
            Covode.recordClassIndex(3269);
        }
    }

    private static native String nativeGetRecords();

    private static native int nativeInit(int i2, boolean z);

    private static native void nativeSetDebug(boolean z);

    static {
        Covode.recordClassIndex(3268);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private a f6811a = ByteHook.f6804a;

        /* renamed from: b  reason: collision with root package name */
        private int f6812b = ByteHook.f6805b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6813c;

        static {
            Covode.recordClassIndex(3270);
        }

        public final a a() {
            a aVar = new a();
            aVar.f6808a = this.f6811a;
            aVar.f6809b = this.f6812b;
            aVar.f6810c = this.f6813c;
            return aVar;
        }
    }

    public static int a() {
        if (f6806c) {
            return f6807d;
        }
        return a(new b().a());
    }

    public enum c {
        AUTOMATIC(0),
        MANUAL(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3271);
        }

        private c(int i2) {
            this.value = i2;
        }
    }

    private static synchronized int a(a aVar) {
        synchronized (ByteHook.class) {
            MethodCollector.i(7678);
            if (f6806c) {
                int i2 = f6807d;
                MethodCollector.o(7678);
                return i2;
            }
            f6806c = true;
            try {
                if (aVar.f6808a == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.b("bytehook", false, null);
                    m.a(uptimeMillis, "bytehook");
                }
                try {
                    f6807d = nativeInit(aVar.f6809b, aVar.f6810c);
                } catch (Throwable unused) {
                    f6807d = 101;
                }
                int i3 = f6807d;
                MethodCollector.o(7678);
                return i3;
            } catch (Throwable unused2) {
                f6807d = 100;
                MethodCollector.o(7678);
                return 100;
            }
        }
    }
}
