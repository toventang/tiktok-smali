package com.ss.android.ugc.aweme.ftc.l.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.l.a.i;
import com.ss.android.ugc.gamora.recorder.n.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f98707a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f98708b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i.a> f98709c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f98710d = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(62776);
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final List<b> a() {
        return this.f98707a;
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final b b() {
        return this.f98708b;
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final int c() {
        return this.f98710d;
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void b(i.a aVar) {
        l.d(aVar, "");
        this.f98709c.remove(aVar);
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void a(int i2) {
        this.f98710d = i2;
        Iterator<T> it = this.f98709c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void a(i.a aVar) {
        l.d(aVar, "");
        if (!this.f98709c.contains(aVar)) {
            this.f98709c.add(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void b(b bVar) {
        if (!l.a(this.f98708b, bVar)) {
            this.f98708b = bVar;
            Iterator<T> it = this.f98709c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void a(b bVar) {
        l.d(bVar, "");
        int i2 = 0;
        for (b bVar2 : this.f98707a) {
            if (bVar2.f148158a != bVar.f148158a) {
                i2++;
            } else if (i2 >= 0) {
                b bVar3 = this.f98707a.get(i2);
                l.b(bVar3, "");
                bVar3.f148169l = true;
                this.f98707a.set(i2, bVar.clone());
                Iterator<T> it = this.f98709c.iterator();
                while (it.hasNext()) {
                    it.next().a(bVar);
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.l.a.i
    public final void a(List<? extends b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f98707a);
        this.f98707a.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f98707a.add(it.next().clone());
        }
        ArrayList<b> arrayList2 = this.f98707a;
        HashSet hashSet = new HashSet(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(hashSet);
        n.c((List) arrayList2);
        Iterator<T> it2 = this.f98709c.iterator();
        while (it2.hasNext()) {
            it2.next().a(arrayList, this.f98707a);
        }
    }
}
