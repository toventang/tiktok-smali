package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class de extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ da f50771a;

    static {
        Covode.recordClassIndex(31725);
    }

    public final void clear() {
        this.f50771a.clear();
    }

    public final int size() {
        return this.f50771a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        da daVar = this.f50771a;
        Map b2 = daVar.b();
        if (b2 != null) {
            return b2.entrySet().iterator();
        }
        return new dc(daVar);
    }

    de(da daVar) {
        this.f50771a = daVar;
    }

    public final boolean contains(Object obj) {
        Map b2 = this.f50771a.b();
        if (b2 != null) {
            return b2.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a2 = this.f50771a.a(entry.getKey());
            if (a2 == -1 || !ck.a(this.f50771a.f50759e[a2], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int c2;
        int a2;
        Map b2 = this.f50771a.b();
        if (b2 != null) {
            return b2.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f50771a.a() || (a2 = dh.a(entry.getKey(), entry.getValue(), (c2 = this.f50771a.c()), this.f50771a.f50756b, this.f50771a.f50757c, this.f50771a.f50758d, this.f50771a.f50759e)) == -1) {
            return false;
        }
        this.f50771a.a(a2, c2);
        this.f50771a.f50761g--;
        this.f50771a.d();
        return true;
    }
}
