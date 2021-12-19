package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.a.c;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class h extends f {

    /* renamed from: a  reason: collision with root package name */
    protected final Class<?> f2465a;

    /* renamed from: b  reason: collision with root package name */
    protected final Constructor<?> f2466b;

    /* renamed from: c  reason: collision with root package name */
    protected final Method f2467c;

    /* renamed from: d  reason: collision with root package name */
    protected final Method f2468d;

    /* renamed from: e  reason: collision with root package name */
    protected final Method f2469e;

    /* renamed from: f  reason: collision with root package name */
    protected final Method f2470f;

    /* renamed from: g  reason: collision with root package name */
    protected final Method f2471g;

    static {
        Covode.recordClassIndex(799);
    }

    /* access modifiers changed from: protected */
    public Method a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    private boolean a() {
        if (this.f2467c != null) {
            return true;
        }
        return false;
    }

    private Object b() {
        try {
            return this.f2466b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            Method method6 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method3 = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = a(cls2);
            cls = cls2;
            method = method6;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            method5 = cls;
            method4 = method5;
            constructor = method4;
            Constructor<?> constructor2 = constructor;
            method2 = constructor2;
            method3 = method2;
            method = constructor2;
        }
        this.f2465a = cls;
        this.f2466b = constructor;
        this.f2467c = method;
        this.f2468d = method2;
        this.f2469e = method3;
        this.f2470f = method4;
        this.f2471g = method5;
    }

    private void c(Object obj) {
        try {
            this.f2470f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean b(Object obj) {
        try {
            return ((Boolean) this.f2469e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2465a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2471g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public final Typeface a(Context context, CancellationSignal cancellationSignal, b.C0030b[] bVarArr, int i2) {
        Typeface a2;
        if (bVarArr.length <= 0) {
            return null;
        }
        if (!a()) {
            b.C0030b a3 = a(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a3.f2321a, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a3.f2323c).setItalic(a3.f2324d).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a4 = b.a(context, bVarArr, (CancellationSignal) null);
            Object b2 = b();
            if (b2 == null) {
                return null;
            }
            boolean z = false;
            for (b.C0030b bVar : bVarArr) {
                ByteBuffer byteBuffer = a4.get(bVar.f2321a);
                if (byteBuffer != null) {
                    if (!a(b2, byteBuffer, bVar.f2322b, bVar.f2323c, bVar.f2324d ? 1 : 0)) {
                        c(b2);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                c(b2);
                return null;
            } else if (b(b2) && (a2 = a(b2)) != null) {
                return Typeface.create(a2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public final Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        if (!a()) {
            return super.a(context, bVar, resources, i2);
        }
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        c.C0028c[] cVarArr = bVar.f2272a;
        for (c.C0028c cVar : cVarArr) {
            if (!a(context, b2, cVar.f2273a, cVar.f2277e, cVar.f2274b, cVar.f2275c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2276d))) {
                c(b2);
                return null;
            }
        }
        if (!b(b2)) {
            return null;
        }
        return a(b2);
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f2468d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // androidx.core.graphics.k
    public final Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (!a()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        if (!a(context, b2, str, 0, -1, -1, null)) {
            c(b2);
            return null;
        } else if (!b(b2)) {
            return null;
        } else {
            return a(b2);
        }
    }

    private boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2467c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
