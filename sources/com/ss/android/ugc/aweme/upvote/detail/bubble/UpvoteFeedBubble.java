package com.ss.android.ugc.aweme.upvote.detail.bubble;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.proxy.f;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.g;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.i;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class UpvoteFeedBubble implements h, com.bytedance.hox.a.d, au, com.ss.android.ugc.aweme.upvote.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f142062a;

    /* renamed from: b  reason: collision with root package name */
    public final m f142063b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f142064c = i.a((h.f.a.a) new e(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f142065d = i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private boolean f142066e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f142067f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.upvote.detail.panel.e f142068g;

    public static final class a extends h.f.b.m implements h.f.a.b<g, g> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(92842);
        }

        public a() {
            super(1);
        }

        public final g invoke(g gVar) {
            l.c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(92841);
    }

    public final UpvoteListViewModel a() {
        return (UpvoteListViewModel) this.f142064c.getValue();
    }

    public final a b() {
        return (a) this.f142065d.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.upvote.a.a
    public final void a(String str, boolean z, com.ss.android.ugc.aweme.upvote.event.b bVar) {
        com.ss.android.ugc.aweme.upvote.c.e eVar;
        UpvoteReason a2;
        l.d(bVar, "");
        if (!this.f142066e) {
            a b2 = b();
            d dVar = new d(this);
            l.d(dVar, "");
            b2.f142073b = dVar;
            androidx.lifecycle.i lifecycle = this.f142063b.getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a() != i.b.DESTROYED) {
                f.a.a(this, (AssemViewModel) new com.bytedance.assem.a.a(ab.a(UpvotePublishVM.class), null, u.j.f25671a, u.a(this.f142063b, false), u.c.f25670a, a.INSTANCE, null, null).getValue(), c.f142096a, (k) null, new c(this), 6);
            }
            this.f142063b.getLifecycle().a(this);
            this.f142066e = true;
        }
        if (!l.a((Object) a().f142048b, (Object) str)) {
            this.f142062a.setVisibility(8);
            if (!z) {
                new com.bytedance.tux.g.b(this.f142062a).e(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f96), Integer.valueOf((int) R.string.fdf))).intValue()).b();
                return;
            }
            UpvoteListViewModel a3 = a();
            l.d(bVar, "");
            String str2 = a3.f142048b;
            if (str2 != null) {
                com.ss.android.ugc.aweme.upvote.detail.d.a(str2, a3);
            }
            a3.f142048b = str;
            a3.f142050d = bVar;
            String str3 = a3.f142048b;
            if (str3 != null) {
                l.d(str3, "");
                l.d(a3, "");
                List<com.ss.android.ugc.aweme.upvote.detail.c> list = com.ss.android.ugc.aweme.upvote.detail.d.a().get(str3);
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (!list.contains(a3)) {
                    list.add(a3);
                }
                com.ss.android.ugc.aweme.upvote.detail.d.a().put(str3, list);
                eVar = com.ss.android.ugc.aweme.upvote.detail.b.b(str3);
                if (eVar == null && (a2 = com.ss.android.ugc.aweme.upvote.detail.b.a(str3)) != null) {
                    com.ss.android.ugc.aweme.upvote.detail.d.a(str3, a2, 0, "", null);
                }
            } else {
                eVar = null;
            }
            a3.a(eVar);
            this.f142068g = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.a.a
    public final void a(boolean z) {
        if (this.f142066e) {
            if (z) {
                a.a(b(), false, true);
            } else {
                b().a(true);
                String str = a().f142048b;
                if (str != null) {
                    l.d(str, "");
                    com.ss.android.ugc.aweme.upvote.c.e b2 = com.ss.android.ugc.aweme.upvote.detail.b.b(str);
                    if (b2 != null && b2.getUpvotes().size() > 20) {
                        com.ss.android.ugc.aweme.upvote.detail.b.a(str, com.ss.android.ugc.aweme.upvote.c.e.copy$default(b2, b2.getUpvotes().subList(0, 20), 20, true, 0, null, 24, null), true);
                    }
                }
            }
            a();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        b().d();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        b().e();
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ UpvoteFeedBubble this$0;

        static {
            Covode.recordClassIndex(92843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UpvoteFeedBubble upvoteFeedBubble) {
            super(0);
            this.this$0 = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.f142062a, this.this$0.a());
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f142063b.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    static final class e extends h.f.b.m implements h.f.a.a<UpvoteListViewModel> {
        final /* synthetic */ UpvoteFeedBubble this$0;

        static {
            Covode.recordClassIndex(92846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UpvoteFeedBubble upvoteFeedBubble) {
            super(0);
            this.this$0 = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ UpvoteListViewModel invoke() {
            UpvoteListViewModel a2 = UpvoteListViewModel.a.a(this.this$0.f142063b);
            a2.a().observe(this.this$0.f142063b, new a(this));
            return a2;
        }

        static final class a<T> implements androidx.lifecycle.u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f142069a;

            static {
                Covode.recordClassIndex(92847);
            }

            a(e eVar) {
                this.f142069a = eVar;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                UpvoteFeedBubble upvoteFeedBubble = this.f142069a.this$0;
                if (upvoteFeedBubble.a().c()) {
                    upvoteFeedBubble.f142062a.setVisibility(8);
                    return;
                }
                upvoteFeedBubble.c();
                a.a(upvoteFeedBubble.b(), true, false);
                upvoteFeedBubble.f142062a.setVisibility(0);
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Context context = this.f142062a.getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null) {
            Hox.a.a(eVar).b("For You", this);
            this.f142067f = false;
        }
    }

    public final void c() {
        Context context = this.f142062a.getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null && !this.f142067f) {
            Hox.a.a(eVar).a("For You", this);
            this.f142067f = true;
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        b().e();
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        l.d(bundle, "");
        b().d();
    }

    static final class d extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ UpvoteFeedBubble this$0;

        static {
            Covode.recordClassIndex(92845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UpvoteFeedBubble upvoteFeedBubble) {
            super(1);
            this.this$0 = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            Long l2;
            String str2;
            View view2 = view;
            l.d(view2, "");
            if (!com.ss.android.ugc.aweme.l.a.a.a(view2, 1200)) {
                UpvoteFeedBubble upvoteFeedBubble = this.this$0;
                boolean b2 = upvoteFeedBubble.a().b();
                p[] pVarArr = new p[4];
                com.ss.android.ugc.aweme.upvote.event.b bVar = upvoteFeedBubble.a().f142050d;
                if (bVar != null) {
                    str = bVar.f142221a;
                } else {
                    str = null;
                }
                pVarArr[0] = h.v.a(str, "enter_from");
                com.ss.android.ugc.aweme.upvote.c.e value = upvoteFeedBubble.a().a().getValue();
                if (value != null) {
                    l2 = Long.valueOf(value.getTotal());
                } else {
                    l2 = null;
                }
                pVarArr[1] = h.v.a(l2, "recommend_cnt");
                String str3 = "0";
                if (b2) {
                    str2 = str3;
                } else {
                    str2 = "1";
                }
                pVarArr[2] = h.v.a(str2, "with_repost_button");
                if (b2) {
                    str3 = "1";
                }
                pVarArr[3] = h.v.a(str3, "is_self");
                r.a("recommend_entrance_click", pVarArr);
                this.this$0.a((String) null);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.a.a
    public final void a(String str) {
        String str2;
        androidx.fragment.app.i supportFragmentManager;
        int i2;
        if (this.f142066e && (str2 = a().f142048b) != null && !UpvoteListViewModel.f142045e) {
            UpvoteListViewModel.f142045e = true;
            String str3 = a().f142049c;
            com.ss.android.ugc.aweme.upvote.detail.panel.e eVar = this.f142068g;
            l.d(str2, "");
            l.d(str3, "");
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            com.ss.android.ugc.aweme.upvote.detail.panel.e eVar2 = null;
            if (!(validTopActivity instanceof androidx.fragment.app.e)) {
                validTopActivity = null;
            }
            androidx.fragment.app.e eVar3 = (androidx.fragment.app.e) validTopActivity;
            if (!(eVar3 == null || (supportFragmentManager = eVar3.getSupportFragmentManager()) == null)) {
                if (eVar != null) {
                    Bundle arguments = eVar.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("is_first_time_open", false);
                    }
                } else {
                    eVar = new com.ss.android.ugc.aweme.upvote.detail.panel.e();
                    Bundle bundle = new Bundle();
                    bundle.putString("aid", str2);
                    bundle.putString("vm", str3);
                    bundle.putString("upvote_id", str);
                    bundle.putBoolean("is_first_time_open", true);
                    eVar.setArguments(bundle);
                }
                Resources resources = eVar3.getResources();
                l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i2 = displayMetrics.heightPixels;
                } else {
                    i2 = 0;
                }
                a.C1112a c2 = new a.C1112a().a(2).a(false).a((Fragment) eVar).b(false).c();
                double d2 = (double) i2;
                Double.isNaN(d2);
                Double.isNaN(d2);
                c2.a((int) (0.5d * d2), (int) (d2 * 0.73d)).a((DialogInterface.OnDismissListener) eVar).f45299a.show(supportFragmentManager, "UpvoteDetailPanelFragment");
                eVar2 = eVar;
            }
            this.f142068g = eVar2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>>, z> {
        final /* synthetic */ UpvoteFeedBubble this$0;

        static {
            Covode.recordClassIndex(92844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UpvoteFeedBubble upvoteFeedBubble) {
            super(2);
            this.this$0 = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends p<? extends Integer, ? extends String>> aVar2 = aVar;
            l.d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || !l.a(t.component2(), (Object) this.this$0.a().f142048b))) {
                this.this$0.c();
                a.a(this.this$0.b(), false, true);
            }
            return z.f158842a;
        }
    }

    public UpvoteFeedBubble(FrameLayout frameLayout, m mVar) {
        l.d(frameLayout, "");
        l.d(mVar, "");
        this.f142062a = frameLayout;
        this.f142063b = mVar;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
