package com.ss.android.ugc.aweme.dsp.playerservice.d.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.e;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.d;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    d f83504a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<c> f83505b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private CopyOnWriteArrayList<c> f83506c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.c.c f83507d = com.ss.android.ugc.aweme.dsp.playerservice.c.c.SEQUENCE;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f83508e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final q f83509f;

    static {
        Covode.recordClassIndex(52109);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final d m() {
        return this.f83504a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final c n() {
        return (c) n.b((List) this.f83506c, this.f83508e);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final c o() {
        return this.f83507d.getNext(this.f83506c, this.f83508e);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final c p() {
        return this.f83507d.getPre(this.f83506c, this.f83508e);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean q() {
        if (o() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean r() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void s() {
        d dVar = this.f83504a;
        if (dVar != null) {
            this.f83509f.b(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83505b.clear();
        this.f83506c.clear();
        d dVar = this.f83504a;
        if (dVar != null) {
            dVar.d();
        }
    }

    public a(q qVar) {
        l.d(qVar, "");
        this.f83509f = qVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        this.f83507d = cVar;
        this.f83506c.clear();
        this.f83506c.addAll(this.f83507d.getRealPlayableList(this.f83505b));
        this.f83509f.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final List<c> d(c cVar) {
        int i2;
        if (cVar == null) {
            i2 = this.f83508e;
        } else {
            i2 = 0;
            Iterator<c> it = this.f83506c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (l.a((Object) it.next().a(), (Object) cVar.a())) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i2 >= 0) {
            return this.f83507d.getFuturePlayableList(this.f83506c, i2);
        }
        return z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void e(c cVar) {
        l.d(cVar, "");
        int i2 = 0;
        for (c cVar2 : this.f83506c) {
            if (!l.a((Object) cVar2.a(), (Object) cVar.a())) {
                i2++;
            } else if (i2 >= 0) {
                this.f83508e = i2;
                this.f83509f.b(cVar);
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void c(d dVar) {
        l.d(dVar, "");
        d dVar2 = this.f83504a;
        if (dVar2 != null) {
            dVar2.d();
        }
        dVar.c();
        this.f83504a = dVar;
        this.f83505b.clear();
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f83505b;
        List<c> b2 = dVar.b();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            if (hashSet.add(t.a())) {
                arrayList.add(t);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
        this.f83508e = -1;
        this.f83506c.clear();
        this.f83506c.addAll(this.f83507d.getRealPlayableList(this.f83505b));
        this.f83509f.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void a(List<? extends c> list, Integer num) {
        String str;
        l.d(list, "");
        c n = n();
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f83505b;
        ArrayList arrayList = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        ArrayList arrayList2 = arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t.a())) {
                arrayList3.add(t);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!arrayList2.contains(((c) obj).a())) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = arrayList4;
        if (!arrayList5.isEmpty()) {
            if (num == null) {
                this.f83505b.addAll(arrayList5);
                this.f83506c.addAll(this.f83507d.getRealPlayableList(arrayList5));
            } else {
                this.f83505b.addAll(num.intValue(), arrayList5);
                this.f83506c.addAll(num.intValue(), this.f83507d.getRealPlayableList(arrayList5));
            }
            int i2 = 0;
            Iterator<c> it2 = this.f83506c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                String a2 = it2.next().a();
                if (n != null) {
                    str = n.a();
                } else {
                    str = null;
                }
                if (l.a((Object) a2, (Object) str)) {
                    break;
                }
                i2++;
            }
            this.f83508e = i2;
            d dVar = this.f83504a;
            if (dVar != null) {
                this.f83509f.a(dVar);
            }
        }
    }
}
