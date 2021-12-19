package com.ss.android.ugc.aweme.base.arch;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.a.c;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.d;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public abstract class e<T> extends d<JediViewHolder<? extends g, T>> implements com.bytedance.jedi.arch.ext.list.a<T> {

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.jedi.arch.ext.list.a.b<T> f67987d;

    static {
        Covode.recordClassIndex(41870);
    }

    public abstract JediViewHolder<? extends g, T> a(ViewGroup viewGroup);

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final com.bytedance.jedi.arch.ext.list.a.b<T> a() {
        return this.f67987d;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f67987d.a() + d();
    }

    static final class b extends m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, T>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(41872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return this.this$0.a(viewGroup2);
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final T a(int i2) {
        return (T) a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final T b(int i2) {
        return this.f67987d.a(i2 - d(), true);
    }

    static final class a extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(41871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.this$0.d());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, T>> gVar) {
        l.d(gVar, "");
        gVar.a(new b(this));
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final void a(List<? extends T> list, h.f.a.a<z> aVar) {
        l.d(list, "");
        a.C0960a.a(this, list, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(androidx.lifecycle.m mVar, j.e<T> eVar, e.b bVar) {
        this(mVar, (com.bytedance.jedi.arch.ext.list.a.e) null, l.c(eVar, ""));
        l.d(mVar, "");
        l.d(eVar, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(androidx.lifecycle.m mVar, com.bytedance.jedi.arch.ext.list.a.e eVar, c<T> cVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(cVar, "");
        this.f67987d = new com.bytedance.jedi.arch.ext.list.a.b<>(new d(this, new a(this)), cVar, eVar);
    }
}
