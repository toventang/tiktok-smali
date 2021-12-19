package com.ss.android.ugc.aweme.sharer.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.c.c.az;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sharer.b> f124649a;

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f124650b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f124651c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f124652d;

    /* renamed from: e  reason: collision with root package name */
    public final int f124653e;

    /* renamed from: f  reason: collision with root package name */
    public final int f124654f;

    /* renamed from: g  reason: collision with root package name */
    public final float f124655g;

    /* renamed from: h  reason: collision with root package name */
    public final int f124656h;

    /* renamed from: i  reason: collision with root package name */
    public final SharePackage f124657i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f124658j;

    /* renamed from: k  reason: collision with root package name */
    public final View f124659k;

    /* renamed from: l  reason: collision with root package name */
    public final f f124660l;

    /* renamed from: m  reason: collision with root package name */
    public final d f124661m;
    public final h.f.a.a<Boolean> n;
    public final boolean o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    static {
        Covode.recordClassIndex(81908);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public List<com.ss.android.ugc.aweme.sharer.b> f124662a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<h> f124663b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<String> f124664c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public boolean f124665d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f124666e = true;

        /* renamed from: f  reason: collision with root package name */
        public az<h> f124667f;

        /* renamed from: g  reason: collision with root package name */
        public c<h> f124668g;

        /* renamed from: h  reason: collision with root package name */
        public az<com.ss.android.ugc.aweme.sharer.b> f124669h;

        /* renamed from: i  reason: collision with root package name */
        public h.f.a.b<? super com.ss.android.ugc.aweme.sharer.b, Boolean> f124670i;

        /* renamed from: j  reason: collision with root package name */
        public int f124671j;

        /* renamed from: k  reason: collision with root package name */
        public int f124672k;

        /* renamed from: l  reason: collision with root package name */
        public float f124673l;

        /* renamed from: m  reason: collision with root package name */
        public int f124674m;
        public SharePackage n;
        public boolean o;
        public View p;
        public f q;
        public d r;
        public h.f.a.a<Boolean> s;
        public boolean t;
        public float u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;

        static final class a<T> implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            public static final a f124675a = new a();

            static {
                Covode.recordClassIndex(81911);
            }

            a() {
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.e$b$b  reason: collision with other inner class name */
        static final class C3259b<T> implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            public static final C3259b f124676a = new C3259b();

            static {
                Covode.recordClassIndex(81912);
            }

            C3259b() {
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        static {
            Covode.recordClassIndex(81910);
        }

        public b() {
            az<h> a2 = az.a(a.f124675a);
            l.b(a2, "");
            this.f124667f = a2;
            az<com.ss.android.ugc.aweme.sharer.b> a3 = az.a(C3259b.f124676a);
            l.b(a3, "");
            this.f124669h = a3;
            this.f124670i = c.f124677a;
            this.f124672k = R.color.bx;
            this.f124673l = 1.0f;
            this.o = true;
            this.u = 0.7f;
            this.v = true;
        }

        public final e a() {
            return new e(this, (byte) 0);
        }

        public final b a(SharePackage sharePackage) {
            l.d(sharePackage, "");
            this.n = sharePackage;
            return this;
        }

        static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f124677a = new c();

            static {
                Covode.recordClassIndex(81913);
            }

            c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
                l.d(bVar, "");
                return true;
            }
        }

        public final b a(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            this.f124662a.add(bVar);
            return this;
        }

        public final b b(Comparator<com.ss.android.ugc.aweme.sharer.b> comparator) {
            l.d(comparator, "");
            az<com.ss.android.ugc.aweme.sharer.b> a2 = az.a(comparator);
            l.b(a2, "");
            this.f124669h = a2;
            return this;
        }

        public final b a(d dVar) {
            l.d(dVar, "");
            this.r = dVar;
            return this;
        }

        public final b a(f fVar) {
            l.d(fVar, "");
            this.q = fVar;
            return this;
        }

        public final b a(h hVar) {
            l.d(hVar, "");
            this.f124663b.add(hVar);
            return this;
        }

        public final b a(h.f.a.b<? super com.ss.android.ugc.aweme.sharer.b, Boolean> bVar) {
            l.d(bVar, "");
            this.f124670i = bVar;
            return this;
        }

        public final b a(String str) {
            l.d(str, "");
            this.f124664c.add(str);
            return this;
        }

        public final b a(Comparator<h> comparator) {
            l.d(comparator, "");
            az<h> a2 = az.a(comparator);
            l.b(a2, "");
            this.f124667f = a2;
            return this;
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ b $builder$inlined;

        static {
            Covode.recordClassIndex(81909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.$builder$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            return Boolean.valueOf(this.$builder$inlined.f124664c.contains(bVar2.a()));
        }
    }

    private e(b bVar) {
        boolean z;
        List<com.ss.android.ugc.aweme.sharer.b> list;
        az<com.ss.android.ugc.aweme.sharer.b> azVar = bVar.f124669h;
        List<com.ss.android.ugc.aweme.sharer.b> list2 = bVar.f124662a;
        n.a((List) list2, (h.f.a.b) new a(bVar));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t2 : list2) {
            if (hashSet.add(t2.a())) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (bVar.f124670i.invoke(obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        List<E> a2 = azVar.a(arrayList2);
        l.b(a2, "");
        this.f124649a = a2;
        az<h> azVar2 = bVar.f124667f;
        List<h> list3 = bVar.f124663b;
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (T t3 : list3) {
            if (hashSet2.add(t3.c())) {
                arrayList3.add(t3);
            }
        }
        List<E> a3 = azVar2.a(arrayList3);
        l.b(a3, "");
        this.f124650b = a3;
        c<h> cVar = bVar.f124668g;
        if (cVar != null) {
            cVar.a(a3);
        }
        if (bVar.f124665d || (list = this.f124649a) == null || list.size() <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f124651c = z;
        this.f124652d = bVar.f124666e;
        this.f124653e = bVar.f124671j;
        this.f124654f = bVar.f124672k;
        this.f124655g = bVar.f124673l;
        this.f124656h = bVar.f124674m;
        SharePackage sharePackage = bVar.n;
        if (sharePackage == null) {
            l.b();
        }
        this.f124657i = sharePackage;
        this.f124658j = bVar.o;
        this.f124659k = bVar.p;
        this.f124660l = bVar.q;
        this.f124661m = bVar.r;
        this.n = bVar.s;
        this.o = bVar.t;
        this.p = bVar.u;
        this.q = bVar.v;
        this.r = bVar.w;
        this.s = bVar.x;
        this.t = bVar.y;
    }

    public /* synthetic */ e(b bVar, byte b2) {
        this(bVar);
    }
}
