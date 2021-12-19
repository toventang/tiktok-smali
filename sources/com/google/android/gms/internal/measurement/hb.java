package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class hb extends ey<String> implements he, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final hb f50967a;

    /* renamed from: b  reason: collision with root package name */
    private static final he f50968b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f50969c;

    public hb() {
        this(10);
    }

    @Override // com.google.android.gms.internal.measurement.gv, com.google.android.gms.internal.measurement.ey
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final List<?> d() {
        return Collections.unmodifiableList(this.f50969c);
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final int size() {
        return this.f50969c.size();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final void clear() {
        c();
        this.f50969c.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final he e() {
        if (a()) {
            return new jf(this);
        }
        return this;
    }

    static {
        Covode.recordClassIndex(31841);
        hb hbVar = new hb();
        f50967a = hbVar;
        hbVar.b();
        f50968b = hbVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* bridge */ /* synthetic */ boolean add(String str) {
        return super.add(str);
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final Object b(int i2) {
        return this.f50969c.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public hb(int i2) {
        this(new ArrayList(i2));
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final void a(fe feVar) {
        c();
        this.f50969c.add(feVar);
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    private hb(ArrayList<Object> arrayList) {
        this.f50969c = arrayList;
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fe) {
            return ((fe) obj).zzb();
        }
        return gp.a((byte[]) obj);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ String remove(int i2) {
        c();
        Object remove = this.f50969c.remove(i2);
        this.modCount++;
        return a(remove);
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final /* synthetic */ gv a(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f50969c);
            return new hb(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f50969c.get(i2);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof fe) {
            fe feVar = (fe) obj;
            String zzb = feVar.zzb();
            if (feVar.zzc()) {
                this.f50969c.set(i2, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String a2 = gp.a(bArr);
        if (jm.f51081a.c(bArr, 0, bArr.length)) {
            this.f50969c.set(i2, a2);
        }
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, String str) {
        c();
        this.f50969c.add(i2, str);
        this.modCount++;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ String set(int i2, String str) {
        c();
        return a(this.f50969c.set(i2, str));
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        c();
        if (collection instanceof he) {
            collection = ((he) collection).d();
        }
        boolean addAll = this.f50969c.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }
}
