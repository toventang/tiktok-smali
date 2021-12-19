package com.bytedance.webx.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.e.b;
import com.bytedance.webx.h;
import com.bytedance.webx.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class a implements b {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakReference<Object> f45941d = new WeakReference<>(null);

    /* renamed from: a  reason: collision with root package name */
    public boolean f45942a;

    /* renamed from: b  reason: collision with root package name */
    public Set<h.c> f45943b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Class<? extends com.bytedance.webx.a>, h.c> f45944c;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Object> f45945e = f45941d;

    /* renamed from: f  reason: collision with root package name */
    private h f45946f;

    /* renamed from: g  reason: collision with root package name */
    private b f45947g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<c> f45948h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<Class, WeakReference<c>> f45949i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private Map<String, TreeMap<Integer, com.bytedance.webx.f.a>> f45950j;

    @Override // com.bytedance.webx.d.b
    public final Map<String, TreeMap<Integer, com.bytedance.webx.f.a>> a() {
        return this.f45950j;
    }

    @Override // com.bytedance.webx.d.b
    public final h d() {
        return this.f45946f;
    }

    @Override // com.bytedance.webx.d.b
    public final c b() {
        return (c) this.f45947g;
    }

    @Override // com.bytedance.webx.d.b
    public final Iterator<c> c() {
        return this.f45948h.iterator();
    }

    static {
        Covode.recordClassIndex(28083);
    }

    @Override // com.bytedance.webx.d.b
    public final void a(Map<String, TreeMap<Integer, com.bytedance.webx.f.a>> map) {
        this.f45950j = map;
    }

    public final boolean a(Class<? extends com.bytedance.webx.a> cls) {
        return this.f45949i.containsKey(cls);
    }

    public final void a(LinkedHashSet<Class<? extends com.bytedance.webx.a>> linkedHashSet) {
        if (linkedHashSet != null) {
            Iterator<Class<? extends com.bytedance.webx.a>> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Class<? extends com.bytedance.webx.a> next = it.next();
                com.bytedance.webx.a aVar = (com.bytedance.webx.a) com.bytedance.webx.g.b.b(next);
                if (aVar != null) {
                    a(next, aVar);
                } else {
                    throw new Error("extension init fail: ".concat(String.valueOf(next)));
                }
            }
        }
        Iterator it2 = new ArrayList(this.f45948h).iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar instanceof com.bytedance.webx.a) {
                i.a((com.bytedance.webx.a) cVar);
            }
        }
    }

    private void a(Class<? extends com.bytedance.webx.a> cls, c cVar) {
        this.f45948h.add(cVar);
        this.f45949i.put(cls, new WeakReference<>(cVar));
    }

    public a(h hVar, b bVar) {
        this.f45946f = hVar;
        this.f45947g = bVar;
        this.f45948h.add(bVar);
    }

    public final void a(Class<? extends com.bytedance.webx.a> cls, com.bytedance.webx.a aVar) {
        h.c cVar;
        LinkedHashSet<h.c> linkedHashSet;
        aVar.f45901d = this.f45946f;
        if (this.f45946f.f46005f != null) {
            Iterator<h.c> it = this.f45946f.f46005f.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
        if (!(this.f45946f.f46006g == null || (linkedHashSet = this.f45946f.f46006g.get(cls)) == null)) {
            Iterator<h.c> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().a(aVar);
            }
        }
        Set<h.c> set = this.f45943b;
        if (set != null) {
            for (h.c cVar2 : set) {
                cVar2.a(aVar);
            }
        }
        HashMap<Class<? extends com.bytedance.webx.a>, h.c> hashMap = this.f45944c;
        if (!(hashMap == null || (cVar = hashMap.get(cls)) == null)) {
            cVar.a(aVar);
        }
        a(cls, (c) aVar);
        aVar.f45902e = this;
    }
}
