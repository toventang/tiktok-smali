package androidx.h;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class k<T> extends AbstractList<T> {

    /* renamed from: a  reason: collision with root package name */
    static final List f3174a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f3175b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<List<T>> f3176c;

    /* renamed from: d  reason: collision with root package name */
    public int f3177d;

    /* renamed from: e  reason: collision with root package name */
    public int f3178e;

    /* renamed from: f  reason: collision with root package name */
    public int f3179f;

    /* renamed from: g  reason: collision with root package name */
    int f3180g;

    /* renamed from: h  reason: collision with root package name */
    public int f3181h;

    /* renamed from: i  reason: collision with root package name */
    public int f3182i;

    interface a {
        static {
            Covode.recordClassIndex(1136);
        }

        void a(int i2, int i3, int i4);

        void b(int i2);

        void b(int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(1135);
    }

    /* access modifiers changed from: package-private */
    public final T c() {
        return this.f3176c.get(0).get(0);
    }

    public final int size() {
        return this.f3175b + this.f3179f + this.f3177d;
    }

    k() {
        this.f3176c = new ArrayList<>();
        this.f3177d = 0;
        this.f3178e = 0;
        this.f3179f = 0;
        this.f3180g = 1;
        this.f3181h = 0;
        this.f3182i = 0;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i2 = this.f3175b;
        int size = this.f3176c.size();
        for (int i3 = 0; i3 < size; i3++) {
            List<T> list = this.f3176c.get(i3);
            if (!(list == null || list == f3174a)) {
                break;
            }
            i2 += this.f3180g;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        int i2 = this.f3177d;
        for (int size = this.f3176c.size() - 1; size >= 0; size--) {
            List<T> list = this.f3176c.get(size);
            if (!(list == null || list == f3174a)) {
                break;
            }
            i2 += this.f3180g;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final T d() {
        ArrayList<List<T>> arrayList = this.f3176c;
        List<T> list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.f3175b + ", storage " + this.f3179f + ", trailing " + this.f3177d);
        for (int i2 = 0; i2 < this.f3176c.size(); i2++) {
            sb.append(" ").append(this.f3176c.get(i2));
        }
        return sb.toString();
    }

    k(k<T> kVar) {
        this.f3175b = kVar.f3175b;
        this.f3176c = new ArrayList<>(kVar.f3176c);
        this.f3177d = kVar.f3177d;
        this.f3178e = kVar.f3178e;
        this.f3179f = kVar.f3179f;
        this.f3180g = kVar.f3180g;
        this.f3181h = kVar.f3181h;
        this.f3182i = kVar.f3182i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i2) {
        if (i2 < 0 || i2 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + size());
        }
        int i3 = i2 - this.f3175b;
        if (i3 >= 0 && i3 < this.f3179f) {
            int i4 = this.f3180g;
            int i5 = 0;
            if (i4 <= 0) {
                int size = this.f3176c.size();
                while (i5 < size) {
                    int size2 = this.f3176c.get(i5).size();
                    if (size2 > i3) {
                        break;
                    }
                    i3 -= size2;
                    i5++;
                }
            } else {
                i5 = i3 / i4;
                i3 %= i4;
            }
            List<T> list = this.f3176c.get(i5);
            if (!(list == null || list.size() == 0)) {
                return list.get(i3);
            }
        }
        return null;
    }
}
