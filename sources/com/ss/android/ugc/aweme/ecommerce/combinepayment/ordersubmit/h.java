package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AnnouncementVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.OrderSubmitSpanVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PolicyVH;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.SpanVH;
import com.zhiliaoapp.musically.R;

public final class h extends com.ss.android.ugc.aweme.base.arch.c<Object> {
    static {
        Covode.recordClassIndex(53015);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f84872a = new f();

        static {
            Covode.recordClassIndex(53021);
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
            return new SpanVH(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.h$h  reason: collision with other inner class name */
    static final class C2031h extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2031h f84873a = new C2031h();

        static {
            Covode.recordClassIndex(53023);
        }

        C2031h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new OrderSubmitSpanVH(viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment) {
        super(fragment, new i(), 4);
        h.f.b.l.d(fragment, "");
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84870a = new b();

        static {
            Covode.recordClassIndex(53017);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.p0, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new AnnouncementVH(a2);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.d);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84871a = new d();

        static {
            Covode.recordClassIndex(53019);
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
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.p2, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new PlatformCouponVH(a2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.pdp.vh.h);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.d);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f84874a = new i();

        static {
            Covode.recordClassIndex(53024);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.rd, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new AddressVH(a2);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f84875a = new k();

        static {
            Covode.recordClassIndex(53026);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.rk, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new ProductInfoVH(a2);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f84876a = new m();

        static {
            Covode.recordClassIndex(53028);
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
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.ri, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new PaymentInfoVH(a2);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.e);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f84877a = new o();

        static {
            Covode.recordClassIndex(53030);
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
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.p3, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new PolicyVH(a2);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(53031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.b);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        h.f.b.l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, i.f84874a);
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new j(this), null, k.f84875a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new l(this), null, m.f84876a);
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(new n(this), null, o.f84877a);
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(new p(this), null, b.f84870a);
        com.bytedance.jedi.ext.adapter.b.g unused6 = gVar.a(new c(this), null, d.f84871a);
        com.bytedance.jedi.ext.adapter.b.g unused7 = gVar.a(new e(this), null, f.f84872a);
        com.bytedance.jedi.ext.adapter.b.g unused8 = gVar.a(new g(this), null, C2031h.f84873a);
    }
}
