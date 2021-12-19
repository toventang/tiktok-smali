package com.bytedance.librarian;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.elf.ElfParser;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public class LibrarianImpl {

    /* renamed from: a  reason: collision with root package name */
    static final LibrarianImpl f39767a;
    private static final String[] o = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};

    /* renamed from: b  reason: collision with root package name */
    public final LibrarianMonitor f39768b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f39769c = {"/system/lib64", "/vendor/lib64"};

    /* renamed from: d  reason: collision with root package name */
    private final File f39770d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, LibRecorder> f39771e;

    /* renamed from: f  reason: collision with root package name */
    private final File f39772f;

    /* renamed from: g  reason: collision with root package name */
    private File f39773g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f39774h;

    /* renamed from: i  reason: collision with root package name */
    private ZipFile[] f39775i;

    /* renamed from: j  reason: collision with root package name */
    private String f39776j;

    /* renamed from: k  reason: collision with root package name */
    private ApplicationInfo f39777k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f39778l;

    /* renamed from: m  reason: collision with root package name */
    private String[] f39779m;
    private String n;

    /* access modifiers changed from: package-private */
    public static class LibRecorder {

        /* renamed from: a  reason: collision with root package name */
        boolean f39780a;

        LibRecorder() {
        }

        public String toString() {
            return Boolean.toString(this.f39780a);
        }
    }

    /* access modifiers changed from: package-private */
    public class Locker {

        /* renamed from: b  reason: collision with root package name */
        private RandomAccessFile f39782b;

        /* renamed from: c  reason: collision with root package name */
        private FileLock f39783c;

        /* renamed from: d  reason: collision with root package name */
        private FileChannel f39784d;

        /* renamed from: e  reason: collision with root package name */
        private File f39785e;

        /* access modifiers changed from: package-private */
        public final void b() {
            FileLock fileLock = this.f39783c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            this.f39785e.getPath();
            LibrarianImpl.a(this.f39784d);
            LibrarianImpl.a(this.f39782b);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f39785e, "rw");
            this.f39782b = randomAccessFile;
            try {
                this.f39784d = randomAccessFile.getChannel();
                try {
                    this.f39785e.getPath();
                    this.f39783c = this.f39784d.lock();
                    this.f39785e.getPath();
                } catch (IOException e2) {
                    LibrarianImpl.a(this.f39784d);
                    throw e2;
                }
            } catch (IOException e3) {
                LibrarianImpl.a(this.f39782b);
                throw e3;
            }
        }

        Locker(File file) {
            this.f39785e = file;
        }
    }

    private String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ZipFile[] zipFileArr = this.f39775i;
        for (ZipFile zipFile : zipFileArr) {
            if (zipFile != null) {
                String name = zipFile.getName();
                sb.append(name).append("#").append(zipFile.size()).append(":").append(new File(name).length()).append("|");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        String str;
        LibrarianMonitor librarianMonitor;
        Context context = Librarian.f39763a;
        Librarian.f39763a = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (Librarian.f39764b != null) {
                str = Librarian.f39764b;
            } else {
                str = "default.version";
            }
            File file = new File(dir, str + "." + (new File(applicationInfo.sourceDir).lastModified() >> 8));
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file.getName().equals(file2.getName())) {
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null) {
                            for (File file3 : listFiles2) {
                                e(file3);
                            }
                        }
                        e(file2);
                    }
                }
            }
            file.mkdirs();
            if (file.exists()) {
                if (Librarian.f39765c != null) {
                    librarianMonitor = Librarian.f39765c;
                } else {
                    librarianMonitor = new LibrarianMonitor();
                }
                f39767a = new LibrarianImpl(applicationInfo, file, librarianMonitor);
                return;
            }
            f39767a = null;
            return;
        }
        throw new LibrarianUnsatisfiedLinkError("you should call init first or use loadLibraryForModule.");
    }

    private void a() {
        String[] strArr;
        MethodCollector.i(9155);
        if (this.f39774h) {
            MethodCollector.o(9155);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f39774h) {
                    File file = new File(this.f39777k.sourceDir);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file);
                    if (!(Build.VERSION.SDK_INT < 21 || (strArr = this.f39777k.splitSourceDirs) == null || strArr.length == 0)) {
                        for (String str : strArr) {
                            arrayList.add(new File(str));
                        }
                    }
                    ZipFile[] zipFileArr = new ZipFile[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        int i3 = i2 + 1;
                        try {
                            zipFileArr[i2] = new ZipFile(file2);
                        } catch (IOException e2) {
                            new LibrarianUnsatisfiedLinkError("fail to get zip file " + file2.getName() + ", size " + file2.length() + ", exists " + file2.exists(), e2).printStackTrace();
                        }
                        i2 = i3;
                    }
                    this.f39775i = zipFileArr;
                    this.f39773g = new File(this.f39777k.nativeLibraryDir);
                    HashMap hashMap = new HashMap();
                    this.f39778l = hashMap;
                    hashMap.put("arm64-v8a", "arm64");
                    this.f39778l.put("armeabi-v7a", "arm");
                    this.f39778l.put("armeabi", "arm");
                    String str2 = null;
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                            str2 = (String) cls.getDeclaredMethod("vmInstructionSet", new Class[0]).invoke(cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                        } catch (Exception e3) {
                            new LibrarianUnsatisfiedLinkError("reflect err", e3);
                        }
                    }
                    this.f39776j = str2;
                    this.f39779m = Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : Build.SUPPORTED_ABIS;
                    this.f39774h = true;
                    MethodCollector.o(9155);
                }
            } finally {
                MethodCollector.o(9155);
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static List<String> b(File file) {
        Throwable th;
        ElfParser elfParser = null;
        try {
            ElfParser elfParser2 = new ElfParser(file);
            try {
                List<String> a2 = elfParser2.a();
                Collections.sort(a2);
                a(elfParser2);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                elfParser = elfParser2;
                a(elfParser);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a(elfParser);
            throw th;
        }
    }

    private boolean c(String str) {
        for (String str2 : this.f39769c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean e(String str) {
        if (this.f39776j == null) {
            return true;
        }
        String str2 = this.f39778l.get(str);
        String str3 = this.f39776j;
        if (str2 != null) {
            str = str2;
        }
        return str3.equals(str);
    }

    private static String f(String str) {
        return "lib" + str + ".so";
    }

    private boolean a(String str) {
        try {
            this.f39768b.a(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long c(java.io.File r6) {
        /*
            r5 = 9353(0x2489, float:1.3106E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]
            r3 = 0
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream     // Catch:{ IOException -> 0x0032 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0032 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0032 }
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x0032 }
            r0.<init>()     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0032 }
        L_0x0019:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            if (r0 >= 0) goto L_0x0019
            java.util.zip.Checksum r0 = r2.getChecksum()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            long r0 = r0.getValue()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x002e:
            r0 = move-exception
            r3 = r2
            goto L_0x003f
        L_0x0031:
            r3 = r2
        L_0x0032:
            r6.getPath()     // Catch:{ all -> 0x003e }
            a(r3)
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x003e:
            r0 = move-exception
        L_0x003f:
            a(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.c(java.io.File):long");
    }

    private void d(String str) {
        if (this.n == null) {
            String[] strArr = this.f39779m;
            for (String str2 : strArr) {
                if (e(str2)) {
                    String str3 = "lib/" + str2 + "/" + str;
                    ZipFile[] zipFileArr = this.f39775i;
                    for (ZipFile zipFile : zipFileArr) {
                        if (zipFile != null && zipFile.getEntry(str3) != null) {
                            this.n = str2;
                            return;
                        }
                    }
                    continue;
                }
            }
            throw new LibrarianUnsatisfiedLinkError("can not ensure abi for " + str + ", check " + this.f39776j + ", apks " + b());
        }
    }

    private static boolean e(File file) {
        MethodCollector.i(9682);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9682);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9682);
        return delete;
    }

    /* JADX INFO: finally extract failed */
    private boolean d(File file) {
        MethodCollector.i(9522);
        d(file.getName());
        String str = "lib/" + this.n + "/" + file.getName();
        ZipFile[] zipFileArr = this.f39775i;
        for (ZipFile zipFile : zipFileArr) {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    a(inputStream, file);
                    file.getPath();
                    zipFile.getName();
                    a(inputStream);
                    MethodCollector.o(9522);
                    return true;
                } catch (Throwable th) {
                    a(inputStream);
                    MethodCollector.o(9522);
                    throw th;
                }
            }
        }
        MethodCollector.o(9522);
        return false;
    }

    private boolean b(String str) {
        String str2;
        File[] fileArr;
        int i2;
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23 || (str2 = this.f39776j) == null || !str2.contains("64")) {
            return false;
        }
        try {
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((BaseDexClassLoader) getClass().getClassLoader());
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            File[] fileArr2 = (File[]) declaredField2.get(obj);
            int length = fileArr2.length;
            File[] fileArr3 = new File[length];
            System.arraycopy(fileArr2, 0, fileArr3, 0, length);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < length; i6++) {
                File file = fileArr3[i6];
                if (this.f39770d.equals(file)) {
                    i3 = i6;
                } else if (this.f39773g.equals(file)) {
                    i5 = i6;
                } else if (new File(file, f(str)).exists()) {
                    i4 = i6;
                }
            }
            if (i3 != -1) {
                fileArr = new File[length];
                a(fileArr3, 0, i3);
                i2 = 1;
            } else {
                fileArr = new File[(length + 1)];
                fileArr[0] = this.f39770d;
                i2 = 0;
            }
            if (i4 != -1) {
                a(fileArr3, i2, i4);
                i2++;
            }
            if (i5 != -1) {
                a(fileArr3, i2, i5);
                i2++;
            }
            for (int length2 = length - this.f39769c.length; length2 < length; length2++) {
                if (!c(fileArr3[length2].getAbsolutePath())) {
                    for (int i7 = i2; i7 < length - 2; i7++) {
                        if (c(fileArr3[i7].getAbsolutePath())) {
                            a(fileArr3, length2, i7);
                        }
                    }
                }
            }
            if (i3 != -1) {
                System.arraycopy(fileArr3, 0, fileArr, 0, length);
            } else {
                System.arraycopy(fileArr3, 0, fileArr, 1, length);
            }
            declaredField2.set(obj, fileArr);
            return true;
        } catch (Exception e2) {
            new LibrarianUnsatisfiedLinkError("opt lib dir err", e2);
            return false;
        }
    }

    private boolean a(File file) {
        if (!file.exists()) {
            file.getPath();
            return false;
        }
        d(file.getName());
        long j2 = 0;
        String str = "lib/" + this.n + "/" + file.getName();
        ZipFile[] zipFileArr = this.f39775i;
        int length = zipFileArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            ZipEntry entry = zipFileArr[i2].getEntry(str);
            if (entry != null) {
                j2 = entry.getCrc();
                break;
            }
            i2++;
        }
        if (j2 == c(file)) {
            return true;
        }
        return false;
    }

    private static boolean b(File file, boolean z) {
        MethodCollector.i(14515);
        try {
            System.load(file.getPath());
            MethodCollector.o(14515);
            return true;
        } catch (UnsatisfiedLinkError e2) {
            if (!z) {
                file.getName();
                MethodCollector.o(14515);
                return false;
            }
            LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError = new LibrarianUnsatisfiedLinkError("finally fail to load " + file.getPath(), e2);
            MethodCollector.o(14515);
            throw librarianUnsatisfiedLinkError;
        }
    }

    private void c(File file, boolean z) {
        try {
            for (String str : b(file)) {
                String substring = str.substring(3, str.length() - 3);
                String[] strArr = o;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        a(substring, z);
                        break;
                    } else if (strArr[i2].equals(substring)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } catch (IOException e2) {
            throw new LibrarianUnsatisfiedLinkError("fail to load depended lib", e2);
        }
    }

    private void a(File file, boolean z) {
        MethodCollector.i(14513);
        String name = file.getName();
        synchronized (this) {
            try {
                Locker locker = new Locker(this.f39772f);
                try {
                    locker.a();
                    if (!d(file)) {
                        if (!z) {
                            LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError = new LibrarianUnsatisfiedLinkError("fail to extract ".concat(String.valueOf(name)));
                            MethodCollector.o(14513);
                            throw librarianUnsatisfiedLinkError;
                        }
                    }
                    locker.b();
                } catch (IOException e2) {
                    LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError2 = new LibrarianUnsatisfiedLinkError("fail to extract ".concat(String.valueOf(name)), e2);
                    MethodCollector.o(14513);
                    throw librarianUnsatisfiedLinkError2;
                } catch (Throwable th) {
                    locker.b();
                    MethodCollector.o(14513);
                    throw th;
                }
            } finally {
                MethodCollector.o(14513);
            }
        }
    }

    private static File a(InputStream inputStream, File file) {
        MethodCollector.i(9680);
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        createTempFile.getPath();
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                IOException iOException = new IOException("failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                MethodCollector.o(9680);
                throw iOException;
            }
            IOException iOException2 = new IOException("failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            MethodCollector.o(9680);
            throw iOException2;
        } finally {
            a(fileOutputStream);
            e(createTempFile);
            MethodCollector.o(9680);
        }
    }

    private void b(String str, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        File file = new File(this.f39770d, f(str));
        if (!a(str)) {
            if (!file.exists() || !b(file, false)) {
                a();
                if (!b(str) || !a(str)) {
                    File a2 = a(str, file, z);
                    c(a2, z);
                    if (a2 != file) {
                        if (!a(str)) {
                            a(file, z);
                        } else {
                            return;
                        }
                    }
                    b(file, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.f39780a == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        b(r5, r6);
        r1.f39780a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14511);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14511);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r3 = 14511(0x38af, float:2.0334E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r2 = r4.f39771e
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r0 = r4.f39771e     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0041 }
            com.bytedance.librarian.LibrarianImpl$LibRecorder r1 = (com.bytedance.librarian.LibrarianImpl.LibRecorder) r1     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x001b
            boolean r0 = r1.f39780a     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x001b:
            com.bytedance.librarian.LibrarianImpl$LibRecorder r1 = new com.bytedance.librarian.LibrarianImpl$LibRecorder
            r1.<init>()
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r0 = r4.f39771e
            r0.put(r5, r1)
        L_0x0025:
            monitor-exit(r2)
            monitor-enter(r1)
            boolean r0 = r1.f39780a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0030
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0030:
            r4.b(r5, r6)
            r0 = 1
            r1.f39780a = r0
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.a(java.lang.String, boolean):void");
    }

    private static void a(File[] fileArr, int i2, int i3) {
        if (i2 != i3) {
            File file = fileArr[i2];
            fileArr[i2] = fileArr[i3];
            fileArr[i3] = file;
        }
    }

    private File a(String str, File file, boolean z) {
        File file2 = new File(this.f39773g, f(str));
        if (a(file2)) {
            return file2;
        }
        a(file, z);
        return file;
    }

    private LibrarianImpl(ApplicationInfo applicationInfo, File file, LibrarianMonitor librarianMonitor) {
        this.f39770d = file;
        this.f39768b = librarianMonitor;
        this.f39777k = applicationInfo;
        this.f39772f = new File(file, "process.lock");
        this.f39771e = new HashMap();
    }
}
