package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.core.content.a.c;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class f extends k {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f2456a;

    /* renamed from: b  reason: collision with root package name */
    private static Constructor<?> f2457b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2458c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2459d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2460e;

    static {
        Covode.recordClassIndex(797);
    }

    f() {
    }

    @Override // androidx.core.graphics.k
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        Object b2 = b();
        c.C0028c[] cVarArr = bVar.f2272a;
        for (c.C0028c cVar : cVarArr) {
            File a2 = l.a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!l.a(a2, resources, cVar.f2278f)) {
                    a(a2);
                    return null;
                } else if (!a(b2, a2.getPath(), cVar.f2274b, cVar.f2275c)) {
                    return null;
                } else {
                    a(a2);
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a(a2);
            }
        }
        return a(b2);
    }

    private static Object b() {
        a();
        try {
            return f2457b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a() {
        /*
            boolean r0 = androidx.core.graphics.f.f2460e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r8 = 1
            androidx.core.graphics.f.f2460e = r8
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Constructor r5 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.String r3 = "addFontWeightStyle"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r2[r8] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r1 = 2
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r2[r1] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r4 = r6.getMethod(r3, r2)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r8)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r1[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r0 = r3.getMethod(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0044, NoSuchMethodException -> 0x0042 }
            r9 = r5
            goto L_0x004f
        L_0x0042:
            r0 = move-exception
            goto L_0x0045
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            java.lang.Class r0 = r0.getClass()
            r0.getName()
            r0 = r9
            r6 = r0
            r4 = r6
        L_0x004f:
            androidx.core.graphics.f.f2457b = r9
            androidx.core.graphics.f.f2456a = r6
            androidx.core.graphics.f.f2458c = r4
            androidx.core.graphics.f.f2459d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.f.a():void");
    }

    private static Typeface a(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(f2456a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2459d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    private static boolean a(Object obj, String str, int i2, boolean z) {
        a();
        try {
            return ((Boolean) f2458c.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.C0030b[] bVarArr, int i2) {
        Typeface typeface;
        String path;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a(bVarArr, i2).f2321a, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                File a2 = a(openFileDescriptor);
                if (a2 == null || !a2.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        Typeface a3 = super.a(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return a3;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    if (TypeFaceOptimizer.getSwitch() && (path = a2.getPath()) != null) {
                        if (TypeFaceLancet.cache.contains(path)) {
                            typeface = (Typeface) TypeFaceLancet.cache.get(path);
                        } else {
                            typeface = Typeface.createFromFile(a2);
                            if (typeface != null) {
                                TypeFaceLancet.cache.put(path, typeface);
                            }
                        }
                        openFileDescriptor.close();
                        return typeface;
                    }
                    typeface = Typeface.createFromFile(a2);
                    openFileDescriptor.close();
                    return typeface;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException unused) {
            return null;
        }
        throw th;
        throw th;
    }
}
