package com.ss.android.ugc.gamora.recorder.n.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.n.a.b;
import com.ss.android.ugc.gamora.recorder.n.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b f148135a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f148136b;

    /* renamed from: c  reason: collision with root package name */
    private b f148137c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b.a> f148138d;

    /* renamed from: e  reason: collision with root package name */
    private int f148139e;

    static {
        Covode.recordClassIndex(97645);
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final List<com.ss.android.ugc.gamora.recorder.n.b> a() {
        return this.f148136b;
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final com.ss.android.ugc.gamora.recorder.n.b b() {
        return this.f148137c;
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final int c() {
        return this.f148139e;
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final com.ss.android.ugc.gamora.recorder.n.b d() {
        return this.f148135a;
    }

    private /* synthetic */ g() {
        this(null);
    }

    private static <T> ArrayList<T> a(ArrayList<T> arrayList) {
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void b(b.a aVar) {
        l.d(aVar, "");
        this.f148138d.remove(aVar);
    }

    public g(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        this.f148135a = bVar;
        this.f148136b = new ArrayList<>();
        this.f148138d = new ArrayList();
        this.f148139e = Integer.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void a(int i2) {
        this.f148139e = i2;
        Iterator<T> it = this.f148138d.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void a(b.a aVar) {
        l.d(aVar, "");
        if (!this.f148138d.contains(aVar)) {
            this.f148138d.add(aVar);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void b(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        l.d(bVar, "");
        if (this.f148136b.remove(bVar)) {
            Iterator<T> it = this.f148138d.iterator();
            while (it.hasNext()) {
                it.next().b(bVar);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void d(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        if (!l.a(this.f148137c, bVar)) {
            this.f148137c = bVar;
            Iterator<T> it = this.f148138d.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void a(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        l.d(bVar, "");
        this.f148136b.add(bVar);
        n.c((List) a((ArrayList) this.f148136b));
        Iterator<T> it = this.f148138d.iterator();
        while (it.hasNext()) {
            this.f148136b.size();
            it.next().a(bVar);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void c(com.ss.android.ugc.gamora.recorder.n.b bVar) {
        l.d(bVar, "");
        int i2 = 0;
        for (com.ss.android.ugc.gamora.recorder.n.b bVar2 : this.f148136b) {
            if (bVar2.f148158a != bVar.f148158a) {
                i2++;
            } else if (i2 >= 0) {
                com.ss.android.ugc.gamora.recorder.n.b bVar3 = this.f148136b.get(i2);
                l.b(bVar3, "");
                bVar3.f148169l = true;
                this.f148136b.set(i2, bVar.clone());
                Iterator<T> it = this.f148138d.iterator();
                while (it.hasNext()) {
                    it.next().c(bVar);
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.n.a.b
    public final void a(List<? extends com.ss.android.ugc.gamora.recorder.n.b> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f148136b);
        this.f148136b.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f148136b.add(it.next().clone());
        }
        n.c((List) a((ArrayList) this.f148136b));
        Iterator<T> it2 = this.f148138d.iterator();
        while (it2.hasNext()) {
            it2.next().a(arrayList, this.f148136b);
        }
    }
}
