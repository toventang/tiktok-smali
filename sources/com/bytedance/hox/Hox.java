package com.bytedance.hox;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.c;
import com.bytedance.hox.a.d;
import h.f.b.l;
import h.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Hox extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f31022c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Class<?>, d> f31023a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f31024b;

    /* renamed from: d  reason: collision with root package name */
    private e f31025d;

    /* renamed from: e  reason: collision with root package name */
    private b f31026e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d> f31027f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, d> f31028g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Hox$activityLifeObserver$1 f31029h;

    /* renamed from: i  reason: collision with root package name */
    private final b f31030i;

    static {
        Covode.recordClassIndex(18016);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18017);
        }

        private a() {
        }

        /* renamed from: com.bytedance.hox.Hox$a$a  reason: collision with other inner class name */
        public static final class C0652a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f31031a;

            static {
                Covode.recordClassIndex(18018);
            }

            C0652a(e eVar) {
                this.f31031a = eVar;
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.c(cls, "");
                return new Hox(this.f31031a);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Hox a(e eVar) {
            l.c(eVar, "");
            ac a2 = new ad(eVar, new C0652a(eVar)).a(Hox.class);
            l.a((Object) a2, "");
            return (Hox) a2;
        }
    }

    public final d a() {
        b bVar = this.f31026e;
        if (bVar == null) {
            return null;
        }
        return a(bVar);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        e eVar = this.f31025d;
        if (eVar != null) {
            i lifecycle = eVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this.f31029h);
            }
            androidx.fragment.app.i supportFragmentManager = eVar.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.a(this.f31030i);
            }
        }
    }

    public static final class b extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Hox f31033a;

        static {
            Covode.recordClassIndex(18020);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(Hox hox) {
            this.f31033a = hox;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDestroyed(androidx.fragment.app.i iVar, Fragment fragment) {
            d dVar;
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            if ((fragment instanceof c) && (dVar = this.f31033a.f31023a.get(fragment.getClass())) != null) {
                this.f31033a.b(dVar.d(), (c) fragment);
            }
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentCreated(androidx.fragment.app.i iVar, Fragment fragment, Bundle bundle) {
            d dVar;
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentCreated(iVar, fragment, bundle);
            if ((fragment instanceof c) && (dVar = this.f31033a.f31023a.get(fragment.getClass())) != null) {
                if (dVar instanceof HoxFragmentNode) {
                    l.c(fragment, "");
                    ((HoxFragmentNode) dVar).f31036a = fragment;
                } else if (dVar instanceof HoxFragmentGroup) {
                    l.c(fragment, "");
                    ((HoxFragmentGroup) dVar).f31034a = fragment;
                }
                this.f31033a.a(dVar.d(), (c) fragment);
            }
        }
    }

    private static d a(b bVar) {
        while (bVar.f31041c instanceof b) {
            d dVar = bVar.f31041c;
            if (dVar != null) {
                bVar = (b) dVar;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        return bVar.f31041c;
    }

    public final String d(String str) {
        d c2;
        b bVar;
        String d2;
        if (str == null || (c2 = c(str)) == null || (bVar = c2.f31043e) == null || (d2 = bVar.d()) == null) {
            return "";
        }
        return d2;
    }

    public final int e(String str) {
        l.c(str, "");
        d c2 = c(str);
        if (c2 == null || c2.f31043e == null) {
            return -1;
        }
        b bVar = c2.f31043e;
        if (bVar == null) {
            l.a();
        }
        return bVar.f31042d.indexOf(c2);
    }

    public final String f(String str) {
        d dVar;
        String d2;
        l.c(str, "");
        d c2 = c(str);
        if (!(c2 instanceof b) || (dVar = ((b) c2).f31041c) == null || (d2 = dVar.d()) == null) {
            return "";
        }
        return d2;
    }

    private final void b(b bVar) {
        for (T t : bVar.f31042d) {
            this.f31027f.put(t.d(), t);
            Class<? extends Fragment> f2 = t.f();
            if (f2 != null) {
                this.f31023a.put(f2, t);
            }
            if (t instanceof b) {
                b((b) t);
            }
        }
    }

    public final Class<?> a(String str) {
        l.c(str, "");
        d c2 = c(str);
        if (c2 != null) {
            return c2.f();
        }
        return null;
    }

    public final d c(String str) {
        if (this.f31027f.containsKey(str)) {
            return this.f31027f.get(str);
        }
        b bVar = this.f31026e;
        if (bVar == null) {
            return null;
        }
        this.f31027f.put(bVar.d(), this.f31026e);
        b bVar2 = this.f31026e;
        if (bVar2 == null) {
            l.a();
        }
        b(bVar2);
        return this.f31027f.get(str);
    }

    public final <T extends Fragment> T g(String str) {
        l.c(str, "");
        d c2 = c(str);
        if (c2 instanceof HoxFragmentNode) {
            T t = (T) ((HoxFragmentNode) c2).f31036a;
            if (!(t instanceof Fragment)) {
                return null;
            }
            return t;
        } else if (!(c2 instanceof HoxFragmentGroup)) {
            return null;
        } else {
            T t2 = (T) ((HoxFragmentGroup) c2).f31034a;
            if (!(t2 instanceof Fragment)) {
                return null;
            }
            return t2;
        }
    }

    public Hox(e eVar) {
        Hox$activityLifeObserver$1 hox$activityLifeObserver$1 = new Hox$activityLifeObserver$1(this);
        this.f31029h = hox$activityLifeObserver$1;
        b bVar = new b(this);
        this.f31030i = bVar;
        this.f31025d = eVar;
        if (eVar == null) {
            l.a();
        }
        eVar.getLifecycle().a(hox$activityLifeObserver$1);
        e eVar2 = this.f31025d;
        if (eVar2 == null) {
            l.a();
        }
        eVar2.getSupportFragmentManager().a((i.b) bVar, true);
    }

    public final boolean b(String str) {
        LinkedList<d> linkedList;
        l.c(str, "");
        d a2 = a();
        if (a2 == null || (linkedList = a2.f31044f) == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().d(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    public final void d(String str, Bundle bundle) {
        String d2;
        String str2 = "";
        l.c(str, str2);
        l.c(bundle, str2);
        d c2 = c(str);
        if (c2 != null) {
            b bVar = c2.f31043e;
            if (!(bVar == null || (d2 = bVar.d()) == null)) {
                str2 = d2;
            }
            if (!bundle.containsKey(str2)) {
                bundle.putBoolean(str2, true);
            }
            Iterator<T> it = c2.f31045g.iterator();
            while (it.hasNext()) {
                it.next().b(bundle);
            }
        }
    }

    private final d a(String str, String str2) {
        LinkedList<d> linkedList;
        LinkedList<d> linkedList2;
        d c2 = c(str);
        if (c2 == null || (linkedList = c2.f31044f) == null) {
            linkedList = new LinkedList<>();
        }
        d c3 = c(str2);
        if (c3 == null || (linkedList2 = c3.f31044f) == null) {
            linkedList2 = new LinkedList<>();
        }
        Iterator<d> it = linkedList.iterator();
        l.a((Object) it, "");
        Iterator<d> it2 = linkedList2.iterator();
        l.a((Object) it2, "");
        d dVar = null;
        while (it.hasNext() && it2.hasNext()) {
            d next = it.next();
            l.a((Object) next, "");
            d dVar2 = next;
            d next2 = it2.next();
            l.a((Object) next2, "");
            if (!l.a(dVar2, next2)) {
                break;
            }
            dVar = dVar2;
        }
        if (dVar == null) {
            l.a();
        }
        return dVar;
    }

    public final void c(String str, Bundle bundle) {
        String d2;
        String str2 = "";
        l.c(str, str2);
        l.c(bundle, str2);
        d c2 = c(str);
        if (c2 != null) {
            b bVar = c2.f31043e;
            if (!(bVar == null || (d2 = bVar.d()) == null)) {
                str2 = d2;
            }
            if (!bundle.containsKey(str2)) {
                bundle.putBoolean(str2, true);
            }
            Iterator<T> it = c2.f31045g.iterator();
            while (it.hasNext()) {
                it.next().a(bundle);
            }
        }
    }

    public final void b(String str, Bundle bundle) {
        b bVar;
        l.c(str, "");
        l.c(bundle, "");
        d c2 = c(str);
        if (c2 != null && (bVar = c2.f31043e) != null) {
            d a2 = a();
            if (a2 == null) {
                if (bVar.f31041c != null) {
                    d dVar = bVar.f31041c;
                    if (dVar == null) {
                        l.a();
                    }
                    if (l.a((Object) dVar.d(), (Object) str)) {
                        return;
                    }
                }
                bVar.b(str, bundle);
                if (bVar.c()) {
                    bVar.c(str, bundle);
                    return;
                }
                return;
            }
            a(a2.d(), str, bundle);
        }
    }

    public final void a(e eVar, b bVar) {
        l.c(eVar, "");
        l.c(bVar, "");
        this.f31025d = eVar;
        this.f31026e = bVar;
    }

    public final void b(String str, c cVar) {
        l.c(str, "");
        l.c(cVar, "");
        d c2 = c(str);
        if (c2 != null) {
            l.c(cVar, "");
            l.c(cVar, "");
            List<d> list = c2.f31045g;
            if (list != null) {
                h.f.b.ad.b(list).remove(cVar);
                List<com.bytedance.hox.a.a> list2 = c2.f31046h;
                if (list2 != null) {
                    h.f.b.ad.b(list2).remove(cVar);
                    List<com.bytedance.hox.a.b> list3 = c2.f31047i;
                    if (list3 != null) {
                        h.f.b.ad.b(list3).remove(cVar);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final void a(String str, Bundle bundle) {
        b bVar;
        l.c(str, "");
        l.c(bundle, "");
        d c2 = c(str);
        if (c2 != null && (bVar = c2.f31043e) != null && (bVar instanceof b)) {
            if (!bundle.containsKey(bVar.d())) {
                bundle.putBoolean(bVar.d(), true);
            }
            bVar.c(str, bundle);
        }
    }

    public final void a(String str, c cVar) {
        List<d> list;
        l.c(str, "");
        l.c(cVar, "");
        d c2 = c(str);
        if (c2 != null) {
            c2.b(cVar);
            b bVar = c2.f31043e;
            if (bVar != null && bVar.f31040b && l.a(bVar.f31041c, c2) && (list = c2.f31045g) != null) {
                for (T t : list) {
                    Bundle bundle = new Bundle();
                    if (!bundle.containsKey(bVar.d())) {
                        bundle.putBoolean(bVar.d(), true);
                    }
                    t.a(bundle);
                }
            }
        }
    }

    public final void b(String str, int i2, Bundle bundle) {
        String str2 = "";
        l.c(str, str2);
        l.c(bundle, str2);
        l.c(str, str2);
        d c2 = c(str);
        if ((c2 instanceof b) && i2 >= 0) {
            b bVar = (b) c2;
            if (i2 < bVar.f31042d.size()) {
                str2 = bVar.f31042d.get(i2).d();
            }
        }
        b(str2, bundle);
    }

    private final void a(String str, String str2, Bundle bundle) {
        if (!l.a((Object) str, (Object) str2)) {
            String str3 = str + '_' + str2;
            if (!this.f31028g.containsKey(str3)) {
                this.f31028g.put(str3, a(str, str2));
            }
            d dVar = this.f31028g.get(str3);
            d c2 = c(str2);
            if (c2 == null) {
                l.a();
            }
            Iterator<d> it = c2.f31044f.iterator();
            l.a((Object) it, "");
            if (!(dVar instanceof b)) {
                dVar = null;
            }
            b bVar = (b) dVar;
            while (it.hasNext() && bVar != null) {
                d next = it.next();
                l.a((Object) next, "");
                d dVar2 = next;
                if (l.a(bVar, dVar2.f31043e)) {
                    if (!l.a(bVar.f31041c, dVar2)) {
                        if (!bundle.containsKey(bVar.d())) {
                            bundle.putBoolean(bVar.d(), true);
                        }
                        bVar.b(dVar2.d(), bundle);
                    }
                    if (!(dVar2 instanceof b)) {
                        dVar2 = null;
                    }
                    bVar = (b) dVar2;
                }
            }
        }
    }

    public final void a(String str, int i2, Bundle bundle) {
        l.c(str, "");
        l.c(bundle, "");
        d c2 = c(str);
        if (c2 != null && (c2 instanceof b)) {
            if (!bundle.containsKey(c2.d())) {
                bundle.putBoolean(c2.d(), true);
            }
            b bVar = (b) c2;
            bVar.c(bVar.f31042d.get(i2).d(), bundle);
        }
    }
}
