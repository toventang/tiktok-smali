package androidx.e.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.c.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<a> f2700a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    final g<b, Long> f2701b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f2702c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public c f2703d;

    /* renamed from: e  reason: collision with root package name */
    long f2704e = 0;

    /* renamed from: f  reason: collision with root package name */
    boolean f2705f = false;

    /* renamed from: g  reason: collision with root package name */
    private final C0040a f2706g = new C0040a();

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(935);
        }

        boolean a(long j2);
    }

    /* access modifiers changed from: package-private */
    public static class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f2713b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f2714c = new Choreographer.FrameCallback() {
            /* class androidx.e.a.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(940);
            }

            public final void doFrame(long j2) {
                e.this.f2708a.a();
            }
        };

        static {
            Covode.recordClassIndex(939);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.e.a.a.c
        public final void a() {
            this.f2713b.postFrameCallback(this.f2714c);
        }

        e(C0040a aVar) {
            super(aVar);
        }
    }

    static {
        Covode.recordClassIndex(933);
    }

    static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        long f2709b = -1;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f2710c = new Runnable() {
            /* class androidx.e.a.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(938);
            }

            public final void run() {
                d.this.f2709b = SystemClock.uptimeMillis();
                d.this.f2708a.a();
            }
        };

        /* renamed from: d  reason: collision with root package name */
        private final Handler f2711d = new Handler(Looper.myLooper());

        static {
            Covode.recordClassIndex(937);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.e.a.a.c
        public final void a() {
            this.f2711d.postDelayed(this.f2710c, Math.max(10 - (SystemClock.uptimeMillis() - this.f2709b), 0L));
        }

        d(C0040a aVar) {
            super(aVar);
        }
    }

    a() {
    }

    public static a a() {
        ThreadLocal<a> threadLocal = f2700a;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    /* access modifiers changed from: package-private */
    public final c b() {
        if (this.f2703d == null) {
            int i2 = Build.VERSION.SDK_INT;
            this.f2703d = new e(this.f2706g);
        }
        return this.f2703d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$a  reason: collision with other inner class name */
    public class C0040a {
        static {
            Covode.recordClassIndex(934);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            a.this.f2704e = SystemClock.uptimeMillis();
            a aVar = a.this;
            long j2 = aVar.f2704e;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i2 = 0; i2 < aVar.f2702c.size(); i2++) {
                b bVar = aVar.f2702c.get(i2);
                if (bVar != null) {
                    Long l2 = aVar.f2701b.get(bVar);
                    if (l2 != null) {
                        if (l2.longValue() < uptimeMillis) {
                            aVar.f2701b.remove(bVar);
                        }
                    }
                    bVar.a(j2);
                }
            }
            if (aVar.f2705f) {
                for (int size = aVar.f2702c.size() - 1; size >= 0; size--) {
                    if (aVar.f2702c.get(size) == null) {
                        aVar.f2702c.remove(size);
                    }
                }
                aVar.f2705f = false;
            }
            if (a.this.f2702c.size() > 0) {
                a.this.b().a();
            }
        }

        C0040a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final C0040a f2708a;

        static {
            Covode.recordClassIndex(936);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        c(C0040a aVar) {
            this.f2708a = aVar;
        }
    }

    public final void a(b bVar) {
        this.f2701b.remove(bVar);
        int indexOf = this.f2702c.indexOf(bVar);
        if (indexOf >= 0) {
            this.f2702c.set(indexOf, null);
            this.f2705f = true;
        }
    }
}
