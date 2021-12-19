package com.bytedance.u;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static b f45698d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f45699e;

    /* renamed from: g  reason: collision with root package name */
    private static Context f45700g;

    /* renamed from: a  reason: collision with root package name */
    public long f45701a;

    /* renamed from: b  reason: collision with root package name */
    public long f45702b;

    /* renamed from: c  reason: collision with root package name */
    public String f45703c;

    /* renamed from: f  reason: collision with root package name */
    private a f45704f;

    /* renamed from: h  reason: collision with root package name */
    private volatile Boolean f45705h;

    /* renamed from: i  reason: collision with root package name */
    private File f45706i;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(27812);
        }

        String a();
    }

    static {
        Covode.recordClassIndex(27811);
    }

    private String b() {
        a aVar = this.f45704f;
        if (aVar == null) {
            return "unknown";
        }
        return aVar.a();
    }

    public final boolean a() {
        if (!"mounted".equals(b()) || !c()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "state=" + b() + ", totalSize=" + this.f45702b + ", availableSize=" + this.f45701a + ", path=" + this.f45703c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.u.b$b  reason: collision with other inner class name */
    public static class C1124b implements a {

        /* renamed from: a  reason: collision with root package name */
        private Method f45707a;

        /* renamed from: b  reason: collision with root package name */
        private Object f45708b;

        static {
            Covode.recordClassIndex(27813);
        }

        @Override // com.bytedance.u.b.a
        public final String a() {
            Object obj;
            Object invoke;
            Method method = this.f45707a;
            if (method == null || (obj = this.f45708b) == null) {
                return "unknown";
            }
            try {
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_storage_SdCardInfo$ReflectStateListener_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    invoke = a2.second;
                } else {
                    invoke = method.invoke(obj, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_storage_SdCardInfo$ReflectStateListener_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return (String) invoke;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return "unknown";
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return "unknown";
            }
        }

        public C1124b(Method method, Object obj) {
            this.f45707a = method;
            this.f45708b = obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        if (r4 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6 A[SYNTHETIC, Splitter:B:47:0x00a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c() {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.u.b.c():boolean");
    }

    public static b a(Context context) {
        MethodCollector.i(8451);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        f45700g = applicationContext;
        if (!f45699e) {
            synchronized (b.class) {
                try {
                    if (!f45699e) {
                        try {
                            StorageManager storageManager = (StorageManager) a(context, "storage");
                            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                            Method method2 = cls.getMethod("getPathFile", new Class[0]);
                            Method method3 = cls.getMethod("isRemovable", new Class[0]);
                            Method method4 = cls.getMethod("getState", new Class[0]);
                            Object invoke = method.invoke(storageManager, new Object[0]);
                            int length = Array.getLength(invoke);
                            for (int i2 = 0; i2 < length; i2++) {
                                Object obj = Array.get(invoke, i2);
                                if (((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                                    File file = (File) method2.invoke(obj, new Object[0]);
                                    b bVar = new b(new C1124b(method4, obj), file.getFreeSpace(), file.getTotalSpace(), file.getPath());
                                    f45698d = bVar;
                                    f45699e = true;
                                    return bVar;
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        } catch (Throwable th) {
                            f45699e = true;
                            MethodCollector.o(8451);
                            throw th;
                        }
                        f45699e = true;
                    }
                } finally {
                    MethodCollector.o(8451);
                }
            }
        }
        b bVar2 = f45698d;
        MethodCollector.o(8451);
        return bVar2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8461);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8461);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private b(a aVar, long j2, long j3, String str) {
        this.f45704f = aVar;
        this.f45701a = j2;
        this.f45702b = j3;
        this.f45703c = str;
    }
}
