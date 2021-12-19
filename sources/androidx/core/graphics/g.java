package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.a.c;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

final class g extends k {

    /* renamed from: a  reason: collision with root package name */
    static final Method f2461a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2462b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f2463c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f2464d;

    g() {
    }

    private static Object a() {
        try {
            return f2463c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Class<?> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls;
        Method method;
        Method method2;
        Covode.recordClassIndex(798);
        Constructor<?> constructor = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            method = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            Constructor<?> constructor3 = constructor;
            method2 = constructor3;
            method = method2;
            cls = constructor3;
        }
        f2463c = constructor;
        f2462b = cls;
        f2461a = method;
        f2464d = method2;
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2462b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2464d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, CancellationSignal cancellationSignal, b.C0030b[] bVarArr, int i2) {
        Object a2 = a();
        if (a2 == null) {
            return null;
        }
        androidx.c.g gVar = new androidx.c.g();
        for (b.C0030b bVar : bVarArr) {
            Uri uri = bVar.f2321a;
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = l.a(context, (CancellationSignal) null, uri);
                gVar.put(uri, byteBuffer);
                if (byteBuffer == null) {
                    return null;
                }
            }
            if (!a(a2, byteBuffer, bVar.f2322b, bVar.f2323c, bVar.f2324d)) {
                return null;
            }
        }
        Typeface a3 = a(a2);
        if (a3 == null) {
            return null;
        }
        return Typeface.create(a3, i2);
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        Object a2 = a();
        if (a2 == null) {
            return null;
        }
        c.C0028c[] cVarArr = bVar.f2272a;
        for (c.C0028c cVar : cVarArr) {
            ByteBuffer a3 = l.a(context, resources, cVar.f2278f);
            if (a3 == null || !a(a2, a3, cVar.f2277e, cVar.f2274b, cVar.f2275c)) {
                return null;
            }
        }
        return a(a2);
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f2461a.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
