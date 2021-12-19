package com.bytedance.ies.powerlist;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import h.f.b.l;
import h.h;
import h.i;
import h.w;
import h.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class PowerStub implements k, u<b<com.bytedance.ies.powerlist.b.a>> {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f<com.bytedance.ies.powerlist.b.a> f34241a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public PowerStub f34242b;

    /* renamed from: c  reason: collision with root package name */
    int f34243c = 20000;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Integer, Class<? extends PowerCell<?>>> f34244d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map<Type, Integer> f34245e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    final List<com.bytedance.ies.powerlist.b.a> f34246f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    final List<com.bytedance.ies.powerlist.header.a> f34247g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    final List<com.bytedance.ies.powerlist.header.a> f34248h = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    m f34249i;

    /* renamed from: j  reason: collision with root package name */
    public final List<com.bytedance.ies.powerlist.b.a> f34250j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final e f34251k;

    /* renamed from: l  reason: collision with root package name */
    public final h.f.a.m<Integer, Integer, z> f34252l;

    /* renamed from: m  reason: collision with root package name */
    public final h.f.a.m<Integer, Integer, z> f34253m;
    public final h.f.a.m<Boolean, Boolean, z> n;
    private int p = 10000;
    private volatile int q;
    private boolean r;
    private final h s = i.a((h.f.a.a) b.f34254a);

    static {
        Covode.recordClassIndex(20463);
    }

    public final com.bytedance.ies.powerlist.a.b e() {
        return (com.bytedance.ies.powerlist.a.b) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20464);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.ies.powerlist.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34254a = new b();

        static {
            Covode.recordClassIndex(20465);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.a.b invoke() {
            return new com.bytedance.ies.powerlist.a.b();
        }
    }

    private final int f() {
        int i2 = this.p;
        this.p = i2 + 1;
        return i2;
    }

    public final int a() {
        return this.f34247g.size();
    }

    public final int b() {
        return this.f34248h.size();
    }

    public final int d() {
        return this.f34250j.size();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.n.invoke(false, true);
    }

    public final void a(m mVar) {
        l.c(mVar, "");
        this.f34241a.f34255a.observe(mVar, this);
        mVar.getLifecycle().a(this);
        this.f34249i = mVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b<com.bytedance.ies.powerlist.b.a> bVar) {
        b<com.bytedance.ies.powerlist.b.a> bVar2 = bVar;
        l.c(bVar2, "");
        this.f34246f.clear();
        this.f34246f.addAll(bVar2.f34258a);
        this.n.invoke(Boolean.valueOf(bVar2.f34259b), false);
    }

    public final void a(View view) {
        if (view != null) {
            int size = this.f34247g.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f34247g.get(i2).f34295a == view) {
                    this.f34247g.remove(i2);
                    this.f34253m.invoke(0, 1);
                    c();
                    return;
                }
            }
        }
    }

    public final void a(List<? extends Class<? extends PowerCell<?>>> list) {
        l.c(list, "");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (T t : list) {
            Type genericSuperclass = t.getGenericSuperclass();
            if (genericSuperclass != null) {
                Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                l.a((Object) actualTypeArguments, "");
                for (Type type : actualTypeArguments) {
                    if (this.f34245e.get(type) == null) {
                        int i2 = this.q;
                        this.q = i2 + 1;
                        hashMap.put(type, Integer.valueOf(i2));
                        hashMap2.put(Integer.valueOf(i2), t);
                    }
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        a(hashMap, hashMap2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Context context = this.f34251k.f34288b;
            Integer a2 = c.a().a(it.next());
            l.a((Object) a2, "");
            c.a(context, a2.intValue());
        }
    }

    private final void a(Map<Type, Integer> map, Map<Integer, ? extends Class<? extends PowerCell<?>>> map2) {
        this.f34245e.putAll(map);
        this.f34244d.putAll(map2);
    }

    public final void a(int i2, View view) {
        if (view != null) {
            int f2 = f();
            this.f34247g.add(i2, new com.bytedance.ies.powerlist.header.a(view, f2));
            this.f34244d.put(Integer.valueOf(f2), FixedViewCell.class);
            this.f34252l.invoke(0, 1);
            c();
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (g.f34294a[aVar.ordinal()] == 1) {
            Boolean valueOf = Boolean.valueOf(this.r);
            if (!valueOf.booleanValue()) {
                valueOf.booleanValue();
                this.f34251k.c();
                this.r = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.Boolean, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public PowerStub(e eVar, h.f.a.m<? super Integer, ? super Integer, z> mVar, h.f.a.m<? super Integer, ? super Integer, z> mVar2, h.f.a.m<? super Boolean, ? super Boolean, z> mVar3) {
        l.c(eVar, "");
        l.c(mVar, "");
        l.c(mVar2, "");
        l.c(mVar3, "");
        this.f34251k = eVar;
        this.f34252l = mVar;
        this.f34253m = mVar2;
        this.n = mVar3;
    }
}
