package j.a.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List<Class<?>> f158847a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<c<?, ?>> f158848b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<e<?>> f158849c = new ArrayList();

    static {
        Covode.recordClassIndex(105404);
    }

    @Override // j.a.a.k
    public final c<?, ?> a(int i2) {
        return this.f158848b.get(i2);
    }

    @Override // j.a.a.k
    public final e<?> b(int i2) {
        return this.f158849c.get(i2);
    }

    @Override // j.a.a.k
    public final boolean a(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f158847a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f158847a.remove(indexOf);
            this.f158848b.remove(indexOf);
            this.f158849c.remove(indexOf);
            z = true;
        }
    }

    @Override // j.a.a.k
    public final int b(Class<?> cls) {
        int indexOf = this.f158847a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i2 = 0; i2 < this.f158847a.size(); i2++) {
            if (this.f158847a.get(i2).isAssignableFrom(cls)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // j.a.a.k
    public final <T> void a(Class<? extends T> cls, c<T, ?> cVar, e<T> eVar) {
        this.f158847a.add(cls);
        this.f158848b.add(cVar);
        this.f158849c.add(eVar);
    }
}
