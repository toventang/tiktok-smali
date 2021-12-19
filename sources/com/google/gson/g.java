package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.a;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.i;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Excluder f54711a;

    /* renamed from: b  reason: collision with root package name */
    public e f54712b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54713c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54714d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54715e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f54716f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f54717g;

    /* renamed from: h  reason: collision with root package name */
    private u f54718h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<Type, h<?>> f54719i;

    /* renamed from: j  reason: collision with root package name */
    private final List<w> f54720j;

    /* renamed from: k  reason: collision with root package name */
    private final List<w> f54721k;

    /* renamed from: l  reason: collision with root package name */
    private String f54722l;

    /* renamed from: m  reason: collision with root package name */
    private int f54723m;
    private int n;
    private boolean o;
    private boolean p;

    static {
        Covode.recordClassIndex(33936);
    }

    public final g a() {
        Excluder a2 = this.f54711a.clone();
        a2.f54729e = true;
        this.f54711a = a2;
        return this;
    }

    public g() {
        this.f54711a = Excluder.f54725a;
        this.f54718h = u.DEFAULT;
        this.f54712b = d.IDENTITY;
        this.f54719i = new HashMap();
        this.f54720j = new ArrayList();
        this.f54721k = new ArrayList();
        this.f54713c = false;
        this.f54723m = 2;
        this.n = 2;
        this.f54714d = false;
        this.o = false;
        this.f54715e = true;
        this.f54716f = false;
        this.p = false;
        this.f54717g = false;
    }

    public final f b() {
        ArrayList arrayList = new ArrayList(this.f54720j.size() + this.f54721k.size() + 3);
        arrayList.addAll(this.f54720j);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f54721k);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f54722l, this.f54723m, this.n, arrayList);
        return new f(this.f54711a, this.f54712b, this.f54719i, this.f54713c, this.f54714d, this.p, this.f54715e, this.f54716f, this.f54717g, this.o, this.f54718h, this.f54722l, this.f54723m, this.n, this.f54720j, this.f54721k, arrayList);
    }

    public final g a(w wVar) {
        this.f54720j.add(wVar);
        return this;
    }

    public final g a(b bVar) {
        this.f54711a = this.f54711a.a(bVar, true, false);
        return this;
    }

    public g(f fVar) {
        this.f54711a = Excluder.f54725a;
        this.f54718h = u.DEFAULT;
        this.f54712b = d.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f54719i = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f54720j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f54721k = arrayList2;
        this.f54713c = false;
        this.f54723m = 2;
        this.n = 2;
        this.f54714d = false;
        this.o = false;
        this.f54715e = true;
        this.f54716f = false;
        this.p = false;
        this.f54717g = false;
        this.f54711a = fVar.f54694b;
        this.f54712b = fVar.f54695c;
        hashMap.putAll(fVar.f54696d);
        this.f54713c = fVar.f54697e;
        this.f54714d = fVar.f54698f;
        this.p = fVar.f54699g;
        this.f54715e = fVar.f54700h;
        this.f54716f = fVar.f54701i;
        this.f54717g = fVar.f54702j;
        this.o = fVar.f54703k;
        this.f54718h = fVar.o;
        this.f54722l = fVar.f54704l;
        this.f54723m = fVar.f54705m;
        this.n = fVar.n;
        arrayList.addAll(fVar.p);
        arrayList2.addAll(fVar.q);
    }

    public final g a(Class<?> cls, Object obj) {
        boolean z;
        boolean z2 = obj instanceof s;
        if (z2 || (obj instanceof k) || (obj instanceof v)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z);
        if ((obj instanceof k) || z2) {
            this.f54721k.add(TreeTypeAdapter.a(cls, obj));
        }
        if (obj instanceof v) {
            this.f54720j.add(i.b(cls, (v) obj));
        }
        return this;
    }

    public final g a(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof s;
        if (z2 || (obj instanceof k) || (obj instanceof h) || (obj instanceof v)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z);
        if (obj instanceof h) {
            this.f54719i.put(type, obj);
        }
        if (z2 || (obj instanceof k)) {
            this.f54720j.add(TreeTypeAdapter.a(com.google.gson.b.a.get(type), obj));
        }
        if (obj instanceof v) {
            this.f54720j.add(i.a(com.google.gson.b.a.get(type), (v) obj));
        }
        return this;
    }

    private static void a(String str, int i2, int i3, List<w> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a(Date.class, str);
            aVar2 = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else if (i2 != 2 && i3 != 2) {
            aVar = new a(Date.class, i2, i3);
            aVar2 = new a(Timestamp.class, i2, i3);
            aVar3 = new a(java.sql.Date.class, i2, i3);
        } else {
            return;
        }
        list.add(i.a(Date.class, aVar));
        list.add(i.a(Timestamp.class, aVar2));
        list.add(i.a(java.sql.Date.class, aVar3));
    }
}
