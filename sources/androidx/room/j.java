package androidx.room;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.c.h;
import androidx.i.a.c;
import androidx.i.a.e;
import androidx.i.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public volatile androidx.i.a.b f4320a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f4321b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f4322c;

    /* renamed from: d  reason: collision with root package name */
    public androidx.i.a.c f4323d;

    /* renamed from: e  reason: collision with root package name */
    public final g f4324e = a();

    /* renamed from: f  reason: collision with root package name */
    boolean f4325f;

    /* renamed from: g  reason: collision with root package name */
    public List<b> f4326g;

    /* renamed from: h  reason: collision with root package name */
    final ReentrantReadWriteLock f4327h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f4328i = new ThreadLocal<>();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Object> f4329j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    private boolean f4330k;

    public static abstract class b {
        static {
            Covode.recordClassIndex(1674);
        }

        public void a(androidx.i.a.b bVar) {
        }
    }

    static {
        Covode.recordClassIndex(1672);
    }

    /* access modifiers changed from: protected */
    public abstract g a();

    /* access modifiers changed from: protected */
    public abstract androidx.i.a.c b(a aVar);

    public final boolean b() {
        androidx.i.a.b bVar = this.f4320a;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public final void g() {
        this.f4323d.a().c();
    }

    public final boolean h() {
        return this.f4323d.a().d();
    }

    public final void c() {
        if (!this.f4330k && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void d() {
        if (!h() && this.f4328i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void e() {
        c();
        androidx.i.a.b a2 = this.f4323d.a();
        this.f4324e.a(a2);
        a2.a();
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        static {
            Covode.recordClassIndex(1675);
        }

        public static Object androidx_room_RoomDatabase$JournalMode_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }
    }

    public final void f() {
        this.f4323d.a().b();
        if (!h()) {
            g gVar = this.f4324e;
            if (gVar.f4279d.compareAndSet(false, true)) {
                gVar.f4278c.f4321b.execute(gVar.f4284i);
            }
        }
    }

    public static class a<T extends j> {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<b> f4331a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4332b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4333c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4334d;

        /* renamed from: e  reason: collision with root package name */
        private final Class<T> f4335e;

        /* renamed from: f  reason: collision with root package name */
        private final String f4336f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f4337g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f4338h;

        /* renamed from: i  reason: collision with root package name */
        private Executor f4339i;

        /* renamed from: j  reason: collision with root package name */
        private c.AbstractC0047c f4340j;

        /* renamed from: k  reason: collision with root package name */
        private c f4341k = c.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4342l;

        /* renamed from: m  reason: collision with root package name */
        private final d f4343m = new d();
        private Set<Integer> n;
        private Set<Integer> o;

        static {
            Covode.recordClassIndex(1673);
        }

        public final T a() {
            if (this.f4337g == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4335e != null) {
                Executor executor = this.f4338h;
                if (executor == null) {
                    if (this.f4339i == null) {
                        Executor executor2 = androidx.a.a.a.a.f785c;
                        this.f4339i = executor2;
                        this.f4338h = executor2;
                    } else {
                        Executor executor3 = this.f4339i;
                        if (executor3 != null) {
                            this.f4338h = executor3;
                        }
                    }
                } else if (this.f4339i == null) {
                    this.f4339i = executor;
                }
                Set<Integer> set = this.o;
                if (!(set == null || this.n == null)) {
                    for (Integer num : set) {
                        if (this.n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(num)));
                        }
                    }
                }
                if (this.f4340j == null) {
                    this.f4340j = new androidx.i.a.a.c();
                }
                Context context = this.f4337g;
                String str = this.f4336f;
                c.AbstractC0047c cVar = this.f4340j;
                d dVar = this.f4343m;
                ArrayList<b> arrayList = this.f4331a;
                boolean z = this.f4332b;
                c cVar2 = this.f4341k;
                if (cVar2 == c.AUTOMATIC) {
                    int i2 = Build.VERSION.SDK_INT;
                    ActivityManager activityManager = (ActivityManager) c.androidx_room_RoomDatabase$JournalMode_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
                    if (activityManager != null) {
                        int i3 = Build.VERSION.SDK_INT;
                        if (!activityManager.isLowRamDevice()) {
                            cVar2 = c.WRITE_AHEAD_LOGGING;
                        }
                    }
                    cVar2 = c.TRUNCATE;
                }
                a aVar = new a(context, str, cVar, dVar, arrayList, z, cVar2, this.f4338h, this.f4339i, this.f4342l, this.f4333c, this.f4334d, this.n);
                T t = (T) ((j) i.a(this.f4335e, "_Impl"));
                t.a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public final a<T> a(androidx.room.a.a... aVarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (androidx.room.a.a aVar : aVarArr) {
                this.o.add(Integer.valueOf(aVar.f4247a));
                this.o.add(Integer.valueOf(aVar.f4248b));
            }
            this.f4343m.a(aVarArr);
            return this;
        }

        public a(Context context, Class<T> cls, String str) {
            this.f4337g = context;
            this.f4335e = cls;
            this.f4336f = str;
        }
    }

    public final Cursor a(e eVar) {
        c();
        d();
        return this.f4323d.a().a(eVar);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private h<h<androidx.room.a.a>> f4345a = new h<>();

        static {
            Covode.recordClassIndex(1676);
        }

        public final void a(androidx.room.a.a... aVarArr) {
            for (androidx.room.a.a aVar : aVarArr) {
                int i2 = aVar.f4247a;
                int i3 = aVar.f4248b;
                h<androidx.room.a.a> a2 = this.f4345a.a(i2, null);
                if (a2 == null) {
                    a2 = new h<>();
                    this.f4345a.b(i2, a2);
                }
                a2.a(i3, null);
                a2.c(i3, aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (r0 == r2) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r1 = r3.c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r8 == false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            if (r1 > r10) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            if (r1 <= r9) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r7.add(r3.d(r0));
            r9 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r8 == false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r1 < r10) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r1 >= r9) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            r0 = r0 + r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
            if (r9 > r10) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            if (r9 < r10) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
            r3 = r6.f4345a.a(r9, null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            if (r3 != null) goto L_0x0013;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
            r2 = r3.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r8 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            r0 = r2 - 1;
            r2 = -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<androidx.room.a.a> a(java.util.List<androidx.room.a.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
                r0 = -1
                r0 = 1
                if (r8 == 0) goto L_0x003e
                r5 = -1
            L_0x0005:
                if (r9 >= r10) goto L_0x0043
            L_0x0007:
                androidx.c.h<androidx.c.h<androidx.room.a.a>> r0 = r6.f4345a
                r4 = 0
                java.lang.Object r3 = r0.a(r9, r4)
                androidx.c.h r3 = (androidx.c.h) r3
                if (r3 != 0) goto L_0x0013
                return r4
            L_0x0013:
                int r2 = r3.b()
                r0 = 0
                if (r8 == 0) goto L_0x003c
                int r0 = r2 + -1
                r2 = -1
            L_0x001d:
                if (r0 == r2) goto L_0x0042
                int r1 = r3.c(r0)
                if (r8 == 0) goto L_0x0035
                if (r1 > r10) goto L_0x003a
                if (r1 <= r9) goto L_0x003a
            L_0x0029:
                java.lang.Object r0 = r3.d(r0)
                r7.add(r0)
                r9 = r1
                r0 = 1
                if (r8 == 0) goto L_0x003f
                goto L_0x0005
            L_0x0035:
                if (r1 < r10) goto L_0x003a
                if (r1 >= r9) goto L_0x003a
                goto L_0x0029
            L_0x003a:
                int r0 = r0 + r5
                goto L_0x001d
            L_0x003c:
                r0 = 0
                goto L_0x001d
            L_0x003e:
                r5 = 1
            L_0x003f:
                if (r9 <= r10) goto L_0x0043
                goto L_0x0007
            L_0x0042:
                return r4
            L_0x0043:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.j.d.a(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public final f a(String str) {
        c();
        d();
        return this.f4323d.a().a(str);
    }

    public final void a(androidx.i.a.b bVar) {
        g gVar = this.f4324e;
        synchronized (gVar) {
            if (!gVar.f4280e) {
                bVar.c("PRAGMA temp_store = MEMORY;");
                bVar.c("PRAGMA recursive_triggers='ON';");
                bVar.c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                gVar.a(bVar);
                gVar.f4281f = bVar.a("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                gVar.f4280e = true;
            }
        }
    }

    public final void a(a aVar) {
        this.f4323d = b(aVar);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (aVar.f4240g == c.WRITE_AHEAD_LOGGING) {
            z = true;
        }
        this.f4323d.a(z);
        this.f4326g = aVar.f4238e;
        this.f4321b = aVar.f4241h;
        this.f4322c = new o(aVar.f4242i);
        this.f4330k = aVar.f4239f;
        this.f4325f = z;
        if (aVar.f4243j) {
            g gVar = this.f4324e;
            gVar.f4283h = new h(aVar.f4235b, aVar.f4236c, gVar, gVar.f4278c.f4321b);
        }
    }
}
