package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f49175a;

    /* renamed from: b  reason: collision with root package name */
    static h f49176b;

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f49177c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static i[] f49178d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f49179e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static l f49180f;

    /* renamed from: g  reason: collision with root package name */
    private static b f49181g;

    /* renamed from: h  reason: collision with root package name */
    private static final HashSet<String> f49182h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<String, Object> f49183i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private static final Set<String> f49184j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k  reason: collision with root package name */
    private static k f49185k = null;

    /* renamed from: l  reason: collision with root package name */
    private static int f49186l;

    /* access modifiers changed from: package-private */
    public static class Api14Utils {
        static {
            Covode.recordClassIndex(30754);
        }

        private Api14Utils() {
        }

        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e2) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e2);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    static {
        Covode.recordClassIndex(30752);
        boolean z = false;
        try {
            int i2 = Build.VERSION.SDK_INT;
            z = true;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f49175a = z;
    }

    private static int a() {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = f49177c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if ((f49186l & 2) != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i2;
        } catch (Throwable th) {
            f49177c.writeLock().unlock();
            throw th;
        }
    }

    private static Method c() {
        Method method;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 27) {
            try {
                method = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            } catch (NoSuchMethodException | SecurityException unused) {
                return null;
            }
        } else {
            method = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class);
        }
        method.setAccessible(true);
        return method;
    }

    private static synchronized void b() {
        final boolean z;
        final String str;
        synchronized (SoLoader.class) {
            MethodCollector.i(5403);
            final Runtime runtime = Runtime.getRuntime();
            final Method c2 = c();
            if (c2 != null) {
                z = true;
            } else {
                z = false;
            }
            final String str2 = null;
            if (z) {
                str = Api14Utils.a();
                if (str != null) {
                    String[] split = str.split(":");
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str3 : split) {
                        if (!str3.contains("!")) {
                            arrayList.add(str3);
                        }
                    }
                    str2 = TextUtils.join(":", arrayList);
                }
            } else {
                str = null;
            }
            f49176b = new h() {
                /* class com.facebook.soloader.SoLoader.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(30753);
                }

                private static Object a(Method method, Object obj, Object[] objArr) {
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_facebook_soloader_SoLoader$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method.invoke(obj, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_facebook_soloader_SoLoader$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }

                private static String a(String str) {
                    String str2;
                    MethodCollector.i(6603);
                    try {
                        File file = new File(str);
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                instance.update(bArr, 0, read);
                            }
                            str2 = com.a.a("%32x", new Object[]{new BigInteger(1, instance.digest())});
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            MethodCollector.o(6603);
                            throw th;
                        }
                    } catch (IOException e2) {
                        str2 = e2.toString();
                    } catch (NoSuchAlgorithmException e3) {
                        str2 = e3.toString();
                    }
                    MethodCollector.o(6603);
                    return str2;
                }

                @Override // com.facebook.soloader.h
                public final void a(String str, int i2) {
                    String str2;
                    Throwable th;
                    String str3;
                    MethodCollector.i(6574);
                    if (z) {
                        if ((i2 & 4) == 4) {
                            str2 = str;
                        } else {
                            str2 = str2;
                        }
                        try {
                            synchronized (runtime) {
                                try {
                                    if (Build.VERSION.SDK_INT <= 27) {
                                        str3 = (String) a(c2, runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                                    } else {
                                        str3 = (String) a(c2, runtime, new Object[]{str, SoLoader.class.getClassLoader()});
                                    }
                                    if (str3 == null) {
                                        try {
                                            MethodCollector.o(6574);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            MethodCollector.o(6574);
                                            throw th;
                                        }
                                    } else {
                                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(str3);
                                        MethodCollector.o(6574);
                                        throw unsatisfiedLinkError;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    MethodCollector.o(6574);
                                    throw th;
                                }
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                            RuntimeException runtimeException = new RuntimeException("Error: Cannot load ".concat(String.valueOf(str)), e2);
                            MethodCollector.o(6574);
                            throw runtimeException;
                        } catch (Throwable th4) {
                            if (0 != 0) {
                                a(str);
                            }
                            MethodCollector.o(6574);
                            throw th4;
                        }
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        System.load(str);
                        m.a(uptimeMillis, str);
                        MethodCollector.o(6574);
                    }
                }
            };
            MethodCollector.o(5403);
        }
    }

    public static final class a extends UnsatisfiedLinkError {
        static {
            Covode.recordClassIndex(30755);
        }

        a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static void a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            b();
            a(context, 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static boolean a(String str) {
        boolean z;
        MethodCollector.i(5413);
        ReentrantReadWriteLock reentrantReadWriteLock = f49177c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f49178d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        if (f49178d != null) {
                            reentrantReadWriteLock.readLock().unlock();
                        } else {
                            RuntimeException runtimeException = new RuntimeException("SoLoader.init() not yet called");
                            MethodCollector.o(5413);
                            throw runtimeException;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    synchronized (SoLoader.class) {
                        try {
                            z = !f49182h.contains(str);
                            if (z && f49185k == null) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                Librarian.a(str, false, (Context) null);
                                m.a(uptimeMillis, str);
                            }
                        } catch (Throwable th2) {
                            MethodCollector.o(5413);
                            throw th2;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    MethodCollector.o(5413);
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            boolean a2 = a(System.mapLibraryName(str), str, 0, null);
            MethodCollector.o(5413);
            return a2;
        } finally {
            f49177c.readLock().unlock();
            MethodCollector.o(5413);
        }
    }

    private static void a(Context context, int i2) {
        String[] split;
        int i3;
        f49177c.writeLock().lock();
        try {
            if (f49178d == null) {
                f49186l = 0;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                for (String str2 : str.split(":")) {
                    arrayList.add(new c(new File(str2), 2));
                }
                if (context != null) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & 128) != 0) {
                        int i4 = Build.VERSION.SDK_INT;
                        b bVar = new b(context, 0);
                        f49181g = bVar;
                        arrayList.add(0, bVar);
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    a aVar = new a(context, "lib-main", i3);
                    f49180f = aVar;
                    arrayList.add(0, aVar);
                }
                i[] iVarArr = (i[]) arrayList.toArray(new i[arrayList.size()]);
                int a2 = a();
                int length = iVarArr.length;
                while (true) {
                    int i5 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    iVarArr[i5].a(a2);
                    length = i5;
                }
                f49178d = iVarArr;
                f49179e++;
            }
        } finally {
            f49177c.writeLock().unlock();
        }
    }

    private static void a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        boolean z;
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock2 = f49177c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f49178d != null) {
                reentrantReadWriteLock2.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f49175a) {
                    Trace.beginSection("SoLoader.loadLibrary[" + str + "]");
                }
                int i3 = 0;
                do {
                    try {
                        f49177c.readLock().lock();
                        int i4 = f49179e;
                        int i5 = 0;
                        while (true) {
                            if (i3 != 0) {
                                break;
                            }
                            try {
                                i[] iVarArr = f49178d;
                                if (i5 >= iVarArr.length) {
                                    break;
                                }
                                i3 = iVarArr[i5].a(str, i2, threadPolicy);
                                if (i3 == 3) {
                                    l lVar = f49180f;
                                    if (lVar != null) {
                                        lVar.a(str);
                                        i3 = f49180f.a(str, i2, threadPolicy);
                                    }
                                } else {
                                    i5++;
                                }
                            } catch (Throwable th) {
                                f49177c.readLock().unlock();
                                throw th;
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                        reentrantReadWriteLock.writeLock().lock();
                        try {
                            b bVar = f49181g;
                            if (bVar != null && bVar.a()) {
                                f49179e++;
                            }
                            if (f49179e != i4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            reentrantReadWriteLock.writeLock().unlock();
                        } catch (Throwable th2) {
                            f49177c.writeLock().unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (f49175a) {
                            Trace.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i3 == 0 || i3 == 3) {
                            String concat = "couldn't find DSO to load: ".concat(String.valueOf(str));
                            String message = th3.getMessage();
                            if (message == null) {
                                message = th3.toString();
                            }
                            throw new UnsatisfiedLinkError(concat + " caused by: " + message);
                        }
                        return;
                    }
                } while (z2);
                if (f49175a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i3 == 0 || i3 == 3) {
                    throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
                }
                return;
            }
            throw new UnsatisfiedLinkError("couldn't find DSO to load: ".concat(String.valueOf(str)));
        } finally {
            f49177c.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r2.contains(r7) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        a(r7, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        com.facebook.soloader.SoLoader.f49184j.contains(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0061, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        r1 = r2.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007c, code lost:
        r0 = new com.facebook.soloader.SoLoader.a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0085, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0089, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008a, code lost:
        r0 = new java.lang.RuntimeException(r1);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0092, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0095, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5425);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(java.lang.String r7, java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
