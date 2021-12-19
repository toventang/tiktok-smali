package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.List;

public abstract class CommonListViewModel<T, S extends IListState<T, o>> extends ListViewModel<T, o, S> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.b<S, t<p<List<T>, o>>> f39406a;

    static {
        Covode.recordClassIndex(24187);
    }

    /* access modifiers changed from: protected */
    public abstract h.f.a.b<S, t<p<List<T>, o>>> a();

    /* access modifiers changed from: protected */
    public h.f.a.b<S, t<p<List<T>, o>>> b() {
        return this.f39406a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final h.f.a.b<S, t<p<List<T>, o>>> g() {
        return new b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final h.f.a.b<S, t<p<List<T>, o>>> h() {
        h.f.a.b<S, t<p<List<T>, o>>> b2 = b();
        if (b2 != null) {
            return new a(b2);
        }
        return null;
    }

    static final class a extends m implements h.f.a.b<S, t<p<? extends List<? extends T>, ? extends o>>> {
        final /* synthetic */ h.f.a.b $loadMoreBlock;

        static {
            Covode.recordClassIndex(24188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.b bVar) {
            super(1);
            this.$loadMoreBlock = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return this.$loadMoreBlock.invoke(obj);
        }
    }

    static final class b extends m implements h.f.a.b<S, t<p<? extends List<? extends T>, ? extends o>>> {
        final /* synthetic */ CommonListViewModel this$0;

        static {
            Covode.recordClassIndex(24189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommonListViewModel commonListViewModel) {
            super(1);
            this.this$0 = commonListViewModel;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return this.this$0.a().invoke(obj);
        }
    }
}
