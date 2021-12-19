package com.ss.android.ugc.aweme.base.arch;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.a.b;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.d;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public abstract class c<T> extends d<JediViewHolder<? extends g, ?>> implements com.bytedance.jedi.arch.ext.list.a<T> {

    /* renamed from: d  reason: collision with root package name */
    private final b<T> f67985d;

    static {
        Covode.recordClassIndex(41867);
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final b<T> a() {
        return this.f67985d;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f67985d.a() + d();
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final T a(int i2) {
        return (T) a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
    }

    public final void a(List<? extends T> list) {
        l.d(list, "");
        l.c(list, "");
        a(list, (h.f.a.a<z>) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final T b(int i2) {
        return this.f67985d.a(i2 - d(), true);
    }

    static final class a extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(41868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.this$0.d());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private c(androidx.lifecycle.m mVar, j.e<T> eVar) {
        this(mVar, (e) null, l.c(eVar, ""));
        l.d(mVar, "");
        l.d(eVar, "");
    }

    @Override // com.bytedance.jedi.arch.ext.list.a
    public final void a(List<? extends T> list, h.f.a.a<z> aVar) {
        l.d(list, "");
        a.C0960a.a(this, list, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(androidx.lifecycle.m mVar, j.e eVar, int i2) {
        this(mVar, (i2 & 2) != 0 ? new a() : eVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(androidx.lifecycle.m mVar, e eVar, com.bytedance.jedi.arch.ext.list.a.c<T> cVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(cVar, "");
        this.f67985d = new b<>(new d(this, new a(this)), cVar, (e) null);
    }
}
