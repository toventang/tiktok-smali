package com.bytedance.als;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.als.dsl.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class AlsLogicContainer implements au {

    /* renamed from: a  reason: collision with root package name */
    public final i f6434a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<j<?>> f6435b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<j<?>> f6436c;

    /* renamed from: d  reason: collision with root package name */
    public final n f6437d;

    /* renamed from: e  reason: collision with root package name */
    public f f6438e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Class<j<?>>> f6439f;

    /* renamed from: g  reason: collision with root package name */
    public final ApiCenter f6440g;

    /* renamed from: h  reason: collision with root package name */
    private f f6441h;

    /* renamed from: i  reason: collision with root package name */
    private final e f6442i;

    static {
        Covode.recordClassIndex(3095);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onActivityCreated();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroyView();
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onActivityCreated() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.CREATED);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroyView() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.DESTROYED);
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.STARTED);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.RESUMED);
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.STARTED);
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        Iterator<T> it = this.f6435b.iterator();
        while (it.hasNext()) {
            a(it.next(), i.b.CREATED);
        }
    }

    public static final class a extends p<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f6443a;

        static {
            Covode.recordClassIndex(3096);
        }

        a(Class cls) {
            this.f6443a = cls;
        }

        @Override // com.bytedance.o.p
        public final /* synthetic */ Object get(f fVar) {
            l.d(fVar, "");
            return ((j) fVar.a(this.f6443a)).getApiComponent();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.o.n$a<?> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void a(Class<?> cls, n.a<?> aVar) {
        Class<?>[] interfaces = cls.getInterfaces();
        l.b(interfaces, "");
        for (Class<?> cls2 : interfaces) {
            if ((!l.a(cls2, b.class)) && b.class.isAssignableFrom(cls2)) {
                Objects.requireNonNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                aVar.a(cls2);
                a(cls2, aVar);
            }
        }
    }

    public final <A extends b, B extends j<A>> void a(Class<A> cls, Class<B> cls2) {
        l.d(cls, "");
        l.d(cls2, "");
        if (!l.a(cls, b.class)) {
            n.a<?> a2 = this.f6437d.a(cls, new a(cls2));
            l.b(a2, "");
            a((Class<?>) cls, a2);
        }
        this.f6439f.add(cls2);
    }

    private final void a(j<?> jVar, i.b bVar) {
        int i2 = a.f6451a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (jVar.getLifecycle().a().compareTo((Enum) i.b.RESUMED) >= 0) {
                            jVar.onPause();
                        }
                        if (jVar.getLifecycle().a().compareTo((Enum) i.b.STARTED) >= 0) {
                            jVar.onStop();
                        }
                        if (jVar.getLifecycle().a().compareTo((Enum) i.b.CREATED) >= 0) {
                            jVar.onDestroy();
                            b apiComponent = jVar.getApiComponent();
                            if (!l.a(apiComponent, b.class)) {
                                this.f6440g.b(apiComponent);
                            }
                        }
                    }
                } else if (jVar.getLifecycle().a().compareTo((Enum) i.b.RESUMED) < 0) {
                    if (jVar.getLifecycle().a().compareTo((Enum) i.b.CREATED) < 0) {
                        jVar.onCreate();
                    }
                    if (jVar.getLifecycle().a().compareTo((Enum) i.b.STARTED) < 0) {
                        jVar.onStart();
                    }
                    jVar.onResume();
                }
            } else if (jVar.getLifecycle().a().compareTo((Enum) i.b.STARTED) < 0) {
                if (jVar.getLifecycle().a().compareTo((Enum) i.b.CREATED) < 0) {
                    jVar.onCreate();
                }
                jVar.onStart();
            } else if (jVar.getLifecycle().a().compareTo((Enum) i.b.STARTED) > 0) {
                jVar.onPause();
            }
        } else if (jVar.getLifecycle().a().compareTo((Enum) i.b.CREATED) < 0) {
            jVar.onCreate();
        } else {
            if (jVar.getLifecycle().a().compareTo((Enum) i.b.STARTED) > 0) {
                jVar.onPause();
            }
            if (jVar.getLifecycle().a().compareTo((Enum) i.b.CREATED) > 0) {
                jVar.onStop();
            }
        }
    }

    public AlsLogicContainer(i iVar, ApiCenter apiCenter, f fVar, e eVar) {
        l.d(iVar, "");
        l.d(apiCenter, "");
        l.d(eVar, "");
        this.f6440g = apiCenter;
        this.f6441h = fVar;
        this.f6442i = eVar;
        this.f6434a = iVar;
        LinkedHashSet<j<?>> linkedHashSet = new LinkedHashSet<>();
        this.f6435b = linkedHashSet;
        this.f6436c = linkedHashSet;
        iVar.a(this);
        if (this.f6441h == null) {
            this.f6441h = new n(null, eVar.f6462a).a();
        }
        this.f6437d = new n(this.f6441h, eVar.f6462a);
        this.f6439f = new ArrayList();
    }
}
