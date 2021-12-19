package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public interface ag {

    public interface c {
        static {
            Covode.recordClassIndex(1552);
        }

        int a(int i2);

        int b(int i2);
    }

    static {
        Covode.recordClassIndex(1547);
    }

    c a(v vVar);

    v a(int i2);

    public static class a implements ag {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<v> f3980a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f3981b = 0;

        static {
            Covode.recordClassIndex(1548);
        }

        @Override // androidx.recyclerview.widget.ag
        public final c a(v vVar) {
            return new C0059a(vVar);
        }

        @Override // androidx.recyclerview.widget.ag
        public final v a(int i2) {
            v vVar = this.f3980a.get(i2);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i2)));
        }

        /* renamed from: androidx.recyclerview.widget.ag$a$a  reason: collision with other inner class name */
        class C0059a implements c {

            /* renamed from: a  reason: collision with root package name */
            final v f3982a;

            /* renamed from: c  reason: collision with root package name */
            private SparseIntArray f3984c = new SparseIntArray(1);

            /* renamed from: d  reason: collision with root package name */
            private SparseIntArray f3985d = new SparseIntArray(1);

            static {
                Covode.recordClassIndex(1549);
            }

            @Override // androidx.recyclerview.widget.ag.c
            public final int a(int i2) {
                int indexOfKey = this.f3984c.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    return this.f3984c.valueAt(indexOfKey);
                }
                a aVar = a.this;
                v vVar = this.f3982a;
                int i3 = aVar.f3981b;
                aVar.f3981b = i3 + 1;
                aVar.f3980a.put(i3, vVar);
                this.f3984c.put(i2, i3);
                this.f3985d.put(i3, i2);
                return i3;
            }

            @Override // androidx.recyclerview.widget.ag.c
            public final int b(int i2) {
                int indexOfKey = this.f3985d.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    return this.f3985d.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.f3982a.f4212c);
            }

            C0059a(v vVar) {
                this.f3982a = vVar;
            }
        }
    }

    public static class b implements ag {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<List<v>> f3986a = new SparseArray<>();

        static {
            Covode.recordClassIndex(1550);
        }

        @Override // androidx.recyclerview.widget.ag
        public final c a(v vVar) {
            return new a(vVar);
        }

        class a implements c {

            /* renamed from: a  reason: collision with root package name */
            final v f3987a;

            static {
                Covode.recordClassIndex(1551);
            }

            @Override // androidx.recyclerview.widget.ag.c
            public final int b(int i2) {
                return i2;
            }

            @Override // androidx.recyclerview.widget.ag.c
            public final int a(int i2) {
                List<v> list = b.this.f3986a.get(i2);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f3986a.put(i2, list);
                }
                if (!list.contains(this.f3987a)) {
                    list.add(this.f3987a);
                }
                return i2;
            }

            a(v vVar) {
                this.f3987a = vVar;
            }
        }

        @Override // androidx.recyclerview.widget.ag
        public final v a(int i2) {
            List<v> list = this.f3986a.get(i2);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i2)));
        }
    }
}
