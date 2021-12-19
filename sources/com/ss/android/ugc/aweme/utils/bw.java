package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class bw implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f142723a = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final String f142724g = bw.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final File f142725b;

    /* renamed from: c  reason: collision with root package name */
    public final long f142726c;

    /* renamed from: d  reason: collision with root package name */
    public final int f142727d;

    /* renamed from: e  reason: collision with root package name */
    public Writer f142728e;

    /* renamed from: f  reason: collision with root package name */
    public int f142729f;

    /* renamed from: h  reason: collision with root package name */
    private final File f142730h;

    /* renamed from: i  reason: collision with root package name */
    private final File f142731i;

    /* renamed from: j  reason: collision with root package name */
    private final int f142732j;

    /* renamed from: k  reason: collision with root package name */
    private long f142733k;

    /* renamed from: l  reason: collision with root package name */
    private final LinkedHashMap<String, b> f142734l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m  reason: collision with root package name */
    private long f142735m = 0;
    private final ExecutorService n;
    private final Callable<Void> o;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f142737a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f142738b;

        static {
            Covode.recordClassIndex(93368);
        }

        public final void b() {
            bw.this.a(this, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.utils.bw$a$a  reason: collision with other inner class name */
        public class C3813a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(93369);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.f142738b = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.f142738b = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(int i2) {
                MethodCollector.i(844);
                try {
                    this.out.write(i2);
                    MethodCollector.o(844);
                } catch (IOException unused) {
                    a.this.f142738b = true;
                    MethodCollector.o(844);
                }
            }

            private C3813a(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.i(842);
                MethodCollector.o(842);
            }

            /* synthetic */ C3813a(a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(byte[] bArr, int i2, int i3) {
                MethodCollector.i(845);
                try {
                    this.out.write(bArr, i2, i3);
                    MethodCollector.o(845);
                } catch (IOException unused) {
                    a.this.f142738b = true;
                    MethodCollector.o(845);
                }
            }
        }

        public final void a() {
            if (this.f142738b) {
                bw.this.a(this, false);
                bw.this.c(this.f142737a.f142741a);
                return;
            }
            bw.this.a(this, true);
        }

        public final OutputStream a(int i2) {
            C3813a aVar;
            MethodCollector.i(818);
            synchronized (bw.this) {
                try {
                    if (this.f142737a.f142744d == this) {
                        aVar = new C3813a(this, new FileOutputStream(this.f142737a.b(i2)), (byte) 0);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(818);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(818);
                }
            }
            return aVar;
        }

        private a(b bVar) {
            this.f142737a = bVar;
        }

        /* synthetic */ a(bw bwVar, b bVar, byte b2) {
            this(bVar);
        }
    }

    public final boolean c() {
        if (this.f142728e == null) {
            return true;
        }
        return false;
    }

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream[] f142747a;

        /* renamed from: c  reason: collision with root package name */
        private final String f142749c;

        /* renamed from: d  reason: collision with root package name */
        private final long f142750d;

        static {
            Covode.recordClassIndex(93371);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f142747a) {
                bw.a((Closeable) inputStream);
            }
        }

        private c(String str, long j2, InputStream[] inputStreamArr) {
            this.f142749c = str;
            this.f142750d = j2;
            this.f142747a = inputStreamArr;
        }

        /* synthetic */ c(bw bwVar, String str, long j2, InputStream[] inputStreamArr, byte b2) {
            this(str, j2, inputStreamArr);
        }
    }

    private void h() {
        if (this.f142728e == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void e() {
        close();
        a(this.f142725b);
    }

    /* access modifiers changed from: package-private */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f142741a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f142742b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f142743c;

        /* renamed from: d  reason: collision with root package name */
        public a f142744d;

        /* renamed from: e  reason: collision with root package name */
        public long f142745e;

        static {
            Covode.recordClassIndex(93370);
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f142742b) {
                sb.append(' ').append(j2);
            }
            return sb.toString();
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i2) {
            return new File(bw.this.f142725b, this.f142741a + "." + i2);
        }

        public final File b(int i2) {
            return new File(bw.this.f142725b, this.f142741a + "." + i2 + ".tmp");
        }

        public final void a(String[] strArr) {
            if (strArr.length == bw.this.f142727d) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f142742b[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        private b(String str) {
            this.f142741a = str;
            this.f142742b = new long[bw.this.f142727d];
        }

        /* synthetic */ b(bw bwVar, String str, byte b2) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(93366);
    }

    public final boolean b() {
        int i2 = this.f142729f;
        if (i2 < 2000 || i2 < this.f142734l.size()) {
            return false;
        }
        return true;
    }

    private void g() {
        c(this.f142731i);
        Iterator<b> it = this.f142734l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i2 = 0;
            if (next.f142744d == null) {
                while (i2 < this.f142727d) {
                    this.f142733k += next.f142742b[i2];
                    i2++;
                }
            } else {
                next.f142744d = null;
                while (i2 < this.f142727d) {
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
        MethodCollector.i(2743);
        if (this.f142728e == null) {
            MethodCollector.o(2743);
            return;
        }
        Iterator it = new ArrayList(this.f142734l.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f142744d != null) {
                bVar.f142744d.b();
            }
        }
        d();
        this.f142728e.close();
        this.f142728e = null;
        MethodCollector.o(2743);
    }

    public final void d() {
        while (this.f142733k > this.f142726c) {
            c(this.f142734l.entrySet().iterator().next().getKey());
        }
    }

    private void f() {
        String a2;
        MethodCollector.i(2701);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f142730h), 8192);
        try {
            String a3 = a((InputStream) bufferedInputStream);
            String a4 = a((InputStream) bufferedInputStream);
            String a5 = a((InputStream) bufferedInputStream);
            String a6 = a((InputStream) bufferedInputStream);
            String a7 = a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a3) || !"1".equals(a4) || !Integer.toString(this.f142732j).equals(a5) || !Integer.toString(this.f142727d).equals(a6) || !"".equals(a7)) {
                IOException iOException = new IOException("unexpected journal header: [" + a3 + ", " + a4 + ", " + a6 + ", " + a7 + "]");
                MethodCollector.o(2701);
                throw iOException;
            }
            while (true) {
                try {
                    a2 = a((InputStream) bufferedInputStream);
                    String[] split = a2.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        if (!split[0].equals("REMOVE") || split.length != 2) {
                            b bVar = this.f142734l.get(str);
                            if (bVar == null) {
                                bVar = new b(this, str, (byte) 0);
                                this.f142734l.put(str, bVar);
                            }
                            if (split[0].equals("CLEAN") && split.length == this.f142727d + 2) {
                                bVar.f142743c = true;
                                bVar.f142744d = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                                    MethodCollector.o(2701);
                                    throw illegalArgumentException;
                                } else if (2 <= length2) {
                                    int i2 = length - 2;
                                    int min = Math.min(i2, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i2);
                                    System.arraycopy(split, 2, objArr, 0, min);
                                    bVar.a((String[]) objArr);
                                } else {
                                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                                    MethodCollector.o(2701);
                                    throw arrayIndexOutOfBoundsException;
                                }
                            } else if (split[0].equals("DIRTY") && split.length == 2) {
                                bVar.f142744d = new a(this, bVar, (byte) 0);
                            } else if (!split[0].equals("READ") || split.length != 2) {
                                IOException iOException2 = new IOException("unexpected journal line: ".concat(String.valueOf(a2)));
                                MethodCollector.o(2701);
                            }
                        } else {
                            this.f142734l.remove(str);
                        }
                    } else {
                        IOException iOException3 = new IOException("unexpected journal line: ".concat(String.valueOf(a2)));
                        MethodCollector.o(2701);
                        throw iOException3;
                    }
                } catch (EOFException unused) {
                    return;
                }
            }
            IOException iOException22 = new IOException("unexpected journal line: ".concat(String.valueOf(a2)));
            MethodCollector.o(2701);
            throw iOException22;
        } finally {
            a((Closeable) bufferedInputStream);
            MethodCollector.o(2701);
        }
    }

    public final synchronized void a() {
        MethodCollector.i(2719);
        Writer writer = this.f142728e;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f142731i), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f142732j));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f142727d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.f142734l.values()) {
            if (bVar.f142744d != null) {
                bufferedWriter.write("DIRTY " + bVar.f142741a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.f142741a + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        this.f142731i.renameTo(this.f142730h);
        this.f142728e = new BufferedWriter(new FileWriter(this.f142730h, true), 8192);
        MethodCollector.o(2719);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static void c(File file) {
        if (file.exists() && !b(file)) {
            throw new IOException();
        }
    }

    private static void d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    private static String a(InputStream inputStream) {
        MethodCollector.i(2251);
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                EOFException eOFException = new EOFException();
                MethodCollector.o(2251);
                throw eOFException;
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == '\r') {
                        sb.setLength(i2);
                    }
                }
                String sb2 = sb.toString();
                MethodCollector.o(2251);
                return sb2;
            }
        }
    }

    private static boolean b(File file) {
        MethodCollector.i(2668);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2668);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2668);
        return delete;
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!b(file2)) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    public final synchronized a b(String str) {
        MethodCollector.i(2730);
        h();
        d(str);
        b bVar = this.f142734l.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.f142734l.put(str, bVar);
        } else if (bVar.f142744d != null) {
            MethodCollector.o(2730);
            return null;
        }
        a aVar = new a(this, bVar, (byte) 0);
        bVar.f142744d = aVar;
        this.f142728e.write("DIRTY " + str + '\n');
        this.f142728e.flush();
        MethodCollector.o(2730);
        return aVar;
    }

    public final synchronized boolean c(String str) {
        MethodCollector.i(2737);
        h();
        d(str);
        b bVar = this.f142734l.get(str);
        if (bVar == null || bVar.f142744d != null) {
            MethodCollector.o(2737);
            return false;
        }
        for (int i2 = 0; i2 < this.f142727d; i2++) {
            File a2 = bVar.a(i2);
            if (b(a2)) {
                this.f142733k -= bVar.f142742b[i2];
                bVar.f142742b[i2] = 0;
            } else {
                IOException iOException = new IOException("failed to delete ".concat(String.valueOf(a2)));
                MethodCollector.o(2737);
                throw iOException;
            }
        }
        this.f142729f++;
        this.f142728e.append((CharSequence) ("REMOVE " + str + '\n'));
        this.f142734l.remove(str);
        if (b()) {
            this.n.submit(this.o);
        }
        MethodCollector.o(2737);
        return true;
    }

    public final synchronized c a(String str) {
        MethodCollector.i(2727);
        h();
        d(str);
        b bVar = this.f142734l.get(str);
        if (bVar == null) {
            MethodCollector.o(2727);
            return null;
        } else if (!bVar.f142743c) {
            MethodCollector.o(2727);
            return null;
        } else {
            InputStream[] inputStreamArr = new InputStream[this.f142727d];
            for (int i2 = 0; i2 < this.f142727d; i2++) {
                try {
                    inputStreamArr[i2] = new FileInputStream(bVar.a(i2));
                } catch (FileNotFoundException unused) {
                    MethodCollector.o(2727);
                    return null;
                }
            }
            this.f142729f++;
            this.f142728e.append((CharSequence) ("READ " + str + '\n'));
            if (b()) {
                this.n.submit(this.o);
            }
            c cVar = new c(this, str, bVar.f142745e, inputStreamArr, (byte) 0);
            MethodCollector.o(2727);
            return cVar;
        }
    }

    public static bw a(File file, int i2) {
        bw bwVar = new bw(file, i2, 1, 52428800);
        if (bwVar.f142730h.exists()) {
            try {
                bwVar.f();
                bwVar.g();
                bwVar.f142728e = new BufferedWriter(new FileWriter(bwVar.f142730h, true), 8192);
                return bwVar;
            } catch (IOException unused) {
                bwVar.e();
            }
        }
        file.mkdirs();
        bw bwVar2 = new bw(file, i2, 1, 52428800);
        bwVar2.a();
        return bwVar2;
    }

    public final synchronized void a(a aVar, boolean z) {
        MethodCollector.i(2735);
        b bVar = aVar.f142737a;
        if (bVar.f142744d == aVar) {
            if (z && !bVar.f142743c) {
                for (int i2 = 0; i2 < this.f142727d; i2++) {
                    if (!bVar.b(i2).exists()) {
                        aVar.b();
                        IllegalStateException illegalStateException = new IllegalStateException("edit didn't create file ".concat(String.valueOf(i2)));
                        MethodCollector.o(2735);
                        throw illegalStateException;
                    }
                }
            }
            for (int i3 = 0; i3 < this.f142727d; i3++) {
                File b2 = bVar.b(i3);
                if (!z) {
                    c(b2);
                } else if (b2.exists()) {
                    File a2 = bVar.a(i3);
                    b2.renameTo(a2);
                    long j2 = bVar.f142742b[i3];
                    long length = a2.length();
                    bVar.f142742b[i3] = length;
                    this.f142733k = (this.f142733k - j2) + length;
                }
            }
            this.f142729f++;
            bVar.f142744d = null;
            if (bVar.f142743c || z) {
                bVar.f142743c = true;
                this.f142728e.write("CLEAN " + bVar.f142741a + bVar.a() + '\n');
                if (z) {
                    long j3 = this.f142735m;
                    this.f142735m = 1 + j3;
                    bVar.f142745e = j3;
                }
            } else {
                this.f142734l.remove(bVar.f142741a);
                this.f142728e.write("REMOVE " + bVar.f142741a + '\n');
            }
            if (this.f142733k > this.f142726c || b()) {
                this.n.submit(this.o);
            }
            MethodCollector.o(2735);
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException();
            MethodCollector.o(2735);
            throw illegalStateException2;
        }
    }

    private bw(File file, int i2, int i3, long j2) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        this.n = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        this.o = new Callable<Void>() {
            /* class com.ss.android.ugc.aweme.utils.bw.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93367);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                MethodCollector.i(2110);
                synchronized (bw.this) {
                    try {
                        if (bw.this.f142728e == null) {
                            return null;
                        }
                        bw.this.d();
                        if (bw.this.b()) {
                            bw.this.a();
                            bw.this.f142729f = 0;
                        }
                        MethodCollector.o(2110);
                        return null;
                    } finally {
                        MethodCollector.o(2110);
                    }
                }
            }
        };
        this.f142725b = file;
        this.f142732j = i2;
        this.f142730h = new File(file, "journal");
        this.f142731i = new File(file, "journal.tmp");
        this.f142727d = 1;
        this.f142726c = 52428800;
    }
}
