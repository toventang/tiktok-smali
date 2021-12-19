package com.squareup.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import k.aa;
import k.ab;
import k.f;
import k.g;
import k.h;
import k.q;
import k.y;

public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f57579a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: j  reason: collision with root package name */
    public static final y f57580j = new y() {
        /* class com.squareup.a.a.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(35926);
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
        }

        @Override // k.y
        public final ab timeout() {
            return ab.NONE;
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            fVar.l(j2);
        }
    };

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ boolean f57581k = true;

    /* renamed from: b  reason: collision with root package name */
    public final com.squareup.a.a.c.a f57582b;

    /* renamed from: c  reason: collision with root package name */
    public final File f57583c;

    /* renamed from: d  reason: collision with root package name */
    public final int f57584d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap<String, C1275b> f57585e = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: f  reason: collision with root package name */
    public int f57586f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f57587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f57588h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f57589i;

    /* renamed from: l  reason: collision with root package name */
    private final File f57590l;

    /* renamed from: m  reason: collision with root package name */
    private final File f57591m;
    private final File n;
    private final int o;
    private long p;
    private long q;
    private g r;
    private long s = 0;
    private final Executor t;
    private final Runnable u = new Runnable() {
        /* class com.squareup.a.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35924);
        }

        public final void run() {
            boolean z;
            MethodCollector.i(12036);
            synchronized (b.this) {
                try {
                    if (!b.this.f57588h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !b.this.f57589i) {
                        try {
                            b.this.c();
                            if (b.this.b()) {
                                b.this.a();
                                b.this.f57586f = 0;
                            }
                            MethodCollector.o(12036);
                        } catch (IOException e2) {
                            RuntimeException runtimeException = new RuntimeException(e2);
                            MethodCollector.o(12036);
                            throw runtimeException;
                        }
                    }
                } finally {
                    MethodCollector.o(12036);
                }
            }
        }
    };

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final String f57610a;

        /* renamed from: b  reason: collision with root package name */
        public final long f57611b;

        /* renamed from: c  reason: collision with root package name */
        public final aa[] f57612c;

        /* renamed from: e  reason: collision with root package name */
        private final long[] f57614e;

        static {
            Covode.recordClassIndex(35930);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (aa aaVar : this.f57612c) {
                j.a(aaVar);
            }
        }

        private c(String str, long j2, aa[] aaVarArr, long[] jArr) {
            this.f57610a = str;
            this.f57611b = j2;
            this.f57612c = aaVarArr;
            this.f57614e = jArr;
        }

        /* synthetic */ c(b bVar, String str, long j2, aa[] aaVarArr, long[] jArr, byte b2) {
            this(str, j2, aaVarArr, jArr);
        }
    }

    private synchronized boolean h() {
        boolean z;
        MethodCollector.i(10694);
        z = this.f57589i;
        MethodCollector.o(10694);
        return z;
    }

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C1275b f57595a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f57596b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f57597c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f57599e;

        static {
            Covode.recordClassIndex(35927);
        }

        public final void b() {
            MethodCollector.i(12599);
            synchronized (b.this) {
                try {
                    b.this.a(this, false);
                } finally {
                    MethodCollector.o(12599);
                }
            }
        }

        public final void a() {
            MethodCollector.i(12598);
            synchronized (b.this) {
                try {
                    if (this.f57597c) {
                        b.this.a(this, false);
                        b.this.a(this.f57595a);
                    } else {
                        b.this.a(this, true);
                    }
                    this.f57599e = true;
                } finally {
                    MethodCollector.o(12598);
                }
            }
        }

        public final y a(int i2) {
            AnonymousClass1 r0;
            MethodCollector.i(12483);
            synchronized (b.this) {
                try {
                    if (this.f57595a.f57607f == this) {
                        if (!this.f57595a.f57606e) {
                            this.f57596b[i2] = true;
                        }
                        try {
                            r0 = new c(b.this.f57582b.b(this.f57595a.f57605d[i2])) {
                                /* class com.squareup.a.a.b.a.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(35928);
                                }

                                /* access modifiers changed from: protected */
                                @Override // com.squareup.a.a.c
                                public final void a() {
                                    MethodCollector.i(11876);
                                    synchronized (b.this) {
                                        try {
                                            a.this.f57597c = true;
                                        } finally {
                                            MethodCollector.o(11876);
                                        }
                                    }
                                }
                            };
                        } catch (FileNotFoundException unused) {
                            y yVar = b.f57580j;
                            MethodCollector.o(12483);
                            return yVar;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(12483);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(12483);
                }
            }
            return r0;
        }

        private a(C1275b bVar) {
            boolean[] zArr;
            this.f57595a = bVar;
            if (bVar.f57606e) {
                zArr = null;
            } else {
                zArr = new boolean[b.this.f57584d];
            }
            this.f57596b = zArr;
        }

        /* synthetic */ a(b bVar, C1275b bVar2, byte b2) {
            this(bVar2);
        }
    }

    static {
        Covode.recordClassIndex(35923);
    }

    private g f() {
        return q.a(new c(this.f57582b.c(this.f57590l)) {
            /* class com.squareup.a.a.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ boolean f57593a = true;

            static {
                Covode.recordClassIndex(35925);
            }

            /* access modifiers changed from: protected */
            @Override // com.squareup.a.a.c
            public final void a() {
                if (f57593a || Thread.holdsLock(b.this)) {
                    b.this.f57587g = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    private synchronized void i() {
        MethodCollector.i(10695);
        if (!h()) {
            MethodCollector.o(10695);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("cache is closed");
            MethodCollector.o(10695);
            throw illegalStateException;
        }
    }

    public final boolean b() {
        int i2 = this.f57586f;
        if (i2 < 2000 || i2 < this.f57585e.size()) {
            return false;
        }
        return true;
    }

    public final void c() {
        while (this.q > this.p) {
            a(this.f57585e.values().iterator().next());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.b$b  reason: collision with other inner class name */
    public final class C1275b {

        /* renamed from: a  reason: collision with root package name */
        public final String f57602a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f57603b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f57604c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f57605d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f57606e;

        /* renamed from: f  reason: collision with root package name */
        public a f57607f;

        /* renamed from: g  reason: collision with root package name */
        public long f57608g;

        static {
            Covode.recordClassIndex(35929);
        }

        /* access modifiers changed from: package-private */
        public final c a() {
            if (Thread.holdsLock(b.this)) {
                aa[] aaVarArr = new aa[b.this.f57584d];
                long[] jArr = (long[]) this.f57603b.clone();
                int i2 = 0;
                for (int i3 = 0; i3 < b.this.f57584d; i3++) {
                    try {
                        aaVarArr[i3] = b.this.f57582b.a(this.f57604c[i3]);
                    } catch (FileNotFoundException unused) {
                        while (i2 < b.this.f57584d && aaVarArr[i2] != null) {
                            j.a(aaVarArr[i2]);
                            i2++;
                        }
                        return null;
                    }
                }
                return new c(b.this, this.f57602a, this.f57608g, aaVarArr, jArr, (byte) 0);
            }
            throw new AssertionError();
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public final void a(g gVar) {
            for (long j2 : this.f57603b) {
                gVar.a(32).b(j2);
            }
        }

        public final void a(String[] strArr) {
            if (strArr.length == b.this.f57584d) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f57603b[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        private C1275b(String str) {
            this.f57602a = str;
            this.f57603b = new long[b.this.f57584d];
            this.f57604c = new File[b.this.f57584d];
            this.f57605d = new File[b.this.f57584d];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i2 = 0; i2 < b.this.f57584d; i2++) {
                append.append(i2);
                this.f57604c[i2] = new File(b.this.f57583c, append.toString());
                append.append(".tmp");
                this.f57605d[i2] = new File(b.this.f57583c, append.toString());
                append.setLength(length);
            }
        }

        /* synthetic */ C1275b(b bVar, String str, byte b2) {
            this(str);
        }
    }

    private void g() {
        this.f57582b.d(this.f57591m);
        Iterator<C1275b> it = this.f57585e.values().iterator();
        while (it.hasNext()) {
            C1275b next = it.next();
            int i2 = 0;
            if (next.f57607f == null) {
                while (i2 < this.f57584d) {
                    this.q += next.f57603b[i2];
                    i2++;
                }
            } else {
                next.f57607f = null;
                while (i2 < this.f57584d) {
                    this.f57582b.d(next.f57604c[i2]);
                    this.f57582b.d(next.f57605d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(10844);
        if (!this.f57588h || this.f57589i) {
            this.f57589i = true;
            MethodCollector.o(10844);
            return;
        }
        C1275b[] bVarArr = (C1275b[]) this.f57585e.values().toArray(new C1275b[this.f57585e.size()]);
        for (C1275b bVar : bVarArr) {
            if (bVar.f57607f != null) {
                bVar.f57607f.b();
            }
        }
        c();
        this.r.close();
        this.r = null;
        this.f57589i = true;
        MethodCollector.o(10844);
    }

    private synchronized void d() {
        MethodCollector.i(10043);
        if (!f57581k && !Thread.holdsLock(this)) {
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(10043);
            throw assertionError;
        } else if (this.f57588h) {
            MethodCollector.o(10043);
        } else {
            if (this.f57582b.e(this.n)) {
                if (this.f57582b.e(this.f57590l)) {
                    this.f57582b.d(this.n);
                } else {
                    this.f57582b.a(this.n, this.f57590l);
                }
            }
            if (this.f57582b.e(this.f57590l)) {
                try {
                    e();
                    g();
                    this.f57588h = true;
                    MethodCollector.o(10043);
                    return;
                } catch (IOException e2) {
                    System.out.println("DiskLruCache " + this.f57583c + " is corrupt: " + e2.getMessage() + ", removing");
                    close();
                    this.f57582b.g(this.f57583c);
                    this.f57589i = false;
                }
            }
            a();
            this.f57588h = true;
            MethodCollector.o(10043);
        }
    }

    private void e() {
        String s2;
        String str;
        h a2 = q.a(this.f57582b.a(this.f57590l));
        try {
            String s3 = a2.s();
            String s4 = a2.s();
            String s5 = a2.s();
            String s6 = a2.s();
            String s7 = a2.s();
            if (!"libcore.io.DiskLruCache".equals(s3) || !"1".equals(s4) || !Integer.toString(this.o).equals(s5) || !Integer.toString(this.f57584d).equals(s6) || !"".equals(s7)) {
                throw new IOException("unexpected journal header: [" + s3 + ", " + s4 + ", " + s6 + ", " + s7 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    s2 = a2.s();
                    int indexOf = s2.indexOf(32);
                    if (indexOf != -1) {
                        int i3 = indexOf + 1;
                        int indexOf2 = s2.indexOf(32, i3);
                        if (indexOf2 == -1) {
                            str = s2.substring(i3);
                            if (indexOf == 6 && s2.startsWith("REMOVE")) {
                                this.f57585e.remove(str);
                                i2++;
                            }
                        } else {
                            str = s2.substring(i3, indexOf2);
                        }
                        C1275b bVar = this.f57585e.get(str);
                        if (bVar == null) {
                            bVar = new C1275b(this, str, (byte) 0);
                            this.f57585e.put(str, bVar);
                        }
                        if (indexOf2 != -1) {
                            if (indexOf != 5 || !s2.startsWith("CLEAN")) {
                                if (indexOf2 != -1) {
                                    if (indexOf2 != -1) {
                                        break;
                                    }
                                    if (indexOf != 4 || !s2.startsWith("READ")) {
                                        break;
                                    }
                                    i2++;
                                }
                            } else {
                                String[] split = s2.substring(indexOf2 + 1).split(" ");
                                bVar.f57606e = true;
                                bVar.f57607f = null;
                                bVar.a(split);
                                i2++;
                            }
                        }
                        if (indexOf == 5) {
                            if (!s2.startsWith("DIRTY")) {
                                break;
                            }
                            bVar.f57607f = new a(this, bVar, (byte) 0);
                            i2++;
                        }
                        i2++;
                    } else {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(s2)));
                    }
                } catch (EOFException unused) {
                    this.f57586f = i2 - this.f57585e.size();
                    if (!a2.e()) {
                        a();
                    } else {
                        this.r = f();
                    }
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(s2)));
        } finally {
            j.a(a2);
        }
    }

    public final synchronized void a() {
        MethodCollector.i(10046);
        g gVar = this.r;
        if (gVar != null) {
            gVar.close();
        }
        g a2 = q.a(this.f57582b.b(this.f57591m));
        try {
            a2.a("libcore.io.DiskLruCache").a(10);
            a2.a("1").a(10);
            a2.b((long) this.o).a(10);
            a2.b((long) this.f57584d).a(10);
            a2.a(10);
            for (C1275b bVar : this.f57585e.values()) {
                if (bVar.f57607f != null) {
                    a2.a("DIRTY").a(32);
                    a2.a(bVar.f57602a);
                    a2.a(10);
                } else {
                    a2.a("CLEAN").a(32);
                    a2.a(bVar.f57602a);
                    bVar.a(a2);
                    a2.a(10);
                }
            }
            a2.close();
            if (this.f57582b.e(this.f57590l)) {
                this.f57582b.a(this.f57590l, this.n);
            }
            this.f57582b.a(this.f57591m, this.f57590l);
            this.f57582b.d(this.n);
            this.r = f();
            this.f57587g = false;
            MethodCollector.o(10046);
        } catch (Throwable th) {
            a2.close();
            MethodCollector.o(10046);
            throw th;
        }
    }

    private static void c(String str) {
        if (!f57579a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final synchronized boolean b(String str) {
        MethodCollector.i(10528);
        d();
        i();
        c(str);
        C1275b bVar = this.f57585e.get(str);
        if (bVar == null) {
            MethodCollector.o(10528);
            return false;
        }
        boolean a2 = a(bVar);
        MethodCollector.o(10528);
        return a2;
    }

    public final synchronized c a(String str) {
        MethodCollector.i(10210);
        d();
        i();
        c(str);
        C1275b bVar = this.f57585e.get(str);
        if (bVar == null || !bVar.f57606e) {
            MethodCollector.o(10210);
            return null;
        }
        c a2 = bVar.a();
        if (a2 == null) {
            MethodCollector.o(10210);
            return null;
        }
        this.f57586f++;
        this.r.a("READ").a(32).a(str).a(10);
        if (b()) {
            this.t.execute(this.u);
        }
        MethodCollector.o(10210);
        return a2;
    }

    public final boolean a(C1275b bVar) {
        if (bVar.f57607f != null) {
            bVar.f57607f.f57597c = true;
        }
        for (int i2 = 0; i2 < this.f57584d; i2++) {
            this.f57582b.d(bVar.f57604c[i2]);
            this.q -= bVar.f57603b[i2];
            bVar.f57603b[i2] = 0;
        }
        this.f57586f++;
        this.r.a("REMOVE").a(32).a(bVar.f57602a).a(10);
        this.f57585e.remove(bVar.f57602a);
        if (b()) {
            this.t.execute(this.u);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.squareup.a.a.b.a a(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.b.a(java.lang.String, long):com.squareup.a.a.b$a");
    }

    public final synchronized void a(a aVar, boolean z) {
        MethodCollector.i(10527);
        C1275b bVar = aVar.f57595a;
        if (bVar.f57607f == aVar) {
            if (z && !bVar.f57606e) {
                for (int i2 = 0; i2 < this.f57584d; i2++) {
                    if (!aVar.f57596b[i2]) {
                        aVar.b();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        MethodCollector.o(10527);
                        throw illegalStateException;
                    } else if (!this.f57582b.e(bVar.f57605d[i2])) {
                        aVar.b();
                        MethodCollector.o(10527);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.f57584d; i3++) {
                File file = bVar.f57605d[i3];
                if (!z) {
                    this.f57582b.d(file);
                } else if (this.f57582b.e(file)) {
                    File file2 = bVar.f57604c[i3];
                    this.f57582b.a(file, file2);
                    long j2 = bVar.f57603b[i3];
                    long f2 = this.f57582b.f(file2);
                    bVar.f57603b[i3] = f2;
                    this.q = (this.q - j2) + f2;
                }
            }
            this.f57586f++;
            bVar.f57607f = null;
            if (bVar.f57606e || z) {
                bVar.f57606e = true;
                this.r.a("CLEAN").a(32);
                this.r.a(bVar.f57602a);
                bVar.a(this.r);
                this.r.a(10);
                if (z) {
                    long j3 = this.s;
                    this.s = 1 + j3;
                    bVar.f57608g = j3;
                }
            } else {
                this.f57585e.remove(bVar.f57602a);
                this.r.a("REMOVE").a(32);
                this.r.a(bVar.f57602a);
                this.r.a(10);
            }
            this.r.flush();
            if (this.q > this.p || b()) {
                this.t.execute(this.u);
            }
            MethodCollector.o(10527);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.o(10527);
        throw illegalStateException2;
    }

    public b(com.squareup.a.a.c.a aVar, File file, long j2, Executor executor) {
        this.f57582b = aVar;
        this.f57583c = file;
        this.o = 201105;
        this.f57590l = new File(file, "journal");
        this.f57591m = new File(file, "journal.tmp");
        this.n = new File(file, "journal.bkp");
        this.f57584d = 2;
        this.p = j2;
        this.t = executor;
    }
}
