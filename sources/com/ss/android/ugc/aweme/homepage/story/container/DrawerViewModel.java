package com.ss.android.ugc.aweme.homepage.story.container;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class DrawerViewModel extends ac {

    /* renamed from: k  reason: collision with root package name */
    public static final a f99257k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public t<Boolean> f99258a;

    /* renamed from: b  reason: collision with root package name */
    public t<Boolean> f99259b;

    /* renamed from: c  reason: collision with root package name */
    public t<Boolean> f99260c;

    /* renamed from: d  reason: collision with root package name */
    public t<Boolean> f99261d;

    /* renamed from: e  reason: collision with root package name */
    public List<e> f99262e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<d> f99263f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public t<Integer> f99264g;

    /* renamed from: h  reason: collision with root package name */
    public String f99265h;

    /* renamed from: i  reason: collision with root package name */
    public String f99266i;

    /* renamed from: j  reason: collision with root package name */
    public String f99267j;

    static {
        Covode.recordClassIndex(63241);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63242);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static DrawerViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = new ad(eVar).a(DrawerViewModel.class);
            l.b(a2, "");
            return (DrawerViewModel) a2;
        }
    }

    public DrawerViewModel() {
        t<Boolean> tVar = new t<>();
        tVar.setValue(false);
        this.f99258a = tVar;
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(false);
        this.f99259b = tVar2;
        t<Boolean> tVar3 = new t<>();
        tVar3.setValue(false);
        this.f99260c = tVar3;
        t<Boolean> tVar4 = new t<>();
        tVar4.setValue(null);
        this.f99261d = tVar4;
        t<Integer> tVar5 = new t<>();
        tVar5.setValue(0);
        this.f99264g = tVar5;
        this.f99265h = "";
        this.f99266i = "";
        this.f99267j = "";
    }

    public final void b(a aVar) {
        l.d(aVar, "");
        List<e> list = this.f99262e;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        h.f.b.ad.b(list).remove(aVar);
        List<d> list2 = this.f99263f;
        Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        h.f.b.ad.b(list2).remove(aVar);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        if (n.a((Iterable) this.f99262e, (Object) aVar) || n.a((Iterable) this.f99263f, (Object) aVar)) {
            throw new RuntimeException("have been added, cannot add again");
        } else if (aVar instanceof e) {
            this.f99262e.add(aVar);
        } else if (aVar instanceof d) {
            this.f99263f.add(aVar);
        }
    }

    public final void a(int i2, String str) {
        l.d(str, "");
        h.a("operateDrawer >>> operate:" + i2 + " , " + str);
        this.f99265h = str;
        this.f99264g.setValue(Integer.valueOf(i2));
    }
}
