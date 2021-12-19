package com.facebook.drawee.c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.drawee.b.a;
import com.facebook.drawee.b.b;
import com.facebook.drawee.b.c;
import com.facebook.drawee.g.a;
import java.util.concurrent.Executor;

public abstract class a<T, INFO> implements a.AbstractC1172a, a.AbstractC1174a, com.facebook.drawee.h.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47297a = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final b f47298b = b.a();

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.drawee.b.a f47299c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f47300d;

    /* renamed from: e  reason: collision with root package name */
    private d<INFO> f47301e;

    /* renamed from: f  reason: collision with root package name */
    c f47302f;

    /* renamed from: g  reason: collision with root package name */
    public com.facebook.drawee.g.a f47303g;

    /* renamed from: h  reason: collision with root package name */
    public e f47304h;

    /* renamed from: i  reason: collision with root package name */
    public com.facebook.drawee.h.c f47305i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f47306j;

    /* renamed from: k  reason: collision with root package name */
    public String f47307k;

    /* renamed from: l  reason: collision with root package name */
    public Object f47308l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f47309m;
    public boolean n;
    public boolean o;
    String p;
    private boolean q;
    private boolean r;
    private com.facebook.d.c<T> s;
    private T t;
    private Drawable u;
    private boolean v = true;

    /* access modifiers changed from: protected */
    public abstract void a(Drawable drawable);

    /* access modifiers changed from: protected */
    public abstract void a(T t2);

    public void a(String str, T t2) {
    }

    /* access modifiers changed from: protected */
    public abstract com.facebook.d.c<T> b();

    /* access modifiers changed from: protected */
    public T c() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract INFO c(T t2);

    /* access modifiers changed from: protected */
    public abstract Drawable d(T t2);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.c.a$a  reason: collision with other inner class name */
    public static class C1173a<INFO> extends f<INFO> {
        static {
            Covode.recordClassIndex(28748);
        }

        private C1173a() {
        }

        public static <INFO> C1173a<INFO> a(d<? super INFO> dVar, d<? super INFO> dVar2) {
            com.facebook.imagepipeline.p.b.a();
            C1173a<INFO> aVar = new C1173a<>();
            aVar.a(dVar);
            aVar.a(dVar2);
            com.facebook.imagepipeline.p.b.a();
            return aVar;
        }
    }

    @Override // com.facebook.drawee.h.a
    public final com.facebook.drawee.h.b e() {
        return this.f47305i;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, com.facebook.d.c<T> cVar) {
        if (cVar == null && this.s == null) {
            return true;
        }
        if (!str.equals(this.f47307k) || cVar != this.s || !this.q) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(28746);
    }

    private d<INFO> j() {
        d<INFO> dVar = this.f47301e;
        if (dVar == null) {
            return c.getNoOpListener();
        }
        return dVar;
    }

    @Override // com.facebook.drawee.h.a
    public final Animatable i() {
        Drawable drawable = this.u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    private boolean k() {
        c cVar;
        if (!this.n || (cVar = this.f47302f) == null || !cVar.b()) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.drawee.b.a.AbstractC1172a
    public final void d() {
        this.f47298b.a(b.a.ON_RELEASE_CONTROLLER);
        c cVar = this.f47302f;
        if (cVar != null) {
            cVar.f47296c = 0;
        }
        com.facebook.drawee.g.a aVar = this.f47303g;
        if (aVar != null) {
            aVar.b();
        }
        com.facebook.drawee.h.c cVar2 = this.f47305i;
        if (cVar2 != null) {
            cVar2.b();
        }
        a();
    }

    private void a() {
        boolean z = this.q;
        this.q = false;
        this.n = false;
        com.facebook.d.c<T> cVar = this.s;
        if (cVar != null) {
            cVar.g();
            this.s = null;
        }
        Drawable drawable = this.u;
        if (drawable != null) {
            a(drawable);
        }
        if (this.p != null) {
            this.p = null;
        }
        this.u = null;
        T t2 = this.t;
        if (t2 != null) {
            d("release", t2);
            a((Object) this.t);
            this.t = null;
        }
        if (z) {
            j().onRelease(this.f47307k);
        }
    }

    @Override // com.facebook.drawee.g.a.AbstractC1174a
    public final boolean h() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f47307k);
        }
        if (!k()) {
            return false;
        }
        this.f47302f.f47296c++;
        this.f47305i.b();
        l();
        return true;
    }

    public String toString() {
        return h.a(this).a("isAttached", this.f47309m).a("isRequestSubmitted", this.q).a("hasFetchFailed", this.n).a("fetchedImage", b((Object) this.t)).a("events", this.f47298b.toString()).toString();
    }

    @Override // com.facebook.drawee.h.a
    public final void f() {
        String str;
        com.facebook.imagepipeline.p.b.a();
        if (com.facebook.common.e.a.a(2)) {
            Class<?> cls = f47297a;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f47307k;
            if (this.q) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            com.facebook.common.e.a.a(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f47298b.a(b.a.ON_ATTACH_CONTROLLER);
        i.a(this.f47305i);
        this.f47299c.a(this);
        this.f47309m = true;
        if (!this.q) {
            l();
        }
        com.facebook.imagepipeline.p.b.a();
    }

    @Override // com.facebook.drawee.h.a
    public final void g() {
        com.facebook.imagepipeline.p.b.a();
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f47307k);
        }
        this.f47298b.a(b.a.ON_DETACH_CONTROLLER);
        this.f47309m = false;
        com.facebook.drawee.b.a aVar = this.f47299c;
        com.facebook.drawee.b.a.b();
        if (aVar.f47286a.add(this) && aVar.f47286a.size() == 1) {
            aVar.f47287b.post(aVar.f47288c);
        }
        com.facebook.imagepipeline.p.b.a();
    }

    private void l() {
        com.facebook.imagepipeline.p.b.a();
        T c2 = c();
        if (c2 != null) {
            com.facebook.imagepipeline.p.b.a();
            this.s = null;
            this.q = true;
            this.n = false;
            this.f47298b.a(b.a.ON_SUBMIT_CACHE_HIT);
            j().onSubmit(this.f47307k, this.f47308l);
            a(this.f47307k, (Object) c2);
            a(this.f47307k, this.s, c2, 1.0f, true, true, true);
            com.facebook.imagepipeline.p.b.a();
            com.facebook.imagepipeline.p.b.a();
            return;
        }
        this.f47298b.a(b.a.ON_DATASOURCE_SUBMIT);
        j().onSubmit(this.f47307k, this.f47308l);
        this.f47305i.a(0.0f, true);
        this.q = true;
        this.n = false;
        this.s = b();
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f47307k, Integer.valueOf(System.identityHashCode(this.s)));
        }
        final String str = this.f47307k;
        final boolean c3 = this.s.c();
        this.s.a(new com.facebook.d.b<T>() {
            /* class com.facebook.drawee.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28747);
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(com.facebook.d.c<T> cVar) {
                a.this.a(str, cVar, cVar.e(), true);
            }

            @Override // com.facebook.d.b
            public final void onNewResultImpl(com.facebook.d.c<T> cVar) {
                boolean b2 = cVar.b();
                float f2 = cVar.f();
                T d2 = cVar.d();
                if (d2 != null) {
                    a.this.a(str, cVar, d2, f2, b2, c3, false);
                } else if (b2) {
                    a.this.a(str, cVar, new NullPointerException(), true);
                }
            }

            @Override // com.facebook.d.e, com.facebook.d.b
            public final void onProgressUpdate(com.facebook.d.c<T> cVar) {
                boolean b2 = cVar.b();
                float f2 = cVar.f();
                a aVar = a.this;
                if (!aVar.a(str, (com.facebook.d.c) cVar)) {
                    aVar.a("ignore_old_datasource @ onProgress", (Throwable) null);
                    cVar.g();
                } else if (!b2) {
                    aVar.f47305i.a(f2, false);
                }
            }
        }, this.f47300d);
        com.facebook.imagepipeline.p.b.a();
    }

    /* access modifiers changed from: protected */
    public int b(T t2) {
        return System.identityHashCode(t2);
    }

    private static String e(T t2) {
        if (t2 != null) {
            return t2.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    public final void b(Drawable drawable) {
        this.f47306j = drawable;
        com.facebook.drawee.h.c cVar = this.f47305i;
        if (cVar != null) {
            cVar.a(drawable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.facebook.drawee.c.d<? super INFO> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(d<? super INFO> dVar) {
        i.a(dVar);
        d<INFO> dVar2 = this.f47301e;
        if (dVar2 instanceof C1173a) {
            ((f) dVar2).a(dVar);
        } else if (dVar2 != null) {
            this.f47301e = C1173a.a(dVar2, dVar);
        } else {
            this.f47301e = dVar;
        }
    }

    public final void b(d<? super INFO> dVar) {
        i.a(dVar);
        d<INFO> dVar2 = this.f47301e;
        if (dVar2 instanceof C1173a) {
            ((f) dVar2).b(dVar);
        } else if (dVar2 == dVar) {
            this.f47301e = null;
        }
    }

    @Override // com.facebook.drawee.h.a
    public void a(com.facebook.drawee.h.b bVar) {
        b.a aVar;
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f47307k, bVar);
        }
        b bVar2 = this.f47298b;
        if (bVar != null) {
            aVar = b.a.ON_SET_HIERARCHY;
        } else {
            aVar = b.a.ON_CLEAR_HIERARCHY;
        }
        bVar2.a(aVar);
        if (this.q) {
            this.f47299c.a(this);
            d();
        }
        com.facebook.drawee.h.c cVar = this.f47305i;
        if (cVar != null) {
            cVar.a(null);
            this.f47305i = null;
        }
        if (bVar != null) {
            i.a(bVar instanceof com.facebook.drawee.h.c);
            com.facebook.drawee.h.c cVar2 = (com.facebook.drawee.h.c) bVar;
            this.f47305i = cVar2;
            cVar2.a(this.f47306j);
        }
    }

    @Override // com.facebook.drawee.h.a
    public final boolean a(MotionEvent motionEvent) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f47307k, motionEvent);
        }
        com.facebook.drawee.g.a aVar = this.f47303g;
        if (aVar == null) {
            return false;
        }
        if (!aVar.f47487c && !k()) {
            return false;
        }
        com.facebook.drawee.g.a aVar2 = this.f47303g;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                aVar2.f47487c = false;
                if (Math.abs(motionEvent.getX() - aVar2.f47490f) > aVar2.f47486b || Math.abs(motionEvent.getY() - aVar2.f47491g) > aVar2.f47486b) {
                    aVar2.f47488d = false;
                }
                if (aVar2.f47488d && motionEvent.getEventTime() - aVar2.f47489e <= ((long) ViewConfiguration.getLongPressTimeout()) && aVar2.f47485a != null) {
                    aVar2.f47485a.h();
                }
            } else if (action != 2) {
                if (action == 3) {
                    aVar2.f47487c = false;
                }
            } else if (Math.abs(motionEvent.getX() - aVar2.f47490f) > aVar2.f47486b || Math.abs(motionEvent.getY() - aVar2.f47491g) > aVar2.f47486b) {
                aVar2.f47488d = false;
            }
            aVar2.f47488d = false;
        } else {
            aVar2.f47487c = true;
            aVar2.f47488d = true;
            aVar2.f47489e = motionEvent.getEventTime();
            aVar2.f47490f = motionEvent.getX();
            aVar2.f47491g = motionEvent.getY();
        }
        return true;
    }

    public a(com.facebook.drawee.b.a aVar, Executor executor) {
        this.f47299c = aVar;
        this.f47300d = executor;
        c(null, null);
    }

    private void d(String str, T t2) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f47307k, str, e(t2), Integer.valueOf(b((Object) t2)));
        }
    }

    public final void b(String str, Object obj) {
        c(str, obj);
        this.v = false;
    }

    private synchronized void c(String str, Object obj) {
        com.facebook.drawee.b.a aVar;
        com.facebook.imagepipeline.p.b.a();
        this.f47298b.a(b.a.ON_INIT_CONTROLLER);
        if (!this.v && (aVar = this.f47299c) != null) {
            aVar.a(this);
        }
        this.f47309m = false;
        this.r = false;
        a();
        this.o = false;
        c cVar = this.f47302f;
        if (cVar != null) {
            cVar.a();
        }
        com.facebook.drawee.g.a aVar2 = this.f47303g;
        if (aVar2 != null) {
            aVar2.a();
            this.f47303g.f47485a = this;
        }
        d<INFO> dVar = this.f47301e;
        if (dVar instanceof C1173a) {
            ((C1173a) dVar).a();
        } else {
            this.f47301e = null;
        }
        this.f47304h = null;
        com.facebook.drawee.h.c cVar2 = this.f47305i;
        if (cVar2 != null) {
            cVar2.b();
            this.f47305i.a(null);
            this.f47305i = null;
        }
        this.f47306j = null;
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f47307k, str);
        }
        this.f47307k = str;
        this.f47308l = obj;
        com.facebook.imagepipeline.p.b.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Throwable th) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f47297a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f47307k, str, th);
        }
    }

    public final void a(String str, com.facebook.d.c<T> cVar, Throwable th, boolean z) {
        b.a aVar;
        Drawable drawable;
        com.facebook.imagepipeline.p.b.a();
        if (!a(str, (com.facebook.d.c) cVar)) {
            a("ignore_old_datasource @ onFailure", th);
            cVar.g();
            com.facebook.imagepipeline.p.b.a();
            return;
        }
        b bVar = this.f47298b;
        if (z) {
            aVar = b.a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = b.a.ON_DATASOURCE_FAILURE_INT;
        }
        bVar.a(aVar);
        if (z) {
            a("final_failed @ onFailure", th);
            this.s = null;
            this.n = true;
            if (this.o && (drawable = this.u) != null) {
                this.f47305i.a(drawable, 1.0f, true);
            } else if (k()) {
                this.f47305i.d();
            } else {
                this.f47305i.c();
            }
            j().onFailure(this.f47307k, th);
        } else {
            a("intermediate_failed @ onFailure", th);
            j().onIntermediateImageFailed(this.f47307k, th);
        }
        com.facebook.imagepipeline.p.b.a();
    }

    /* JADX INFO: finally extract failed */
    public final void a(String str, com.facebook.d.c<T> cVar, T t2, float f2, boolean z, boolean z2, boolean z3) {
        b.a aVar;
        try {
            com.facebook.imagepipeline.p.b.a();
            if (!a(str, (com.facebook.d.c) cVar)) {
                d("ignore_old_datasource @ onNewResult", t2);
                a((Object) t2);
                cVar.g();
                com.facebook.imagepipeline.p.b.a();
                return;
            }
            b bVar = this.f47298b;
            if (z) {
                aVar = b.a.ON_DATASOURCE_RESULT;
            } else {
                aVar = b.a.ON_DATASOURCE_RESULT_INT;
            }
            bVar.a(aVar);
            try {
                Drawable d2 = d(t2);
                T t3 = this.t;
                Drawable drawable = this.u;
                this.t = t2;
                this.u = d2;
                if (z) {
                    try {
                        d("set_final_result @ onNewResult", t2);
                        this.s = null;
                        this.f47305i.a(d2, 1.0f, z2);
                        j().onFinalImageSet(str, c(t2), i());
                    } catch (Throwable th) {
                        if (!(drawable == null || drawable == d2)) {
                            a(drawable);
                        }
                        if (!(t3 == null || t3 == t2)) {
                            d("release_previous_result @ onNewResult", t3);
                            a((Object) t3);
                        }
                        throw th;
                    }
                } else if (z3) {
                    d("set_temporary_result @ onNewResult", t2);
                    this.f47305i.a(d2, 1.0f, z2);
                    j().onFinalImageSet(str, c(t2), i());
                } else {
                    d("set_intermediate_result @ onNewResult", t2);
                    this.f47305i.a(d2, f2, z2);
                    j().onIntermediateImageSet(str, c(t2));
                }
                if (!(drawable == null || drawable == d2)) {
                    a(drawable);
                }
                if (!(t3 == null || t3 == t2)) {
                    d("release_previous_result @ onNewResult", t3);
                    a((Object) t3);
                }
                com.facebook.imagepipeline.p.b.a();
            } catch (Exception e2) {
                d("drawable_failed @ onNewResult", t2);
                a((Object) t2);
                a(str, cVar, e2, z);
                com.facebook.imagepipeline.p.b.a();
            }
        } catch (Throwable th2) {
            com.facebook.imagepipeline.p.b.a();
            throw th2;
        }
    }
}
