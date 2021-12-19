package com.bytedance.android.live.core.a.a;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cw.g;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f8858a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: g  reason: collision with root package name */
    public static final OutputStream f8859g = new OutputStream() {
        /* class com.bytedance.android.live.core.a.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(4536);
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
        }

        {
            MethodCollector.i(11528);
            MethodCollector.o(11528);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final File f8860b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8861c;

    /* renamed from: d  reason: collision with root package name */
    public Writer f8862d;

    /* renamed from: e  reason: collision with root package name */
    public int f8863e;

    /* renamed from: f  reason: collision with root package name */
    final ExecutorService f8864f;

    /* renamed from: h  reason: collision with root package name */
    private final File f8865h;

    /* renamed from: i  reason: collision with root package name */
    private final File f8866i;

    /* renamed from: j  reason: collision with root package name */
    private final File f8867j;

    /* renamed from: k  reason: collision with root package name */
    private final int f8868k;

    /* renamed from: l  reason: collision with root package name */
    private long f8869l;

    /* renamed from: m  reason: collision with root package name */
    private long f8870m;
    private final LinkedHashMap<String, b> n = new LinkedHashMap<>(0, 0.75f, true);
    private long o = 0;
    private final Callable<Void> p;

    /* renamed from: com.bytedance.android.live.core.a.a.a$a  reason: collision with other inner class name */
    public final class C0132a {

        /* renamed from: a  reason: collision with root package name */
        public final b f8872a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f8873b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8874c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8875d;

        static {
            Covode.recordClassIndex(4537);
        }

        public final void b() {
            a.this.a(this, false);
        }

        /* renamed from: com.bytedance.android.live.core.a.a.a$a$a  reason: collision with other inner class name */
        class C0133a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(4538);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0132a.this.f8874c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0132a.this.f8874c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(int i2) {
                MethodCollector.i(12219);
                try {
                    this.out.write(i2);
                    MethodCollector.o(12219);
                } catch (IOException unused) {
                    C0132a.this.f8874c = true;
                    MethodCollector.o(12219);
                }
            }

            private C0133a(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.i(12064);
                MethodCollector.o(12064);
            }

            /* synthetic */ C0133a(C0132a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(byte[] bArr, int i2, int i3) {
                MethodCollector.i(12220);
                try {
                    this.out.write(bArr, i2, i3);
                    MethodCollector.o(12220);
                } catch (IOException unused) {
                    C0132a.this.f8874c = true;
                    MethodCollector.o(12220);
                }
            }
        }

        public final OutputStream a() {
            FileOutputStream fileOutputStream;
            C0133a aVar;
            MethodCollector.i(11701);
            if (a.this.f8861c > 0) {
                synchronized (a.this) {
                    try {
                        if (this.f8872a.f8881d == this) {
                            if (!this.f8872a.f8880c) {
                                this.f8873b[0] = true;
                            }
                            File b2 = this.f8872a.b(0);
                            try {
                                fileOutputStream = new FileOutputStream(b2);
                            } catch (FileNotFoundException unused) {
                                a.this.f8860b.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(b2);
                                } catch (FileNotFoundException unused2) {
                                    OutputStream outputStream = a.f8859g;
                                    MethodCollector.o(11701);
                                    return outputStream;
                                }
                            }
                            aVar = new C0133a(this, fileOutputStream, (byte) 0);
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException();
                            MethodCollector.o(11701);
                            throw illegalStateException;
                        }
                    } finally {
                        MethodCollector.o(11701);
                    }
                }
                return aVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + a.this.f8861c);
            MethodCollector.o(11701);
            throw illegalArgumentException;
        }

        private C0132a(b bVar) {
            boolean[] zArr;
            this.f8872a = bVar;
            if (bVar.f8880c) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f8861c];
            }
            this.f8873b = zArr;
        }

        /* synthetic */ C0132a(a aVar, b bVar, byte b2) {
            this(bVar);
        }
    }

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream[] f8884a;

        /* renamed from: c  reason: collision with root package name */
        private final String f8886c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8887d;

        /* renamed from: e  reason: collision with root package name */
        private final long[] f8888e;

        static {
            Covode.recordClassIndex(4540);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f8884a) {
                b.a(inputStream);
            }
        }

        private c(String str, long j2, InputStream[] inputStreamArr, long[] jArr) {
            this.f8886c = str;
            this.f8887d = j2;
            this.f8884a = inputStreamArr;
            this.f8888e = jArr;
        }

        /* synthetic */ c(a aVar, String str, long j2, InputStream[] inputStreamArr, long[] jArr, byte b2) {
            this(str, j2, inputStreamArr, jArr);
        }
    }

    private void f() {
        if (this.f8862d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8878a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f8879b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8880c;

        /* renamed from: d  reason: collision with root package name */
        public C0132a f8881d;

        /* renamed from: e  reason: collision with root package name */
        public long f8882e;

        static {
            Covode.recordClassIndex(4539);
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f8879b) {
                sb.append(' ').append(j2);
            }
            return sb.toString();
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i2) {
            return new File(a.this.f8860b, this.f8878a + "." + i2);
        }

        public final File b(int i2) {
            return new File(a.this.f8860b, this.f8878a + "." + i2 + ".tmp");
        }

        public final void a(String[] strArr) {
            if (strArr.length == a.this.f8861c) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f8879b[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        private b(String str) {
            this.f8878a = str;
            this.f8879b = new long[a.this.f8861c];
        }

        /* synthetic */ b(a aVar, String str, byte b2) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(4534);
    }

    public final boolean b() {
        int i2 = this.f8863e;
        if (i2 < 2000 || i2 < this.n.size()) {
            return false;
        }
        return true;
    }

    public final void c() {
        while (this.f8870m > this.f8869l) {
            c(this.n.entrySet().iterator().next().getKey());
        }
    }

    private void e() {
        c(this.f8866i);
        Iterator<b> it = this.n.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i2 = 0;
            if (next.f8881d == null) {
                while (i2 < this.f8861c) {
                    this.f8870m += next.f8879b[i2];
                    i2++;
                }
            } else {
                next.f8881d = null;
                while (i2 < this.f8861c) {
                    c(next.a(i2));
                    c(next.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(11730);
        if (this.f8862d == null) {
            MethodCollector.o(11730);
            return;
        }
        Iterator it = new ArrayList(this.n.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8881d != null) {
                bVar.f8881d.b();
            }
        }
        c();
        this.f8862d.close();
        this.f8862d = null;
        MethodCollector.o(11730);
    }

    private void d() {
        String a2;
        String str;
        MethodCollector.i(10735);
        c cVar = new c(new FileInputStream(this.f8865h), b.f8889a);
        try {
            String a3 = cVar.a();
            String a4 = cVar.a();
            String a5 = cVar.a();
            String a6 = cVar.a();
            String a7 = cVar.a();
            if (!"libcore.io.DiskLruCache".equals(a3) || !"1".equals(a4) || !Integer.toString(this.f8868k).equals(a5) || !Integer.toString(this.f8861c).equals(a6) || !"".equals(a7)) {
                IOException iOException = new IOException("unexpected journal header: [" + a3 + ", " + a4 + ", " + a6 + ", " + a7 + "]");
                MethodCollector.o(10735);
                throw iOException;
            }
            int i2 = 0;
            while (true) {
                try {
                    a2 = cVar.a();
                    int indexOf = a2.indexOf(32);
                    if (indexOf != -1) {
                        int i3 = indexOf + 1;
                        int indexOf2 = a2.indexOf(32, i3);
                        if (indexOf2 == -1) {
                            str = a2.substring(i3);
                            if (indexOf == 6 && a2.startsWith("REMOVE")) {
                                this.n.remove(str);
                                i2++;
                            }
                        } else {
                            str = a2.substring(i3, indexOf2);
                        }
                        b bVar = this.n.get(str);
                        if (bVar == null) {
                            bVar = new b(this, str, (byte) 0);
                            this.n.put(str, bVar);
                        }
                        if (indexOf2 != -1) {
                            if (indexOf != 5 || !a2.startsWith("CLEAN")) {
                                if (indexOf2 != -1) {
                                    if (indexOf2 != -1) {
                                        break;
                                    }
                                    if (indexOf != 4 || !a2.startsWith("READ")) {
                                        break;
                                    }
                                    i2++;
                                }
                            } else {
                                String[] split = a2.substring(indexOf2 + 1).split(" ");
                                bVar.f8880c = true;
                                bVar.f8881d = null;
                                bVar.a(split);
                                i2++;
                            }
                        }
                        if (indexOf == 5) {
                            if (!a2.startsWith("DIRTY")) {
                                break;
                            }
                            bVar.f8881d = new C0132a(this, bVar, (byte) 0);
                            i2++;
                        }
                        i2++;
                    } else {
                        IOException iOException2 = new IOException("unexpected journal line: ".concat(String.valueOf(a2)));
                        MethodCollector.o(10735);
                        throw iOException2;
                    }
                } catch (EOFException unused) {
                    this.f8863e = i2 - this.n.size();
                    if (cVar.f8892b == -1) {
                        a();
                    } else {
                        this.f8862d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8865h, true), b.f8889a));
                    }
                    return;
                }
            }
            IOException iOException3 = new IOException("unexpected journal line: ".concat(String.valueOf(a2)));
            MethodCollector.o(10735);
            throw iOException3;
        } finally {
            b.a(cVar);
            MethodCollector.o(10735);
        }
    }

    public final synchronized void a() {
        MethodCollector.i(10737);
        Writer writer = this.f8862d;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8866i), b.f8889a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8868k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8861c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b bVar : this.n.values()) {
                if (bVar.f8881d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f8878a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f8878a + bVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f8865h.exists()) {
                a(this.f8865h, this.f8867j, true);
            }
            a(this.f8866i, this.f8865h, false);
            b(this.f8867j);
            this.f8862d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8865h, true), b.f8889a));
            MethodCollector.o(10737);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.o(10737);
            throw th;
        }
    }

    private static void c(File file) {
        if (file.exists() && !b(file)) {
            throw new IOException();
        }
    }

    private static void d(String str) {
        if (!f8858a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private a(File file) {
        ExecutorService threadPoolExecutor;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            threadPoolExecutor = g.a();
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.f8864f = threadPoolExecutor;
        this.p = new Callable<Void>() {
            /* class com.bytedance.android.live.core.a.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4535);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                MethodCollector.i(10481);
                synchronized (a.this) {
                    try {
                        if (a.this.f8862d == null) {
                            return null;
                        }
                        a.this.c();
                        if (a.this.b()) {
                            a.this.a();
                            a.this.f8863e = 0;
                        }
                        MethodCollector.o(10481);
                        return null;
                    } finally {
                        MethodCollector.o(10481);
                    }
                }
            }
        };
        this.f8860b = file;
        this.f8868k = 100;
        this.f8865h = new File(file, "journal");
        this.f8866i = new File(file, "journal.tmp");
        this.f8867j = new File(file, "journal.bkp");
        this.f8861c = 1;
        this.f8869l = 400;
    }

    public static a a(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                b(file2);
            } else {
                a(file2, file3, false);
            }
        }
        a aVar = new a(file);
        if (aVar.f8865h.exists()) {
            try {
                aVar.d();
                aVar.e();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.close();
                b.a(aVar.f8860b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file);
        aVar2.a();
        return aVar2;
    }

    private static boolean b(File file) {
        MethodCollector.i(10732);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10732);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10732);
        return delete;
    }

    public final synchronized c a(String str) {
        MethodCollector.i(11073);
        f();
        d(str);
        b bVar = this.n.get(str);
        if (bVar == null) {
            MethodCollector.o(11073);
            return null;
        } else if (!bVar.f8880c) {
            MethodCollector.o(11073);
            return null;
        } else {
            InputStream[] inputStreamArr = new InputStream[this.f8861c];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f8861c; i3++) {
                try {
                    inputStreamArr[i3] = new FileInputStream(bVar.a(i3));
                } catch (FileNotFoundException unused) {
                    while (i2 < this.f8861c && inputStreamArr[i2] != null) {
                        b.a(inputStreamArr[i2]);
                        i2++;
                    }
                    MethodCollector.o(11073);
                    return null;
                }
            }
            this.f8863e++;
            this.f8862d.append((CharSequence) ("READ " + str + '\n'));
            if (b()) {
                this.f8864f.submit(this.p);
            }
            c cVar = new c(this, str, bVar.f8882e, inputStreamArr, bVar.f8879b, (byte) 0);
            MethodCollector.o(11073);
            return cVar;
        }
    }

    public final synchronized C0132a b(String str) {
        MethodCollector.i(11385);
        f();
        d(str);
        b bVar = this.n.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.n.put(str, bVar);
        } else if (bVar.f8881d != null) {
            MethodCollector.o(11385);
            return null;
        }
        C0132a aVar = new C0132a(this, bVar, (byte) 0);
        bVar.f8881d = aVar;
        this.f8862d.write("DIRTY " + str + '\n');
        this.f8862d.flush();
        MethodCollector.o(11385);
        return aVar;
    }

    public final synchronized boolean c(String str) {
        MethodCollector.i(11566);
        f();
        d(str);
        b bVar = this.n.get(str);
        if (bVar == null || bVar.f8881d != null) {
            MethodCollector.o(11566);
            return false;
        }
        for (int i2 = 0; i2 < this.f8861c; i2++) {
            File a2 = bVar.a(i2);
            if (!a2.exists() || b(a2)) {
                this.f8870m -= bVar.f8879b[i2];
                bVar.f8879b[i2] = 0;
            } else {
                IOException iOException = new IOException("failed to delete ".concat(String.valueOf(a2)));
                MethodCollector.o(11566);
                throw iOException;
            }
        }
        this.f8863e++;
        this.f8862d.append((CharSequence) ("REMOVE " + str + '\n'));
        this.n.remove(str);
        if (b()) {
            this.f8864f.submit(this.p);
        }
        MethodCollector.o(11566);
        return true;
    }

    public final synchronized void a(C0132a aVar, boolean z) {
        MethodCollector.i(11564);
        b bVar = aVar.f8872a;
        if (bVar.f8881d == aVar) {
            if (z && !bVar.f8880c) {
                for (int i2 = 0; i2 < this.f8861c; i2++) {
                    if (!aVar.f8873b[i2]) {
                        aVar.b();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                        MethodCollector.o(11564);
                        throw illegalStateException;
                    } else if (!bVar.b(i2).exists()) {
                        aVar.b();
                        MethodCollector.o(11564);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.f8861c; i3++) {
                File b2 = bVar.b(i3);
                if (!z) {
                    c(b2);
                } else if (b2.exists()) {
                    File a2 = bVar.a(i3);
                    b2.renameTo(a2);
                    long j2 = bVar.f8879b[i3];
                    long length = a2.length();
                    bVar.f8879b[i3] = length;
                    this.f8870m = (this.f8870m - j2) + length;
                }
            }
            this.f8863e++;
            bVar.f8881d = null;
            if (bVar.f8880c || z) {
                bVar.f8880c = true;
                this.f8862d.write("CLEAN " + bVar.f8878a + bVar.a() + '\n');
                if (z) {
                    long j3 = this.o;
                    this.o = 1 + j3;
                    bVar.f8882e = j3;
                }
            } else {
                this.n.remove(bVar.f8878a);
                this.f8862d.write("REMOVE " + bVar.f8878a + '\n');
            }
            this.f8862d.flush();
            if (this.f8870m > this.f8869l || b()) {
                this.f8864f.submit(this.p);
            }
            MethodCollector.o(11564);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.o(11564);
        throw illegalStateException2;
    }

    private static void a(File file, File file2, boolean z) {
        MethodCollector.i(10903);
        if (z) {
            c(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.o(10903);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.o(10903);
        throw iOException;
    }
}
