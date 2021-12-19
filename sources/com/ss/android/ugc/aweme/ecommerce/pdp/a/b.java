package com.ss.android.ugc.aweme.ecommerce.pdp.a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.SpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;

public final class b extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final Fragment f86348d;

    static {
        Covode.recordClassIndex(54057);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f86349a = new d();

        static {
            Covode.recordClassIndex(54061);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new SpanVH(viewGroup2);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f86350a = new f();

        static {
            Covode.recordClassIndex(54063);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new ShopProfileVH(viewGroup2);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f86351a = new m();

        static {
            Covode.recordClassIndex(54071);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new ProductDescImageViewHolder(viewGroup2);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f86352a = new o();

        static {
            Covode.recordClassIndex(54073);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PdpInfoViewHolder(viewGroup2);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f86353a = new q();

        static {
            Covode.recordClassIndex(54075);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PdpReviewHeadViewHolder(viewGroup2);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f86354a = new s();

        static {
            Covode.recordClassIndex(54077);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PdpReviewViewHolder(viewGroup2);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.a.b$b  reason: collision with other inner class name */
    static final class C2082b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2082b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PdpSelectViewHolder(viewGroup2, this.this$0.f86348d);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.vh.h);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.o);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.m);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new ProductDescTextViewHolder(viewGroup2, new h.f.a.b<Integer, Object>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.a.b.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(54066);
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

    static final class i extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.n);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new ProductDescVideoViewHolder(viewGroup2, this.this$0.f86348d);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.f);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new PdpHeadViewHolder(viewGroup2, this.this$0.f86348d.getFragmentManager());
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.g);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof ProductDetailReview);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof ReviewItemStruct);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment) {
        super(fragment, new c(), 4);
        h.f.b.l.d(fragment, "");
        this.f86348d = fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        h.f.b.l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbsFullSpanVH) {
            ((AbsFullSpanVH) viewHolder).m();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        h.f.b.l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, new l(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new n(this), null, o.f86352a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new p(this), null, q.f86353a);
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(new r(this), null, s.f86354a);
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(new t(this), null, new C2082b(this));
        com.bytedance.jedi.ext.adapter.b.g unused6 = gVar.a(new c(this), null, d.f86349a);
        com.bytedance.jedi.ext.adapter.b.g unused7 = gVar.a(new e(this), null, f.f86350a);
        com.bytedance.jedi.ext.adapter.b.g unused8 = gVar.a(new g(this), null, new h(this));
        com.bytedance.jedi.ext.adapter.b.g unused9 = gVar.a(new i(this), null, new j(this));
        com.bytedance.jedi.ext.adapter.b.g unused10 = gVar.a(new k(this), null, m.f86351a);
    }
}
