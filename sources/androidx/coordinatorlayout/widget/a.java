package androidx.coordinatorlayout.widget;

import androidx.c.g;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final f.a<ArrayList<T>> f2114a = new f.b(10);

    /* renamed from: b  reason: collision with root package name */
    final g<T, ArrayList<T>> f2115b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f2116c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f2117d = new HashSet<>();

    static {
        Covode.recordClassIndex(638);
    }

    public final ArrayList<T> a() {
        this.f2116c.clear();
        this.f2117d.clear();
        int size = this.f2115b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(this.f2115b.b(i2), this.f2116c, this.f2117d);
        }
        return this.f2116c;
    }

    public final void a(T t) {
        if (!this.f2115b.containsKey(t)) {
            this.f2115b.put(t, null);
        }
    }

    public final List b(T t) {
        return this.f2115b.get(t);
    }

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f2115b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
