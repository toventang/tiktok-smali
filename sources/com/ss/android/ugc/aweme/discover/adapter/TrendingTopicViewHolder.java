package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.ui.z;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.DiscoverAllServiceImpl;
import com.ss.android.ugc.aweme.discover.adapter.c;
import com.ss.android.ugc.aweme.discover.model.AdLabel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.metrics.ak;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class TrendingTopicViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements c.d, c.AbstractC1878c, com.ss.android.ugc.aweme.discover.tooltip.b, com.ss.android.ugc.aweme.discover.tooltip.b {
    private static final TrendingTopic F = new TrendingTopic(0, null, null, null, null, null, null, null, null, 511, null);

    /* renamed from: m  reason: collision with root package name */
    public static final h.h f80281m = h.i.a((h.f.a.a) c.f80288a);
    public static final b n = new b((byte) 0);
    private final z A;
    private View B;
    private final h.h C;
    private final h.h D;
    private final h.h E;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.tooltip.b f80282f;

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f80283g;

    /* renamed from: j  reason: collision with root package name */
    public final Context f80284j;

    /* renamed from: k  reason: collision with root package name */
    public d f80285k;

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView.RecycledViewPool f80286l;
    private final WrapLinearLayoutManager o;
    private final RemoteImageView p;
    private final TextView q;
    private final TextView r;
    private final TextView s;
    private final TextView t;
    private final View u;
    private final ViewStub v;
    private final ImageView w;
    private TrendingTopic x;
    private boolean y;
    private c z;

    public interface d {
        static {
            Covode.recordClassIndex(49975);
        }

        void a(String str, String str2, String str3, int i2);
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final l f80295a = new l();

        static {
            Covode.recordClassIndex(49984);
        }

        l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    private static String c(boolean z2) {
        return z2 ? "cell_slide" : "cell_click";
    }

    private static String d(boolean z2) {
        return z2 ? "into" : "header_click";
    }

    private final int q() {
        return ((Number) this.E.getValue()).intValue();
    }

    public final TrendsTabViewModel m() {
        return (TrendsTabViewModel) this.C.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(49973);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(DiscoverSectionItem discoverSectionItem) {
        AdLabel adLabel;
        MethodCollector.i(3089);
        DiscoverSectionItem discoverSectionItem2 = discoverSectionItem;
        h.f.b.l.d(discoverSectionItem2, "");
        TrendingTopic trendingTopic = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem2).trendingTopicOrAd.topic;
        if (trendingTopic != null) {
            if (trendingTopic == F) {
                if (this.B == null) {
                    this.B = this.v.inflate();
                }
                o.a(this.B, 0);
                o.a(this.u, 8);
            } else {
                o.a(this.v, 8);
                o.a(this.u, 0);
                if (com.ss.android.ugc.aweme.discover.f.f.a().f80992a) {
                    if (((Boolean) f80281m.getValue()).booleanValue()) {
                        o.a(this.t, 8);
                    }
                } else if (in.d()) {
                    o.a(this.t, 8);
                }
                this.x = trendingTopic;
                Challenge challenge = trendingTopic.getChallenge();
                Music music = trendingTopic.getMusic();
                com.ss.android.ugc.aweme.sticker.model.g effect = trendingTopic.getEffect();
                if (this.z == null) {
                    c cVar = new c(this);
                    this.z = cVar;
                    cVar.f80531e = trendingTopic;
                    View view = new View(this.f80284j);
                    view.setLayoutParams(new ViewGroup.LayoutParams((int) n.b(this.f80284j, 14.0f), -1));
                    c cVar2 = this.z;
                    if (cVar2 == null) {
                        h.f.b.l.b();
                    }
                    cVar2.a(view);
                    this.f80283g.setAdapter(this.z);
                    if (com.ss.android.ugc.aweme.discover.f.e.a()) {
                        com.ss.android.ugc.aweme.framework.a.a.b(4, "TrendingTopicViewHolder", "should use a common pool");
                        RecyclerView.RecycledViewPool recycledViewPool = this.f80286l;
                        if (recycledViewPool != null) {
                            this.f80283g.setRecycledViewPool(recycledViewPool);
                            com.ss.android.ugc.aweme.framework.a.a.b(4, "TrendingTopicViewHolder", "use a common pool");
                        }
                    }
                    c cVar3 = this.z;
                    if (cVar3 == null) {
                        h.f.b.l.b();
                    }
                    cVar3.f80530d = this;
                }
                String str = null;
                if (challenge != null) {
                    this.w.setVisibility(8);
                    DiscoverAllServiceImpl.b();
                    if (!challenge.isPgcshow() || challenge.isCommerce()) {
                        this.p.setImageResource(2131231915);
                        String desc = trendingTopic.getDesc();
                        TrendingTopicsAdInfo adData = trendingTopic.getAdData();
                        if (!(adData == null || (adLabel = adData.getAdLabel()) == null)) {
                            str = adLabel.text;
                        }
                        a(desc, str);
                    } else {
                        if (challenge.getAuthor() != null) {
                            User author = challenge.getAuthor();
                            h.f.b.l.b(author, "");
                            if (author.getAvatarThumb() != null) {
                                RemoteImageView remoteImageView = this.p;
                                User author2 = challenge.getAuthor();
                                h.f.b.l.b(author2, "");
                                com.ss.android.ugc.aweme.base.e.a(remoteImageView, author2.getAvatarThumb());
                            }
                        }
                        this.r.setText(this.f80284j.getString(R.string.dpe));
                    }
                    this.t.setText(com.ss.android.ugc.aweme.i18n.b.a(challenge.getDisplayCount()));
                    if (CommerceChallengeServiceImpl.e().a(challenge.getChallengeName(), challenge.isCommerce(), false) == null) {
                        this.y = false;
                        this.q.setText(challenge.getChallengeName());
                    } else {
                        this.y = true;
                        CommerceChallengeServiceImpl.e().a(this.f80284j, challenge.getChallengeName(), challenge.isCommerce(), this.q, false, "discover_hashtag_list");
                    }
                    c cVar4 = this.z;
                    if (cVar4 == null) {
                        h.f.b.l.b();
                    }
                    cVar4.f80533g = challenge.getCid();
                    c cVar5 = this.z;
                    if (cVar5 == null) {
                        h.f.b.l.b();
                    }
                    cVar5.f80532f = 0;
                    if (trendingTopic.isAd()) {
                        c cVar6 = this.z;
                        if (cVar6 == null) {
                            h.f.b.l.b();
                        }
                        cVar6.f80531e = trendingTopic;
                    }
                } else if (music != null) {
                    this.p.setImageResource(2131231911);
                    this.w.setVisibility(8);
                    this.t.setText(com.ss.android.ugc.aweme.i18n.b.a((long) music.getUserCount()));
                    this.q.setText(music.getMusicName());
                    a(trendingTopic.getDesc(), (String) null);
                    c cVar7 = this.z;
                    if (cVar7 == null) {
                        h.f.b.l.b();
                    }
                    cVar7.f80533g = String.valueOf(music.getId());
                    c cVar8 = this.z;
                    if (cVar8 == null) {
                        h.f.b.l.b();
                    }
                    cVar8.f80532f = 1;
                } else if (effect != null) {
                    this.p.setImageResource(2131231910);
                    this.w.setVisibility(8);
                    this.t.setText(com.ss.android.ugc.aweme.i18n.b.a(effect.userCount));
                    this.q.setText(effect.name);
                    a(trendingTopic.getDesc(), (String) null);
                    c cVar9 = this.z;
                    if (cVar9 == null) {
                        h.f.b.l.b();
                    }
                    cVar9.f80533g = effect.id;
                    c cVar10 = this.z;
                    if (cVar10 == null) {
                        h.f.b.l.b();
                    }
                    cVar10.f80532f = 3;
                }
                c cVar11 = this.z;
                if (cVar11 == null) {
                    h.f.b.l.b();
                }
                cVar11.b_(trendingTopic.getItems());
                c cVar12 = this.z;
                if (cVar12 == null) {
                    h.f.b.l.b();
                }
                cVar12.f80535i = getAdapterPosition();
            }
        }
        if (com.ss.android.ugc.aweme.discover.f.f.a().f80993b) {
            b.i.b(new i(this), b.i.f4824a);
            MethodCollector.o(3089);
            return;
        }
        withState(m(), new j(this));
        MethodCollector.o(3089);
    }

    @Override // com.ss.android.ugc.aweme.common.h.c.d
    public final void a(int i2, int i3) {
        TrendingTopic trendingTopic;
        if (i2 == 0 && i3 != 0 && (trendingTopic = this.x) != null) {
            Challenge challenge = trendingTopic.getChallenge();
            Music music = trendingTopic.getMusic();
            com.ss.android.ugc.aweme.sticker.model.g effect = trendingTopic.getEffect();
            if (com.ss.android.ugc.aweme.discover.f.f.a().f80993b || effect != null) {
                b.i.b(new k(this, effect, challenge, trendingTopic, music), b.i.f4824a);
            } else if (challenge != null) {
                CommerceChallengeServiceImpl.e().a(challenge.getSchema(), challenge.getCid());
                this.f80283g.getContext();
                r.a("show_challenge", "discovery", challenge.getCid(), 0);
                ak akVar = new ak();
                akVar.f109491a = "discovery";
                akVar.f109492b = challenge.getCid();
                akVar.f();
                r.a("cell_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("tag_id", challenge.getCid()).a("client_order", p()).f66730a);
                d dVar = this.f80285k;
                if (dVar != null) {
                    dVar.a(a(trendingTopic), trendingTopic.getDesc(), "discovery", p());
                }
                if (trendingTopic.isAd()) {
                    com.ss.android.ugc.aweme.discover.a.c(this.f80284j, trendingTopic);
                }
            } else if (music != null) {
                this.f80283g.getContext();
                r.a("show_music", "discovery", music.getMid(), 0);
                r.a("cell_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("music_id", music.getMid()).a("client_order", p()).f66730a);
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void bW_() {
        super.bW_();
        o();
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.b
    public final void l() {
        this.f80282f.l();
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80288a = new c();

        static {
            Covode.recordClassIndex(49974);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(in.d());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.c.AbstractC1878c
    public final void a() {
        a(true);
        this.f80282f.l();
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void aq_() {
        super.aq_();
        withState(m(), new e(this));
    }

    public final void n() {
        z zVar = this.A;
        if (zVar != null) {
            zVar.a(this.f80283g, false);
        }
    }

    public final void o() {
        if (this.A != null) {
            z.a(this.f80283g);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(49977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.$itemView.getContext(), 2.0f));
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(49978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.$itemView.getContext(), 20.0f));
        }
    }

    static final class i<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrendingTopicViewHolder f80289a;

        static {
            Covode.recordClassIndex(49980);
        }

        i(TrendingTopicViewHolder trendingTopicViewHolder) {
            this.f80289a = trendingTopicViewHolder;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            TrendingTopicViewHolder trendingTopicViewHolder = this.f80289a;
            trendingTopicViewHolder.withState(trendingTopicViewHolder.m(), new h.f.a.b<TrendsTabState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(49981);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
                    TrendsTabState trendsTabState2 = trendsTabState;
                    h.f.b.l.d(trendsTabState2, "");
                    this.this$0.f80289a.b(!trendsTabState2.isTabHidden());
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    public final int p() {
        return ((Number) withState(m(), new h(this))).intValue();
    }

    static {
        Covode.recordClassIndex(49969);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<TrendsTabViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(49972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_discover_adapter_TrendingTopicViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class k<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrendingTopicViewHolder f80290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.model.g f80291b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Challenge f80292c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TrendingTopic f80293d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Music f80294e;

        static {
            Covode.recordClassIndex(49983);
        }

        k(TrendingTopicViewHolder trendingTopicViewHolder, com.ss.android.ugc.aweme.sticker.model.g gVar, Challenge challenge, TrendingTopic trendingTopic, Music music) {
            this.f80290a = trendingTopicViewHolder;
            this.f80291b = gVar;
            this.f80292c = challenge;
            this.f80293d = trendingTopic;
            this.f80294e = music;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f80291b != null) {
                r.a("show_effect", new com.ss.android.ugc.aweme.app.f.d().a("prop_id", this.f80291b.effectId).a("client_order", this.f80290a.p()).f66730a);
            } else if (this.f80292c != null) {
                CommerceChallengeServiceImpl.e().a(this.f80292c.getSchema(), this.f80292c.getCid());
                this.f80290a.f80283g.getContext();
                r.a("show_challenge", "discovery", this.f80292c.getCid(), 0);
                ak akVar = new ak();
                akVar.f109491a = "discovery";
                akVar.f109492b = this.f80292c.getCid();
                akVar.f();
                r.a("cell_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("tag_id", this.f80292c.getCid()).a("client_order", this.f80290a.p()).f66730a);
                d dVar = this.f80290a.f80285k;
                if (dVar != null) {
                    dVar.a(TrendingTopicViewHolder.a(this.f80293d), this.f80293d.getDesc(), "discovery", this.f80290a.p());
                }
                if (this.f80293d.isAd()) {
                    com.ss.android.ugc.aweme.discover.a.c(this.f80290a.f80284j, this.f80293d);
                }
            } else if (this.f80294e != null) {
                this.f80290a.f80283g.getContext();
                r.a("show_music", "discovery", this.f80294e.getMid(), 0);
                r.a("cell_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("music_id", this.f80294e.getMid()).a("client_order", this.f80290a.p()).f66730a);
            }
            return h.z.f158842a;
        }
    }

    public final void a(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f80285k = dVar;
    }

    public final void b(boolean z2) {
        c cVar = this.z;
        if (cVar != null) {
            cVar.f80534h = z2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<TrendsTabState, h.z> {
        final /* synthetic */ TrendingTopicViewHolder this$0;

        static {
            Covode.recordClassIndex(49976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.this$0 = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            h.f.b.l.d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden()) {
                this.this$0.n();
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<TrendsTabState, h.z> {
        final /* synthetic */ TrendingTopicViewHolder this$0;

        static {
            Covode.recordClassIndex(49982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.this$0 = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            h.f.b.l.d(trendsTabState2, "");
            this.this$0.b(!trendsTabState2.isTabHidden());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<TrendsTabState, Integer> {
        final /* synthetic */ TrendingTopicViewHolder this$0;

        static {
            Covode.recordClassIndex(49979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.this$0 = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            h.f.b.l.d(trendsTabState2, "");
            Iterator<DiscoverSectionItem> it = trendsTabState2.getSubstate().getList().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (it.next() instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                    break;
                } else {
                    i2++;
                }
            }
            return Integer.valueOf((this.this$0.getAdapterPosition() - i2) + 1);
        }
    }

    public final void a(boolean z2) {
        TrendingTopic trendingTopic;
        if (in.d() || (trendingTopic = this.x) == null) {
            return;
        }
        if (trendingTopic.getChallenge() != null) {
            a(trendingTopic.getChallenge(), z2);
        } else if (trendingTopic.getMusic() != null) {
            a(trendingTopic.getMusic(), z2);
        } else if (trendingTopic.getEffect() != null) {
            a(trendingTopic.getEffect(), z2);
        }
    }

    public static String a(TrendingTopic trendingTopic) {
        if (trendingTopic.getChallenge() != null) {
            Challenge challenge = trendingTopic.getChallenge();
            if (challenge == null) {
                h.f.b.l.b();
            }
            String cid = challenge.getCid();
            h.f.b.l.b(cid, "");
            return cid;
        } else if (trendingTopic.getMusic() != null) {
            Music music = trendingTopic.getMusic();
            if (music == null) {
                h.f.b.l.b();
            }
            return String.valueOf(music.getId());
        } else if (trendingTopic.getEffect() == null) {
            return "";
        } else {
            com.ss.android.ugc.aweme.sticker.model.g effect = trendingTopic.getEffect();
            if (effect == null) {
                h.f.b.l.b();
            }
            String str = effect.id;
            h.f.b.l.b(str, "");
            return str;
        }
    }

    private final void a(com.ss.android.ugc.aweme.sticker.model.g gVar, boolean z2) {
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.b(uuid, "");
        View view = this.itemView;
        h.f.b.l.b(view, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//stickers/detail");
        if (gVar == null) {
            h.f.b.l.b();
        }
        buildRoute.withParam("id", gVar.effectId).withParam("process_id", uuid).withParam("shoot_enter_from", "discovery").open();
        r.a("cell_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("enter_method", "click_discovery_cover").a("prop_id", gVar.id).a("client_order", p()).f66730a);
        r.onEvent(MobClick.obtain().setEventName(c(z2)).setLabelName(d(z2)).setValue(gVar.id).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("cell_type", "effect").a()));
        r.a("enter_prop_detail", new com.ss.android.ugc.aweme.app.f.d().a("group_id", "").a("author_id", "").a("impr_type", "").a("prop_id", gVar.id).a("enter_from", "discovery").a("enter_method", "click_discovery_cover").f66730a);
        s.a(af.STICKER);
    }

    private final void a(Music music, boolean z2) {
        if (music == null) {
            h.f.b.l.b();
        }
        if (!MusicService.m().a(music.convertToMusicModel(), this.f80284j, true)) {
            r.a("enter_music_detail_failed", new com.ss.android.ugc.aweme.app.f.d().a("group_id", "").a("author_id", "").a("music_id", music.getMid()).a("enter_from", "discovery").f66730a);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.b(uuid, "");
        if (MSAdaptionService.c().c(this.f80284j)) {
            View view = this.itemView;
            h.f.b.l.b(view, "");
            SmartRouter.buildRoute(view.getContext(), "//duo").withParam("duo_type", "duo_music_detail").withParam("id", music.getMid()).withParam("process_id", uuid).withParam("shoot_enter_from", "discovery").open();
        } else {
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "//music/detail").withParam("id", music.getMid()).withParam("process_id", uuid).open();
        }
        r.a("cell_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "discovery").a("music_id", music.getMid()).a("client_order", p()).f66730a);
        r.onEvent(MobClick.obtain().setEventName(c(z2)).setLabelName(d(z2)).setValue(music.getMid().toString()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("cell_type", "music").a()));
        com.ss.android.ugc.aweme.metrics.m o2 = new com.ss.android.ugc.aweme.metrics.m().o("discovery");
        o2.p = music.getMid();
        o2.r = uuid;
        o2.a("click_discovery_cover").f();
        s.a(af.MUSICAL);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.discover.model.Challenge r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 559
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.a(com.ss.android.ugc.aweme.discover.model.Challenge, boolean):void");
    }

    private final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.s.setText(str2);
            this.s.setVisibility(0);
            this.s.setOnClickListener(l.f80295a);
            this.r.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            this.r.setText(str);
            this.s.setVisibility(8);
            this.r.setVisibility(0);
        } else {
            this.s.setVisibility(8);
            this.r.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.a) layoutParams).topMargin = q();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrendingTopicViewHolder(View view, RecyclerView.RecycledViewPool recycledViewPool, com.ss.android.ugc.aweme.discover.tooltip.b bVar) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(bVar, "");
        this.f80286l = recycledViewPool;
        this.f80282f = bVar;
        View findViewById = view.findViewById(R.id.c2f);
        h.f.b.l.b(findViewById, "");
        this.p = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f9l);
        h.f.b.l.b(findViewById2, "");
        this.q = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f_3);
        h.f.b.l.b(findViewById3, "");
        this.r = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gv);
        h.f.b.l.b(findViewById4, "");
        this.s = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.exo);
        h.f.b.l.b(findViewById5, "");
        this.t = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.drj);
        h.f.b.l.b(findViewById6, "");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.f80283g = recyclerView;
        View findViewById7 = view.findViewById(R.id.dqe);
        h.f.b.l.b(findViewById7, "");
        this.u = findViewById7;
        View findViewById8 = view.findViewById(R.id.fl9);
        h.f.b.l.b(findViewById8, "");
        this.v = (ViewStub) findViewById8;
        View findViewById9 = view.findViewById(R.id.amo);
        h.f.b.l.b(findViewById9, "");
        this.w = (ImageView) findViewById9;
        h.k.c a2 = h.f.b.ab.a(TrendsTabViewModel.class);
        this.C = h.i.a((h.f.a.a) new a(this, a2, a2));
        h.h a3 = h.i.a(h.m.NONE, new f(view));
        this.D = a3;
        this.E = h.i.a(h.m.NONE, new g(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TrendingTopicViewHolder f80287a;

            static {
                Covode.recordClassIndex(49970);
            }

            {
                this.f80287a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f80287a.a(false);
                this.f80287a.f80282f.l();
            }
        });
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.f80284j = context;
        z zVar = new z();
        this.A = zVar;
        Context context2 = view.getContext();
        h.f.b.l.b(context2, "");
        int color = context2.getResources().getColor(R.color.f159928l);
        view.getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
        this.o = wrapLinearLayoutManager;
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        if (wrapLinearLayoutManager.E) {
            wrapLinearLayoutManager.E = false;
            wrapLinearLayoutManager.F = 0;
            if (wrapLinearLayoutManager.w != null) {
                wrapLinearLayoutManager.w.f3811e.b();
            }
        }
        recyclerView.a(new com.ss.android.ugc.aweme.friends.a.d(color, ((Number) a3.getValue()).intValue(), 0));
        recyclerView.a(zVar);
        recyclerView.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.AnonymousClass2 */

            static {
                Covode.recordClassIndex(49971);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                h.f.b.l.d(recyclerView, "");
                super.a(recyclerView, i2);
                if (i2 == 0) {
                    r.a("cell_slide", "slide", 0);
                }
            }
        });
    }
}
