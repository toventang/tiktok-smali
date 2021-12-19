package androidx.versionedparcelable;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final androidx.c.a<String, Method> f4418a;

    /* renamed from: b  reason: collision with root package name */
    protected final androidx.c.a<String, Method> f4419b;

    /* renamed from: c  reason: collision with root package name */
    protected final androidx.c.a<String, Class> f4420c;

    static {
        Covode.recordClassIndex(1711);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract a b();

    /* access modifiers changed from: protected */
    public abstract boolean b(int i2);

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract void c(int i2);

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract byte[] e();

    /* access modifiers changed from: protected */
    public abstract CharSequence f();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T g();

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public final void a(boolean z, int i2) {
        c(i2);
        a(z);
    }

    public final void a(CharSequence charSequence, int i2) {
        c(i2);
        a(charSequence);
    }

    /* access modifiers changed from: protected */
    public final <T extends c> T i() {
        String d2 = d();
        if (d2 == null) {
            return null;
        }
        return (T) a(d2, b());
    }

    public final void b(String str) {
        c(7);
        a(str);
    }

    public final <T extends c> T c(T t) {
        return !b(1) ? t : (T) i();
    }

    public final String c(String str) {
        if (!b(7)) {
            return str;
        }
        return d();
    }

    private Method a(Class cls) {
        Method method = this.f4419b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, a.class);
        this.f4419b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class b(Class<? extends c> cls) {
        Class cls2 = this.f4420c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(com.a.a("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4420c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.versionedparcelable.a */
    /* JADX WARN: Multi-variable type inference failed */
    private void d(c cVar) {
        try {
            a(b((Class<? extends c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public final byte[] c(byte[] bArr) {
        if (!b(2)) {
            return bArr;
        }
        return e();
    }

    /* access modifiers changed from: protected */
    public final void b(c cVar) {
        if (cVar == null) {
            a((String) null);
            return;
        }
        d(cVar);
        a b2 = b();
        a(cVar, b2);
        b2.a();
    }

    public final void b(byte[] bArr) {
        c(2);
        a(bArr);
    }

    public final void a(c cVar) {
        c(1);
        b(cVar);
    }

    public final void a(int i2, int i3) {
        c(i3);
        a(i2);
    }

    public final int b(int i2, int i3) {
        if (!b(i3)) {
            return i2;
        }
        return c();
    }

    public final <T extends Parcelable> T b(T t, int i2) {
        return !b(i2) ? t : (T) g();
    }

    private <T extends c> T a(String str, a aVar) {
        try {
            Method method = this.f4418a.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
                this.f4418a.put(str, method);
            }
            return (T) ((c) method.invoke(null, aVar));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw e3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final CharSequence b(CharSequence charSequence, int i2) {
        if (!b(i2)) {
            return charSequence;
        }
        return f();
    }

    private <T extends c> void a(T t, a aVar) {
        try {
            a(t.getClass()).invoke(null, t, aVar);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw e3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final void a(Parcelable parcelable, int i2) {
        c(i2);
        a(parcelable);
    }

    public final boolean b(boolean z, int i2) {
        if (!b(i2)) {
            return z;
        }
        return h();
    }

    public a(androidx.c.a<String, Method> aVar, androidx.c.a<String, Method> aVar2, androidx.c.a<String, Class> aVar3) {
        this.f4418a = aVar;
        this.f4419b = aVar2;
        this.f4420c = aVar3;
    }
}
