package com.ss.android.ugc.aweme.favorites.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.c.f;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ae;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class VideoAllFavoriteContentFragment extends com.ss.android.ugc.aweme.favorites.f.a implements com.bytedance.assem.arch.viewModel.h, f.g {

    /* renamed from: e  reason: collision with root package name */
    public Long f90743e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f90744f = h.i.a((h.f.a.a) c.f90747a);

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90745g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f90746h;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56987);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90749a = new f();

        static {
            Covode.recordClassIndex(56991);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public final /* synthetic */ class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f90756a;

        static {
            Covode.recordClassIndex(57007);
        }

        public m(h.f.a.b bVar) {
            this.f90756a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.b.l.b(this.f90756a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(56985);
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f90746h == null) {
            this.f90746h = new SparseArray();
        }
        View view = (View) this.f90746h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f90746h.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f90746h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final f.a.b.a c() {
        return (f.a.b.a) this.f90744f.getValue();
    }

    public final VideoCollectionContentViewModel d() {
        return (VideoCollectionContentViewModel) this.f90745g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a
    public final int e() {
        return R.layout.zo;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
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

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
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

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(Aweme aweme) {
        h.f.b.l.d(aweme, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            r.a("remove_unavailable_from_collection", v.a("collection_video", "enter_from"));
            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
            bVar.a(false);
            bVar.b(activity.getResources().getString(R.string.buj));
            bVar.b(R.string.buh);
            com.bytedance.tux.dialog.b.c.a(bVar, new h(this, activity, aweme));
            new com.bytedance.tux.dialog.a(bVar).b().show();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90747a = new c();

        static {
            Covode.recordClassIndex(56988);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c().a();
        br_();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56986);
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

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TuxStatusView $statusView;

        static {
            Covode.recordClassIndex(57004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TuxStatusView tuxStatusView) {
            super(0);
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$statusView.a();
            TuxStatusView tuxStatusView = this.$statusView;
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            return z.f158842a;
        }
    }

    private final void i() {
        f.a.b.b a2 = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), f.f90749a);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, c());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.favorites.api.f a2 = com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_CONTENT");
        if (a2 != null && a2.f90461a == 3) {
            d().c(true);
            i();
            com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", a2);
        }
    }

    public VideoAllFavoriteContentFragment() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f90745g = bVar;
    }

    public final void h() {
        Resources resources;
        Resources resources2;
        CharSequence charSequence = null;
        if (this.f90743e != null) {
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            if (!(context == null || (resources2 = context.getResources()) == null)) {
                charSequence = resources2.getText(R.string.bu_);
            }
            a(this, sb.append(charSequence).append(" (").append(this.f90743e).append(')').toString());
            return;
        }
        Context context2 = getContext();
        if (!(context2 == null || (resources = context2.getResources()) == null)) {
            charSequence = resources.getText(R.string.bu_);
        }
        a(this, String.valueOf(charSequence));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ VideoAllFavoriteContentFragment this$0;

        static {
            Covode.recordClassIndex(56989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment) {
            super(1);
            this.this$0 = videoAllFavoriteContentFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            this.this$0.f();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoAllFavoriteContentFragment f90748a;

        static {
            Covode.recordClassIndex(56990);
        }

        e(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment) {
            this.f90748a = videoAllFavoriteContentFragment;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long l2;
            d.a aVar;
            VideoAllFavoriteContentFragment videoAllFavoriteContentFragment = this.f90748a;
            com.ss.android.ugc.aweme.favorites.api.d dVar = ((com.ss.android.ugc.aweme.favorites.api.b) obj).f90445a;
            if (dVar == null || (aVar = dVar.f90453e) == null) {
                l2 = null;
            } else {
                l2 = aVar.f90454a;
            }
            videoAllFavoriteContentFragment.f90743e = l2;
            this.f90748a.h();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ androidx.fragment.app.e $activity$inlined;
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ VideoAllFavoriteContentFragment this$0;

        static {
            Covode.recordClassIndex(56993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, androidx.fragment.app.e eVar, Aweme aweme) {
            super(1);
            this.this$0 = videoAllFavoriteContentFragment;
            this.$activity$inlined = eVar;
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.fbo, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f90750a;

                static {
                    Covode.recordClassIndex(56994);
                }

                {
                    this.f90750a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    com.ss.android.ugc.aweme.favorites.e.k kVar = new com.ss.android.ugc.aweme.favorites.e.j().f90621b;
                    String aid = this.f90750a.$aweme$inlined.getAid();
                    h.f.b.l.b(aid, "");
                    f.a.b.b a2 = kVar.b(aid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.h.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90751a;

                        static {
                            Covode.recordClassIndex(56995);
                        }

                        {
                            this.f90751a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            Long l2 = this.f90751a.f90750a.this$0.f90743e;
                            if (l2 != null) {
                                long longValue = l2.longValue();
                                this.f90751a.f90750a.this$0.f90743e = Long.valueOf(longValue - 1);
                                this.f90751a.f90750a.this$0.h();
                            }
                            com.ss.android.ugc.aweme.account.b.a();
                            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                            h.f.b.l.b(e2, "");
                            r.a("cancel_favourite_video", v.a("collection_video", "enter_from"), v.a("unavailable_popup", "enter_method"), v.a(this.f90751a.f90750a.$aweme$inlined.getAuthorUid(), "author_id"), v.a(this.f90751a.f90750a.$aweme$inlined.getAid(), "aweme_id"), v.a(e2.getCurUserId(), "user_id"));
                            this.f90751a.f90750a.this$0.d().c(true);
                            com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", new com.ss.android.ugc.aweme.favorites.api.f(3, null, null, null, null, null, null, null, 254));
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.h.AnonymousClass1.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90752a;

                        static {
                            Covode.recordClassIndex(56996);
                        }

                        {
                            this.f90752a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            new com.bytedance.tux.g.b(this.f90752a.f90750a.$activity$inlined).e(R.string.bp3).b();
                        }
                    });
                    h.f.b.l.b(a2, "");
                    f.a.j.a.a(a2, this.f90750a.this$0.c());
                    aVar2.a().dismiss();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>() {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(56997);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    aVar2.a().dismiss();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ VideoAllFavoriteContentFragment this$0;

        static {
            Covode.recordClassIndex(56998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, View view) {
            super(1);
            this.this$0 = videoAllFavoriteContentFragment;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass1.f90753a);
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass2.f90754a);
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.i.AnonymousClass3 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(57001);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.a8i);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.favorites.c.f.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.favorites.c.f();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ VideoAllFavoriteContentFragment this$0;

        static {
            Covode.recordClassIndex(57005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, TuxStatusView tuxStatusView) {
            super(1);
            this.this$0 = videoAllFavoriteContentFragment;
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.$statusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(57006);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.d().c(true);
                    return z.f158842a;
                }
            }));
            TuxStatusView tuxStatusView = this.$statusView;
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a>, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ TuxStatusView $statusView;

        static {
            Covode.recordClassIndex(57002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TuxStatusView tuxStatusView, Context context) {
            super(1);
            this.$statusView = tuxStatusView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list) {
            List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list2 = list;
            h.f.b.l.d(list2, "");
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.$statusView;
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string = this.$context.getString(R.string.bsy);
                h.f.b.l.b(string, "");
                TuxStatusView.c a2 = cVar.a(string);
                String string2 = this.$context.getString(R.string.bsx);
                h.f.b.l.b(string2, "");
                tuxStatusView.setStatus(a2.a((CharSequence) string2).a(com.bytedance.tux.c.c.a(AnonymousClass1.f90755a)));
                TuxStatusView tuxStatusView2 = this.$statusView;
                h.f.b.l.b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(0);
            } else {
                TuxStatusView tuxStatusView3 = this.$statusView;
                h.f.b.l.b(tuxStatusView3, "");
                tuxStatusView3.setVisibility(8);
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ View $itemView;
        final /* synthetic */ VideoAllFavoriteContentFragment this$0;

        static {
            Covode.recordClassIndex(56992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, View view, Aweme aweme) {
            super(1);
            this.this$0 = videoAllFavoriteContentFragment;
            this.$itemView = view;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            ArrayList arrayList;
            com.ss.android.ugc.aweme.favorites.viewmodel.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            List<com.ss.android.ugc.aweme.favorites.viewmodel.a> a2 = dVar2.f91007a.a();
            if (a2 != null) {
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) a2, 10));
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f91001a);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            boolean z = dVar2.f91009c;
            com.ss.android.ugc.aweme.profile.presenter.q<?, ?> d2 = ae.f115954a.d();
            d2.a(arrayList, z);
            com.ss.android.ugc.aweme.feed.x.ae.f95296a = d2;
            View view = this.$itemView;
            androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), this.$itemView.getHeight());
            h.f.b.l.b(b2, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(this.this$0.getActivity(), "aweme://aweme/detail/");
            Bundle bundle = new Bundle();
            bundle.putString("id", this.$aweme.getAid());
            bundle.putString("video_from", "from_profile_other");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            bundle.putString("userid", g2.getCurUserId());
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            bundle.putString("sec_userid", g3.getCurSecUserId());
            bundle.putString("refer", "collection_video");
            bundle.putInt("video_type", 4);
            buildRoute.withParam(bundle).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true).open();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(View view, Aweme aweme) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(aweme, "");
        VideoCollectionContentViewModel d2 = d();
        g gVar = new g(this, view, aweme);
        h.f.b.l.d(d2, "");
        h.f.b.l.d(gVar, "");
        h.a.a(d2, gVar);
    }

    private static /* synthetic */ void a(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, String str) {
        d dVar = new d(videoAllFavoriteContentFragment);
        Context context = videoAllFavoriteContentFragment.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.title);
            h.f.b.l.b(findViewById, "");
            ((TextView) findViewById).setText(str);
            activity.findViewById(R.id.qb).setOnClickListener(new m(dVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        h();
        com.bytedance.assem.arch.extensions.d.a(this, new i(this, view));
        i();
        TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.e_o);
        Context context = view.getContext();
        VideoCollectionContentViewModel d2 = d();
        h.k.k kVar = ad.f90818a;
        j jVar = new j(tuxStatusView, context);
        AssemViewModel.a(d2, kVar, null, new l(this, tuxStatusView), new k(tuxStatusView), jVar, 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
