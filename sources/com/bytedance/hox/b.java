package com.bytedance.hox;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.d;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31039a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31040b;

    /* renamed from: c  reason: collision with root package name */
    public d f31041c;

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f31042d = new ArrayList();

    static {
        Covode.recordClassIndex(18028);
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    public final boolean c() {
        return b();
    }

    private final void b(Bundle bundle) {
        List<d> list;
        if (!this.f31039a) {
            d dVar = this.f31041c;
            if (dVar instanceof b) {
                if (dVar != null) {
                    ((b) dVar).b(bundle);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            d dVar2 = this.f31041c;
            if (dVar2 != null && (list = dVar2.f31045g) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b(bundle);
                }
            }
        }
    }

    private final void a(Bundle bundle) {
        boolean z;
        List<d> list;
        List<d> list2;
        b bVar = this;
        while (true) {
            d dVar = bVar.f31041c;
            if (dVar == null || (list2 = dVar.f31045g) == null || list2.size() != 0) {
                z = false;
            } else {
                z = true;
            }
            bVar.f31040b = z;
            d dVar2 = bVar.f31041c;
            if (!(dVar2 == null || (list = dVar2.f31045g) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(bundle);
                }
            }
            if (bVar.f31039a) {
                bVar.f31039a = false;
                return;
            }
            d dVar3 = bVar.f31041c;
            if (!(dVar3 instanceof b)) {
                return;
            }
            if (dVar3 != null) {
                bVar = (b) dVar3;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(d dVar) {
        l.c(dVar, "");
        if (!this.f31042d.contains(dVar)) {
            dVar.f31043e = this;
            a(this.f31044f, dVar);
            this.f31042d.add(dVar);
            return;
        }
        throw new RuntimeException("addChild(), already has childNode " + dVar.d());
    }

    public final void b(String str, Bundle bundle) {
        l.c(str, "");
        l.c(bundle, "");
        a(str, bundle);
    }

    public final void c(String str, Bundle bundle) {
        l.c(str, "");
        l.c(bundle, "");
        d(str, bundle);
    }

    private final void a(int i2, Bundle bundle) {
        if (i2 < 0 || i2 >= this.f31042d.size()) {
            throw new RuntimeException("dispatchVisible(), out of childrenList size, index = " + i2 + ", childrenList size = " + this.f31042d.size());
        }
        b(bundle);
        this.f31041c = this.f31042d.get(i2);
        a(bundle);
    }

    private final void d(String str, Bundle bundle) {
        int i2 = 0;
        for (T t : this.f31042d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (l.a((Object) t.d(), (Object) str)) {
                a(i2, bundle);
            }
            i2 = i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedList<com.bytedance.hox.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.LinkedList<com.bytedance.hox.d> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void a(LinkedList<d> linkedList, d dVar) {
        if (dVar instanceof b) {
            for (Object obj : n.h((Iterable) linkedList)) {
                dVar.f31044f.addFirst(obj);
            }
            Iterator<T> it = ((b) dVar).f31042d.iterator();
            while (it.hasNext()) {
                a(linkedList, it.next());
            }
            return;
        }
        for (Object obj2 : n.h((Iterable) linkedList)) {
            dVar.f31044f.addFirst(obj2);
        }
    }
}
