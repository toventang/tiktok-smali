package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.i.a.f;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f4275j = {"UPDATE", com.bytedance.d.a.a.a.a.a.f28514d, "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    final androidx.c.a<String, Integer> f4276a;

    /* renamed from: b  reason: collision with root package name */
    final String[] f4277b;

    /* renamed from: c  reason: collision with root package name */
    final j f4278c;

    /* renamed from: d  reason: collision with root package name */
    AtomicBoolean f4279d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f4280e;

    /* renamed from: f  reason: collision with root package name */
    volatile f f4281f;

    /* renamed from: g  reason: collision with root package name */
    final androidx.a.a.b.b<b, c> f4282g;

    /* renamed from: h  reason: collision with root package name */
    h f4283h;

    /* renamed from: i  reason: collision with root package name */
    Runnable f4284i;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, Set<String>> f4285k;

    /* renamed from: l  reason: collision with root package name */
    private a f4286l;

    /* renamed from: m  reason: collision with root package name */
    private final f f4287m;

    static {
        Covode.recordClassIndex(1658);
    }

    private void a() {
        if (this.f4278c.b()) {
            a(this.f4278c.f4323d.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long[] f4289a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f4290b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f4291c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4292d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4293e;

        static {
            Covode.recordClassIndex(1660);
        }

        /* access modifiers changed from: package-private */
        public final int[] a() {
            boolean z;
            synchronized (this) {
                if (!this.f4292d || this.f4293e) {
                    return null;
                }
                int length = this.f4289a.length;
                int i2 = 0;
                while (true) {
                    int i3 = 1;
                    if (i2 < length) {
                        if (this.f4289a[i2] > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean[] zArr = this.f4290b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f4291c;
                            if (!z) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.f4291c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i2++;
                    } else {
                        this.f4293e = true;
                        this.f4292d = false;
                        return this.f4291c;
                    }
                }
            }
        }

        a(int i2) {
            long[] jArr = new long[i2];
            this.f4289a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f4290b = zArr;
            this.f4291c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f4289a;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f4292d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f4289a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f4292d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final String[] f4294a;

        static {
            Covode.recordClassIndex(1661);
        }

        public abstract void a(Set<String> set);

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public b(String[] strArr) {
            this.f4294a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    public final void b(b bVar) {
        c b2;
        synchronized (this.f4282g) {
            b2 = this.f4282g.b(bVar);
        }
        if (b2 != null && this.f4286l.b(b2.f4295a)) {
            a();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void a(androidx.i.a.b bVar) {
        if (!bVar.d()) {
            while (true) {
                ReentrantReadWriteLock.ReadLock readLock = this.f4278c.f4327h.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.f4286l.a();
                    if (a2 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a2.length;
                    bVar.a();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                bVar.c("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
                                String str = this.f4277b[i2];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f4275j;
                                for (String str2 : strArr) {
                                    sb.setLength(0);
                                    sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                    a(sb, str, str2);
                                    sb.append(" AFTER ").append(str2).append(" ON `").append(str).append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ").append(i2).append(" AND invalidated = 0; END");
                                    bVar.c(sb.toString());
                                }
                            } else if (i3 == 2) {
                                a(bVar, i2);
                            }
                        } catch (Throwable th) {
                            bVar.b();
                            throw th;
                        }
                    }
                    bVar.c();
                    bVar.b();
                    a aVar = this.f4286l;
                    synchronized (aVar) {
                        aVar.f4293e = false;
                    }
                    try {
                        readLock.unlock();
                    } catch (SQLiteException | IllegalStateException unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            }
        }
    }

    public final void a(b bVar) {
        c a2;
        String[] strArr = bVar.f4294a;
        androidx.c.b bVar2 = new androidx.c.b();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4285k.containsKey(lowerCase)) {
                bVar2.addAll(this.f4285k.get(lowerCase));
            } else {
                bVar2.add(str);
            }
        }
        String[] strArr2 = (String[]) bVar2.toArray(new String[bVar2.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Integer num = this.f4276a.get(strArr2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + strArr2[i2]);
            }
        }
        c cVar = new c(bVar, iArr, strArr2);
        synchronized (this.f4282g) {
            a2 = this.f4282g.a(bVar, cVar);
        }
        if (a2 == null && this.f4286l.a(iArr)) {
            a();
        }
    }

    public g(j jVar, String... strArr) {
        this(jVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    private void a(androidx.i.a.b bVar, int i2) {
        String str = this.f4277b[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f4275j;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            a(sb, str, str2);
            bVar.c(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int[] f4295a;

        /* renamed from: b  reason: collision with root package name */
        final String[] f4296b;

        /* renamed from: c  reason: collision with root package name */
        final b f4297c;

        /* renamed from: d  reason: collision with root package name */
        final Set<String> f4298d;

        static {
            Covode.recordClassIndex(1662);
        }

        c(b bVar, int[] iArr, String[] strArr) {
            this.f4297c = bVar;
            this.f4295a = iArr;
            this.f4296b = strArr;
            if (iArr.length == 1) {
                androidx.c.b bVar2 = new androidx.c.b();
                bVar2.add(strArr[0]);
                this.f4298d = Collections.unmodifiableSet(bVar2);
                return;
            }
            this.f4298d = null;
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_").append(str).append("_").append(str2).append("`");
    }

    public g(j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4279d = new AtomicBoolean(false);
        this.f4280e = false;
        this.f4282g = new androidx.a.a.b.b<>();
        this.f4284i = new Runnable() {
            /* class androidx.room.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1659);
            }

            /* JADX INFO: finally extract failed */
            private Set<Integer> a() {
                androidx.c.b bVar = new androidx.c.b();
                Cursor a2 = g.this.f4278c.a(new androidx.i.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (byte) 0));
                while (a2.moveToNext()) {
                    try {
                        bVar.add(Integer.valueOf(a2.getInt(0)));
                    } catch (Throwable th) {
                        a2.close();
                        throw th;
                    }
                }
                a2.close();
                if (!bVar.isEmpty()) {
                    g.this.f4281f.a();
                }
                return bVar;
            }

            public final void run() {
                Set<Integer> set;
                Throwable th;
                ReentrantReadWriteLock.ReadLock readLock = g.this.f4278c.f4327h.readLock();
                try {
                    readLock.lock();
                    g gVar = g.this;
                    if (gVar.f4278c.b()) {
                        if (!gVar.f4280e) {
                            gVar.f4278c.f4323d.a();
                        }
                        if (gVar.f4280e) {
                            try {
                                if (!g.this.f4279d.compareAndSet(true, false)) {
                                    readLock.unlock();
                                } else if (g.this.f4278c.h()) {
                                    readLock.unlock();
                                } else {
                                    if (g.this.f4278c.f4325f) {
                                        androidx.i.a.b a2 = g.this.f4278c.f4323d.a();
                                        a2.a();
                                        try {
                                            set = a();
                                            try {
                                                a2.c();
                                                a2.b();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    a2.b();
                                                    throw th;
                                                } catch (SQLiteException | IllegalStateException unused) {
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            set = null;
                                            a2.b();
                                            throw th;
                                        }
                                    } else {
                                        set = a();
                                    }
                                    readLock.unlock();
                                    if (!(set == null || set.isEmpty())) {
                                        synchronized (g.this.f4282g) {
                                            Iterator<Map.Entry<b, c>> it = g.this.f4282g.iterator();
                                            while (it.hasNext()) {
                                                c value = it.next().getValue();
                                                int length = value.f4295a.length;
                                                Set<String> set2 = null;
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    if (set.contains(Integer.valueOf(value.f4295a[i2]))) {
                                                        if (length == 1) {
                                                            set2 = value.f4298d;
                                                        } else {
                                                            if (set2 == null) {
                                                                set2 = new androidx.c.b<>(length);
                                                            }
                                                            set2.add(value.f4296b[i2]);
                                                        }
                                                    }
                                                }
                                                if (set2 != null) {
                                                    value.f4297c.a(set2);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (SQLiteException | IllegalStateException unused2) {
                                set = null;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            }
        };
        this.f4278c = jVar;
        this.f4286l = new a(strArr.length);
        this.f4276a = new androidx.c.a<>();
        this.f4285k = map2;
        this.f4287m = new f(jVar);
        int length = strArr.length;
        this.f4277b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.f4276a.put(lowerCase, Integer.valueOf(i2));
            String str = map.get(strArr[i2]);
            if (str != null) {
                this.f4277b[i2] = str.toLowerCase(Locale.US);
            } else {
                this.f4277b[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.f4276a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                androidx.c.a<String, Integer> aVar = this.f4276a;
                aVar.put(lowerCase3, aVar.get(lowerCase2));
            }
        }
    }
}
