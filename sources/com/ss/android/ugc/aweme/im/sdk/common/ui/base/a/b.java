package com.ss.android.ugc.aweme.im.sdk.common.ui.base.a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.d;
import h.f.b.l;
import h.f.b.m;
import java.util.Collections;
import java.util.List;

public abstract class b<VH extends RecyclerView.ViewHolder, T> extends f<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T> f102517a;

    static {
        Covode.recordClassIndex(65654);
    }

    public int m() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.c
    public final a<T> l() {
        return this.f102517a;
    }

    public /* synthetic */ b() {
        this(new f());
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public int getItemCount() {
        int i2;
        List<? extends T> list = this.f102517a.f102505c;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        return i2 + m();
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<? extends T>, java.util.List<T> */
    public final List<T> n() {
        List list = (List<? extends T>) l().f102505c;
        if (list != null) {
            return list;
        }
        List<T> emptyList = Collections.emptyList();
        l.b(emptyList, "");
        return emptyList;
    }

    public final void e(List<? extends T> list) {
        a<T> l2 = l();
        l2.f102505c = list;
        l2.f102506d.a();
    }

    static final class a extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.this$0.m());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private b(j.e<T> eVar) {
        this(new d.a(eVar).a());
        l.d(eVar, "");
        l.d(eVar, "");
    }

    private b(d<T> dVar) {
        l.d(dVar, "");
        this.f102517a = new a<>(new e(this, new a(this)), dVar);
        this.v = false;
    }

    public final T a(int i2) {
        if (i2 >= m() && i2 < getItemCount()) {
            a<T> aVar = this.f102517a;
            int m2 = i2 - m();
            List<? extends T> list = aVar.f102505c;
            if (list != null && m2 < list.size() && m2 >= 0) {
                return (T) list.get(m2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.c
    public final void f(List<? extends T> list) {
        a<T> l2 = l();
        l2.f102504b++;
        int i2 = l2.f102504b;
        List<? extends T> list2 = l2.f102505c;
        if (list == list2) {
            return;
        }
        if (list == null) {
            if (list2 == null) {
                l.b();
            }
            int size = list2.size();
            l2.f102505c = null;
            l2.f102506d.b(0, size);
        } else if (list2 == null) {
            l2.f102505c = list;
            l2.f102506d.a(0, list.size());
        } else {
            l2.f102507e.f102519b.execute(new a.b(l2, list2, list, i2, null));
        }
    }
}
