package com.squareup.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final t f57955a;

    /* renamed from: b  reason: collision with root package name */
    public final w f57956b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<T> f57957c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f57958d;

    /* renamed from: e  reason: collision with root package name */
    public final int f57959e;

    /* renamed from: f  reason: collision with root package name */
    public final int f57960f;

    /* renamed from: g  reason: collision with root package name */
    final int f57961g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable f57962h;

    /* renamed from: i  reason: collision with root package name */
    public final String f57963i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f57964j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f57965k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f57966l;

    static {
        Covode.recordClassIndex(36030);
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract void a(Bitmap bitmap, t.d dVar);

    /* access modifiers changed from: package-private */
    public void b() {
        this.f57966l = true;
    }

    /* access modifiers changed from: package-private */
    public final T c() {
        WeakReference<T> weakReference = this.f57957c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: com.squareup.b.a$a  reason: collision with other inner class name */
    static class C1279a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        final a f57967a;

        static {
            Covode.recordClassIndex(36031);
        }

        public C1279a(a aVar, M m2, ReferenceQueue<? super M> referenceQueue) {
            super(m2, referenceQueue);
            this.f57967a = aVar;
        }
    }

    a(t tVar, T t, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        C1279a aVar;
        this.f57955a = tVar;
        this.f57956b = wVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C1279a(this, t, tVar.f58082j);
        }
        this.f57957c = aVar;
        this.f57959e = i2;
        this.f57960f = i3;
        this.f57958d = z;
        this.f57961g = i4;
        this.f57962h = drawable;
        this.f57963i = str;
        this.f57964j = obj == null ? this : obj;
    }
}
