package com.ss.android.ugc.aweme.mix.videodetail;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.q;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.f;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class k implements aa, aa.a {

    /* renamed from: a  reason: collision with root package name */
    private e f110288a;

    /* renamed from: b  reason: collision with root package name */
    private q f110289b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110290c;

    /* renamed from: d  reason: collision with root package name */
    private final MixVideosViewModel f110291d;

    static {
        Covode.recordClassIndex(70807);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 19;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    static final class c extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f110293a = new c();

        static {
            Covode.recordClassIndex(70810);
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

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f110291d;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f110290c;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        if (!this.f110291d.p) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        if (!this.f110291d.q) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f110292a = new b();

        static {
            Covode.recordClassIndex(70809);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            return z.f158842a;
        }
    }

    public k(MixVideosViewModel mixVideosViewModel) {
        l.d(mixVideosViewModel, "");
        this.f110291d = mixVideosViewModel;
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e, z> {
        final /* synthetic */ ad $detailFragmentPanel;

        static {
            Covode.recordClassIndex(70808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ad adVar) {
            super(1);
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e eVar) {
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.e eVar2 = eVar;
            if (eVar2 != null) {
                Integer num = eVar2.f110150a;
                int i2 = f.f110153a;
                if (num != null && num.intValue() == i2) {
                    this.$detailFragmentPanel.a(eVar2.f110151b, eVar2.f110152c);
                } else {
                    int i3 = f.f110154b;
                    if (num != null && num.intValue() == i3) {
                        this.$detailFragmentPanel.b(eVar2.f110151b, eVar2.f110152c);
                    } else {
                        int i4 = f.f110155c;
                        if (num != null && num.intValue() == i4) {
                            this.$detailFragmentPanel.c(eVar2.f110151b, eVar2.f110152c);
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        String aid;
        String str = "";
        l.d(adVar, str);
        if ((com.ss.android.ugc.aweme.mix.c.a.a() == 1 || com.ss.android.ugc.aweme.mix.c.a.a() == 2) && this.f110288a != null) {
            Aweme aweme = this.f110291d.n;
            if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                str = aid;
            }
            Aweme b2 = AwemeService.b().b(str);
            ArrayList arrayList = new ArrayList();
            if (b2 != null) {
                arrayList.add(b2);
            }
            adVar.a((List) arrayList, true);
            com.bytedance.ies.watcher.c.b("playlist_first_render_cost_time");
        }
        AssemViewModel.a(this.f110291d, l.f110294a, null, b.f110292a, c.f110293a, new a(adVar), 2);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f110291d == null) {
            return false;
        }
        e activity = fragment.getActivity();
        if (activity == null) {
            l.b();
        }
        this.f110288a = activity;
        if (activity != null) {
            DetailLoadStateManager.a.a(activity).f79903a.setValue(Boolean.valueOf(this.f110291d.p));
        }
        this.f110289b = new JediWidget();
        com.bytedance.widget.c a2 = c.a.a(fragment, fragment.getView());
        q qVar = this.f110289b;
        if (qVar == null) {
            l.a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a2.a((Widget) qVar);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        MixVideosViewModel mixVideosViewModel;
        l.d(bVar, "");
        if (i2 == 1) {
            MixVideosViewModel mixVideosViewModel2 = this.f110291d;
            if (mixVideosViewModel2 != null) {
                String uid = bVar.getUid();
                l.b(uid, "");
                String secUid = bVar.getSecUid();
                l.b(secUid, "");
                mixVideosViewModel2.a(uid, secUid);
            }
        } else if (i2 == 2) {
            MixVideosViewModel mixVideosViewModel3 = this.f110291d;
            String uid2 = bVar.getUid();
            l.b(uid2, "");
            String secUid2 = bVar.getSecUid();
            l.b(secUid2, "");
            l.d(uid2, "");
            l.d(secUid2, "");
            int i4 = g.f110158b;
            MixFeedApi.a.a().getMixVideos2(mixVideosViewModel3.f110092l, "", mixVideosViewModel3.r, i4, mixVideosViewModel3.k(), mixVideosViewModel3.l()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new MixVideosViewModel.c(mixVideosViewModel3, i4), MixVideosViewModel.d.f110099a);
        } else if (i2 == 4 && (mixVideosViewModel = this.f110291d) != null) {
            String uid3 = bVar.getUid();
            l.b(uid3, "");
            String secUid3 = bVar.getSecUid();
            l.b(secUid3, "");
            mixVideosViewModel.b(uid3, secUid3);
        }
    }
}
