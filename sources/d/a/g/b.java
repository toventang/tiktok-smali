package d.a.g;

import com.bytedance.covode.number.Covode;
import d.a.a.a;
import java.util.ArrayList;
import java.util.Collection;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final d.a.a.b<K, a<V>> f156643a = new d.a.a.b<>();

    static {
        Covode.recordClassIndex(104011);
    }

    public final Collection<V> a() {
        Collection<a<V>> values = this.f156643a.values();
        ArrayList arrayList = new ArrayList();
        for (a<V> aVar : values) {
            arrayList.addAll(aVar);
        }
        return arrayList;
    }

    public final void a(K k2, V v) {
        a<V> aVar = this.f156643a.get(k2);
        if (aVar == null) {
            a<V> aVar2 = new a<>();
            aVar2.add(v);
            this.f156643a.put(k2, aVar2);
            return;
        }
        aVar.add(v);
    }
}
