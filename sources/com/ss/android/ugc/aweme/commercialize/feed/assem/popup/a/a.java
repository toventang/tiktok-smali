package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.b.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdEventViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AbsAdPopUpWebPageVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.r;
import com.ss.android.ugc.aweme.commercialize.feed.assem.s;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.ab;
import java.util.List;
import java.util.Objects;

public abstract class a<RECEIVER extends com.bytedance.tiktok.proxy.d> extends w<RECEIVER> implements com.bytedance.assem.arch.b.i<VideoItemParams> {
    public static final m s = new m((byte) 0);
    public AdPopUpWebPageView r;
    private final h.h t = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, e.INSTANCE, f.INSTANCE, C1675a.INSTANCE);
    private final h.h u = new com.bytedance.ext_power_list.g(ab.a(FeedAdViewModel.class), this, h.INSTANCE, i.INSTANCE, g.INSTANCE);
    private final h.h v = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, k.INSTANCE, l.INSTANCE, j.INSTANCE);
    private final h.h w = new com.bytedance.ext_power_list.g(ab.a(FeedAdEventViewModel.class), this, c.INSTANCE, d.INSTANCE, b.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a$a  reason: collision with other inner class name */
    public static final class C1675a extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final C1675a INSTANCE = new C1675a();

        static {
            Covode.recordClassIndex(45697);
        }

        public C1675a() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<r, r> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(45698);
        }

        public b() {
            super(1);
        }

        public final r invoke(r rVar) {
            h.f.b.l.c(rVar, "");
            return rVar;
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<s, s> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(45703);
        }

        public g() {
            super(1);
        }

        public final s invoke(s sVar) {
            h.f.b.l.c(sVar, "");
            return sVar;
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(45706);
        }

        public j() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(45696);
    }

    /* access modifiers changed from: protected */
    public abstract AbsAdPopUpWebPageVM D();

    /* access modifiers changed from: protected */
    public final VideoPlayViewModel E() {
        return (VideoPlayViewModel) this.t.getValue();
    }

    /* access modifiers changed from: protected */
    public final FeedAdViewModel F() {
        return (FeedAdViewModel) this.u.getValue();
    }

    /* access modifiers changed from: protected */
    public final VideoViewModel G() {
        return (VideoViewModel) this.v.getValue();
    }

    /* access modifiers changed from: protected */
    public final FeedAdEventViewModel H() {
        return (FeedAdEventViewModel) this.w.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract void J();

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    /* renamed from: a */
    public boolean c(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        return true;
    }

    @Override // com.bytedance.assem.arch.b.v
    public void c(View view) {
        h.f.b.l.d(view, "");
    }

    public static final class m {
        static {
            Covode.recordClassIndex(45709);
        }

        private m() {
        }

        public /* synthetic */ m(byte b2) {
            this();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<r>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(45699);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<r> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(45700);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(45701);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(45702);
        }

        public f() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<s>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(45704);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<s> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(45705);
        }

        public i() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(45707);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(45708);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Object> {
        final /* synthetic */ AdPopUpWebPageView $it;
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $openParams$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AdPopUpWebPageView adPopUpWebPageView, a aVar, com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
            super(0);
            this.$it = adPopUpWebPageView;
            this.this$0 = aVar;
            this.$openParams$inlined = bVar;
        }

        @Override // h.f.a.a
        public final Object invoke() {
            return Boolean.valueOf(this.$it.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a.n.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f74119a;

                static {
                    Covode.recordClassIndex(45711);
                }

                {
                    this.f74119a = r1;
                }

                public final void run() {
                    this.f74119a.$it.a(this.f74119a.$openParams$inlined);
                    this.f74119a.this$0.D().f74137m = this.f74119a.$it.getActionMode().f74371i;
                }
            }));
        }
    }

    public final void I() {
        AdPopUpWebPageView adPopUpWebPageView = this.r;
        if (adPopUpWebPageView != null) {
            adPopUpWebPageView.b();
            View s2 = s();
            Objects.requireNonNull(s2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) s2).removeView(adPopUpWebPageView);
        }
        this.r = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams, List list) {
        h.f.b.l.d(videoItemParams, "");
    }

    protected static Bundle a(Aweme aweme, Fragment fragment) {
        Context context;
        Bundle bundle = new Bundle();
        if (!(fragment == null || (context = fragment.getContext()) == null)) {
            h.f.b.l.b(context, "");
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                com.ss.android.ugc.aweme.commercialize.utils.a.a(bundle, aweme, context);
                com.ss.android.ugc.aweme.commercialize.utils.a.b(bundle, aweme, context);
                com.ss.android.ugc.aweme.commercialize.utils.a.c(bundle, aweme, context);
                com.ss.android.ugc.aweme.commercialize.utils.a.a(bundle, context);
            }
        }
        return bundle;
    }
}
