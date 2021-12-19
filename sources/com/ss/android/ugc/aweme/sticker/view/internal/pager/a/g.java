package com.ss.android.ugc.aweme.sticker.view.internal.pager.a;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class g<T, VH extends a<T>> implements h<T, VH> {

    /* renamed from: a  reason: collision with root package name */
    final SparseArray<h.f.a.b<ViewGroup, VH>> f136374a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    final List<a<VH>> f136375b;

    /* renamed from: c  reason: collision with root package name */
    private int f136376c = 11513600;

    static {
        Covode.recordClassIndex(89067);
    }

    public g() {
        b bVar = b.f136380a;
        c cVar = c.f136381a;
        int i2 = this.f136376c;
        this.f136376c = i2 + 1;
        this.f136375b = n.c(new a(bVar, cVar, i2));
    }

    static final class b extends m implements h.f.a.b<ViewGroup, VH> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136380a = new b();

        static {
            Covode.recordClassIndex(89069);
        }

        b() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new c(viewGroup2);
        }
    }

    static final class c extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f136381a = new c();

        static {
            Covode.recordClassIndex(89070);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h
    public final void a(h.f.a.b<? super Integer, Boolean> bVar, h.f.a.b<? super ViewGroup, ? extends VH> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        int size = this.f136375b.size();
        int i2 = this.f136376c;
        this.f136376c = i2 + 1;
        this.f136375b.add(size - 1, new a<>(bVar2, bVar, i2));
    }

    static final class a<VH> {

        /* renamed from: a  reason: collision with root package name */
        public final h.f.a.b<ViewGroup, VH> f136377a;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.b<Integer, Boolean> f136378b;

        /* renamed from: c  reason: collision with root package name */
        public final int f136379c;

        static {
            Covode.recordClassIndex(89068);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f136377a, aVar.f136377a) && l.a(this.f136378b, aVar.f136378b) && this.f136379c == aVar.f136379c;
        }

        public final int hashCode() {
            h.f.a.b<ViewGroup, VH> bVar = this.f136377a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            h.f.a.b<Integer, Boolean> bVar2 = this.f136378b;
            if (bVar2 != null) {
                i2 = bVar2.hashCode();
            }
            return ((hashCode + i2) * 31) + this.f136379c;
        }

        public final String toString() {
            return "HolderCreator(factory=" + this.f136377a + ", typeMatcher=" + this.f136378b + ", viewType=" + this.f136379c + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.ViewGroup, ? extends VH> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h.f.a.b<? super ViewGroup, ? extends VH> bVar, h.f.a.b<? super Integer, Boolean> bVar2, int i2) {
            l.d(bVar, "");
            l.d(bVar2, "");
            this.f136377a = bVar;
            this.f136378b = bVar2;
            this.f136379c = i2;
        }
    }
}
