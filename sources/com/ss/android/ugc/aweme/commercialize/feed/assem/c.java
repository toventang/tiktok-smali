package com.ss.android.ugc.aweme.commercialize.feed.assem;

import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.g.b;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.ab;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class c extends q<c> {
    static final /* synthetic */ h.k.i[] r = {new h.f.b.y(c.class, "adInteractiveVM", "getAdInteractiveVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/AdInteractiveVM;", 0)};
    public static final l s = new l((byte) 0);
    private final h.h.d t;
    private final h.h u;
    private final h.h v;
    private final h.h w;
    private final h.h x;
    private final h.h y;

    public static final class b extends h.f.b.m implements h.f.a.b<p, p> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(45658);
        }

        public b() {
            super(1);
        }

        public final p invoke(p pVar) {
            h.f.b.l.c(pVar, "");
            return pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.assem.c$c  reason: collision with other inner class name */
    public static final class C1674c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final C1674c INSTANCE = new C1674c();

        static {
            Covode.recordClassIndex(45659);
        }

        public C1674c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(45662);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<s, s> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(45665);
        }

        public i() {
            super(1);
        }

        public final s invoke(s sVar) {
            h.f.b.l.c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(45654);
    }

    private final VideoViewModel I() {
        return (VideoViewModel) this.u.getValue();
    }

    private final FeedAdViewModel J() {
        return (FeedAdViewModel) this.w.getValue();
    }

    public final AdInteractiveVM D() {
        return (AdInteractiveVM) this.t.a(this, r[0]);
    }

    public final VideoPlayViewModel E() {
        return (VideoPlayViewModel) this.v.getValue();
    }

    public final com.ss.android.ugc.aweme.ad.feed.interactive.e F() {
        return (com.ss.android.ugc.aweme.ad.feed.interactive.e) this.x.getValue();
    }

    public static final class l {
        static {
            Covode.recordClassIndex(45668);
        }

        private l() {
        }

        public /* synthetic */ l(byte b2) {
            this();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(45660);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(45661);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(45663);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(45664);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<s>> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(45666);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<s> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(45667);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public final void G() {
        F().g();
    }

    public final void H() {
        F().f();
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f74091a = new m();

        static {
            Covode.recordClassIndex(45669);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.c invoke() {
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
            if (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c)) {
                return null;
            }
            return a2;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.interactive.e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(45670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.interactive.e invoke() {
            View s = this.this$0.s();
            Objects.requireNonNull(s, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.interactive.IFeedAdInteractiveLayout");
            return s;
        }
    }

    public static final class o implements com.ss.android.ugc.aweme.ad.feed.interactive.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f74093b;

        static {
            Covode.recordClassIndex(45671);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.interactive.f
        public final void a() {
            this.f74092a.E().h();
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.interactive.f
        public final void b() {
            this.f74092a.E().g();
        }

        o(c cVar, VideoItemParams videoItemParams) {
            this.f74092a = cVar;
            this.f74093b = videoItemParams;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(45655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class aa<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f74090a;

        static {
            Covode.recordClassIndex(45656);
        }

        aa(String str) {
            this.f74090a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!com.ss.android.ugc.aweme.commercialize.g.b.a(Uri.parse(this.f74090a))) {
                com.ss.android.ugc.aweme.commercialize.g.b.a(this.f74090a, new b.a() {
                    /* class com.ss.android.ugc.aweme.commercialize.feed.assem.c.aa.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(45657);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void b() {
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, D(), d.f74105a, com.bytedance.assem.arch.viewModel.l.b(), p.f74094a, 4);
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.b.w
    public final void z() {
        h.f.b.l.d("onInActive", "");
        super.z();
        F().a(null, null);
        F().setVisibility(8);
    }

    public c() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(AdInteractiveVM.class);
        this.t = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.u = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, C1674c.INSTANCE);
        this.v = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
        this.w = new com.bytedance.ext_power_list.g(ab.a(FeedAdViewModel.class), this, j.INSTANCE, k.INSTANCE, i.INSTANCE);
        this.x = h.i.a((h.f.a.a) new n(this));
        this.y = h.i.a((h.f.a.a) m.f74091a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.q, com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(VideoItemParams videoItemParams) {
        return c(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.q
    public final boolean a(VideoItemParams videoItemParams) {
        Aweme aweme;
        h.f.b.l.d(videoItemParams, "");
        com.ss.android.ugc.aweme.ad.feed.c cVar = (com.ss.android.ugc.aweme.ad.feed.c) this.y.getValue();
        if (cVar == null) {
            return false;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) D().g();
        if (videoItemParams2 != null) {
            aweme = videoItemParams2.mAweme;
        } else {
            aweme = null;
        }
        if (cVar.c(aweme)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        AdGestureGuidance gestureGuidance;
        UrlModel image;
        List<String> urlList;
        VideoItemParams videoItemParams2 = videoItemParams;
        h.f.b.l.d(videoItemParams2, "");
        h.f.b.l.d("onBind", "");
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && (gestureGuidance = adInteractionData.getGestureGuidance()) != null && (image = gestureGuidance.getImage()) != null && (urlList = image.getUrlList()) != null && (!urlList.isEmpty())) {
            String str = urlList.get(0);
            h.f.b.l.b(str, "");
            b.i.b(new aa(str), b.i.f4824a);
            F().a(videoItemParams2.mAweme, str);
            F().setOperator(new o(this, videoItemParams2));
            F().setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        h.f.b.l.d("onViewCreated", "");
        f.a.a(this, I(), e.f74106a, com.bytedance.assem.arch.viewModel.l.b(), v.f74100a, 4);
        f.a.a(this, I(), k.f74112a, com.bytedance.assem.arch.viewModel.l.b(), x.f74102a, 4);
        f.a.a(this, E(), l.f74113a, com.bytedance.assem.arch.viewModel.l.b(), y.f74103a, 4);
        f.a.a(this, E(), m.f74114a, com.bytedance.assem.arch.viewModel.l.b(), z.f74104a, 4);
        f.a.a(this, J(), n.f74115a, com.bytedance.assem.arch.viewModel.l.b(), q.f74095a, 4);
        f.a.a(this, J(), f.f74107a, com.bytedance.assem.arch.viewModel.l.b(), r.f74096a, 4);
        f.a.a(this, J(), g.f74108a, com.bytedance.assem.arch.viewModel.l.b(), s.f74097a, 4);
        f.a.a(this, J(), h.f74109a, com.bytedance.assem.arch.viewModel.l.b(), t.f74098a, 4);
        f.a.a(this, I(), i.f74110a, com.bytedance.assem.arch.viewModel.l.b(), u.f74099a, 4);
        f.a.a(this, I(), j.f74111a, com.bytedance.assem.arch.viewModel.l.b(), w.f74101a, 4);
    }

    static final class s extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f74097a = new s();

        static {
            Covode.recordClassIndex(45675);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.G();
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f74098a = new t();

        static {
            Covode.recordClassIndex(45676);
        }

        t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.H();
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f74099a = new u();

        static {
            Covode.recordClassIndex(45677);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.G();
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f74101a = new w();

        static {
            Covode.recordClassIndex(45679);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.H();
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f74094a = new p();

        static {
            Covode.recordClassIndex(45672);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            h.f.b.l.d("show", "");
            cVar2.F().a();
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends ao>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f74095a = new q();

        static {
            Covode.recordClassIndex(45673);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends ao> aVar) {
            T t;
            c cVar2 = cVar;
            com.bytedance.assem.arch.extensions.a<? extends ao> aVar2 = aVar;
            h.f.b.l.d(cVar2, "");
            h.f.b.l.d("onBindTextureSizeEvent", "");
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            cVar2.F().setVideoSize(t);
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f74096a = new r();

        static {
            Covode.recordClassIndex(45674);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            c cVar2 = cVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(cVar2, "");
            if (aVar2 == null || !aVar2.f25631b.booleanValue()) {
                cVar2.H();
            } else {
                cVar2.G();
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f74102a = new x();

        static {
            Covode.recordClassIndex(45680);
        }

        x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.F().c();
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f74103a = new y();

        static {
            Covode.recordClassIndex(45681);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.F().e();
            return h.z.f158842a;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f74104a = new z();

        static {
            Covode.recordClassIndex(45682);
        }

        z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.F().d();
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f74100a = new v();

        static {
            Covode.recordClassIndex(45678);
        }

        v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            AdInteractionData adInteractionData;
            UrlModel popupImage;
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            h.f.b.l.d("onPageSelectedEvent", "");
            cVar2.F().b();
            VideoItemParams videoItemParams = (VideoItemParams) cVar2.D().g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adInteractionData = awemeRawAd.getAdInteractionData()) == null || (popupImage = adInteractionData.getPopupImage()) == null)) {
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(popupImage));
                a2.f39906b = cVar2.ar_();
                com.bytedance.lighten.a.r.b(a2.b());
            }
            return h.z.f158842a;
        }
    }
}
