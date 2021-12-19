package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.f;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: a  reason: collision with root package name */
    public static final b f50532a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final b f50533b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final b f50534c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f50535d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final b f50536e = new g();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f50537g;

    /* renamed from: h  reason: collision with root package name */
    private static j f50538h;

    /* renamed from: i  reason: collision with root package name */
    private static l f50539i;

    /* renamed from: j  reason: collision with root package name */
    private static String f50540j;

    /* renamed from: k  reason: collision with root package name */
    private static int f50541k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static final ThreadLocal<c> f50542l = new ThreadLocal<>();

    /* renamed from: m  reason: collision with root package name */
    private static final b.AbstractC1214b f50543m = new a();
    private static final b n = new f();

    /* renamed from: f  reason: collision with root package name */
    public final Context f50544f;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;

        static {
            Covode.recordClassIndex(31485);
        }
    }

    public interface b {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f50545a;

            /* renamed from: b  reason: collision with root package name */
            public int f50546b;

            /* renamed from: c  reason: collision with root package name */
            public int f50547c;

            static {
                Covode.recordClassIndex(31488);
            }
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface AbstractC1214b {
            static {
                Covode.recordClassIndex(31489);
            }

            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        static {
            Covode.recordClassIndex(31487);
        }

        a a(Context context, String str, AbstractC1214b bVar);
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f50548a;

        static {
            Covode.recordClassIndex(31490);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    private static Boolean a() {
        boolean z;
        Boolean valueOf;
        MethodCollector.i(12494);
        synchronized (DynamiteModule.class) {
            try {
                if (f50541k >= 2) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            } finally {
                MethodCollector.o(12494);
            }
        }
        return valueOf;
    }

    static {
        Covode.recordClassIndex(31484);
    }

    public static class a extends Exception {
        static {
            Covode.recordClassIndex(31486);
        }

        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, byte b2) {
            this(str, th);
        }
    }

    static class d implements b.AbstractC1214b {

        /* renamed from: a  reason: collision with root package name */
        private final int f50549a;

        static {
            Covode.recordClassIndex(31491);
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC1214b
        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        public d(int i2) {
            this.f50549a = i2;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC1214b
        public final int a(Context context, String str) {
            return this.f50549a;
        }
    }

    private DynamiteModule(Context context) {
        this.f50544f = (Context) r.a(context);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static void a(ClassLoader classLoader) {
        l lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof l) {
                    lVar = (l) queryLocalInterface;
                } else {
                    lVar = new k(iBinder);
                }
            }
            f50539i = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, (byte) 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.j b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.b(android.content.Context):com.google.android.gms.dynamite.j");
    }

    public final IBinder a(String str) {
        String str2;
        try {
            return (IBinder) this.f50544f.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Failed to instantiate module class: ".concat(valueOf);
            } else {
                str2 = new String("Failed to instantiate module class: ");
            }
            throw new a(str2, e2, (byte) 0);
        }
    }

    private static DynamiteModule b(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(a(context));
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = a(context).getClassLoader().loadClass(new StringBuilder(String.valueOf(str).length() + 61).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".ModuleDescriptor").toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(String.valueOf(declaredField.get(null))).length();
            String.valueOf(str).length();
            return 0;
        } catch (ClassNotFoundException unused) {
            String.valueOf(str).length();
            return 0;
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    private static int b(Context context, String str, boolean z) {
        j b2 = b(context);
        if (b2 == null) {
            return 0;
        }
        try {
            if (b2.a() >= 2) {
                return b2.b(com.google.android.gms.a.b.a(context), str, z);
            }
            return b2.a(com.google.android.gms.a.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        l lVar;
        com.google.android.gms.a.a a2;
        MethodCollector.i(12348);
        String.valueOf(str).length();
        synchronized (DynamiteModule.class) {
            try {
                lVar = f50539i;
            } catch (Throwable th) {
                MethodCollector.o(12348);
                throw th;
            }
        }
        if (lVar != null) {
            c cVar = f50542l.get();
            if (cVar == null || cVar.f50548a == null) {
                a aVar = new a("No result cursor", (byte) 0);
                MethodCollector.o(12348);
                throw aVar;
            }
            Context a3 = a(context);
            Cursor cursor = cVar.f50548a;
            com.google.android.gms.a.b.a((Object) null);
            if (a().booleanValue()) {
                a2 = lVar.b(com.google.android.gms.a.b.a(a3), str, i2, com.google.android.gms.a.b.a(cursor));
            } else {
                a2 = lVar.a(com.google.android.gms.a.b.a(a3), str, i2, com.google.android.gms.a.b.a(cursor));
            }
            Context context2 = (Context) com.google.android.gms.a.b.a(a2);
            if (context2 != null) {
                DynamiteModule dynamiteModule = new DynamiteModule(context2);
                MethodCollector.o(12348);
                return dynamiteModule;
            }
            a aVar2 = new a("Failed to get module context", (byte) 0);
            MethodCollector.o(12348);
            throw aVar2;
        }
        a aVar3 = new a("DynamiteLoaderV2 was not cached.", (byte) 0);
        MethodCollector.o(12348);
        throw aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    public static int a(Context context, String str, boolean z) {
        ClassLoader hVar;
        MethodCollector.i(12046);
        try {
            synchronized (DynamiteModule.class) {
                try {
                    Boolean bool = f50537g;
                    if (bool == null) {
                        try {
                            Class<?> loadClass = a(context).getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                            Field declaredField = loadClass.getDeclaredField("sClassLoader");
                            synchronized (loadClass) {
                                try {
                                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                    if (classLoader != null) {
                                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                a(classLoader);
                                            } catch (a unused) {
                                            }
                                            bool = Boolean.TRUE;
                                        }
                                    } else if ("com.google.android.gms".equals(a(context).getPackageName())) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int c2 = c(context, str, z);
                                            String str2 = f50540j;
                                            if (str2 != null) {
                                                if (!str2.isEmpty()) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        hVar = new DelegateLastClassLoader(f50540j, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        hVar = new h(f50540j, ClassLoader.getSystemClassLoader());
                                                    }
                                                    a(hVar);
                                                    declaredField.set(null, hVar);
                                                    f50537g = Boolean.TRUE;
                                                    MethodCollector.o(12046);
                                                    return c2;
                                                }
                                            }
                                            return c2;
                                        } catch (a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                            f50537g = bool;
                                            if (bool.booleanValue()) {
                                                try {
                                                    int c3 = c(context, str, z);
                                                    MethodCollector.o(12046);
                                                    return c3;
                                                } catch (a e2) {
                                                    String valueOf = String.valueOf(e2.getMessage());
                                                    if (valueOf.length() != 0) {
                                                        "Failed to retrieve remote module version: ".concat(valueOf);
                                                    } else {
                                                        new String("Failed to retrieve remote module version: ");
                                                    }
                                                    MethodCollector.o(12046);
                                                    return 0;
                                                }
                                            } else {
                                                int b2 = b(context, str, z);
                                                MethodCollector.o(12046);
                                                return b2;
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.o(12046);
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                            String.valueOf(String.valueOf(e3)).length();
                            bool = Boolean.FALSE;
                        }
                    }
                } finally {
                    MethodCollector.o(12046);
                }
            }
        } catch (Throwable th) {
            f.a(context, th);
            MethodCollector.o(12046);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static DynamiteModule a(Context context, b bVar, String str) {
        ThreadLocal<c> threadLocal = f50542l;
        c cVar = threadLocal.get();
        c cVar2 = new c((byte) 0);
        threadLocal.set(cVar2);
        try {
            b.a a2 = bVar.a(context, str, f50543m);
            String.valueOf(str).length();
            String.valueOf(str).length();
            if (a2.f50547c == 0 || ((a2.f50547c == -1 && a2.f50545a == 0) || (a2.f50547c == 1 && a2.f50546b == 0))) {
                int i2 = a2.f50545a;
                throw new a(new StringBuilder(91).append("No acceptable module found. Local version is ").append(i2).append(" and remote version is ").append(a2.f50546b).append(".").toString(), (byte) 0);
            } else if (a2.f50547c == -1) {
                DynamiteModule b2 = b(context, str);
                if (cVar2.f50548a != null) {
                    cVar2.f50548a.close();
                }
                threadLocal.set(cVar);
                return b2;
            } else if (a2.f50547c == 1) {
                try {
                    DynamiteModule a3 = a(context, str, a2.f50546b);
                    if (cVar2.f50548a != null) {
                        cVar2.f50548a.close();
                    }
                    threadLocal.set(cVar);
                    return a3;
                } catch (a e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to load remote module: ".concat(valueOf);
                    } else {
                        new String("Failed to load remote module: ");
                    }
                    if (a2.f50545a == 0 || bVar.a(context, str, new d(a2.f50545a)).f50547c != -1) {
                        throw new a("Remote load failed. No local fallback found.", e2, (byte) 0);
                    }
                    DynamiteModule b3 = b(context, str);
                    if (cVar2.f50548a != null) {
                        cVar2.f50548a.close();
                    }
                    f50542l.set(cVar);
                    return b3;
                }
            } else {
                throw new a(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(a2.f50547c).toString(), (byte) 0);
            }
        } catch (Throwable th) {
            if (cVar2.f50548a != null) {
                cVar2.f50548a.close();
            }
            f50542l.set(cVar);
            throw th;
        }
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        com.google.android.gms.a.a a2;
        MethodCollector.i(12344);
        try {
            synchronized (DynamiteModule.class) {
                try {
                    bool = f50537g;
                } finally {
                    MethodCollector.o(12344);
                }
            }
            if (bool == null) {
                a aVar = new a("Failed to determine which loading route to use.", (byte) 0);
                MethodCollector.o(12344);
                throw aVar;
            } else if (bool.booleanValue()) {
                DynamiteModule b2 = b(context, str, i2);
                MethodCollector.o(12344);
                return b2;
            } else {
                String.valueOf(str).length();
                j b3 = b(context);
                if (b3 != null) {
                    if (b3.a() >= 2) {
                        a2 = b3.b(com.google.android.gms.a.b.a(context), str, i2);
                    } else {
                        a2 = b3.a(com.google.android.gms.a.b.a(context), str, i2);
                    }
                    if (com.google.android.gms.a.b.a(a2) != null) {
                        return new DynamiteModule((Context) com.google.android.gms.a.b.a(a2));
                    }
                    a aVar2 = new a("Failed to load remote module.", (byte) 0);
                    MethodCollector.o(12344);
                    throw aVar2;
                }
                a aVar3 = new a("Failed to create IDynamiteLoader.", (byte) 0);
                MethodCollector.o(12344);
                throw aVar3;
            }
        } catch (RemoteException e2) {
            a aVar4 = new a("Failed to load remote module.", e2, (byte) 0);
            MethodCollector.o(12344);
            throw aVar4;
        } catch (a e3) {
            MethodCollector.o(12344);
            throw e3;
        } catch (Throwable th) {
            f.a(context, th);
            a aVar5 = new a("Failed to load remote module.", th, (byte) 0);
            MethodCollector.o(12344);
            throw aVar5;
        }
    }
}
