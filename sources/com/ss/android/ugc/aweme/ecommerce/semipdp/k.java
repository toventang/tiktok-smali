package com.ss.android.ugc.aweme.ecommerce.semipdp;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.o;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder;
import com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpInfoVH;
import com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpProfileVH;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class k extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final Fragment f87316d;

    static {
        Covode.recordClassIndex(54799);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class a extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.b);
        }
    }

    static final class b extends m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f87317a = new b();

        static {
            Covode.recordClassIndex(54801);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(viewGroup2.getContext(), R.layout.po, viewGroup2, false);
            l.b(a2, "");
            return new SemiPdpHeaderVH(a2);
        }
    }

    static final class c extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.semipdp.b.a);
        }
    }

    static final class d extends m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f87318a = new d();

        static {
            Covode.recordClassIndex(54803);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(viewGroup2.getContext(), R.layout.qs, viewGroup2, false);
            l.b(a2, "");
            return new SemiPdpInfoVH(a2);
        }
    }

    static final class e extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof o);
        }
    }

    static final class f extends m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f87319a = new f();

        static {
            Covode.recordClassIndex(54805);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(viewGroup2.getContext(), R.layout.qt, viewGroup2, false);
            l.b(a2, "");
            return new SemiPdpProfileVH(a2);
        }
    }

    static final class g extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.m);
        }
    }

    static final class h extends m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(54807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new ProductDescTextViewHolder(viewGroup2, new h.f.a.b<Integer, Object>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.semipdp.k.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(54808);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Object invoke(Integer num) {
                    return this.this$0.this$0.a(num.intValue());
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment) {
        super(fragment, new com.ss.android.ugc.aweme.ecommerce.pdp.a.c(), 4);
        l.d(fragment, "");
        this.f87316d = fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbsFullSpanVH) {
            ((AbsFullSpanVH) viewHolder).m();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, b.f87317a);
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new c(this), null, d.f87318a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new e(this), null, f.f87319a);
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(new g(this), null, new h(this));
    }
}
