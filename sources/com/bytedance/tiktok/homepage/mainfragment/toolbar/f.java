package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.ax;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel;
import com.ss.android.ugc.aweme.recommend.o;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.ug.guide.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.r;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;

public final class f extends c implements AwemeChangeCallBack.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f44221a = {new r(f.class, "isMainPageVisible", "isMainPageVisible()Z", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final b f44222k = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public TuxIconView f44223b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f44224c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f44225d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.a f44226e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.a f44227f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.a f44228g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.a f44229h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.a f44230i;

    /* renamed from: j  reason: collision with root package name */
    final b f44231j;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f44232l = h.i.a((h.f.a.a) j.f44241a);

    /* renamed from: m  reason: collision with root package name */
    private u<Aweme> f44233m;
    private final List<com.ss.android.ugc.aweme.search.model.a> n;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h.e u;

    static {
        Covode.recordClassIndex(27093);
    }

    private final u<Boolean> i() {
        return (u) this.o.getValue();
    }

    private final u<Boolean> j() {
        return (u) this.p.getValue();
    }

    private final u<Boolean> k() {
        return (u) this.q.getValue();
    }

    private final u<Boolean> l() {
        return (u) this.r.getValue();
    }

    private final u<Boolean> m() {
        return (u) this.s.getValue();
    }

    private final u<Boolean> n() {
        return (u) this.t.getValue();
    }

    private boolean r() {
        return ((Boolean) this.u.a(this, f44221a[0])).booleanValue();
    }

    public final void a(boolean z) {
        this.u.a(f44221a[0], Boolean.valueOf(z));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388629;
    }

    /* access modifiers changed from: package-private */
    public final ISearchService e() {
        return (ISearchService) this.f44232l.getValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(27095);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f44236a = new c();

        static {
            Covode.recordClassIndex(27096);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.h();
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f44237a;

                static {
                    Covode.recordClassIndex(27099);
                }

                {
                    this.f44237a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f44237a.this$0.a(this.f44237a.this$0.f44229h);
                    }
                }
            };
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f44238a;

                static {
                    Covode.recordClassIndex(27102);
                }

                {
                    this.f44238a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f44238a.this$0.a(this.f44238a.this$0.f44230i);
                    }
                }
            };
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f44239a;

                static {
                    Covode.recordClassIndex(27104);
                }

                {
                    this.f44239a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        this.f44239a.this$0.a(this.f44239a.this$0.f44226e);
                    }
                }
            };
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f44240a;

                static {
                    Covode.recordClassIndex(27106);
                }

                {
                    this.f44240a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    h.f.b.l.b(bool, "");
                    if (bool.booleanValue()) {
                        this.f44240a.this$0.f44227f.f121497a = true;
                        return;
                    }
                    this.f44240a.this$0.f44226e.f121497a = false;
                    this.f44240a.this$0.a(this.f44240a.this$0.f44227f);
                }
            };
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<ISearchService> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f44241a = new j();

        static {
            Covode.recordClassIndex(27107);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchService invoke() {
            return SearchServiceImpl.t();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f44243a;

                static {
                    Covode.recordClassIndex(27110);
                }

                {
                    this.f44243a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    com.ss.android.ugc.aweme.search.model.a aVar = this.f44243a.this$0.f44228g;
                    h.f.b.l.b(bool, "");
                    aVar.f121497a = bool.booleanValue();
                    if (!bool.booleanValue()) {
                        this.f44243a.this$0.a(this.f44243a.this$0.f44228g);
                    }
                }
            };
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<u<Boolean>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(27111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<Boolean> invoke() {
            return new u(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f44244a;

                static {
                    Covode.recordClassIndex(27112);
                }

                {
                    this.f44244a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    h.f.b.l.b(bool, "");
                    if (bool.booleanValue()) {
                        this.f44244a.this$0.f();
                    }
                }
            };
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f44242a;

        static {
            Covode.recordClassIndex(27108);
        }

        k(f fVar) {
            this.f44242a = fVar;
        }

        public final /* synthetic */ void run() {
            com.bytedance.tux.tooltip.a aVar = this.f44242a.f44224c;
            if (!(aVar == null && (aVar = this.f44242a.g()) == null) && !aVar.isShowing()) {
                aVar.a();
            }
        }
    }

    private static boolean o() {
        boolean z = ax.f109172a;
        boolean a2 = j.a.a();
        boolean b2 = com.ss.android.ugc.aweme.feed.guide.i.b();
        if (z || (a2 && b2)) {
            return false;
        }
        return true;
    }

    private final void p() {
        androidx.fragment.app.e activity;
        if (this.f44233m == null && (activity = this.f44231j.getActivity()) != null && this.f44233m == null) {
            this.f44233m = AwemeChangeCallBack.b(activity, activity, this);
        }
    }

    private final void q() {
        androidx.fragment.app.e activity;
        if (this.f44233m != null && (activity = this.f44231j.getActivity()) != null) {
            AwemeChangeCallBack.a(activity, this.f44233m);
            this.f44233m = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f44245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f44246b;

        static {
            Covode.recordClassIndex(27113);
        }

        n(f fVar, androidx.fragment.app.e eVar) {
            this.f44245a = fVar;
            this.f44246b = eVar;
        }

        public final void run() {
            Context context;
            TuxIconView tuxIconView = this.f44245a.f44223b;
            Activity activity = null;
            if (tuxIconView != null && tuxIconView.getContext() != null) {
                TuxIconView tuxIconView2 = this.f44245a.f44223b;
                if (tuxIconView2 != null) {
                    context = tuxIconView2.getContext();
                } else {
                    context = null;
                }
                if (context instanceof Activity) {
                    activity = context;
                }
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isFinishing()) {
                    com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
                    DialogContext.a aVar2 = new DialogContext.a(this.f44246b);
                    aVar2.f33424a = b.a.SEARCH_ICON_TIPS;
                    aVar.a(aVar2.a(new b.c(this) {
                        /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.f.n.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ n f44247a;

                        static {
                            Covode.recordClassIndex(27114);
                        }

                        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                        public final void a() {
                            androidx.fragment.app.e activity;
                            f fVar = this.f44247a.f44245a;
                            if (fVar.e().l() && (activity = fVar.f44231j.getActivity()) != null) {
                                activity.runOnUiThread(new k(fVar));
                            }
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f44247a = r1;
                        }

                        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                        public final void a(List<Integer> list) {
                            if (list != null) {
                                Integer.valueOf(list.size());
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }

                        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                        public final void a(List<Integer> list, int i2) {
                            if (list != null) {
                                Integer.valueOf(list.size());
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        }
                    }));
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        ViewParent viewParent;
        MethodCollector.i(5277);
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        ViewGroup viewGroup = null;
        if (activity == null) {
            MethodCollector.o(5277);
            return null;
        }
        if (com.ss.android.ugc.aweme.experiment.ax.b()) {
            View h2 = HomePageUIFrameServiceImpl.e().h(activity);
            if (!(h2 instanceof TuxIconView)) {
                h2 = null;
            }
            TuxIconView tuxIconView = (TuxIconView) h2;
            this.f44223b = tuxIconView;
            if (tuxIconView != null) {
                viewParent = tuxIconView.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = viewParent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f44223b);
            }
        } else {
            View i2 = HomePageUIFrameServiceImpl.e().i(activity);
            if (i2 instanceof TuxIconView) {
                viewGroup = i2;
            }
            this.f44223b = viewGroup;
        }
        if (e().l()) {
            g();
            f();
        }
        TuxIconView tuxIconView2 = this.f44223b;
        MethodCollector.o(5277);
        return tuxIconView2;
    }

    public final com.bytedance.tux.tooltip.a g() {
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        if (activity == null) {
            return null;
        }
        com.bytedance.tux.tooltip.a.b.a aVar = new com.bytedance.tux.tooltip.a.b.a(activity);
        TuxIconView tuxIconView = this.f44223b;
        if (tuxIconView == null) {
            h.f.b.l.b();
        }
        com.bytedance.tux.tooltip.a d2 = ((com.bytedance.tux.tooltip.a.b.a) aVar.b(tuxIconView).a(com.bytedance.tux.tooltip.h.BOTTOM).a(5000L).d(com.ss.android.ugc.aweme.base.utils.n.a(8.0d))).e(R.string.hf).a(true).a(c.f44236a).b(new d(this)).d();
        this.f44224c = d2;
        return d2;
    }

    public final void h() {
        e().b(true);
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        if (activity != null) {
            FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ae.a(activity, (ad.b) null).a(FeedPanelStateViewModel.class);
            feedPanelStateViewModel.f124395a.removeObserver(i());
            feedPanelStateViewModel.f124405k.removeObserver(j());
            feedPanelStateViewModel.f124400f.removeObserver(k());
            RecommendUsersDialogViewModel a2 = RecommendUsersDialogViewModel.a.a(activity);
            a2.f120057a.removeObserver(l());
            a2.f120058b.removeObserver(m());
            FeedSearchIconViewModel a3 = e().a(activity);
            a3.d();
            a3.c().removeObserver(n());
            q();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        String g2 = this.f44231j.g();
        if ((TextUtils.equals(g2, "homepage_hot") || TextUtils.equals(g2, "homepage_follow")) && !in.d() && (e().k() || MusicDspServiceImpl.g().c())) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean z;
        TuxIconView tuxIconView;
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        if (activity != null) {
            Aweme a2 = AwemeChangeCallBack.a(activity);
            if (a2 == null || !a2.isAd()) {
                q();
                if (!(!this.f44225d) || r()) {
                    ac a3 = ae.a(activity, (ad.b) null).a(FeedPanelStateViewModel.class);
                    h.f.b.l.b(a3, "");
                    FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) a3;
                    boolean o2 = o();
                    if (h.f.b.l.a((Object) feedPanelStateViewModel.f124395a.getValue(), (Object) true) || o2) {
                        a(feedPanelStateViewModel.f124395a, activity, i());
                        return;
                    }
                    RecommendUsersDialogViewModel a4 = RecommendUsersDialogViewModel.a.a(activity);
                    if (!o.b() || !o.a(a2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean a5 = a4.a();
                    if (!z || !a5) {
                        ac a6 = ae.a(activity, (ad.b) null).a(FeedPanelStateViewModel.class);
                        h.f.b.l.b(a6, "");
                        FeedPanelStateViewModel feedPanelStateViewModel2 = (FeedPanelStateViewModel) a6;
                        this.f44229h.f121497a = h.f.b.l.a((Object) feedPanelStateViewModel2.f124405k.getValue(), (Object) true);
                        if (this.f44229h.f121497a) {
                            a(feedPanelStateViewModel2.f124405k, activity, j());
                        }
                        this.f44230i.f121497a = h.f.b.l.a((Object) feedPanelStateViewModel2.f124400f.getValue(), (Object) true);
                        if (this.f44230i.f121497a) {
                            a(feedPanelStateViewModel2.f124400f, activity, k());
                        }
                        List<com.ss.android.ugc.aweme.search.model.a> list = this.n;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (it.next().f121497a) {
                                    return;
                                }
                            }
                        }
                        if (!e().a(activity).e() && (tuxIconView = this.f44223b) != null) {
                            tuxIconView.postDelayed(new n(this, activity), 500);
                            return;
                        }
                        return;
                    }
                    this.f44226e.f121497a = true;
                    a(a4.f120057a, activity, l());
                    a(a4.f120058b, activity, m());
                    return;
                }
                this.f44225d = true;
                return;
            }
            p();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
    public final void a(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            Boolean.valueOf(aweme.isAd());
        }
        f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.f$f  reason: collision with other inner class name */
    public static final class C1079f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ LiveData $liveData;
        final /* synthetic */ u $observer;
        final /* synthetic */ androidx.lifecycle.m $owner;
        int label;

        static {
            Covode.recordClassIndex(27100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1079f(LiveData liveData, androidx.lifecycle.m mVar, u uVar, h.c.d dVar) {
            super(2, dVar);
            this.$liveData = liveData;
            this.$owner = mVar;
            this.$observer = uVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new C1079f(this.$liveData, this.$owner, this.$observer, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C1079f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                this.$liveData.observe(this.$owner, this.$observer);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.model.a aVar) {
        aVar.f121497a = false;
        for (com.ss.android.ugc.aweme.search.model.a aVar2 : this.n) {
            if (aVar2.f121497a) {
                return;
            }
        }
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        if (activity != null) {
            FeedSearchIconViewModel a2 = e().a(activity);
            if (!a2.e()) {
                a2.a().postValue(1);
                a(a2.c(), activity, n());
            }
        }
    }

    public f(b bVar) {
        h.f.b.l.d(bVar, "");
        this.f44231j = bVar;
        com.ss.android.ugc.aweme.search.model.a aVar = new com.ss.android.ugc.aweme.search.model.a("recommend-users-process");
        this.f44226e = aVar;
        com.ss.android.ugc.aweme.search.model.a aVar2 = new com.ss.android.ugc.aweme.search.model.a("recommend-users-show");
        this.f44227f = aVar2;
        com.ss.android.ugc.aweme.search.model.a aVar3 = new com.ss.android.ugc.aweme.search.model.a("swipe-up");
        this.f44228g = aVar3;
        com.ss.android.ugc.aweme.search.model.a aVar4 = new com.ss.android.ugc.aweme.search.model.a("open-follow");
        this.f44229h = aVar4;
        com.ss.android.ugc.aweme.search.model.a aVar5 = new com.ss.android.ugc.aweme.search.model.a("privacy");
        this.f44230i = aVar5;
        this.n = h.a.n.b(aVar, aVar2, aVar3, aVar4, aVar5);
        this.o = h.i.a((h.f.a.a) new l(this));
        this.p = h.i.a((h.f.a.a) new e(this));
        this.q = h.i.a((h.f.a.a) new g(this));
        this.r = h.i.a((h.f.a.a) new h(this));
        this.s = h.i.a((h.f.a.a) new i(this));
        this.t = h.i.a((h.f.a.a) new m(this));
        this.u = new a(false, false, this);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        String str;
        h.f.b.l.d(view, "");
        androidx.fragment.app.e activity = this.f44231j.getActivity();
        if (activity != null && !a.C3244a.a(activity).a("swipe_up_guide")) {
            if (e().l()) {
                h();
            }
            Aweme e2 = this.f44231j.e();
            if (e2 == null || (str = e2.getAid()) == null) {
                str = "";
            }
            String g2 = this.f44231j.g();
            b.a newBuilder = com.ss.android.ugc.aweme.search.model.b.Companion.newBuilder();
            newBuilder.f121501c = str;
            newBuilder.f121499a = g2;
            com.ss.android.ugc.aweme.search.model.b a2 = newBuilder.a();
            com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setSearchFrom(g2);
            com.ss.android.ugc.aweme.search.n.d dVar = new com.ss.android.ugc.aweme.search.n.d(new com.ss.android.ugc.aweme.search.n.f(new com.ss.android.ugc.aweme.search.n.a(g2, null, false, false, 14, null), null, new com.ss.android.ugc.aweme.search.n.i(null, str, 1, null), 2, null), null, 2, null);
            com.ss.android.ugc.aweme.search.h hVar = com.ss.android.ugc.aweme.search.h.f121133a;
            androidx.fragment.app.e activity2 = this.f44231j.getActivity();
            h.f.b.l.b(searchFrom, "");
            hVar.a(new com.ss.android.ugc.aweme.search.model.c(activity2, searchFrom, a2, dVar, g2));
            new com.ss.android.ugc.aweme.search.k.j().o(g2).p("enter").f();
            new com.ss.android.ugc.aweme.search.k.k().o(g2).p("enter").f();
        }
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f44234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f44235b;

        static {
            Covode.recordClassIndex(27094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, f fVar) {
            super(obj2);
            this.f44234a = obj;
            this.f44235b = fVar;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, Boolean bool, Boolean bool2) {
            h.f.b.l.d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (this.f44235b.f44225d && booleanValue) {
                this.f44235b.f();
                this.f44235b.f44225d = false;
            }
        }
    }

    private static <T> void a(LiveData<T> liveData, androidx.lifecycle.m mVar, u<T> uVar) {
        if (liveData != null && mVar != null) {
            if (h.f.b.l.a(Looper.getMainLooper(), Looper.myLooper())) {
                liveData.observe(mVar, uVar);
            } else {
                kotlinx.coroutines.h.a(kotlinx.coroutines.internal.o.f159148a, new C1079f(liveData, mVar, uVar, null));
            }
        }
    }
}
