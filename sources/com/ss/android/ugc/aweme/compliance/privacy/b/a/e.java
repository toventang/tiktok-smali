package com.ss.android.ugc.aweme.compliance.privacy.b.a;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public interface e {

    public interface c {
        static {
            Covode.recordClassIndex(47853);
        }

        int a(int i2);

        int b(int i2);
    }

    static {
        Covode.recordClassIndex(47848);
    }

    c a(int i2);

    c a(c cVar);

    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<c> f77361a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f77362b = 0;

        static {
            Covode.recordClassIndex(47849);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e
        public final c a(c cVar) {
            return new C1785a(cVar);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e
        public final c a(int i2) {
            c cVar = this.f77361a.get(i2);
            if (cVar != null) {
                return cVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i2)));
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$a$a  reason: collision with other inner class name */
        class C1785a implements c {

            /* renamed from: a  reason: collision with root package name */
            final c f77363a;

            /* renamed from: c  reason: collision with root package name */
            private SparseIntArray f77365c = new SparseIntArray(1);

            /* renamed from: d  reason: collision with root package name */
            private SparseIntArray f77366d = new SparseIntArray(1);

            static {
                Covode.recordClassIndex(47850);
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e.c
            public final int a(int i2) {
                int indexOfKey = this.f77365c.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    return this.f77365c.valueAt(indexOfKey);
                }
                a aVar = a.this;
                c cVar = this.f77363a;
                int i3 = aVar.f77362b;
                aVar.f77362b = i3 + 1;
                aVar.f77361a.put(i3, cVar);
                this.f77365c.put(i2, i3);
                this.f77366d.put(i3, i2);
                return i3;
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e.c
            public final int b(int i2) {
                int indexOfKey = this.f77366d.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    return this.f77366d.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.f77363a.f77349c);
            }

            C1785a(c cVar) {
                this.f77363a = cVar;
            }
        }
    }

    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<List<c>> f77367a = new SparseArray<>();

        static {
            Covode.recordClassIndex(47851);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e
        public final c a(c cVar) {
            return new a(cVar);
        }

        class a implements c {

            /* renamed from: a  reason: collision with root package name */
            final c f77368a;

            static {
                Covode.recordClassIndex(47852);
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e.c
            public final int b(int i2) {
                return i2;
            }

            @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e.c
            public final int a(int i2) {
                List<c> list = b.this.f77367a.get(i2);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f77367a.put(i2, list);
                }
                if (!list.contains(this.f77368a)) {
                    list.add(this.f77368a);
                }
                return i2;
            }

            a(c cVar) {
                this.f77368a = cVar;
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.e
        public final c a(int i2) {
            List<c> list = this.f77367a.get(i2);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i2)));
        }
    }
}
