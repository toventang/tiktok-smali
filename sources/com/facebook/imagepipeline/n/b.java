package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;

public abstract class b<T> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48285a;

    static {
        Covode.recordClassIndex(29138);
    }

    public static boolean a(int i2) {
        return (i2 & 1) == 1;
    }

    public static boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static boolean c(int i2) {
        return (i2 & 10) != 0;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(float f2) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, int i2);

    /* access modifiers changed from: protected */
    public abstract void a(Throwable th);

    @Override // com.facebook.imagepipeline.n.k
    public final synchronized void b() {
        if (!this.f48285a) {
            this.f48285a = true;
            try {
                a();
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    private void a(Exception exc) {
        a.c(getClass(), "unhandled exception", exc);
    }

    public static boolean b(int i2) {
        if (!a(i2)) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.n.k
    public final synchronized void b(float f2) {
        if (!this.f48285a) {
            try {
                a(f2);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.k
    public final synchronized void b(Throwable th) {
        if (!this.f48285a) {
            this.f48285a = true;
            try {
                a(th);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.k
    public final synchronized void b(T t, int i2) {
        if (!this.f48285a) {
            this.f48285a = a(i2);
            try {
                a(t, i2);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }
}
