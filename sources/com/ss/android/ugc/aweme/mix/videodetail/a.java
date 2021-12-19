package com.ss.android.ugc.aweme.mix.videodetail;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.mob.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ap;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.detail.ui.b.a implements h.a, j, j {
    public static final int G;
    public static final c H = new c((byte) 0);
    public String A = "";
    public boolean B;
    public boolean C;
    public Aweme D;
    public Aweme E;
    public boolean F;
    private String I;
    private boolean J;
    private final com.bytedance.assem.arch.viewModel.b K;
    private SparseArray L;
    public com.ss.android.ugc.aweme.base.arch.i v = new com.ss.android.ugc.aweme.base.arch.i();
    public String w = "";
    public com.ss.android.ugc.aweme.mix.e.a y;
    public com.bytedance.tux.sheet.sheet.a z;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70778);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.detail.ui.b.a
    public final View a(int i2) {
        if (this.L == null) {
            this.L = new SparseArray();
        }
        View view = (View) this.L.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.L.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.b.a
    public final List<Aweme> a(aa aaVar) {
        h.f.b.l.d(aaVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.detail.ui.b.a
    public final void e() {
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z, com.ss.android.ugc.aweme.detail.ui.b.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final MixVideosViewModel y() {
        return (MixVideosViewModel) this.K.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70779);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public final /* bridge */ /* synthetic */ ad.b d() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o, com.ss.android.ugc.aweme.detail.ui.z, com.ss.android.ugc.aweme.detail.ui.am
    public final boolean bi_() {
        return y().q;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.b.a
    public final View x() {
        return a(R.id.akz);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        if (this.F) {
            l();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.z
    public final com.ss.android.ugc.aweme.detail.h.b c() {
        com.ss.android.ugc.aweme.detail.h.b c2 = super.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        MixVideosViewModel y2 = y();
        y();
        y2.b("", "");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.a$a  reason: collision with other inner class name */
    public static final class C2823a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2823a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.b.a
    public final int v() {
        com.ss.android.ugc.aweme.mix.e.b searchParam;
        com.ss.android.ugc.aweme.mix.e.a aVar = this.y;
        if (aVar == null || (searchParam = aVar.getSearchParam()) == null) {
            return 0;
        }
        return searchParam.getFlowStartPositionInGeneralSearch();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.b.a
    public final MixFlowParam w() {
        String eventType = new com.ss.android.ugc.aweme.feed.param.b().getEventType();
        if (eventType == null) {
            eventType = "";
        }
        return new MixFlowParam(eventType, "from_mix_video");
    }

    static {
        Covode.recordClassIndex(70776);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        G = h.g.a.a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics()));
    }

    public a() {
        h.k.c a2 = ab.a(MixVideosViewModel.class);
        this.K = new com.bytedance.assem.arch.viewModel.b(a2, new C2823a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f110276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110277b;

        static {
            Covode.recordClassIndex(70780);
        }

        d(Context context, a aVar) {
            this.f110276a = context;
            this.f110277b = aVar;
        }

        public final void run() {
            Aweme aweme;
            String str;
            String str2;
            Aweme aweme2;
            String mVideoFrom;
            a aVar = this.f110277b;
            IMixFeedService k2 = MixFeedService.k();
            Context context = this.f110276a;
            String str3 = this.f110277b.w;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            com.ss.android.ugc.aweme.mix.e.a aVar2 = this.f110277b.y;
            com.ss.android.ugc.aweme.mix.e.b bVar = null;
            if (aVar2 != null) {
                aweme = aVar2.getMAweme();
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.mix.e.a aVar3 = this.f110277b.y;
            if (aVar3 == null || (str = aVar3.getMUsrId()) == null) {
                str = str4;
            }
            com.ss.android.ugc.aweme.mix.e.a aVar4 = this.f110277b.y;
            if (aVar4 == null || (str2 = aVar4.getMSecUid()) == null) {
                str2 = str4;
            }
            com.ss.android.ugc.aweme.mix.e.a aVar5 = this.f110277b.y;
            if (!(aVar5 == null || (mVideoFrom = aVar5.getMVideoFrom()) == null)) {
                str4 = mVideoFrom;
            }
            aVar.z = k2.a(context, "playlist", str3, aweme, str, str2, str4);
            com.ss.android.ugc.aweme.mix.e.a aVar6 = this.f110277b.y;
            if (aVar6 != null) {
                aweme2 = aVar6.getMAweme();
            } else {
                aweme2 = null;
            }
            String str5 = this.f110277b.w;
            com.ss.android.ugc.aweme.mix.e.a aVar7 = this.f110277b.y;
            if (aVar7 != null) {
                bVar = aVar7.getSearchParam();
            }
            com.ss.android.ugc.aweme.mix.a.a.a(aweme2, str5, "playlist", bVar);
            this.f110277b.y().o = this.f110277b.E;
        }
    }

    private final void A() {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(context);
        String string = getString(R.string.bnl);
        h.f.b.l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.A}, 1));
        h.f.b.l.b(a2, "");
        com.bytedance.tux.dialog.a a3 = com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) bVar.b(a2).b(R.string.bnm), new n(this)).a();
        a3.b().show();
        a3.a();
    }

    private final void B() {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(context);
        String string = getString(R.string.bnl);
        h.f.b.l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.A}, 1));
        h.f.b.l.b(a2, "");
        com.bytedance.tux.dialog.a a3 = com.bytedance.tux.dialog.b.c.a(bVar.d(a2), new o(this)).a();
        a3.b().show();
        a3.a();
    }

    public final void z() {
        if (this.B && this.C) {
            DmtStatusView p = p();
            if (p != null) {
                p.g();
            }
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            h.f.b.l.b(e2, "");
            if (h.f.b.l.a((Object) e2.getCurUserId(), (Object) y().u)) {
                A();
                com.bytedance.tux.sheet.sheet.a aVar = this.z;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else {
                B();
            }
            this.B = false;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f110278a;

        static {
            Covode.recordClassIndex(70781);
        }

        e(a aVar) {
            this.f110278a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme mAweme;
            String str;
            boolean z;
            boolean z2;
            String str2;
            String str3;
            String str4;
            Aweme aweme;
            long j2;
            boolean z3;
            String mEventType;
            com.ss.android.ugc.aweme.mix.e.a aVar = this.f110278a.y;
            Aweme aweme2 = null;
            if (aVar == null || (mAweme = aVar.getMAweme()) == null) {
                return null;
            }
            String str5 = "";
            if (mAweme.getMusic() != null) {
                Music music = mAweme.getMusic();
                h.f.b.l.b(music, str5);
                str = String.valueOf(music.getId());
                Music music2 = mAweme.getMusic();
                h.f.b.l.b(music2, str5);
                if (music2.getMatchedPGCSoundInfo() != null) {
                    z = true;
                }
                z = false;
            } else {
                str = str5;
                z = false;
            }
            if (mAweme.getBottomBarModel() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ap apVar = new ap();
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f110278a.f79991j;
            h.f.b.l.b(bVar, str5);
            apVar.f109513b = bVar.getPreviousPage();
            com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f110278a.f79991j;
            h.f.b.l.b(bVar2, str5);
            apVar.f109514c = bVar2.getPreviousPagePosition();
            apVar.f109515d = z2;
            apVar.ad = this.f110278a.f79991j.getFrom();
            com.ss.android.ugc.aweme.mix.e.a aVar2 = this.f110278a.y;
            if (aVar2 == null || (str2 = aVar2.getMEventType()) == null) {
                str2 = str5;
            }
            ap a2 = apVar.a(str2);
            a2.q = "manul_play";
            com.ss.android.ugc.aweme.feed.param.b bVar3 = this.f110278a.f79991j;
            h.f.b.l.b(bVar3, str5);
            ap apVar2 = (ap) a2.c(mAweme, bVar3.getPageType()).a(Boolean.valueOf(com.ss.android.ugc.aweme.feed.x.m.b(mAweme)));
            apVar2.ae = com.ss.android.ugc.aweme.player.e.a();
            apVar2.f109512a = com.ss.android.ugc.aweme.video.o.b().name();
            apVar2.af = str;
            apVar2.ag = z;
            apVar2.ac = mAweme.isHighlighted();
            com.ss.android.ugc.aweme.mix.e.a aVar3 = this.f110278a.y;
            if (aVar3 != null) {
                str3 = aVar3.getMixId();
            } else {
                str3 = null;
            }
            apVar2.aj = str3;
            com.ss.android.ugc.aweme.feed.param.b bVar4 = this.f110278a.f79991j;
            h.f.b.l.b(bVar4, str5);
            apVar2.am = bVar4.getPlaylistSearchId();
            com.ss.android.ugc.aweme.feed.param.b bVar5 = this.f110278a.f79991j;
            h.f.b.l.b(bVar5, str5);
            apVar2.al = bVar5.getIsFromVideo();
            com.ss.android.ugc.aweme.feed.param.b bVar6 = this.f110278a.f79991j;
            h.f.b.l.b(bVar6, str5);
            apVar2.ak = bVar6.getCategoryName();
            com.ss.android.ugc.aweme.mix.e.a aVar4 = this.f110278a.y;
            if (aVar4 == null || (str4 = aVar4.getMEventType()) == null) {
                str4 = str5;
            }
            apVar2.an = str4;
            com.ss.android.ugc.aweme.feed.param.b bVar7 = this.f110278a.f79991j;
            h.f.b.l.b(bVar7, str5);
            apVar2.ao = bVar7.getLastGroupId();
            com.ss.android.ugc.aweme.feed.param.b bVar8 = this.f110278a.f79991j;
            h.f.b.l.b(bVar8, str5);
            apVar2.ap = bVar8.getPlaylistPreviousPage();
            com.ss.android.ugc.aweme.feed.param.b bVar9 = this.f110278a.f79991j;
            h.f.b.l.b(bVar9, str5);
            apVar2.aq = bVar9.getEnterPlaylistGroupId();
            ap a3 = apVar2.b(ah.j(mAweme)).a(ah.k(mAweme));
            com.ss.android.ugc.aweme.feed.param.b bVar10 = this.f110278a.f79991j;
            h.f.b.l.b(bVar10, str5);
            a3.ah = bVar10.getSearchType();
            h.f.b.l.b(a3, str5);
            com.ss.android.ugc.aweme.feed.param.b bVar11 = this.f110278a.f79991j;
            h.f.b.l.b(bVar11, str5);
            String previousPage = bVar11.getPreviousPage();
            com.ss.android.ugc.aweme.feed.param.b bVar12 = this.f110278a.f79991j;
            h.f.b.l.b(bVar12, str5);
            a3.a(y.b(previousPage, bVar12.getFromGroupId()));
            a3.f();
            a aVar5 = this.f110278a;
            com.ss.android.ugc.aweme.feed.param.b bVar13 = aVar5.f79991j;
            h.f.b.l.b(bVar13, str5);
            String playlistPreviousPage = bVar13.getPlaylistPreviousPage();
            if (TextUtils.equals(playlistPreviousPage, "search_result") || TextUtils.equals(playlistPreviousPage, "general_search")) {
                long j3 = aVar5.y().r;
                if (j3 > 0) {
                    j3++;
                }
                List<Aweme> j4 = aVar5.y().j();
                com.ss.android.ugc.aweme.mix.e.a aVar6 = aVar5.y;
                if (aVar6 != null) {
                    aweme = aVar6.getMAweme();
                } else {
                    aweme = null;
                }
                long a4 = (long) a.a(j4, aweme);
                if (a4 > 0) {
                    j2 = j3 + a4;
                } else {
                    j2 = -1;
                }
                if (TextUtils.equals(playlistPreviousPage, "search_result") || TextUtils.equals(playlistPreviousPage, "search_for_you_list")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ISearchResultStatistics a5 = SearchResultStatisticsImpl.a();
                com.ss.android.ugc.aweme.mix.e.a aVar7 = aVar5.y;
                if (aVar7 != null) {
                    aweme2 = aVar7.getMAweme();
                }
                com.ss.android.ugc.aweme.mix.e.a aVar8 = aVar5.y;
                if (!(aVar8 == null || (mEventType = aVar8.getMEventType()) == null)) {
                    str5 = mEventType;
                }
                a5.a(new r("search_video_play", aweme2, str5, z3, playlistPreviousPage, j2));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z2) {
        this.F = z2;
    }

    public static final class f implements AwemeChangeCallBack.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f110279a;

        static {
            Covode.recordClassIndex(70782);
        }

        f(a aVar) {
            this.f110279a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
        public final void a(Aweme aweme) {
            if (com.ss.android.ugc.aweme.mix.c.a.a() != 0 || this.f110279a.D == null) {
                this.f110279a.E = aweme;
                return;
            }
            a aVar = this.f110279a;
            aVar.E = aVar.D;
            Float f2 = null;
            this.f110279a.D = null;
            com.ss.android.ugc.aweme.mix.e.a aVar2 = this.f110279a.y;
            if (aVar2 != null && aVar2.getVideoPlayedPercentage() != null) {
                com.ss.android.ugc.aweme.mix.e.a aVar3 = this.f110279a.y;
                if (aVar3 != null) {
                    f2 = aVar3.getVideoPlayedPercentage();
                }
                if (!h.f.b.l.a(f2, 0.0f)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.mix.videodetail.a.f.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ f f110280a;

                        static {
                            Covode.recordClassIndex(70783);
                        }

                        {
                            this.f110280a = r1;
                        }

                        public final void run() {
                            float f2;
                            Float videoPlayedPercentage;
                            com.ss.android.ugc.aweme.detail.h.b bVar = this.f110280a.f110279a.f79992k;
                            h.f.b.l.b(bVar, "");
                            com.ss.android.ugc.aweme.video.i aN = bVar.aN();
                            com.ss.android.ugc.aweme.mix.e.a aVar = this.f110280a.f110279a.y;
                            if (aVar == null || (videoPlayedPercentage = aVar.getVideoPlayedPercentage()) == null) {
                                f2 = 0.0f;
                            } else {
                                f2 = videoPlayedPercentage.floatValue();
                            }
                            aN.a(f2);
                        }
                    }, 400);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            CharSequence text = this.this$0.getText(R.string.c7);
            h.f.b.l.b(text, "");
            bVar2.c(text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.videodetail.a.o.AnonymousClass1 */
                final /* synthetic */ o this$0;

                static {
                    Covode.recordClassIndex(70796);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.f44820b = true;
            CharSequence text = this.this$0.getText(R.string.pn);
            h.f.b.l.b(text, "");
            bVar2.a(text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.videodetail.a.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(70792);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_manage_mix_id", this.this$0.this$0.w);
                    if (this.this$0.this$0.getContext() != null) {
                        IMixFeedService k2 = MixFeedService.k();
                        Context context = this.this$0.this$0.getContext();
                        if (context == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(context, "");
                        k2.a(context, bundle, 4, "", "");
                    }
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            CharSequence text2 = this.this$0.getText(R.string.b60);
            h.f.b.l.b(text2, "");
            bVar2.a(text2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.videodetail.a.n.AnonymousClass2 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(70793);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.mix.a.a.a(this.this$0.this$0.w, "playlist");
                    this.this$0.this$0.y().h();
                    return z.f158842a;
                }
            });
            CharSequence text3 = this.this$0.getText(R.string.c7);
            h.f.b.l.b(text3, "");
            bVar2.b(text3, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.videodetail.a.n.AnonymousClass3 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(70794);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public final List<Aweme> b(List<Aweme> list) {
        String str;
        String str2;
        IAwemeService b2 = AwemeService.b();
        Aweme aweme = y().n;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        Aweme b3 = b2.b(str);
        int i2 = 0;
        for (T t : list) {
            String aid = t.getAid();
            Aweme aweme2 = y().n;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (!h.f.b.l.a((Object) aid, (Object) str2) || b3 == null) {
                Aweme a2 = AwemeService.b().a((Aweme) t);
                h.f.b.l.b(a2, "");
                list.set(i2, a2);
            } else {
                list.set(i2, b3);
            }
            i2++;
        }
        return list;
    }

    public final void a(List<? extends Aweme> list) {
        com.ss.android.ugc.aweme.mix.e.a aVar;
        Context context;
        if (list.isEmpty()) {
            this.B = true;
            z();
        } else if (com.ss.android.ugc.aweme.mix.c.a.a() == 0 && (aVar = this.y) != null && aVar.getMNeedShowDialog() && (context = getContext()) != null) {
            new Handler().postDelayed(new d(context, this), 1000);
        }
        if (!((com.ss.android.ugc.aweme.mix.c.a.a() != 1 && com.ss.android.ugc.aweme.mix.c.a.a() != 2) || y().n == null || a(list, y().n) == 0)) {
            this.f79992k.al = true;
        }
        if (!com.ss.android.ugc.aweme.search.a.a.a()) {
            y().a(new com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e(Integer.valueOf(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.f.f110153a), b(h.a.n.g((Collection) list)), y().q));
        } else {
            this.f79992k.a(b(h.a.n.g((Collection) list)), y().q);
        }
        if (com.ss.android.ugc.aweme.mix.c.a.a() == 0) {
            com.bytedance.ies.watcher.c.b("playlist_first_render_cost_time");
        }
        com.bytedance.ies.watcher.c.b("playlist_first_open_dialog_cost_time");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        com.ss.android.ugc.aweme.mix.e.a aVar;
        Aweme aweme2;
        String str;
        String str2;
        Aweme aweme3;
        String mVideoFrom;
        com.ss.android.ugc.aweme.mix.e.a aVar2;
        com.ss.android.ugc.aweme.detail.h.b bVar;
        String str3;
        Aweme aweme4;
        String str4;
        String str5;
        String str6;
        Aweme aweme5;
        String str7;
        super.onCreate(bundle);
        ae.f95298c = y();
        Bundle arguments = getArguments();
        com.ss.android.ugc.aweme.mix.e.b bVar2 = null;
        String str8 = "";
        if (arguments != null) {
            this.I = arguments.getString("event_type");
            Serializable serializable = arguments.getSerializable("mix_video_list_params");
            if (!(serializable instanceof com.ss.android.ugc.aweme.mix.e.a)) {
                serializable = null;
            }
            com.ss.android.ugc.aweme.mix.e.a aVar3 = (com.ss.android.ugc.aweme.mix.e.a) serializable;
            this.y = aVar3;
            if (aVar3 != null) {
                String mixId = aVar3.getMixId();
                if (mixId == null) {
                    mixId = str8;
                }
                this.w = mixId;
                com.ss.android.ugc.aweme.mix.model.d mixInfo = aVar3.getMixInfo();
                if (mixInfo == null || (str7 = mixInfo.getMixName()) == null) {
                    str7 = str8;
                }
                this.A = str7;
                this.J = aVar3.getMEnterCleanMode();
            }
            MixVideosViewModel y2 = y();
            h.f.b.l.b(arguments, str8);
            y2.w = com.bytedance.ies.powerpreload.task.e.a(arguments);
        }
        com.ss.android.ugc.aweme.mix.e.a aVar4 = this.y;
        if (aVar4 == null || aVar4.getMEnterCleanMode()) {
            com.ss.android.ugc.aweme.detail.h.b bVar3 = this.f79992k;
            if (bVar3 != null) {
                bVar3.w();
            }
        } else {
            com.ss.android.ugc.aweme.mix.e.a aVar5 = this.y;
            if ((aVar5 != null && !aVar5.getMNeedShowDialog()) || com.ss.android.ugc.aweme.mix.c.a.a() == 0) {
                MixVideosViewModel y3 = y();
                com.ss.android.ugc.aweme.mix.e.a aVar6 = this.y;
                if (aVar6 == null || (str4 = aVar6.getMUsrId()) == null) {
                    str4 = str8;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar7 = this.y;
                if (aVar7 == null || (str5 = aVar7.getMSecUid()) == null) {
                    str5 = str8;
                }
                String str9 = this.w;
                com.ss.android.ugc.aweme.mix.e.a aVar8 = this.y;
                if (aVar8 == null || (str6 = aVar8.getMAid()) == null) {
                    str6 = str8;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar9 = this.y;
                if (aVar9 != null) {
                    aweme5 = aVar9.getMAweme();
                } else {
                    aweme5 = null;
                }
                h.f.b.l.d(str4, str8);
                h.f.b.l.d(str5, str8);
                h.f.b.l.d(str9, str8);
                h.f.b.l.d(str6, str8);
                y3.f110092l = str9;
                y3.f110093m = str6;
                y3.u = str4;
                y3.v = str5;
                y3.n = aweme5;
                y3.a(str4, str5);
            }
            MixVideosViewModel y4 = y();
            com.ss.android.ugc.aweme.mix.e.a aVar10 = this.y;
            if (aVar10 != null) {
                aweme4 = aVar10.getMAweme();
            } else {
                aweme4 = null;
            }
            y4.n = aweme4;
        }
        com.ss.android.ugc.aweme.detail.h.b bVar4 = this.f79992k;
        if (bVar4 != null) {
            String str10 = this.w;
            if (bVar4.aJ != null) {
                bVar4.aJ.setPlayListId(str10);
            }
        }
        com.ss.android.ugc.aweme.mix.e.a aVar11 = this.y;
        if (!(aVar11 == null || aVar11.getMEnterCleanMode() || (bVar = this.f79992k) == null)) {
            com.ss.android.ugc.aweme.mix.e.a aVar12 = this.y;
            if (aVar12 == null || (str3 = aVar12.getMAid()) == null) {
                str3 = str8;
            }
            if (bVar.aJ != null) {
                bVar.aJ.setAid(str3);
            }
        }
        com.ss.android.ugc.aweme.mix.e.a aVar13 = this.y;
        if (aVar13 != null) {
            aweme = aVar13.getMAweme();
        } else {
            aweme = null;
        }
        this.D = aweme;
        com.ss.android.ugc.aweme.detail.h.b bVar5 = this.f79992k;
        if (bVar5 != null) {
            bVar5.f79696h = false;
        }
        if (com.ss.android.ugc.aweme.mix.c.a.a() != 0) {
            com.ss.android.ugc.aweme.mix.e.a aVar14 = this.y;
            if ((aVar14 != null && aVar14.getMEnterCleanMode()) || (aVar = this.y) == null || !aVar.getMNeedShowDialog() || getContext() == null) {
                return;
            }
            if (getContext() != null || ((aVar2 = this.y) != null && aVar2.getMAweme() != null)) {
                IMixFeedService k2 = MixFeedService.k();
                Context context = getContext();
                String str11 = this.w;
                if (str11 == null) {
                    str11 = str8;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar15 = this.y;
                if (aVar15 != null) {
                    aweme2 = aVar15.getMAweme();
                } else {
                    aweme2 = null;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar16 = this.y;
                if (aVar16 == null || (str = aVar16.getMUsrId()) == null) {
                    str = str8;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar17 = this.y;
                if (aVar17 == null || (str2 = aVar17.getMSecUid()) == null) {
                    str2 = str8;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar18 = this.y;
                if (!(aVar18 == null || (mVideoFrom = aVar18.getMVideoFrom()) == null)) {
                    str8 = mVideoFrom;
                }
                this.z = k2.a(context, "playlist", str11, aweme2, str, str2, str8);
                com.ss.android.ugc.aweme.mix.e.a aVar19 = this.y;
                if (aVar19 != null) {
                    aweme3 = aVar19.getMAweme();
                } else {
                    aweme3 = null;
                }
                String str12 = this.w;
                com.ss.android.ugc.aweme.mix.e.a aVar20 = this.y;
                if (aVar20 != null) {
                    bVar2 = aVar20.getSearchParam();
                }
                com.ss.android.ugc.aweme.mix.a.a.a(aweme3, str12, "playlist", bVar2);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.ss.android.ugc.aweme.mix.model.d, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.ss.android.ugc.aweme.mix.model.d dVar2) {
            com.ss.android.ugc.aweme.mix.model.d dVar3 = dVar2;
            h.f.b.l.d(dVar, "");
            if (dVar3 != null) {
                if (!TextUtils.isEmpty(dVar3.getMixName())) {
                    this.this$0.A = dVar3.getMixName();
                    TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.akz);
                    h.f.b.l.b(tuxTextView, "");
                    tuxTextView.setText(dVar3.getMixName());
                }
                this.this$0.C = true;
                this.this$0.z();
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(dVar, "");
            if (intValue == 2) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
            } else if (intValue == 3) {
                this.this$0.B = true;
                this.this$0.z();
            }
            return z.f158842a;
        }
    }

    public static int a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            int i2 = 0;
            for (Aweme aweme2 : list) {
                String aid = aweme2.getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) aid, (Object) str)) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Boolean bool) {
            Aweme aweme;
            String str;
            Aweme aweme2;
            String mSecUid;
            boolean booleanValue = bool.booleanValue();
            String str2 = "";
            h.f.b.l.d(dVar, str2);
            if (booleanValue) {
                a aVar = this.this$0;
                IMixFeedService k2 = MixFeedService.k();
                Context context = aVar.getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                String str3 = aVar.w;
                com.ss.android.ugc.aweme.mix.e.a aVar2 = aVar.y;
                com.ss.android.ugc.aweme.mix.e.b bVar = null;
                if (aVar2 != null) {
                    aweme = aVar2.getMAweme();
                } else {
                    aweme = null;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar3 = aVar.y;
                if (aVar3 == null || (str = aVar3.getMUsrId()) == null) {
                    str = str2;
                }
                com.ss.android.ugc.aweme.mix.e.a aVar4 = aVar.y;
                if (!(aVar4 == null || (mSecUid = aVar4.getMSecUid()) == null)) {
                    str2 = mSecUid;
                }
                aVar.z = k2.a(context, "playlist", str3, aweme, str, str2, "");
                com.ss.android.ugc.aweme.mix.e.a aVar5 = aVar.y;
                if (aVar5 != null) {
                    aweme2 = aVar5.getMAweme();
                } else {
                    aweme2 = null;
                }
                String str4 = aVar.w;
                com.ss.android.ugc.aweme.mix.e.a aVar6 = aVar.y;
                if (aVar6 != null) {
                    bVar = aVar6.getSearchParam();
                }
                com.ss.android.ugc.aweme.mix.a.a.a(aweme2, str4, "playlist", bVar);
                aVar.y().o = aVar.E;
                aVar.y().a(MixVideosViewModel.p.f110124a);
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Aweme>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r0.getAid().equals(r7.f25631b.getAid()) == false) goto L_0x002b;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d r6, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r7) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.videodetail.a.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (aVar2 != null) {
                if (aVar2.f25631b.booleanValue()) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.f(this.this$0.f79992k.y(), this.this$0.w));
                    androidx.fragment.app.e activity = this.this$0.getActivity();
                    if (activity != null) {
                        h.f.b.l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).a().e(R.string.gj2).b();
                    }
                    androidx.fragment.app.e activity2 = this.this$0.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
                }
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            com.ss.android.ugc.aweme.mix.e.a aVar2;
            Aweme aweme;
            com.ss.android.ugc.aweme.mix.e.b bVar;
            String str;
            Integer num;
            String str2;
            String searchId;
            User author;
            String str3 = "";
            h.f.b.l.d(dVar, str3);
            if (!(aVar == null || (aVar2 = this.this$0.y) == null || aVar2.getSearchParam() == null)) {
                com.ss.android.ugc.aweme.mix.e.a aVar3 = this.this$0.y;
                String str4 = null;
                if (aVar3 != null) {
                    aweme = aVar3.getMAweme();
                } else {
                    aweme = null;
                }
                String str5 = this.this$0.w;
                com.ss.android.ugc.aweme.mix.e.a aVar4 = this.this$0.y;
                if (aVar4 != null) {
                    bVar = aVar4.getSearchParam();
                } else {
                    bVar = null;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "playlist").a("playlist_id", str5);
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    str = null;
                } else {
                    str = author.getUid();
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str);
                if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
                    str3 = searchId;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("search_id", str3);
                if (bVar != null) {
                    num = bVar.isFromVideo();
                } else {
                    num = null;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("is_from_video", num);
                if (bVar != null) {
                    str2 = bVar.getSearchType();
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.app.f.d a6 = a5.a("search_type", str2);
                if (aweme != null) {
                    str4 = aweme.getGroupId();
                }
                com.ss.android.ugc.aweme.common.r.a("playlist_panel_click", a6.a("group_id", str4).f66730a);
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, List<? extends Aweme>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(70790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            h.f.b.l.d(dVar, "");
            if (list2 != null) {
                int i2 = ((com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d) this.this$0.y().d().a()).f110144d;
                if (i2 == com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g.f110157a) {
                    this.this$0.a(list2);
                } else if (i2 == com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g.f110159c) {
                    if (!com.ss.android.ugc.aweme.search.a.a.a()) {
                        this.this$0.y().a(new com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e(Integer.valueOf(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.f.f110154b), this.this$0.b(h.a.n.g((Collection) list2)), this.this$0.y().q));
                    } else {
                        this.this$0.f79992k.b(this.this$0.b(h.a.n.g((Collection) list2)), this.this$0.y().q);
                    }
                } else if (i2 == com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g.f110158b) {
                    if (!com.ss.android.ugc.aweme.search.a.a.a()) {
                        this.this$0.y().a(new com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e(Integer.valueOf(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.f.f110155c), this.this$0.b(h.a.n.g((Collection) list2)), this.this$0.y().q));
                    } else {
                        this.this$0.f79992k.c(this.this$0.b(h.a.n.g((Collection) list2)), this.this$0.y().p);
                    }
                } else if (i2 == com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g.f110160d) {
                    this.this$0.a(list2);
                    com.ss.android.ugc.aweme.mix.c.a.a();
                }
                long j2 = this.this$0.y().r;
                if (j2 > 0) {
                    j2++;
                }
                com.ss.android.ugc.aweme.feed.param.b bVar = this.this$0.f79991j;
                h.f.b.l.b(bVar, "");
                bVar.setPlaylistOffset(j2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z, com.ss.android.ugc.aweme.detail.ui.b.a
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.mix.e.a aVar;
        com.ss.android.ugc.aweme.mix.e.b searchParam;
        Integer isFromVideo;
        com.ss.android.ugc.aweme.mix.e.a aVar2;
        MethodCollector.i(1483);
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.akz);
        tuxTextView.setMaxWidth(com.bytedance.common.utility.n.a(tuxTextView.getContext()) - (G * 2));
        tuxTextView.setText(this.A);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.cmx);
        h.f.b.l.b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hh.b();
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                AwemeChangeCallBack.a(activity, activity, new f(this));
            }
            f.a.a(this, y(), e.f110284a, (com.bytedance.assem.arch.viewModel.k) null, new k(this), 6);
            f.a.a(this, y(), f.f110285a, (com.bytedance.assem.arch.viewModel.k) null, new l(this), 6);
            f.a.a(this, y(), g.f110286a, (com.bytedance.assem.arch.viewModel.k) null, new m(this), 6);
            f.a.a(this, y(), h.f110287a, (com.bytedance.assem.arch.viewModel.k) null, new g(this), 6);
            f.a.a(this, y(), b.f110281a, (com.bytedance.assem.arch.viewModel.k) null, new h(this), 6);
            f.a.a(this, y(), c.f110282a, (com.bytedance.assem.arch.viewModel.k) null, new i(this), 6);
            f.a.a(this, y(), d.f110283a, (com.bytedance.assem.arch.viewModel.k) null, new j(this), 6);
            DmtStatusView p = p();
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.al4, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.biq);
            h.f.b.l.b(findViewById, "");
            View findViewById2 = inflate.findViewById(R.id.f9l);
            h.f.b.l.b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.eyc);
            h.f.b.l.b(findViewById3, "");
            TextView textView2 = (TextView) findViewById3;
            ((AutoRTLImageView) findViewById).setBackgroundResource(2131232654);
            if (getContext() != null) {
                textView.setTextColor(androidx.core.content.b.c(textView.getContext(), R.color.f159928l));
                textView2.setTextColor(androidx.core.content.b.c(textView.getContext(), R.color.f159928l));
            }
            textView.setText(getString(R.string.di6));
            textView2.setVisibility(8);
            h.f.b.l.b(inflate, "");
            DmtStatusView.a b2 = a2.b(inflate);
            b2.f33605g = 1;
            p.setBuilder(b2);
            if (com.ss.android.ugc.aweme.mix.c.a.a() == 0 || (aVar2 = this.y) == null || aVar2.getMAweme() == null) {
                p().f();
            }
            if ((com.ss.android.ugc.aweme.mix.c.a.a() == 1 || com.ss.android.ugc.aweme.mix.c.a.a() == 2) && ((aVar = this.y) == null || (searchParam = aVar.getSearchParam()) == null || (isFromVideo = searchParam.isFromVideo()) == null || isFromVideo.intValue() != 3 || com.ss.android.ugc.aweme.search.a.a.a())) {
                b.i.b(new e(this), b.i.f4824a);
            }
            MethodCollector.o(1483);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.o(1483);
        throw nullPointerException;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z, com.ss.android.ugc.b.a.a.a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.akv, viewGroup, false);
    }
}
